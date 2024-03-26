// Computer.java
public class Computer {
    private BIOS bios;
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer(ComputerBuilder builder) {
        this.bios = builder.bios;
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.hardDrive = builder.hardDrive;
    }

    public void startup() {
        System.out.println("Initializing BIOS...");
        bios.initialize();

        System.out.println("Initializing CPU...");
        cpu.initialize();

        System.out.println("Initializing Memory...");
        memory.initialize();

        System.out.println("Initializing Hard Drive...");
        hardDrive.initialize();

        System.out.println("Computer startup sequence completed.");
    }

}