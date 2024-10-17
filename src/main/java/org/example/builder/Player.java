package org.example.builder;

public class Player {
    private String name;
    private String team;

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getHeight() {
        return height;
    }

    public int getSalary() {
        return salary;
    }

    public String getPhone() {
        return phone;
    }

    public String getTwitterAccount() {
        return twitterAccount;
    }

    private int height;
    private int salary;
    private String phone;
    private String twitterAccount;

    public Player( Builder b ){
        this.name = b.name;
        this.team = b.team;
        this.height = b.height;
        this.salary = b.salary;
        this.phone = b.phone;
        this.twitterAccount = b.twitterAccount;
    }

    public static class Builder {
        private String name;
        private String team;
        private int height;
        private int salary;
        private String phone;
        private String twitterAccount;
        public Builder() {

        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setTeam(String team) {
            this.team = team;
            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setTwitterAccount(String twitterAccount) {
            this.twitterAccount = twitterAccount;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }
}
