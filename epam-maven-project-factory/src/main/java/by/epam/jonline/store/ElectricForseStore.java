package by.epam.jonline.store;

import by.epam.jonline.electrical_appliance.ElectricalAppliances;
import by.epam.jonline.electrical_appliance.Laptop;
import by.epam.jonline.electrical_appliance.Oven;
import by.epam.jonline.electrical_appliance.Refrigerator;
import by.epam.jonline.laptop_factory.LaptopType01Factory;
import by.epam.jonline.laptop_factory.LaptopType02Factory;
import by.epam.jonline.laptop_factory.LaptopType03Factory;
import by.epam.jonline.oven_factory.OvenType01Factory;
import by.epam.jonline.oven_factory.OvenType02Factory;
import by.epam.jonline.oven_factory.OvenType03Factory;
import by.epam.jonline.refrigerator_factory.RefrigeratorType01Factory;
import by.epam.jonline.refrigerator_factory.RefrigeratorType02Factory;
import by.epam.jonline.refrigerator_factory.RefrigeratorType03Factory;

public class ElectricForseStore extends ElectricalAppliancesStore {

	@Override
	public ElectricalAppliances createElectricalAppliances(String type, String options) {

		ElectricalAppliances electricalAppliances = null;

		if (type.equals("Oven")) {

			switch (options) {

			case "POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5":
				electricalAppliances = new Oven(new OvenType01Factory());
				break;
			case "POWER_CONSUMPTION=1500, WEIGHT=12, CAPACITY=33, DEPTH=60, HEIGHT=45, WIDTH=68":
				electricalAppliances = new Oven(new OvenType02Factory());
				break;
			case "POWER_CONSUMPTION=2000, WEIGHT=11, CAPACITY=33, DEPTH=60, HEIGHT=40, WIDTH=70":
				electricalAppliances = new Oven(new OvenType03Factory());
				break;
			default:
				System.out.println("Товара по заданным параметрам не существует");

			}

		}

		if (type.equals("Laptop")) {

			switch (options) {

			case "BATTERY_CAPACITY=1, OS=Windows, MEMORY_ROM=4000, SYSTEM_MEMORY=1000, CPU=1.2, DISPLAY_INCHS=18":
				electricalAppliances = new Laptop(new LaptopType01Factory());
				break;
			case "BATTERY_CAPACITY=1.5, OS=Linux, MEMORY_ROM=8000, SYSTEM_MEMORY=1000, CPU=2.2, DISPLAY_INCHS=19":
				electricalAppliances = new Laptop(new LaptopType02Factory());
				break;
			case "BATTERY_CAPACITY=3, OS=Windows, MEMORY_ROM=8000, SYSTEM_MEMORY=1500, CPU=3.2, DISPLAY_INCHS=22":
				electricalAppliances = new Laptop(new LaptopType03Factory());
				break;
			default:
				System.out.println("Товара по заданным параметрам не существует");

			}
		}

		if (type.equals("Refrigerator")) {

			switch (options) {

			case "POWER_CONSUMPTION=100, WEIGHT=20, FREEZER_CAPACITY=10, OVERALL_CAPACITY=300, HEIGHT=200, WIDTH=70":
				electricalAppliances = new Refrigerator(new RefrigeratorType01Factory());
				break;
			case "POWER_CONSUMPTION=200, WEIGHT=30, FREEZER_CAPACITY=15, OVERALL_CAPACITY=300, HEIGHT=180, WIDTH=80":
				electricalAppliances = new Refrigerator(new RefrigeratorType02Factory());
				break;
			case "POWER_CONSUMPTION=150, WEIGHT=35, FREEZER_CAPACITY20, OVERALL_CAPACITY=350.5, HEIGHT=250, WIDTH=75":
				electricalAppliances = new Refrigerator(new RefrigeratorType03Factory());
				break;
			default:
				System.out.println("Товара по заданным параметрам не существует");

			}
		}

		return electricalAppliances;
	}

}
