package by.epam.jonline.electrical_appliance;

import by.epam.jonline.option.freezer_capacity.FreezerCapacity;
import by.epam.jonline.option.height.Height;
import by.epam.jonline.option.overall_capacity.OverallCapacity;
import by.epam.jonline.option.power_consumption.PowerConsumption;
import by.epam.jonline.option.weight.Weight;
import by.epam.jonline.option.width.Width;
import by.epam.jonline.refrigerator_factory.RefrigeratorFactory;

public class Refrigerator extends ElectricalAppliances {

	RefrigeratorFactory factory;

	PowerConsumption powerConsumption;
	Weight weight;
	FreezerCapacity freezerCapacity;
	OverallCapacity overallCapacity;
	Height height;
	Width width;

	public Refrigerator(RefrigeratorFactory factory) {
		this.factory = factory;
	}

	@Override
	public void production() {
		powerConsumption = factory.createPowerConsumption();
		weight = factory.createWeight();
		freezerCapacity = factory.createFreezerCapacity();
		overallCapacity = factory.createOverallCapacity();
		height = factory.createHeight();
		width = factory.createWidth();

	}

	@Override
	public void turnOn() {
		System.out.println("Refrigerator turn on");

	}

	@Override
	public void turnOff() {
		System.out.println("Refrigerator turn off");

	}

	public String toString() {
		return "Refrigerator " + powerConsumption.getClass() + " " + weight.getClass() + " "
				+ freezerCapacity.getClass() + " " + overallCapacity.getClass() + " " + height.getClass() + " "
				+ width.getClass();

	}

}
