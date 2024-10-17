package org.example.builder_ex3;

public class House {
    private int numberOfRooms;
    private boolean hasGarage;
    private boolean hasGarden;
    private boolean hasSwimmingPool;

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public House(HouseBuilder builder) {
        this.numberOfRooms = builder.numberOfRooms;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    public static class HouseBuilder{
        private int numberOfRooms;
        private boolean hasGarage;
        private boolean hasGarden;
        private boolean hasSwimmingPool;

        public HouseBuilder setNumberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }
}
