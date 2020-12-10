package by.epam.jonline.laptop_factory;

import by.epam.jonline.option.battery_capacity.BatteryCapacity;
import by.epam.jonline.option.battery_capacity.BatteryCapacity1;
import by.epam.jonline.option.cpu.Cpu;
import by.epam.jonline.option.cpu.Cpu1_2;
import by.epam.jonline.option.display_inch.DisplayInchs;
import by.epam.jonline.option.display_inch.DisplayInchs18;
import by.epam.jonline.option.memory_rom.MemoryRom;
import by.epam.jonline.option.memory_rom.MemoryRom4000;
import by.epam.jonline.option.os.Os;
import by.epam.jonline.option.os.OsWindows;
import by.epam.jonline.option.system_memory.SystemMemory;
import by.epam.jonline.option.system_memory.SystemMemory1000;

public class LaptopType01Factory implements LaptopFactory {

	@Override
	public BatteryCapacity createBatteryCapacity() {
		return new BatteryCapacity1();
	}

	@Override
	public Os createOs() {
		return new OsWindows();
	}

	@Override
	public MemoryRom createMemoryRom() {
		return new MemoryRom4000();
	}

	@Override
	public SystemMemory createSystemMemory() {
		return new SystemMemory1000();
	}

	@Override
	public Cpu createCpu() {
		return new Cpu1_2();
	}

	@Override
	public DisplayInchs createDisplayInchs() {
		return new DisplayInchs18();
	}

}
