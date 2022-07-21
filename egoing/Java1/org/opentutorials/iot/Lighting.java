package org.opentutorials.iot;

import java.util.Random;

public class Lighting implements OnOff {

	String _id;

	public Lighting(String id) {

		this._id = id;

	}

	@Override
	public boolean on() {

		System.out.println(this._id + " → Lighting on");
		return true;

	}

	@Override
	public boolean off() {

		System.out.println(this._id + " → Lighting off");
		return true;

	}

	public Boolean isOn() {

		Random rand = new Random();
		return rand.nextBoolean();

	}

}