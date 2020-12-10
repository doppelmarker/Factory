package by.epam.jonline.electrical_appliance;

import by.epam.jonline.laptop_factory.LaptopFactory;
import by.epam.jonline.option.battery_capacity.BatteryCapacity;
import by.epam.jonline.option.cpu.Cpu;
import by.epam.jonline.option.display_inch.DisplayInchs;
import by.epam.jonline.option.memory_rom.MemoryRom;
import by.epam.jonline.option.os.Os;
import by.epam.jonline.option.system_memory.SystemMemory;

public class Laptop extends ElectricalAppliances {

	LaptopFactory factory;

	BatteryCapacity batteryCapacity;
	Os os;
	MemoryRom memoryRom;
	SystemMemory systemMemory;
	Cpu cpu;
	DisplayInchs displayInchs;

	public Laptop(LaptopFactory factory) {
		this.factory = factory;
	}

	@Override
	public void production() {
		batteryCapacity = factory.createBatteryCapacity();
		os = factory.createOs();
		memoryRom = factory.createMemoryRom();
		systemMemory = factory.createSystemMemory();
		cpu = factory.createCpu();
		displayInchs = factory.createDisplayInchs();

	}

	@Override
	public void turnOn() {
		System.out.println("Laptop turn on");

	}

	@Override
	public void turnOff() {
		System.out.println("Laptop turn off");

	}
	
	public String toString() {
		return "Laptop " + batteryCapacity.getClass() + " " + os.getClass() + " " + memoryRom.getClass() + " "
				+ systemMemory.getClass() + " " + cpu.getClass() + " " + displayInchs.getClass();
		
	}

}
