package SniperGame;

public class SniperRifle {

    private int bulletDamage = 30;

    public void shoot(Enemy enemy){
        System.out.println("\nBANG!!");
        if((int)(Math.random() * 10 + 1) == 1){
            System.out.println("Fuck, I missed!");
            return;
        }

        enemy.hit(bulletDamage + (int)(Math.random()*50));
        System.out.println("Já almoçaste!\n");

    }
}
