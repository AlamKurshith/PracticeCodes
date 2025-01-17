package com.example.javaheadfirsy.DesignPatterns.Prototype;

public class Client {
    public static void main(String[] args) {


        Candidate candidate = new Candidate();
        candidate.setAge(12);
        candidate.setName("Alam");
        candidate.setPsp(100);
        candidate.setAvgBatchPsp(80);
        candidate.setBatchName("Dummy Batch");

        Candidate copy = candidate.clone();

        ProCandidate proCandidate = new ProCandidate();
        proCandidate.setIq(122);
        proCandidate.setAge(12);
        Candidate intelligentCandidate  = proCandidate.clone();

        System.out.println(intelligentCandidate.toString() + " Print statement");
        System.out.println(copy.toString());


    }
}
