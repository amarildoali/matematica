package com.amarildo;

public class Superiori {

    int fattoriale(int n){
        if (n < 2){
            return 1;
        }
        return n * fattoriale(n-1);
    }

    int fattorialePiuUno(int n){
        if (n < 2){
            return 1;
        }
        return n * fattoriale(n-1) + 1;
    }
}
