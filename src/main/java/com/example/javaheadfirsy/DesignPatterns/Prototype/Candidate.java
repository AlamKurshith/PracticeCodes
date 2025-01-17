package com.example.javaheadfirsy.DesignPatterns.Prototype;

public class Candidate implements Prototype<Candidate>{

    private int age;
    private String name;
    private int psp;
    private int avgBatchPsp;
    private String batchName;
    private int counter;

    public Candidate(){

    }

    public Candidate(Candidate st){
        this.age = st.age;
        this.name = st.name;
        this.psp = st.psp;
        this.avgBatchPsp = st.avgBatchPsp;
        this.batchName = st.batchName;
        this.counter = st.counter;

    }


    @Override
    public Candidate clone() {
        return new Candidate(this);
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPsp(){
        return psp;
    }

    public void setPsp(int psp){
        this.psp = psp;
    }

    public int getAvgBatchPsp(){
        return avgBatchPsp;
    }
    public void setAvgBatchPsp(int avgBatchPsp){
        this.avgBatchPsp = avgBatchPsp;
    }

    public String getBatchName(){
        return batchName;
    }

    public void setBatchName(String batchName){
        this.batchName = batchName;
    }

    public String toString(){
        return "[ Name : " + name + ", Age : " + age + ", PSP: " + psp + ", Batch Name ; " + batchName + "]";
    }

}


