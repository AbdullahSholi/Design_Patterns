package org.example.builder_ex1;

public class Computer {
    private String RAM;
    private String CPU;
    private String storage;
    private String graphicsCard;

    public String getRAM() {
        return RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public Computer(ComputerBuilder builder) {
        this.RAM = builder.RAM;
        this.CPU = builder.CPU;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    public static class ComputerBuilder{
        private String RAM;
        private String CPU;
        private String storage;
        private String graphicsCard;

        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
