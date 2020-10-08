package com.company;
import com.company.entities.Trade;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Trade t1 = new Trade("T1", "APPL", 100, 15.25);
        Trade t2 = new Trade("T2", "BBL", 10);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }
}
