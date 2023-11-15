package com.projetoNo;

public class No<T> {
    private T conteudo;
    private No<T> proxinmoNo;

    public No(T conteudo){
        this.proxinmoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public No<T> getProxinmoNo() {
        return proxinmoNo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setProxinmoNo(No<T> proxinmoNo) {
        this.proxinmoNo = proxinmoNo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }
}
