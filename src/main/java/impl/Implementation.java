package impl;

import interfaces.Interface1;

//Class 'Implementation' must either be declared abstract or implement abstract method 'pubg()' in 'Interface1'
public class Implementation implements Interface1 {

    @Override
    public void pubg() {
        System.out.println("pubg method");

    }

    @Override
    public void starwars() {
        System.out.println("starwars method");
    }

    @Override
    public void minu() {
        System.out.println("minu method");
    }

    public static void main(String[] args) {
        Implementation i = new Implementation();
        i.minu();
        i.pubg();
        i.starwars();
    }
}
