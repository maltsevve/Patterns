package com.maltsevve.patterns.structural.bridge;

abstract class BuildingMaterials {
    protected LoadingEquipment loadingEquipment;

    public BuildingMaterials(LoadingEquipment loadingEquipment) {
        this.loadingEquipment = loadingEquipment;
    }

    public abstract void loading();
}
