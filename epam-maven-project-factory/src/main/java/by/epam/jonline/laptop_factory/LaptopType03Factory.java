package by.epam.jonline.laptop_factory;

import by.epam.jonline.option.battery_capacity.BatteryCapacity;
import by.epam.jonline.option.battery_capacity.BatteryCapacity3;
import by.epam.jonline.option.cpu.Cpu;
import by.epam.jonline.option.cpu.Cpu3_2;
import by.epam.jonline.option.display_inch.DisplayInchs;
import by.epam.jonline.option.display_inch.DisplayInchs22;
import by.epam.jonline.option.memory_rom.MemoryRom;
import by.epam.jonline.option.memory_rom.MemoryRom8000;
import by.epam.jonline.option.os.Os;
import by.epam.jonline.option.os.OsWindows;
import by.epam.jonline.option.system_memory.SystemMemory;
import by.epam.jonline.option.system_memory.SystemMemory1500;

public class LaptopType03Factory implements LaptopFactory {

	@Override
	public BatteryCapacity createBatteryCapacity() {
		return new BatteryCapacity3();
	}

	@Override
	public Os createOs() {
		return new OsWindows();
	}

	@Override
	public MemoryRom createMemoryRom() {
		return new MemoryRom8000();

	}

	@Override
	public SystemMemory createSystemMemory() {
		return new SystemMemory1500();
	}

	@Override
	public Cpu createCpu() {
		return new Cpu3_2();
	}

	@Override
	public DisplayInchs createDisplayInchs() {
		return new DisplayInchs22();
	}

}
