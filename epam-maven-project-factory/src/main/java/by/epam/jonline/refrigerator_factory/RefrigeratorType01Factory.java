package by.epam.jonline.refrigerator_factory;

import by.epam.jonline.option.freezer_capacity.FreezerCapacity;
import by.epam.jonline.option.freezer_capacity.FreezerCapacity10;
import by.epam.jonline.option.height.Height;
import by.epam.jonline.option.height.Height200;
import by.epam.jonline.option.overall_capacity.OverallCapacity;
import by.epam.jonline.option.overall_capacity.OverallCapacity300;
import by.epam.jonline.option.power_consumption.PowerConsumption;
import by.epam.jonline.option.power_consumption.PowerConsumption100;
import by.epam.jonline.option.weight.Weight;
import by.epam.jonline.option.weight.Weight20;
import by.epam.jonline.option.width.Width;
import by.epam.jonline.option.width.Width70;

public class RefrigeratorType01Factory implements RefrigeratorFactory {

	@Override
	public PowerConsumption createPowerConsumption() {
		return new PowerConsumption100();
	}

	@Override
	public Weight createWeight() {
		return new Weight20();
	}

	@Override
	public FreezerCapacity createFreezerCapacity() {
		return new FreezerCapacity10();
	}

	@Override
	public OverallCapacity createOverallCapacity() {
		return new OverallCapacity300();
	}

	@Override
	public Height createHeight() {
		return new Height200();
	}

	@Override
	public Width createWidth() {
		return new Width70();
	}

}
