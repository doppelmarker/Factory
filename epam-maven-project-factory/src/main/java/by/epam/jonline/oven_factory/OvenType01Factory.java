package by.epam.jonline.oven_factory;

import by.epam.jonline.option.capacity.Capacity;
import by.epam.jonline.option.capacity.Capacity32;
import by.epam.jonline.option.depth.Depth;
import by.epam.jonline.option.depth.Depth60;
import by.epam.jonline.option.height.Height;
import by.epam.jonline.option.height.Height45_5;
import by.epam.jonline.option.power_consumption.PowerConsumption;
import by.epam.jonline.option.power_consumption.PowerConsumption1000;
import by.epam.jonline.option.weight.Weight;
import by.epam.jonline.option.weight.Weight10;
import by.epam.jonline.option.width.Width;
import by.epam.jonline.option.width.Width59_5;

public class OvenType01Factory implements OvenFactory {

	@Override
	public PowerConsumption createPowerConsumption() {
		return new PowerConsumption1000();
	}

	@Override
	public Weight createWeight() {
		return new Weight10();
	}

	@Override
	public Capacity createCapacity() {
		return new Capacity32();
	}

	@Override
	public Depth createDepth() {
		return new Depth60();
	}

	@Override
	public Height createHeight() {
		return new Height45_5();
	}

	@Override
	public Width createWidth() {
		return new Width59_5();
	}

}
