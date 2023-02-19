public class PrintService {
    public void print(Gryffindor gryffindors) {
        Gryffindor gryffindor = gryffindors;
        System.out.println("Имя: " + gryffindor.getName() + " благородство: "
                + gryffindor.getNobility() + " честь: "
                + gryffindor.getHonor() + " храбрость: "
                + gryffindor.getCourage() + " колдовство: "
                + gryffindor.getWitchcraft() + " трансгрессия: " + gryffindor.getTransgression());
    }



    public void print(Puffendui puffenduis) {
        Puffendui puffendui = puffenduis;
        System.out.println("Имя: " + puffendui.getName() + " честность: "
                + puffendui.getHonesty() + " трудолюбие: "
                + puffendui.getDiligence() + " верность: "
                + puffendui.getLoyalty() + " колдовство: "
                + puffendui.getWitchcraft() + " трансгрессия: " + puffendui.getTransgression());
    }


    public void print(Slizerin slizerins) {
        Slizerin slizerin = slizerins;
        System.out.println("Имя: " + slizerin.getName() + " хитрость: "
                + slizerin.getCunning() + " решительность: "
                + slizerin.getDetermination() + " амбициозность: "
                + slizerin.getAmbition() + " власть: "
                + slizerin.getOverbearing() + " колдовство: "
                + slizerin.getWitchcraft() + " трансгрессия: " + slizerin.getTransgression());
    }


    public void print(Kogtevran kogtevrans) {
        Kogtevran kogtevran = kogtevrans;
        System.out.println("Имя: " + kogtevran.getName() + " ум: "
                + kogtevran.getSmart() + " мудрость: "
                + kogtevran.getWise() + " строумие: "
                + kogtevran.getWitty() + " креативность: "
                + kogtevran.getCreative() + " колдовство: "
                + kogtevran.getWitchcraft() + " трансгрессия: " + kogtevran.getTransgression());
    }

}

