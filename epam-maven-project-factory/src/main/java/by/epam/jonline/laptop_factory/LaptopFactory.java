package by.epam.jonline.laptop_factory;

import by.epam.jonline.option.battery_capacity.BatteryCapacity;
import by.epam.jonline.option.cpu.Cpu;
import by.epam.jonline.option.display_inch.DisplayInchs;
import by.epam.jonline.option.memory_rom.MemoryRom;
import by.epam.jonline.option.os.Os;
import by.epam.jonline.option.system_memory.SystemMemory;

public interface LaptopFactory {

	public BatteryCapacity createBatteryCapacity();

	public Os createOs();

	public MemoryRom createMemoryRom();

	public SystemMemory createSystemMemory();

	public Cpu createCpu();

	public DisplayInchs createDisplayInchs();

}
