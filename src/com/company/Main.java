package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> mapPersonnes = new HashMap<>();

        String csv = "jean,42/marie,30/typhaine,50/claire,70";

        String[] tabPersonnes = csv.split("/");

        for (String personne : tabPersonnes) {
            String[] tabInfosPersonne = personne.split(",");
            String nom = tabInfosPersonne[0];
            int age = Integer.parseInt(tabInfosPersonne[1]);
            mapPersonnes.put(nom, age);
        }

        for (String prenom: mapPersonnes.keySet()){
            int age = mapPersonnes.get(prenom);
            String statut = "actif";
            if (age > 65)
                statut = "retraite";
            System.out.println(prenom + " " + age + " ans : retraite ? " + statut);
        }

    }


}
