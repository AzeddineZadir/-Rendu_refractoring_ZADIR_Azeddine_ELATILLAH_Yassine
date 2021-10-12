public class Airplane {
    public static final int military = 1 , civil=2 , cargo= 3;
    String model;
    String id ;
    int type ;

    public Airplane(String model, String id, int type) {
        this.model = model;
        this.id = id;
        this.type = type;
    }
}
