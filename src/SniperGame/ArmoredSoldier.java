package SniperGame;

public class ArmoredSoldier extends Enemy {

    private int armorValue;


    public ArmoredSoldier(int health, int armor){
        super(health);
        this.armorValue = armor;
    }

    @Override
    public void printInfo() {
       super.printInfo();
        System.out.println("Armor:" + armorValue + "\n");
    }

    @Override
    public void hit(int damage) {
        if(armorValue > 0){
            if(armorValue - damage < 0){
                super.hit(damage - armorValue);
                armorValue = 0;
                return;
            }
            System.out.println("Levaste com " + damage);
            armorValue -= damage;
            return;
        }
        super.hit(damage);
    }

    @Override
    public String getMessage() {
        return "FOR THE MOTHERLAND";
    }
}
