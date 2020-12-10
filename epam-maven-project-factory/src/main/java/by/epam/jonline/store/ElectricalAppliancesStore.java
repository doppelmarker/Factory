package by.epam.jonline.store;

import by.epam.jonline.electrical_appliance.ElectricalAppliances;

public abstract class ElectricalAppliancesStore {

	public ElectricalAppliances orderElectricalAppliances(String type, String options) {

		ElectricalAppliances electricalAppliances;
		
		electricalAppliances = createElectricalAppliances(type, options);

		electricalAppliances.production();
		electricalAppliances.turnOn();
		electricalAppliances.turnOff();
		
		return electricalAppliances;
	}
	
	public abstract ElectricalAppliances createElectricalAppliances (String type, String options);

}
