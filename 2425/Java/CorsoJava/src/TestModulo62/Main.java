package TestModulo62;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Animale> listaAnimali = new LinkedList<>();

        listaAnimali.add(new Cane(4,true,"Nero","Beast",true));
        listaAnimali.add(new Gatto(4,true,"Grigio","Smoke",7));


        for(Animale animali : listaAnimali){
            animali.suono();
        }

    }
}
