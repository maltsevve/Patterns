package com.maltsevve.patterns.behavioral.iterator;

class Launcher {
    public static void main(String[] args) {
        String[] phones = {"Vasia - (111)345-5343", "Masha - (222)324-32-23", "Galia - (423)423-2342"};

        AndroidPhoneBook androidPhoneBook = new AndroidPhoneBook(phones);

        PhoneBookEntryIterator pbei = androidPhoneBook.getIterator();

        while (pbei.hasNext()) {
            System.out.println(pbei.next());
        }
    }
}
