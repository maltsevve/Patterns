package com.maltsevve.patterns.structural.bridge;

class Launcher {
    public static void main(String[] args) {
        BuildingMaterials[] buildingMaterials = {new SmlPipe(new Crane()), new SteelPipe(new Forklift())};

        for (BuildingMaterials buildingMaterial : buildingMaterials) {
            buildingMaterial.loading();
            System.out.println();
        }
    }
}
