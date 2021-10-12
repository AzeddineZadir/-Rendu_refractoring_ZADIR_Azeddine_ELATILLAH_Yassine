import java.util.List;

public class run{
    public static void main(String[]args){

        professor p = new professor("Huchard","Marianne","xxxxxxx","161 rue ada","34095","Université Montpellier LIRMM UMR - Bâtiment 4, Étage 1 - Montpellier","France");
        List<cours> coursEnseigner = List.of(
                new cours("Ingénierie dérigée par les modeles",1),
                new cours("Inteligence artificielle lié au génie logiciel",2)

        );
        p.cours=coursEnseigner;
        System.out.println("Affichage des cours de "+p.nom);
        p.getCourse().forEach(cours -> {
            System.out.println(cours);
        });

        List<student> students = List.of(
          new student("yassine","el atillah","xxxxxx","64 ","34070","avenue","france"),
                new student("yassine1","el atillah","xxxxxx","64 ","34070","avenue","france") ,
                new student("yassine2","el atillah","xxxxxx","64 ","34070","avenue","france")
        );
        System.out.println("Les étudiants :");
        students.forEach(student -> {
            System.out.println(student);
        });
    }
}
