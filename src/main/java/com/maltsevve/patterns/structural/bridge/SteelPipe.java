package com.maltsevve.patterns.structural.bridge;

class SteelPipe extends BuildingMaterials {
    public SteelPipe(LoadingEquipment loadingEquipment) {
        super(loadingEquipment);
    }

    @Override
    public void loading() {
        System.out.println("Steel pipes loading in progress.");
        loadingEquipment.load();
    }
}
