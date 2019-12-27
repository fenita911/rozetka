package enums;

public enum Subcategories {
    FRIDGES("Холодильники"),
    WASHING_MACHINES("Стиральные машины"),
    AIR_CONDITIONERS("Кондиционеры");


    private String name;


    Subcategories(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}


