package SniperGame;

public abstract class Enemy extends GameObject{

    public int health;

    public Enemy(int health){
        this.health = health;
        this.isDead = false;
        isTree = false;
    }

    public abstract String getMessage();


    public boolean isDead(){

        return isDead;
    }

    public void printInfo(){
        System.out.println(getClass().getSimpleName() + "\n HP: " + health);
    }

    public void hit(int damage){
        System.out.println("Levaste com " + damage);
        health -= damage;
        if(health <= 0){
            isDead = true;
            health = 0;
        }
    }


}
