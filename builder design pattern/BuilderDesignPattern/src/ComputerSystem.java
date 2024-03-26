public class ComputerSystem {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        BIOS bios = new BIOS();
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        ComputerBuilder builder = new ComputerBuilder();
        builder.setBIOS(bios)
               .setCPU(cpu)
               .setMemory(memory)
               .setHardDrive(hardDrive);

        Computer computer = builder.build();
        computer.startup();
    }
}
