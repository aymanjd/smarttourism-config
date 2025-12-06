document.addEventListener("DOMContentLoaded", function () {
    const container = document.getElementById("destinations-container");
    const regionSelect = document.getElementById("regionFilter");

    let allDestinations = [];

    function renderDestinations(list) {
        container.innerHTML = "";

        if (list.length === 0) {
            container.innerHTML = "<p>Aucune destination trouvée.</p>";
            return;
        }

        list.forEach(dest => {
            const card = `
                <div class="destination-card">
                    <img src="${dest.imageUrl}" alt="${dest.name}">
                    <div class="destination-card-content">
                        <div class="destination-card-title">${dest.name}</div>
                        <div class="destination-card-region">${dest.region}</div>
                        <div class="destination-card-desc">${dest.description}</div>
                        <div class="destination-card-footer">
                            <span class="badge">${dest.meteo || "Météo idéale"}</span>
                            <span class="price">⭐ ${dest.price}</span>
                        </div>
                    </div>
                </div>
            `;
            container.innerHTML += card;
        });
    }

    function fillRegions(list) {
        const regions = Array.from(new Set(list.map(d => d.region).filter(Boolean)));
        regions.sort();
        regions.forEach(r => {
            const opt = document.createElement("option");
            opt.value = r;
            opt.textContent = r;
            regionSelect.appendChild(opt);
        });
    }

    regionSelect.addEventListener("change", function () {
        const value = regionSelect.value;
        if (!value) {
            renderDestinations(allDestinations);
        } else {
            const filtered = allDestinations.filter(d => d.region === value);
            renderDestinations(filtered);
        }
    });

    // Récupération depuis le microservice via Gateway
    fetch("/api/destinations")
        .then(response => response.json())
        .then(data => {
            allDestinations = data;
            fillRegions(allDestinations);
            renderDestinations(allDestinations);
        })
        .catch(error => {
            console.error(error);
            container.innerHTML = "<p>Erreur lors du chargement des destinations.</p>";
        });
});
