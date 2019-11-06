package com.pbo;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 *
 */

public class Main {

    public static void main(String[] args) {
	    Human human = new Human();
        human.setNama("Rizki Adam");

        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
}
