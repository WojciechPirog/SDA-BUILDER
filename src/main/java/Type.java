public enum Type {
    THR("Thriller"),
    DRM("Dramat"),
    COM("Comedy"),
    ACT("Action");

    private String description;

    Type(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
