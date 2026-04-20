package com.example.pnt_hackathon_001.dto;

import com.example.pnt_hackathon_001.model.Book;
import jakarta.validation.constraints.*;

public class BookDto {

    private long id; // không validate id (do hệ thống tự sinh)

    @NotBlank(message = "Tiêu đề không được để trống")
    @Size(min = 2, max = 100, message = "Tiêu đề phải từ 2 đến 100 ký tự")
    private String title;

    @NotBlank(message = "Tác giả không được để trống")
    @Size(min = 2, max = 50, message = "Tên tác giả phải từ 2 đến 50 ký tự")
    private String author;

    @Min(value = 0, message = "Số lượng không được âm")
    @Max(value = 10000, message = "Số lượng không được vượt quá 10000")
    private int quantity;

    @NotBlank(message = "Ảnh bìa không được để trống")
    private String coverImage;

    // ====== Constructor ======
    public BookDto() {}

    public BookDto(long id, String title, String author, int quantity, String coverImage) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.coverImage = coverImage;
    }

    // ====== Chuyển từ Book → BookDTO ======
    public static BookDto fromBook(Book book) {
        return new BookDto(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getQuantity(),
                book.getCoverImage()
        );
    }

    // ====== Chuyển từ BookDTO → Book ======
    public Book toBook() {
        Book book = new Book();
        book.setId(this.id);
        book.setTitle(this.title);
        book.setAuthor(this.author);
        book.setQuantity(this.quantity);
        book.setCoverImage(this.coverImage);
        return book;
    }

    // ====== Getters & Setters ======
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getCoverImage() { return coverImage; }
    public void setCoverImage(String coverImage) { this.coverImage = coverImage; }
}