package com.basico.Praticando.FilterObj;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<User> pessoas = Arrays.asList(
                new User("Jack", "jack234@gmail.com"),
                new User("Peter", "pete2@post.com"),
                new User("Lucy", "lucy17@gmail.com"),
                new User("Robert", "bob56@post.com"),
                new User("Martin", "mato4@email.com")
        );

        List<User> resultado = pessoas.stream()
                .filter(person -> person.getEmail().matches(".*email\\.com"))
                .collect(Collectors.toList());
        resultado.forEach(p -> System.out.println(p.getName()));

    }
}
