package MiddleS.task2.Java.Core.Toy;

public class Toy implements Comparable<Toy> {

    private int id;
    private String toyName;
    private int quantity;
    private int chanceOfDrop;

    public Toy(int id, String toyName, int quantity, int chanceOfDrop) {
        this.id = id;
        this.toyName = toyName;
        this.quantity = quantity;
        this.chanceOfDrop = chanceOfDrop;
    }

    public int getId() {
        return this.id;
    }

    public String getToyName() {
        return this.toyName;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getChanceOfDrop() {
        return this.chanceOfDrop;
    }

    public void setChanceOfDrop(int value) {
        this.chanceOfDrop = value;
    }

    public void setQuantity(int value) {
        this.quantity = value;
    }

    @Override
    public int compareTo(Toy toy) {
        return this.toyName.compareTo(toy.toyName);
    }
}
