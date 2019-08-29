package se.ecutb.erik.model;

public class Gladiator {
    //Fields
    private String name;
    private int strength;
    private int health;

    //Constructor
    public Gladiator(String name, int strength, int health){
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public String getDetails(){
        StringBuilder sb = new StringBuilder();
        sb.append("Gladiator " + getName() + " Str: " + getStrength() + " HP: " + getHealth());
        return sb.toString();
    }

}
