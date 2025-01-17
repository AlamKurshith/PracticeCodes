package com.example.javaheadfirsy.DesignPatterns.Adapter;

public class Client {

    // Real world analogy:

    //Think of a socket that only support two-pin plug, but the laptop's plug has a three pin pointer.
    // In this case, an adapter can be used to make it compatible with the two-pin socket.
    //It acts as a bridge between the socket and plug point, it lets the plug point adapt according to the socket.


    //There are three key components to this:

    //1. Target Interface: This is the interface the client expect. (The two pin socket, that expects a two pin plug)

    //2. Adaptee: The existing class that need adapting.( The existing three-pin plug.

    //3. Adapter: A class that implements the target interface and translate the request to the adaptee.
    // (A bridge that adapts the adaptee's interface to match the target interface)


    public static void main(String[] args) {

        OldBankSystem oldBankSystem = new OldBankSystem();

        BankingAPI bankingAPI = new BankingAdapter(oldBankSystem);

        System.out.println(bankingAPI.sendMoney("Alam", "Sanju", 10000));
        System.out.println(bankingAPI.checkBalance());

    }

}
