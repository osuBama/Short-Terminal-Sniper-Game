package SniperGame;

public class Soldier extends Enemy{

    public Soldier(int health){
        super(health);
    }



    @Override
    public String getMessage() {
        return "For the fuhrer!";
    }


}
