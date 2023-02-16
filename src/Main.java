public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Harry Potter", 89, 57, 67, 54, 21),
                new Gryffindor("Hermione Granger", 98, 87, 47, 87, 90),
                new Gryffindor("Ron Weasley", 55, 43, 59, 78, 40)
        };
        Puffendui[] puffenduis = {
                new Puffendui("Zacharias Smith", 56, 45, 23, 39, 78),
                new Puffendui("Cedric Diggory", 96, 47, 13, 64, 85),
                new Puffendui("Justin Finch-Fletchley", 47, 98, 99, 45, 36)
        };
        Slizerin[] slizerins = {
                new Slizerin("Draco Malfoy", 44, 29, 56, 53, 98, 56),
                new Slizerin("Graham Montagu", 97, 54, 55, 41, 31, 51),
                new Slizerin("Gregory Goyle", 47, 23, 53, 83, 43, 99)
        };
        Kogtevran[] kogtevrans = {
                new Kogtevran("Zhou Chang", 81, 52, 58, 49, 61, 47),
                new Kogtevran("Padma Patil", 98, 69, 21, 48, 65, 44),
                new Kogtevran("Marcus Belby", 77, 44, 88, 99, 11, 33)
        };
        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printService.print(puffenduis);
        printService.print(slizerins);
        printService.print(kogtevrans);

        Hogwarts hogwarts = new Hogwarts();
        hogwarts.bestStudent(gryffindors);
    }
}