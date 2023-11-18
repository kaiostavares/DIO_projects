package com.kaio;

public class ListaEncadeada<T> {
    private No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public boolean isEmpty(){
        return this.referenciaEntrada == null ? true : false;
    }

    public int size(){
        int size = 0;
        No<T> referenciaAux = this.referenciaEntrada;
        while (referenciaAux != null) {
            size++;
            referenciaAux = referenciaAux.getProximoNo();
        }
        return size;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            this.referenciaEntrada = novoNo;
        }else{
            No<T> referenciaAux = this.referenciaEntrada;
            while(true){
                if(referenciaAux.getProximoNo() == null){
                    referenciaAux.setProximoNo(novoNo);
                    break;
                }
                referenciaAux = referenciaAux.getProximoNo();
            }
        }
    }

    private No<T> getNo(int index){

        this.validaIndice(index);

        No<T> referenciaAux = this.referenciaEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i <= index; i++){
            noRetorno = referenciaAux;
            referenciaAux = referenciaAux.getProximoNo();
        }
        return noRetorno;
    }

    private void validaIndice(int index){
        if(index >= size()){
            throw new IndexOutOfBoundsException("Nao existe conteúdo no índice " + index + " desta lista");
        }
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivor.getProximoNo();
        }

        No<T> noAnterior = getNo( index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noAnterior.getConteudo();
    }

    @Override
    public String toString(){
        String strRetorno = "";
        No<T> noAuxiliar = this.referenciaEntrada;
        for(int i=0; i <this.size(); i++){
            strRetorno += "No{conteudo=" + noAuxiliar.getConteudo() + "}--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
