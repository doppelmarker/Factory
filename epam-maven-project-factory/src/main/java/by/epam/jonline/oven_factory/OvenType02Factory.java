package by.epam.jonline.oven_factory;

import by.epam.jonline.option.capacity.Capacity;
import by.epam.jonline.option.capacity.Capacity33;
import by.epam.jonline.option.depth.Depth;
import by.epam.jonline.option.depth.Depth60;
import by.epam.jonline.option.height.Height;
import by.epam.jonline.option.height.Height45;
import by.epam.jonline.option.power_consumption.PowerConsumption;
import by.epam.jonline.option.power_consumption.PowerConsumption1500;
import by.epam.jonline.option.weight.Weight;
import by.epam.jonline.option.weight.Weight12;
import by.epam.jonline.option.width.Width;
import by.epam.jonline.option.width.Width68;

public class OvenType02Factory implements OvenFactory {

	@Override
	public PowerConsumption createPowerConsumption() {
		return new PowerConsumption1500();
	}

	@Override
	public Weight createWeight() {
		return new Weight12();
	}

	@Override
	public Capacity createCapacity() {
		return new Capacity33();
	}

	@Override
	public Depth createDepth() {
		return new Depth60();
	}

	@Override
	public Height createHeight() {
		return new Height45();
	}

	@Override
	public Width createWidth() {
		return new Width68();
	}

}
