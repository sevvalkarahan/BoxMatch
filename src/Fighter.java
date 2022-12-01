public class Fighter {
    String name;
    int damage;
    int health, weight,dodge;

    public Fighter(String name, int damage, int health, int weight,int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge>=0 && dodge <=100)
        this.dodge=dodge;
        else
            dodge =0;
    }
    public int hit(Fighter foe){
        System.out.println(this.name+" => "+foe.name+" "+this.damage+" hasar vurdu.");
        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı.");
            System.out.println("---------------");
            return foe.health;
        }

        if (foe.health<0)
            return 0;
        return foe.health-this.damage;
    }
    public boolean isDodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
