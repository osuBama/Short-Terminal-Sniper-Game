package SniperGame;

public class Game {

    private final int TOTALOBJECTS = 20;

    private int shotsFired;

    GameObject[] gameObjects = new GameObject[TOTALOBJECTS];


    SniperRifle snipStick = new SniperRifle();




    public void start(){
    for( int i = 0 ; i< TOTALOBJECTS; i++){
        gameObjects[i] = ObjectCreator.spawnShit();
    }
    for(int i = 0; i < TOTALOBJECTS; i++){
        if(gameObjects[i].isTree){
            System.out.println("\nThas a 3, slay");
            continue;
        }
        while(!gameObjects[i].isDead){
            shotsFired++;
            snipStick.shoot((Enemy) gameObjects[i]);
            ((Enemy) gameObjects[i]).printInfo();
        }
    }
        System.out.println("All enemies dead, shots taken: " + shotsFired);
    }

}
