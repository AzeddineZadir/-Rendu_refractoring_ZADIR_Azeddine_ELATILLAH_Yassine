import java.util.ArrayList;
import java.util.List;

public class professor extends personne{

    public professor(String nom, String prenom, String tel, String rue, String codePostale, String adresse, String pays) {
        super(nom, prenom, tel, rue, codePostale, adresse, pays);
    }

    protected List<cours> getCourse(){
        return getCours();
    }

    protected void setCours(List<cours> cours){
        this.cours=cours;
    }

    @Override
    public String toString() {
        return "professor{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", tel='" + getTel() + '\'' +
                ", rue='" + getRue() + '\'' +
                ", codePostale='" + getCodePostale() + '\'' +
                ", adresse='" + getAdresse() + '\'' +
                ", pays='" + getPays() + '\'' +
                ", cours=" + getCours() +
                '}';
    }

    public List<cours> getCours() {
        return cours;
    }
}
