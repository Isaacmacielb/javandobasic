package com.basico.Praticando;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterFluxo {
    public static void main(String[] args) {
        List<String> produtos = Arrays.asList("caneta", "lapis", "caderno",
                "livros", "borracha", "mochila");

        List<String> resultado = produtos.stream().filter(produto -> produto.length() > 5)
                .collect(Collectors.toList());

        resultado.forEach(produto -> System.out.println(produto));
    }
}
