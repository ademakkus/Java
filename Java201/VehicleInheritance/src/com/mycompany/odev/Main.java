package com.mycompany.odev;

public class Main {

    public static void main(String[] args) {
	TransPortVehicle transPortVehicle=new TransPortVehicle();
	transPortVehicle.setProducer("MAN");
	transPortVehicle.setLoadCapacity(26000);


	Tir tir=new Tir();
	tir.setProducer("Mercedes");
	tir.setContainerNumber(2);
	tir.setLoadCapacity(32000);
    }
}
