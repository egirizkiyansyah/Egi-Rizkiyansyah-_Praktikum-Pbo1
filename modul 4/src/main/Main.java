package main;

import hargatoken.Token;
import hargapulsa.Pulsa;

public class Main {
    public static void main(String[] args) {

        Token token = new Token();
        Pulsa pulsa = new Pulsa();

        token.info();

        System.out.println();

        pulsa.info();
    }
}