package com.maltsevve.patterns.structural.proxy;

class ProxyCupOfTea implements CupOfTea{
    private final boolean isWaterBoiling;
    private RealCupOfTea realCupOfTea;

    public ProxyCupOfTea(boolean isWaterBoiling) {
        this.isWaterBoiling = isWaterBoiling;
    }

    @Override
    public void makeCupOfTea() {
        if (realCupOfTea == null) {
            realCupOfTea = new RealCupOfTea(isWaterBoiling);
        }
        realCupOfTea.makeCupOfTea();
    }
}
