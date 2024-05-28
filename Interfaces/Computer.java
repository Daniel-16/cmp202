package Interfaces;

public class Computer implements Electronic {

    RAM ram;
    Processor cpu;
    Storage storage;

    public Computer(RAM ram, Processor cpu, Storage storage) {
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
        
    }

    @Override
    public String toString() {
        return "Computer{" + "ram=" + ram.name + ", cpu=" + cpu.numberOfCores + ", storage=" + storage.capacity + "}";
    }

    @Override
    public boolean on() {
        return true;
    }

    @Override
    public boolean off() {
        return false;
    }
    
}
