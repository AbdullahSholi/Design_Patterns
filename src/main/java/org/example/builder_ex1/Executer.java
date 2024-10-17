package org.example.builder_ex1;

public class Executer {
    public static void main(String[] args) {
        Computer computer = new Computer
                .ComputerBuilder()
                .setRAM("4G")
                .setCPU("2KHz")
                .setGraphicsCard("Nvidia")
                .setStorage("1 Tera")
                .build();
        System.out.println("RAM: " + computer.getRAM());
        System.out.println("CPU: " + computer.getCPU());
        System.out.println("Graphic Card: " + computer.getGraphicsCard());
        System.out.println("Storage: " + computer.getStorage());

    }
}
