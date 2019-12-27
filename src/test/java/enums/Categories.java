package enums;

public enum Categories {
    CHILD_ITEMS("Детские товары"),
    HOUSEHOLD_APPLIANCES("Бытовая техника"),
    ITEMS_FOR_BUSINESS("Товары для бизнеса")
    ;
    private String name;

    Categories(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
