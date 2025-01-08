class Book {
    private String name;
    private String author;

    public Book() {
        this.name = "Unknown";
        this.author = "Unknown";
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void printBookDetails() {
        System.out.println("Book: " + name + " by " + author);
    }
}