package com.example.previewfilm;

import java.util.ArrayList;

public class FilmData {
    public static String[][] data = new String[][]{
            {"Interstellar", "Sci-Fi, Action", "https://upload.wikimedia.org/wikipedia/en/b/bc/Interstellar_film_poster.jpg","Christopher Nolan","Emma Thomas\nChritoper Nolan\nLynda Obst","" +
             "Hans Zimmer","Hoyte van Hoytema","Lee Smith","Legendary Pictures\nSyncopy\nLynda Obst Productions","Paramount Pictures (North America)\nWarner Bros. Pictures (International)","" +
              "October 26, 2014 (TCL Chinese Theatre)\n" +
              "November 5, 2014 (United States)\n" +
              "November 7, 2014 (United Kingdom)","169 minutes","United States\nUnited Kingdom","" +
                    "In the mid-21st century, crop blights and dust storms threaten humanity's survival. Corn is the last viable crop. The world has also evolved into a post-truth society where younger generations are taught ideas such as the Apollo moon missions were faked. Widowed engineer and former NASA pilot Joseph Cooper is now a farmer. Living with him are his father-in-law, Donald; his 15-year-old son, Tom; and 10-year-old daughter, Murphy. After a dust storm, strange patterns made from dust inexplicably appear on Murphy's bedroom floor, she attributes the anomaly to a ghost. Cooper eventually deduces the patterns were caused by gravity variations and are a binary code for geographic coordinates. Cooper follows the coordinates to a secret NASA facility headed by Professor John Brand, Cooper's former supervisor. Professor Brand says gravitational anomalies have happened elsewhere. 48 years earlier, unknown beings positioned a wormhole near Saturn, opening a path to a distant galaxy with twelve potentially habitable worlds located near a black hole named Gargantua. Twelve volunteers traveled through the wormhole to individually survey the planets. Astronauts Miller, Edmunds, and Mann reported positive results. Based on their data, Professor Brand conceived two plans to ensure humanity's survival. Plan A involves developing a gravitational propulsion theory to propel a mass exodus, while Plan B involves launching the Endurance spacecraft carrying 5,000 frozen human embryos to colonize a habitable planet.\n"
                    },
            {"Gravity", "Sci-Fi, Drama", "https://upload.wikimedia.org/wikipedia/en/f/f6/Gravity_Poster.jpg","Alfonso Cuarón", "Alfonso Cuarón\nDavid Heyman","" +
             "Steven Price","Emmanuel Lubezki","Alfonso Cuarón\nMark Sanger","Heyday Films\nEsperanto Filmoj","Warner Bros. Pictures","" +
             "August 28, 2013 (Venice)\n" +
             "October 4, 2013 (United States)\n" +
             "November 7, 2013 (United Kingdom)","91 minutes","United Kingdom\nUnited States","NASA Space Shuttle Explorer, commanded by veteran astronaut Matt Kowalski, is in Earth's orbit on Mission STS-157 to service the Hubble Space Telescope. Dr. Ryan Stone is aboard on her first space mission as a mission specialist, to perform a set of hardware upgrades on the Hubble. During a spacewalk, Mission Control in Houston warns Explorer's crew about a Russian missile strike on a defunct satellite, which has inadvertently caused a chain reaction forming a rapidly-expanding cloud of space debris, and orders the crew to return to Earth immediately. Communication with Mission Control is lost shortly thereafter as more and more communication satellites are knocked out by the debris."},
            {"Arrival", "Drama, Mistery", "https://upload.wikimedia.org/wikipedia/en/d/df/Arrival%2C_Movie_Poster.jpg","Denis Villeneuve","Shawn Levy\nDan Levine\nAaron Ryder\nDavid Linde","" +
             "Jóhann Jóhannsson","Bradford Young","Joe Walker","FilmNation Entertainment\nLava Bear Films\n21 Laps Entertainment","Paramount Pictures","" +
                    "September 1, 2016 (Venice)\n" +
                    "November 11, 2016 (United States)","116 minutes","United States","Linguist Louise Banks's daughter, Hannah, dies in adolescence from an incurable illness.\n" +
                    "Twelve extraterrestrial spacecraft hover over disparate locations around the Earth. A U.S. Army officer, Colonel G.T. Weber, recruits Banks and physicist Ian Donnelly to find out why the aliens have come. Weber takes them to an army encampment in Montana near one of the craft. On board, Banks and Donnelly make contact with two seven-limbed aliens, whom they call \"heptapods\"; Donnelly nicknames them Abbott and Costello. Banks and Donnelly begin researching their written language of complicated circular symbols. As Banks studies the language, she starts to have visions of a child who seems to be her daughter."},
            {"Avengers: End Game", "Fantasy, Sci-Fi", "https://upload.wikimedia.org/wikipedia/en/0/0d/Avengers_Endgame_poster.jpg","Anthony Russo\nJoe Russo","Kevin Feige","" +
             "Alan Silvestri","Trent Opaloch","Jeffrey Ford\nMatthew Schmidt","Marvel Studios","Walt Disney Studios\nMotion Pictures","" +
                    "April 22, 2019 (Los Angeles Convention Center)\n" +
                    "April 26, 2019 (United States)","181 minutes","United States","Twenty-three days after Thanos used the Infinity Gauntlet to disintegrate half of all life in the universe,[N 1] Carol Danvers rescues Tony Stark and Nebula from deep space and returns them to Earth. They reunite with the remaining Avengers—Bruce Banner, Steve Rogers, Rocket, Thor, Natasha Romanoff, and James Rhodes—and find Thanos on an uninhabited planet. They plan to retake and use the Infinity Stones to reverse the disintegrations, but Thanos reveals he destroyed them to prevent further use. An enraged Thor decapitates Thanos."},
            {"Captain Marvel", "Fantasy, Sci-Fi", "https://upload.wikimedia.org/wikipedia/en/8/85/Captain_Marvel_poster.jpg","Annda Boden\nRyan Fleck","Kevin Feige","" +
             "Pinar Toprak","Ben Davis","Elliot Graham\nDebbie Berman","Marvel Studios","Walt Disney Studios\nMotion Pictures","" +
                    "February 27, 2019 (London)\n" +
                    "March 8, 2019 (United States)","124 minutes","United States","In 1995, on the Kree Empire's capital planet of Hala, Starforce member Vers suffers from amnesia and recurring nightmares involving an older woman. Yon-Rogg, her mentor and commander, trains her to control her abilities while the Supreme Intelligence, the artificial intelligence that rules the Kree, urges her to keep her emotions in check."},
            {"Avengers: Infinity War", "Fantasy, Sci-Fi", "https://upload.wikimedia.org/wikipedia/en/4/4d/Avengers_Infinity_War_poster.jpg","Anthony Russo\nJoe Russo","Kevin Feige","" +
             "Alan Silvestri","Trent Opaloch","Jeffrey Ford\nMatthew Schmidt","Marvel Studios","Walt Disney Studios\nMotion Pictures","" +
                    "April 23, 2018 (Dolby Theatre)\n" +
                    "April 27, 2018 (United States)","149 minutes","United States","Having acquired the Power Stone, one of the six Infinity Stones, from the planet Xandar, Thanos and his lieutenants—Ebony Maw, Cull Obsidian, Proxima Midnight, and Corvus Glaive—intercept the spaceship carrying the survivors of Asgard's recent destruction.[N 1] As they extract the Space Stone from the Tesseract, Thanos subdues Thor, overpowers Hulk, and kills Loki. Heimdall sends Hulk to Earth using the Bifröst before being killed. Thanos departs with his lieutenants and destroys the ship."},
            {"Venom", "Fantasy, Sci-Fi", "https://upload.wikimedia.org/wikipedia/en/1/18/Venom_%282018_film_poster%29.png","Ruben Fleischer","Avi Arad\nMatt Tolmach\nAmy Pascal","" +
             "Ludwig Göransson","Matthew Libatique","Maryann Brandon\nAlan Baumgarten","Columbia Pictures\n" +
                    "Marvel Entertainment\n" +
                    "Tencent Pictures\n" +
                    "Arad Productions\n" +
                    "Matt Tolmach Productions\n" +
                    "Pascal Pictures","Sony Pictures Releasing","October 1, 2018 (Regency Village Theater)\nOctober 5, 2018 (United States)","" +
                    "112 minutes","United States","While exploring space for new habitable worlds, a probe belonging to the bio-engineering corporation Life Foundation discovers a comet covered in symbiotic lifeforms. The probe returns to Earth with four samples, but one escapes and causes the ship to crash in Malaysia. The Life Foundation recovers the other three and transports them to their research facility in San Francisco, where they discover that the symbiotes cannot survive without oxygen-breathing hosts, which often fatally reject the symbiosis. Investigative journalist Eddie Brock reads about these human trials in a classified document in the possession of his fiancée Anne Weying, an attorney preparing a lawsuit defense for the Life Foundation. Brock confronts Life Foundation CEO Carlton Drake about the trials, leading to both Brock and Weying losing their jobs. Consequently, Weying ends their relationship."}
    };

    public static ArrayList<Film> getListData(){
        Film film = null;
        ArrayList<Film> list = new ArrayList<>();
        for (String[] aData:data){
            film = new Film();
            film.setJudul(aData[0]);
            film.setGenre(aData[1]);
            film.setPhoto(aData[2]);
            film.setDirectedBy(aData[3]);
            film.setProducedBy(aData[4]);
            film.setMusicBy(aData[5]);
            film.setCinematography(aData[6]);
            film.setEditedBy(aData[7]);
            film.setProductionCompany(aData[8]);
            film.setDistributedBy(aData[9]);
            film.setRelaseDate(aData[10]);
            film.setRunningTime(aData[11]);
            film.setCountry(aData[12]);
            film.setSynopsis(aData[13]);

            list.add(film);
        }
        return list;
    }
}
