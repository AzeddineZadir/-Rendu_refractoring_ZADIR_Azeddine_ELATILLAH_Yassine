import java.util.ArrayList;
import java.util.List;

public class personne {

    protected List<cours> cours = new ArrayList<>();

    private String nom;
    private String prenom;
    private String tel;
    private String rue;
    private String codePostale;
    private String adresse;
    private String pays;

    public personne(String nom, String prenom, String tel, String rue, String codePostale, String adresse, String pays) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setTel(tel);
        this.setRue(rue);
        this.setCodePostale(codePostale);
        this.setAdresse(adresse);
        this.setPays(pays);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
