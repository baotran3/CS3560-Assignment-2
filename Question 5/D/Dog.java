class Dog {
    private String breed;
    private String name;

    public Dog() {
        this.breed = "Unknown";
        this.name = "Unknown";
    }

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }
}
