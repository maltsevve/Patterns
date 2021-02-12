package com.maltsevve.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class TaxInspectorateWebSite implements Observed {
    List<String> taxClauses = new ArrayList<>();
    List<Observer> accountants = new ArrayList<>();

    public void addClause(String taxClause) {
        this.taxClauses.add(taxClause);
        notifyObservers();
    }

    public void removeClause(String taxClause) {
        this.taxClauses.remove(taxClause);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.accountants.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.accountants.remove(observer);
    }

    @Override
    public void notifyObservers() {
        accountants.forEach(accountant -> accountant.handleEvent(this.taxClauses));
    }
}
