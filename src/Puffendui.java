public class Puffendui extends Hogvarts{
    private int honesty;
    private int diligence;
    private int loyalty;

    public Puffendui(String name, int honesty, int diligence, int loyalty, int witchcraft, int transgression) {
        super(name, witchcraft, transgression);
        this.honesty = honesty;
        this.diligence = diligence;
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    private int calcSum(){
        return this.honesty + this.diligence + this.loyalty;
    }
    public void compare(Puffendui puffendui) {
        if (this.calcSum() > puffendui.calcSum()) {
            System.out.println(this.getName() + " лучше, чем " + puffendui.getName());
        } else {
            System.out.println(puffendui.getName() + " лучше, чем " + this.getName());
        }
    }
}
