package com.pbo;

public abstract class LivingThing {

    public abstract void walk(String nama);
    public void breath(String nama) {
        System.out.println(nama.concat(" Bernafas"));
    }
    public void eat(String nama) {
        System.out.println(nama.concat(" Makan"));
    }

}
