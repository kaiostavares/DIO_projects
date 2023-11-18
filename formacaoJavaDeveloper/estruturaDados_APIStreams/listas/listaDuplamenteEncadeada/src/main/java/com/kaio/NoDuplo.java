package com.kaio;

public class NoDuplo<T> {
    private T conteudo;
    private NoDuplo<T> noProximo;
    private NoDuplo<T> noPrevio;

    public NoDuplo(T conteudo){
        this.conteudo = conteudo;
    }
    public T getConteudo() {
        return conteudo;
    }
    public NoDuplo<T> getNoPrevio() {
        return noPrevio;
    }
    public NoDuplo<T> getNoProximo() {
        return noProximo;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    public void setNoPrevio(NoDuplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }
    public void setNoProximo(NoDuplo<T> noProximo) {
        this.noProximo = noProximo;
    }
    @Override
    public String toString() {
        return "NoDuplo [conteudo=" + conteudo + "]";
    }
}
