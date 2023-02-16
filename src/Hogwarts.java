public class Hogwarts {
    public void bestStudent(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            int sum = gryffindor.getCourage() + gryffindor.getNobility() + gryffindor.getHonor();
            System.out.println(sum);
        }
    }
}