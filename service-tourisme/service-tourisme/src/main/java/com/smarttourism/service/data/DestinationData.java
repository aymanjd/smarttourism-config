package com.smarttourism.service.data;

import com.smarttourism.service.model.Destination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DestinationData {

    public static List<Destination> getAll() {
        List<Destination> list = new ArrayList<>();

        list.add(new Destination(
                1L,
                "Marrakech",
                "Marrakech-Safi",
                "Ville rouge : jardins, palais, souks et désert.",
                "https://images.unsplash.com/photo-1542051841857-5f90071e7989?auto=format&fit=crop&w=1200&q=80",
                4.7,
                "ensoleillé",
                "2-4 jours",
                Arrays.asList("Jemaa El-Fna", "Jardin Majorelle", "Palais Bahia", "Désert Agafay")
        ));

        list.add(new Destination(
                2L,
                "Essaouira",
                "Marrakech-Safi",
                "Ville portuaire artistique, surf et médina UNESCO.",
                "https://images.unsplash.com/photo-1507525428034-b723cf961d3e?auto=format&fit=crop&w=1200&q=80",
                4.6,
                "vent léger",
                "1-3 jours",
                Arrays.asList("Skala", "Médina UNESCO", "Surf", "Port de pêche")
        ));

        list.add(new Destination(
                3L,
                "Safi",
                "Marrakech-Safi",
                "Capitale de la poterie marocaine et ville côtière.",
                "https://images.unsplash.com/photo-1534081333815-ae5019106622?auto=format&fit=crop&w=1200&q=80",
                4.1,
                "doux",
                "1-2 jours",
                Arrays.asList("Musée Céramique", "Médina", "Corniche")
        ));

        list.add(new Destination(
                4L,
                "Agadir",
                "Souss-Massa",
                "Ville balnéaire moderne : plage, corniche, activités marines.",
                "https://images.unsplash.com/photo-1506744038136-46273834b3fb?auto=format&fit=crop&w=1200&q=80",
                4.4,
                "ensoleillé",
                "2-3 jours",
                Arrays.asList("Corniche", "Kasbah", "Jet-ski", "Souk El Had")
        ));

        list.add(new Destination(
                5L,
                "Taghazout",
                "Souss-Massa",
                "Village mondialement connu pour le surf.",
                "https://images.unsplash.com/photo-1470124182917-cc6e71b22ecc",
                4.5,
                "ensoleillé",
                "2-4 jours",
                Arrays.asList("Surf", "Yoga", "Plage", "Cafés Chill")
        ));

        list.add(new Destination(
                6L,
                "Tiznit",
                "Souss-Massa",
                "Ville réputée pour ses bijoux Amazigh en argent.",
                "https://images.unsplash.com/photo-1501785888041-af3ef285b470",
                4.2,
                "sec",
                "1-2 jours",
                Arrays.asList("Médina", "Souks", "Bijoux Amazigh")
        ));

        list.add(new Destination(
                7L,
                "Tanger",
                "Tanger-Tétouan-Al Hoceima",
                "Ville du détroit : artistique, moderne et historique.",
                "https://images.unsplash.com/photo-1579546929518-9e396f3cc809",
                4.5,
                "ensoleillé",
                "1-3 jours",
                Arrays.asList("Kasbah", "Grottes d'Hercule", "Cap Spartel", "Marina Bay")
        ));

        list.add(new Destination(
                8L,
                "Chefchaouen",
                "Tanger-Tétouan-Al Hoceima",
                "Perle bleue du Maroc, paysages de montagne.",
                "https://images.unsplash.com/photo-1500530855697-b586d89ba3ee",
                4.8,
                "nuageux",
                "1-2 jours",
                Arrays.asList("Akchour", "Ruelles bleues", "Place Outa Hammam")
        ));

        list.add(new Destination(
                9L,
                "Al Hoceima",
                "Tanger-Tétouan-Al Hoceima",
                "Magnifiques plages du Rif et nature sauvage.",
                "https://images.unsplash.com/photo-1507525428034-b723cf961d3e",
                4.3,
                "ensoleillé",
                "2-3 jours",
                Arrays.asList("Plage Quemado", "Parc National", "Corniche")
        ));

        list.add(new Destination(
                10L,
                "Fès",
                "Fès-Meknès",
                "Capitale spirituelle : artisanat, médina, histoire.",
                "https://images.unsplash.com/photo-1503264116251-35a269479413",
                4.4,
                "doux",
                "2-4 jours",
                Arrays.asList("Tanneries", "Qarawiyine", "Médina Fes El Bali")
        ));

        list.add(new Destination(
                11L,
                "Meknès",
                "Fès-Meknès",
                "Ville impériale et région des vignobles.",
                "https://images.unsplash.com/photo-1524492412937-bf2ac0a5b0e1",
                4.3,
                "doux",
                "1-2 jours",
                Arrays.asList("Bab Mansour", "Heri Souani", "Volubilis")
        ));

        list.add(new Destination(
                12L,
                "Ifrane",
                "Fès-Meknès",
                "La petite Suisse : montagnes et neige.",
                "https://images.unsplash.com/photo-1600836860465-b8df247e8042",
                4.6,
                "froid",
                "1-3 jours",
                Arrays.asList("Michlifen Ski", "Lac Aoua", "Centre-ville")
        ));

        list.add(new Destination(
                13L,
                "Merzouga",
                "Drâa-Tafilalet",
                "Dunes de l'erg Chebbi, désert et bivouac.",
                "https://images.unsplash.com/photo-1501785888041-af3ef285b470",
                4.9,
                "chaud",
                "1-2 jours",
                Arrays.asList("Chameaux", "Bivouac", "Coucher de soleil")
        ));

        list.add(new Destination(
                14L,
                "Ouarzazate",
                "Drâa-Tafilalet",
                "Hollywood marocain, kasbahs et cinéma.",
                "https://images.unsplash.com/photo-1519681393784-d120267933ba",
                4.5,
                "chaud",
                "1-2 jours",
                Arrays.asList("Ait Ben Haddou", "Studios Atlas", "Kasbahs")
        ));

        return list;
    }
}
