public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 89, 57, 67, 54, 21);
        Gryffindor ronWeaslay = new Gryffindor("Ron Weaslay", 55, 43, 59, 78, 40);

        Puffendui zachariasSmith = new Puffendui("Zacharias Smith", 56, 45, 23, 39, 78);
        Puffendui cedricDiggory = new Puffendui("Cedric Diggory", 96, 47, 13, 64, 85);

        Slizerin dracoMalfoy = new Slizerin("Draco Malfoy", 44, 29, 56, 53, 98, 56);
        Slizerin grahamMontagu = new Slizerin("Graham Montagu", 97, 54, 55, 41, 31, 51);
        Slizerin gregoryGoyle = new Slizerin("Gregory Goyle", 47, 23, 53, 83, 43, 99);

        Kogtevran zhouChang = new Kogtevran("Zhou Chang", 81, 52, 58, 49, 61, 47);
        Kogtevran padmaPatil = new Kogtevran("Padma Patil", 98, 69, 21, 48, 65, 44);
        Kogtevran marcusBelby = new Kogtevran("Marcus Belby", 77, 44, 88, 99, 11, 33);

        PrintService printService = new PrintService();
        printService.print(harryPotter);
        printService.print(zachariasSmith);
        printService.print(dracoMalfoy);
        printService.print(padmaPatil);

        zhouChang.compare(padmaPatil); // метод для сравнения учеников каждого класса
        harryPotter.compare(ronWeaslay);
        zachariasSmith.compare(cedricDiggory);
        dracoMalfoy.compare(grahamMontagu);

        gregoryGoyle.compare(harryPotter); //метод для сравнения двух любых учеников
    }
}