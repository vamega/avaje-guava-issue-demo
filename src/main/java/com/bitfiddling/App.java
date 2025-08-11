package com.bitfiddling;

import com.google.common.collect.ImmutableList;
import io.avaje.jsonb.JsonType;
import io.avaje.jsonb.Jsonb;

public class App {
    public static void main(String[] args) {
        Book book = new Book("Flowers for Algernon", ImmutableList.<String>builder().add("Daniel Keyes").build());
        Jsonb jsonb = Jsonb.builder().build();

        JsonType<Book> bookJsonType = jsonb.type(Book.class);

        String bookString = jsonb.toJson(book);
        System.out.println("Will attempt to parse the following json string");
        System.out.println(bookString);
        Book parsedBook = bookJsonType.fromJson(bookString);
        System.out.println(parsedBook);
    }
}
