public enum  Binder {
    H("Hard"),
    S("Soft");

    private String description;

    Binder(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
