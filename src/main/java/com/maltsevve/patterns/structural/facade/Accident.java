package com.maltsevve.patterns.structural.facade;

class Accident {
    public static void main(String[] args) {
        System.out.println("Accident happened.");
        Injured injured = new Injured("John", DegreeOfInjury.MINOR); // Логичнее травмировать и отправлять
        // в поликлиннику травмированного извне, а не создавать внутри самой поликлинники.

        Polyclinic polyclinic = new Polyclinic(injured);
        polyclinic.provideMedicalAssistance();
    }
}
