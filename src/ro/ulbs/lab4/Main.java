package ro.ulbs.lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList(); //d

        Random random = new Random();

        // Generare valori aleatorii pentru lista x
        for (int i = 0; i < 5; i++) {
            x.add(random.nextInt(0,10)); // Domeniul [0..10]
        }

        // Generare valori aleatorii pentru lista y
        for (int i = 0; i < 7; i++) {
            y.add(random.nextInt(0,10)); // Domeniul [0..10]
        }

        // Ordonare liste crescător
        Collections.sort(x);
        Collections.sort(y);

        // a) xPlusY conține toate elementele șirurilor x și y
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        // b) zSet conține numai valorile comune din ambele șiruri, luate o singură dată
        Set<Integer> xSet = new HashSet<>(x);
        for (Integer value : y) {
            if (xSet.contains(value)) {
                zSet.add(value);
            }
        }

        // c) xMinusY conține valorile din șirul x care nu se află în șirul y
        Set<Integer> ySet = new HashSet<>(y);
        for (Integer value : x) {
            if (!ySet.contains(value)) {
                xMinusY.add(value);
            }
        }
        Collections.sort(xMinusY);

        // d) xPlusYLimitedByP este mulțimea elementelor din x și y ce nu depășesc valoarea p
        for (Integer value : xPlusY) {
            if (value <= p) {
                xPlusYLimitedByP.add(value);
            }
        }
        Collections.sort(xPlusYLimitedByP);

        // Afișare rezultate
        System.out.println("Lista x ordonată: " + x);
        System.out.println("Lista y ordonată: " + y);
        System.out.println("Lista xPlusY ordonată: " + xPlusY);
        System.out.println("Setul zSet ordonat: " + zSet);
        System.out.println("Lista xMinusY ordonată: " + xMinusY);
        System.out.println("Lista xPlusYLimitedByP ordonată: " + xPlusYLimitedByP);
    }

    }


