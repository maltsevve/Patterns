package com.maltsevve.patterns.behavioral.memento;

class SaveSickLeaveRunner {
    public static void main(String[] args) {
        SickLeave sickLeave = new SickLeave();
        HospitalCardFile hospitalCardFile = new HospitalCardFile();

        System.out.println("New sick leave");
        sickLeave.setNameAgeDate("John", 28);
        System.out.println(sickLeave);

        System.out.println("Saving current sick leave\n");
        hospitalCardFile.setSave(sickLeave.save());

        System.out.println("Change name:");
        sickLeave.setNameAgeDate("John Smith", 28);
        System.out.println(sickLeave);

        System.out.println("Restore the previous name:");
        sickLeave.load(hospitalCardFile.getSave());
        System.out.println(sickLeave);
    }
}
