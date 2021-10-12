public class Pilot {
    String name ;
    String code ;
    Airplane  affectedAirplaine ;

    public Pilot() {
    }

    public Pilot(String name, String code) {
        this.name = name;
        this.code = code;
    }


    public void topilot( Airplane a ){
        affectedAirplaine = a ;
        System.out.println(" je suis "+name+" je pilote un avions de type "+affectedAirplaine.type);
    }


}
