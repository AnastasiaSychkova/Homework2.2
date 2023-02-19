import org.w3c.dom.ls.LSOutput;

public class Gryffindor extends Hogvarts{
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
    private int calcSum(){
        return this.nobility + this.honor + this.courage;
    }
    public void compare(Gryffindor gryffindor) {
        if (this.calcSum() > gryffindor.calcSum()) {
            System.out.println(this.getName() + " лучше, чем " + gryffindor.getName());
        } else {
            System.out.println(gryffindor.getName() + " лучше, чем " + this.getName());
        }
    }

}

