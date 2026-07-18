package frequencyCount;
import java.util.HashMap;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int maxfreq = 0;
        int largest = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) >= largest) {
                largest = map.get(key);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) >= largest) {
                maxfreq = maxfreq + map.get(key);
            }
        }   
        System.out.println(map);
        System.out.println("largest: "+largest);
        System.out.println("maximum frequency: "+maxfreq);
    }
}