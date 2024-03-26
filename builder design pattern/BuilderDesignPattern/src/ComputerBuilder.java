// ComputerBuilder.java
public class ComputerBuilder {
    public BIOS bios;
    public CPU cpu;
    public Memory memory;
    public HardDrive hardDrive;

    public BIOS getBios() {
        return bios;
    }

    public ComputerBuilder setBIOS(BIOS bios) {
        this.bios = bios;
        return this;
    }

    public CPU getCpu() {
        return cpu;
    }

    public ComputerBuilder setCPU(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    public Memory getMemory() {
        return memory;
    }

    public ComputerBuilder setMemory(Memory memory) {
        this.memory = memory;
        return this;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public ComputerBuilder setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }
}