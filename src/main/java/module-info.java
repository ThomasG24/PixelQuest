module PixelQuest {
    requires hanyaeger;

    exports org.example;
    exports org.example.entities.map;
    exports org.example.entities.map.blokken;

    opens Blokken;
    opens Audio;
    opens Achtergronden;
    opens Knoppen;
    opens Avatar;
    opens Elementen;
    opens Vijanden;
}