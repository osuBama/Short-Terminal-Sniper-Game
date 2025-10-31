package SniperGame;

public class ObjectCreator {

    public static Soldier createSoldier(){
        return new Soldier(100);

    }

    public static ArmoredSoldier createArmored(){
        return new ArmoredSoldier(100, 50);

    }

    public static Tree createTree(){
        return new Tree();
    }

    public static GameObject spawnShit(){

        int shitSpawn = (int) ((Math.random()*3) + 1 );

        switch (shitSpawn){
            case 1:
                return createTree();

            case 2:
                return createSoldier();

            case 3:
                return createArmored();

            default:
                return createSoldier();
        }
    }
}
