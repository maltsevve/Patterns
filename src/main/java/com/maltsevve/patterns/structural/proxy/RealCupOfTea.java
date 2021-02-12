package com.maltsevve.patterns.structural.proxy;

class RealCupOfTea implements CupOfTea{
    private final boolean isWaterBoiling;

    public RealCupOfTea(boolean isWaterBoiling) {
        this.isWaterBoiling = isWaterBoiling;
        pourBoilingWater();
    }

    public void pourBoilingWater() {
        if (isWaterBoiling) {
            System.out.println("Pour boiling water into a cup.");
        } else {
            System.out.println("Boil some water first.");
        }
    }

    @Override
    public void makeCupOfTea() {
        System.out.println("Put a tea bag in a cup.");
    }
}
