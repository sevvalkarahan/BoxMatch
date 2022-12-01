public class Match {
    Fighter f1,f2;
    int minWeight,maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public void run(){
        if (isCheck()){
            while (this.f1.health>0 && this.f2.health>0){
                System.out.println("---------Yeni Raund------------");
                this.f2.health=this.f1.hit(this.f2);
                if (isWin())
                    break;

                this.f1.health=this.f2.hit(this.f1);
                if (isWin())
                    break;
            }
            System.out.println(this.f1.name+" sağlık: "+this.f1.health);
            System.out.println(this.f2.name+" sağlık: "+this.f2.health);

        }else
            System.out.println("Sporcuların sikletleri uyuşmuyor.");
    }
    public boolean isCheck(){
        return ((this.f1.weight>=minWeight && this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight&&this.f2.weight<=maxWeight));
    }
    public boolean isWin(){
        if (this.f1.health==0) {
            System.out.println(this.f2.name + " Kaazandı!");
            return true;
        }
        if (this.f2.health==0) {
            System.out.println(this.f1.name + " Kaazandı!");
            return true;
        }
        return false;
    }
}
