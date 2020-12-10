package by.epam.jonline.electrical_appliance;

import by.epam.jonline.option.capacity.Capacity;
import by.epam.jonline.option.depth.Depth;
import by.epam.jonline.option.height.Height;
import by.epam.jonline.option.power_consumption.PowerConsumption;
import by.epam.jonline.option.weight.Weight;
import by.epam.jonline.option.width.Width;
import by.epam.jonline.oven_factory.OvenFactory;

public class Oven extends ElectricalAppliances {

	OvenFactory factory;

	PowerConsumption powerConsumption;
	Weight weight;
	Capacity capacity;
	Depth depth;
	Height height;
	Width width;

	public Oven(OvenFactory factory) {
		this.factory = factory;

	}

	public void production() {

		powerConsumption = factory.createPowerConsumption();
		weight = factory.createWeight();
		capacity = factory.createCapacity();
		depth = factory.createDepth();
		height = factory.createHeight();
		width = factory.createWidth();

	}

	@Override
	public void turnOn() {
		System.out.println("Oven turn on");

	}

	@Override
	public void turnOff() {
		System.out.println("Oven turn off");

	}

	public String toString() {
		return "Oven " + powerConsumption.getClass() + " " + weight.getClass() + " " + capacity.getClass() + " "
				+ depth.getClass() + " " + height.getClass() + " " + width.getClass();
		
	}
	
}
