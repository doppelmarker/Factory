package by.epam.jonline.refrigerator_factory;

import by.epam.jonline.option.freezer_capacity.FreezerCapacity;
import by.epam.jonline.option.freezer_capacity.FreezerCapacity15;
import by.epam.jonline.option.height.Height;
import by.epam.jonline.option.height.Height180;
import by.epam.jonline.option.overall_capacity.OverallCapacity;
import by.epam.jonline.option.overall_capacity.OverallCapacity300;
import by.epam.jonline.option.power_consumption.PowerConsumption;
import by.epam.jonline.option.power_consumption.PowerConsumption200;
import by.epam.jonline.option.weight.Weight;
import by.epam.jonline.option.weight.Weight30;
import by.epam.jonline.option.width.Width;
import by.epam.jonline.option.width.Width80;

public class RefrigeratorType02Factory implements RefrigeratorFactory {

	@Override
	public PowerConsumption createPowerConsumption() {
		return new PowerConsumption200();
	}

	@Override
	public Weight createWeight() {
		return new Weight30();
	}

	@Override
	public FreezerCapacity createFreezerCapacity() {
		return new FreezerCapacity15();
	}

	@Override
	public OverallCapacity createOverallCapacity() {
		return new OverallCapacity300();
	}

	@Override
	public Height createHeight() {
		return new Height180();
	}

	@Override
	public Width createWidth() {
		return new Width80();
	}

}
