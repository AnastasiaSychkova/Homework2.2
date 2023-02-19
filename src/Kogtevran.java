public class Kogtevran extends Hogvarts {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Kogtevran(String name, int smart, int wise, int witty, int creative, int witchcraft, int transgression) {
        super(name, witchcraft, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
    private int calcSum(){
        return this.smart + this.wise + this.creative + this.witty;
    }
    public void compare(Kogtevran kogtevran) {
        if (this.calcSum() > kogtevran.calcSum()) {
            System.out.println(this.getName() + " лучше, чем " + kogtevran.getName());
        } else {
            System.out.println(kogtevran.getName() + " лучше, чем " + this.getName());
        }
    }
}
