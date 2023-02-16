public class PrintService {
    public void print(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя: " + gryffindor.getName() + " благородство: "
                    + gryffindor.getNobility() + " честь: "
                    + gryffindor.getHonor() + " храбрость: "
                    + gryffindor.getCourage() + " колдовство: "
                    + gryffindor.getWitchcraft() + " трансгрессия: " + gryffindor.getTransgression());
        }
        System.out.println();
    }
    public void print(Puffendui[] puffenduis) {
        for (int i = 0; i < puffenduis.length; i++) {
            Puffendui puffendui = puffenduis[i];
            System.out.println("Имя: " + puffendui.getName() + " честность: "
                    + puffendui.getHonesty() + " трудолюбие: "
                    + puffendui.getDiligence() + " верность: "
                    + puffendui.getLoyalty() + " колдовство: "
                    + puffendui.getWitchcraft() + " трансгрессия: " + puffendui.getTransgression());
        }
        System.out.println();
    }
    public void print(Slizerin[] slizerins) {
        for (int i = 0; i < slizerins.length; i++) {
            Slizerin slizerin = slizerins[i];
            System.out.println("Имя: " + slizerin.getName() + " хитрость: "
                    + slizerin.getCunning() + " решительность: "
                    + slizerin.getDetermination() + " амбициозность: "
                    + slizerin.getAmbition() + " власть: "
                    + slizerin.getOverbearing() + " колдовство: "
                    + slizerin.getWitchcraft() + " трансгрессия: " + slizerin.getTransgression());
        }
        System.out.println();
    }
    public void print(Kogtevran[] kogtevrans) {
        for (int i = 0; i < kogtevrans.length; i++) {
            Kogtevran kogtevran = kogtevrans[i];
            System.out.println("Имя: " + kogtevran.getName() + " ум: "
                    + kogtevran.getSmart() + " мудрость: "
                    + kogtevran.getWise() + " строумие: "
                    + kogtevran.getWitty() + " креативность: "
                    + kogtevran.getCreative() + " колдовство: "
                    + kogtevran.getWitchcraft() + " трансгрессия: " + kogtevran.getTransgression());
        }
        System.out.println();
    }
}
