package com.maltsevve.patterns.behavioral.observer;

class BadNews {
    public static void main(String[] args) {
        TaxInspectorateWebSite taxSite = new TaxInspectorateWebSite();

        taxSite.addClause("VAT 50%");
        taxSite.addClause("Income tax 50%");

        Observer accountant1 = new Accountant("Natalia");
        Observer accountant2 = new Accountant("Viktoria");

        taxSite.addObserver(accountant1);
        taxSite.addObserver(accountant2);

        taxSite.addClause("Personal income tax 50%");

        taxSite.removeClause("VAT 50%");
        taxSite.addClause("VAT 60%");
    }
}
