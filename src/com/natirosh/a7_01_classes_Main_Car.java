package com.natirosh;

public class a7_01_classes_Main_Car {
    public static void main(String[] args) {
        a7_02_classes_Car porsche = new a7_02_classes_Car();
        a7_02_classes_Car holden = new a7_02_classes_Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
