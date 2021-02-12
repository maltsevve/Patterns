package com.maltsevve.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

class Launcher {
    public static void main(String[] args) {
        ServantFactory servantFactory = new ServantFactory();

        List<DomesticServant> servants = new ArrayList<>();

        servants.add(servantFactory.getServantBySpecialty("maid"));
        servants.add(servantFactory.getServantBySpecialty("maid"));
        servants.add(servantFactory.getServantBySpecialty("maid"));
        servants.add(servantFactory.getServantBySpecialty("maid"));
        servants.add(servantFactory.getServantBySpecialty("gardener"));
        servants.add(servantFactory.getServantBySpecialty("gardener"));
        servants.add(servantFactory.getServantBySpecialty("gardener"));
        servants.add(servantFactory.getServantBySpecialty("gardener"));

        servants.forEach(DomesticServant::doHousework);
    }
}
