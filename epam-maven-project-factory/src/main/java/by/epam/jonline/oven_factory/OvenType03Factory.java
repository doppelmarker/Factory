package by.epam.jonline.oven_factory;

import by.epam.jonline.option.capacity.Capacity;
import by.epam.jonline.option.depth.Depth;
import by.epam.jonline.option.height.Height;
import by.epam.jonline.option.power_consumption.PowerConsumption;
import by.epam.jonline.option.power_consumption.PowerConsumption2000;
import by.epam.jonline.option.weight.Weight;
import by.epam.jonline.option.width.Width;

public class OvenType03Factory implements OvenFactory {

	@Override
	public PowerConsumption createPowerConsumption() {
		return new PowerConsumption2000();
	}

	@Override
	public Weight createWeight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Capacity createCapacity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Depth createDepth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Height createHeight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Width createWidth() {
		// TODO Auto-generated method stub
		return null;
	}

}
