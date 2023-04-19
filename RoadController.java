import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * RoadController.java
 *
 *
 */

 
public class RoadController
{  
   private Lock road = new ReentrantLock();

   public static void main (String args[]) {
      RoadController roadController = new RoadController();

      West_village[] westVillagers = new West_village[4];
      East_village[] eastVillagers = new East_village[4];
      for (int i = 0; i < 4; i++) {
         westVillagers[i] = new West_village(i + 1, roadController);
         eastVillagers[i] = new East_village(i + 1, roadController);
      }
      
      for (int i = 0; i < 4; i++) {
         westVillagers[i].run();
         eastVillagers[i].run();
      }
   }

   public void lock() {
      road.lock();
   }

   public void unlock() {
      road.unlock();
   }
}
