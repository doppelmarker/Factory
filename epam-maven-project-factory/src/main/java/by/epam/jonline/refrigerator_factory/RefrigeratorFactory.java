package by.epam.jonline.refrigerator_factory;

import by.epam.jonline.option.freezer_capacity.FreezerCapacity;
import by.epam.jonline.option.height.Height;
import by.epam.jonline.option.overall_capacity.OverallCapacity;
import by.epam.jonline.option.power_consumption.PowerConsumption;
import by.epam.jonline.option.weight.Weight;
import by.epam.jonline.option.width.Width;

public interface RefrigeratorFactory {

	public PowerConsumption createPowerConsumption();

	public Weight createWeight();

	public FreezerCapacity createFreezerCapacity();

	public OverallCapacity createOverallCapacity();

	public Height createHeight();

	public Width createWidth();

}
