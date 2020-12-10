package by.epam.jonline.refrigerator_factory;

import by.epam.jonline.option.freezer_capacity.FreezerCapacity;
import by.epam.jonline.option.freezer_capacity.FreezerCapacity20;
import by.epam.jonline.option.height.Height;
import by.epam.jonline.option.height.Height250;
import by.epam.jonline.option.overall_capacity.OverallCapacity;
import by.epam.jonline.option.overall_capacity.OverallCapacity350_5;
import by.epam.jonline.option.power_consumption.PowerConsumption;
import by.epam.jonline.option.power_consumption.PowerConsumption150;
import by.epam.jonline.option.weight.Weight;
import by.epam.jonline.option.weight.Weight35;
import by.epam.jonline.option.width.Width;
import by.epam.jonline.option.width.Width75;

public class RefrigeratorType03Factory implements RefrigeratorFactory {

	@Override
	public PowerConsumption createPowerConsumption() {
		return new PowerConsumption150();
	}

	@Override
	public Weight createWeight() {
		return new Weight35();
	}

	@Override
	public FreezerCapacity createFreezerCapacity() {
		return new FreezerCapacity20();
	}

	@Override
	public OverallCapacity createOverallCapacity() {
		return new OverallCapacity350_5();
	}

	@Override
	public Height createHeight() {
		return new Height250();
	}

	@Override
	public Width createWidth() {
		return new Width75();
	}

}
