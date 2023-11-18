package com.kaio;

public class App {
    public static void main(String args[]){
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");

        System.out.println(minhaListaEncadeada.get(3));
        System.out.println(minhaListaEncadeada);
        minhaListaEncadeada.remove(2);
        System.out.println(minhaListaEncadeada);

    }
}
