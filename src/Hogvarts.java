public class Hogvarts {
    private String name;
    private int witchcraft;
    private int transgression;

    public Hogvarts(String name, int witchcraft, int transgression) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    private int calcSum(){
        return this.witchcraft + this.transgression;
    }
    public void compare(Hogvarts hogvarts) {
        System.out.println();
        if (this.calcSum() > hogvarts.calcSum()) {
            System.out.println(this.getName() + " лучше, чем " + hogvarts.getName());
        } else {
            System.out.println(hogvarts.getName() + " лучше, чем " + this.getName());
        }
    }
}
