import java.util.ArrayList;
import java.util.List;

public class student extends  personne{


    List<cours> cours = new ArrayList<>();

    public student(String nom, String prenom, String tel, String rue, String codePostale, String adresse, String pays) {
        super(nom, prenom, tel, rue, codePostale, adresse, pays);
    }


    protected List<cours> getCourse(){
        return cours;
    }

    protected void setCours(List<cours> cours){
        this.cours=cours;
    }

    @Override
    public String toString() {
        return "student{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", tel='" + tel + '\'' +
                ", rue='" + rue + '\'' +
                ", codePostale='" + codePostale + '\'' +
                ", adresse='" + adresse + '\'' +
                ", pays='" + pays + '\'' +
                ", cours=" + cours +
                '}';
    }
}
