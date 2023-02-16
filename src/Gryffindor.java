public class Gryffindor extends OverAll{
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int nobility, int honor, int courage, int witchcraft, int transgression) {
        super(name , witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
}

