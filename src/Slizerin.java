public class Slizerin extends OverAll{
    private int cunning;
    private int determination;
    private int ambition;
    private int overbearing;

    public Slizerin(String name, int cunning, int determination, int ambition, int overbearing, int witchcraft, int transgression) {
        super(name, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.overbearing = overbearing;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getOverbearing() {
        return overbearing;
    }

    public void setOverbearing(int overbearing) {
        this.overbearing = overbearing;
    }
}
