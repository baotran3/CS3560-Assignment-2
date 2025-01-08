class Player {
    private String name;
    private boolean expert;

    public Player(String name, boolean expert) {
        this.name = name;
        this.expert = expert;
    }

    public String getName() {
        return name;
    }

    public boolean isExpert() {
        return expert;
    }
}
