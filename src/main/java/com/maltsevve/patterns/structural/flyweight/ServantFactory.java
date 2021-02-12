package com.maltsevve.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class ServantFactory {
    private static final Map<String, DomesticServant> servants = new HashMap<>();

    public DomesticServant getServantBySpecialty(String specialty) {
        DomesticServant domesticServant = servants.get(specialty);

        if (domesticServant == null) {
            switch (specialty) {
                case "maid" -> {
                    System.out.println("Hiring maid...");
                    domesticServant = new Maid();
                }
                case "gardener" -> {
                    System.out.println("Hiring gardener...");
                    domesticServant = new Gardener();
                }
            }
            servants.put(specialty, domesticServant);
        }

        return domesticServant;
    }
}
