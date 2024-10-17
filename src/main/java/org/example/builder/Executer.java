package org.example.builder;

public class Executer {
    public static void main(String[] args) {
        Player player = new Player.Builder().setName("Abdullah").build();
        System.out.println(player.getName());
    }
}
