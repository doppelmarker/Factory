package by.epam.jonline.laptop_factory;

import by.epam.jonline.option.battery_capacity.BatteryCapacity;
import by.epam.jonline.option.battery_capacity.BatteryCapacity1_5;
import by.epam.jonline.option.cpu.Cpu;
import by.epam.jonline.option.cpu.Cpu2_2;
import by.epam.jonline.option.display_inch.DisplayInchs;
import by.epam.jonline.option.display_inch.DisplayInchs19;
import by.epam.jonline.option.memory_rom.MemoryRom;
import by.epam.jonline.option.memory_rom.MemoryRom8000;
import by.epam.jonline.option.os.Os;
import by.epam.jonline.option.os.OsLinux;
import by.epam.jonline.option.system_memory.SystemMemory;
import by.epam.jonline.option.system_memory.SystemMemory1000;

public class LaptopType02Factory implements LaptopFactory {

	@Override
	public BatteryCapacity createBatteryCapacity() {
		return new BatteryCapacity1_5();
	}

	@Override
	public Os createOs() {
		return new OsLinux();
	}

	@Override
	public MemoryRom createMemoryRom() {
		return new MemoryRom8000();
	}

	@Override
	public SystemMemory createSystemMemory() {
		return new SystemMemory1000();
	}

	@Override
	public Cpu createCpu() {
		return new Cpu2_2();
	}

	@Override
	public DisplayInchs createDisplayInchs() {
		return new DisplayInchs19();
	}

}
