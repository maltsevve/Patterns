package com.maltsevve.patterns.structural.bridge;

class SmlPipe extends BuildingMaterials {
    public SmlPipe(LoadingEquipment loadingEquipment) {
        super(loadingEquipment);
    }

    @Override
    public void loading() {
        System.out.println("SML Pipes loading in progress.");
        loadingEquipment.load();
    }
}
