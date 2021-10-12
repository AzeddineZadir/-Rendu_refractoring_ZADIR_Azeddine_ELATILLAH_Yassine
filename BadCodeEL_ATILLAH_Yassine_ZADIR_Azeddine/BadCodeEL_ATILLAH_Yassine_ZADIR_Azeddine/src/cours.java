import java.util.Date;

public class cours {

    public String name;
    public int id;

    public cours(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id: "+id+" - Cours "+name+"";
    }
}
