package com.maltsevve.patterns.structural.proxy;

class CupOfTeaLauncher {
    public static void main(String[] args) {
        CupOfTea cupOfTea = new ProxyCupOfTea(true); // Благодаря использованию данного шаблона, в данной
        // строке ссылочной переменной уже присвоено значение, но метод не выполняется до его непосредственного вызова

        cupOfTea.makeCupOfTea(); // Если закоментировать данную строку программа ничего делать не будет.

        // А в таком варианте выполнение методов произойдет сразу же:
        // CupOfTea cupOfTea1 = new RealCupOfTea(true);
    }
}
