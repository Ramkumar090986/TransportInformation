package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	public void TransportForm() {
		System.out.println("Transport Form:");

	}
	public static void main(String[] args) {
		Transport t1=new Transport();
		t1.TransportForm();
		Road r1=new Road();
		r1.cycle();
		r1.bus();
		r1.car();
	    Air a1=new Air();
	    a1.aeroPlane();
	    a1.heliCopter();
	    Water w1=new Water();
	    w1.boat();
	    w1.ship();
	    
	}

}
