package model;

public enum Platform {
	Wii("Wii", "Nintendo"),
	NES("NES", "Nintendo"),
	GB("GB", "Nintendo"),
	DS("DS", "Nintendo"),
	X360("X360", "Microsoft"),
	PS3("PS3", "Sony"),
	PS2("PS2", "Sony"),
	SNES("SNES", "Nintendo"),
	GBA("GBA", "Nintendo"),
	N3DS("N3DS", "Nintendo"),
	PS4("PS4", "Sony"),
	N64("N64", "Nintendo"),
	PS("PS", "Sony"),
	XB("XB", "Microsoft"),
	PC("PC", "None"),
	Atari2600("2600", "Nintendo"),
	PSP("PSP", "Sony"),
	XOne("XOne", "Microsoft"),
	GC("GC", "Nintendo"),
	WiiU("WiiU", "Nintendo"),
	GEN("GEN", "Sega"),
	DC("DC", "Sega"),
	PSV("PSV", "Sony"),
	SAT("SAT", "Sega"),
	SCD("SCD", "Sega"),
	WS("WS", "Sega"),
	NG("NG", "SNK Corporation"),
	TG16("TG16", "Hudson Soft"),
	ThreeDO("3DO", "The 3DO Company"),
	GG("GG", "Sega"),
	PCFX("PCFX", "NEC");
	
	private String console;
	private String company;
	
	private Platform(String console, String company) {
		this.console= console;
		this.company = company;
	}

	public String getConsole() {
		return console;
	}

	public String getCompany() {
		return company;
	}
	
}
