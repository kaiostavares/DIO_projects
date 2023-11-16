package com.kaio;


public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public boolean isEmprty(){
        return refNoEntradaFila == null ? true : false;
    }


    public void enqueue(T obj){
        No<T> novoNo = new No<>(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T fisrt(){

        No<T> aux = refNoEntradaFila;
        if(!this.isEmprty()){

            while(aux != null){
                if(aux.getRefNo() == null){
                    break;
                }
                aux = aux.getRefNo();
            }
            return (T) aux.getObject();
        }else{
            return null;
        }

    }

    public T dequeue(){
        
        No<T> aux = refNoEntradaFila;
        No<T> auxAnterior = refNoEntradaFila;

        if(!this.isEmprty()){
            while(aux != null){
                if(aux.getRefNo() == null){
                    auxAnterior.setRefNo(null);
                    break;
                }
                auxAnterior = aux;
                aux = aux.getRefNo();
            }
            return (T) aux.getObject();
        }else{
            return null;
        }
    }

    @Override
    public String toString(){
        String stringRetorno = "";
        No<T> noAuxiliar = refNoEntradaFila;
        if(!this.isEmprty()){
            while(noAuxiliar != null){
                stringRetorno += "[No{objeto = " + noAuxiliar.getObject() + "}]---->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno += "null";
        }

        return stringRetorno;
    }

    
}

