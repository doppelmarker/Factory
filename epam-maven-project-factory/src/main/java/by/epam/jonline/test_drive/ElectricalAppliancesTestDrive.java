package by.epam.jonline.test_drive;

import by.epam.jonline.electrical_appliance.ElectricalAppliances;
import by.epam.jonline.store.ElectricForseStore;
import by.epam.jonline.store.ElectricalAppliancesStore;

public class ElectricalAppliancesTestDrive {

	public static void main(String[] args) {

		ElectricalAppliancesStore store = new ElectricForseStore();

		ElectricalAppliances electricalAppliances = store.orderElectricalAppliances("Oven",
				"POWER_CONSUMPTION=1500, WEIGHT=12, CAPACITY=33, DEPTH=60, HEIGHT=45, WIDTH=68");
		
		System.out.println(electricalAppliances.toString());
	
	}
	
}