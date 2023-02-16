public class Puffendui extends OverAll{
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
}
