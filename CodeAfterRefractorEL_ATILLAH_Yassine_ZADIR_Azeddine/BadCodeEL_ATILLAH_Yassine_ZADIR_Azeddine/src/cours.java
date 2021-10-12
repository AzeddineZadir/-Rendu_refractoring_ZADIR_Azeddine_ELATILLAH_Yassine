public class cours {

    private String name;
    private int id;

    public cours(String name, int id) {
        this.setName(name);
        this.setId(id);
    }

    @Override
    public String toString() {
        return "Id: "+ getId() +" - Cours "+ getName() +"";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
