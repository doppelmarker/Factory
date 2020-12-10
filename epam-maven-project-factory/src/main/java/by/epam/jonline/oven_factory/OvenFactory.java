package by.epam.jonline.oven_factory;

import by.epam.jonline.option.capacity.Capacity;
import by.epam.jonline.option.depth.Depth;
import by.epam.jonline.option.height.Height;
import by.epam.jonline.option.power_consumption.PowerConsumption;
import by.epam.jonline.option.weight.Weight;
import by.epam.jonline.option.width.Width;

public interface OvenFactory {

	public PowerConsumption createPowerConsumption();

	public Weight createWeight();

	public Capacity createCapacity();

	public Depth createDepth();

	public Height createHeight();

	public Width createWidth();

}
