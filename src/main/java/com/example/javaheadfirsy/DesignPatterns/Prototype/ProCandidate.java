package com.example.javaheadfirsy.DesignPatterns.Prototype;

public class ProCandidate extends Candidate{
    private int iq;

    public ProCandidate(){

    }

    public ProCandidate(ProCandidate st){
        super(st);
        this.iq = st.iq;
    }

    public int getIq(){
        return iq;
    }
    public void setIq(int iq){
        this.iq = iq;
    }

    @Override
    public ProCandidate clone(){
        return new ProCandidate(this);
    }

    public String toString(){
        return super.toString();

    }

}
