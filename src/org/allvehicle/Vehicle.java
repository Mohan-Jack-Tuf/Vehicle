package org.allvehicle;

import org.twowheeler.TwoWheeler;
import org.threewheeler.*;
import org.fourwheeler.*;
public class Vehicle {

	private void vehicleNecessery() {
System.out.println("Vehicle Necessery");
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.vehicleNecessery();
		TwoWheeler t = new TwoWheeler();
		t.bike();
		t.cycle();
		ThreeWheeler th = new ThreeWheeler();
		th.Auto();
		FourWheeler f = new FourWheeler();
		f.car();
		f.bus();
		f.lorry();
		
	}
}
