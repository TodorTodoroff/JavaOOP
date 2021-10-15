package IteratorsAndComparatorsT8.Lab.ComparableBook03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> author;

    public Book(String title,int year,String... author){
        this.title = title;
        this.year = year;
        this.setAuthors(author);
    }
    private void setAuthors(String... author){
        this.author = Arrays.stream(author).collect(Collectors.toList());
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }
    @Override
    public int compareTo(Book other) {
        int compared = this.title.compareTo(other.title);
        if (compared == 0) {
            compared = Integer.compare(this.getYear(), other.year);
        }
        return compared;
    }
}
