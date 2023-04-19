import java.util.concurrent.ThreadLocalRandom;

public class East_village implements Runnable
{
   private int villagerNum;
   private RoadController roadController;
   
   public East_village(int num, RoadController road) {
      villagerNum = num;
      roadController = road;
   }

   public void run() {
      synchronized (roadController) {
         roadController.lock();
         System.out.println("East Villager #" + villagerNum + " is currently traveling on the road.");
         int random = (int)(Math.random()*(3-1+1));
         if (random == 1) {
            System.out.println("East Villager #" + villagerNum + " is eating a burrito.");
         } else if (random == 2) {
            System.out.println("East Villager #" + villagerNum + " is taking a quick nap");
         } else {
            System.out.println("East Villager #" + villagerNum + " is enjoying the scenery.");
         }
         try {
            actionTime();
            } catch (Exception e) {
               e.printStackTrace();
            }
         System.out.println("East Villager #" + villagerNum + " has finished the exchange.");
      }
   }

   public void actionTime() throws InterruptedException {
      int sleepTime = ThreadLocalRandom.current().nextInt(1, 3 + 1) * 1000;
      Thread.sleep(sleepTime);
  }
}
