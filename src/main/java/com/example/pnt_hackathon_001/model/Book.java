package com.example.pnt_hackathon_001.model;

public class Book {
    private long  id;
    private String title;
    private String author;
    private int quantity;
    private String coverImage;
    private static long count_id = 1;
    public Book() {
        this.id = count_id++;
    }
    public Book(String title, String author, int quantity, String coverImage) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.coverImage = coverImage;
        this.id = count_id++;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public static long getCount_id() {
        return count_id;
    }

    public static void setCount_id(long count_id) {
        Book.count_id = count_id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                ", coverImage='" + coverImage + '\'' +
                '}';
    }
}
