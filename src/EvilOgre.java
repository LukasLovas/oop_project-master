public class EvilOgre extends BadOgre{
    double kill = Math.random();

    void revenge(Knight knight){
        if (kill >= 0.5){
            System.out.println("Skapals");
        }
    }
}