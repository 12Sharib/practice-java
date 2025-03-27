package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class RandomizedSet {
    Map<Integer, Integer> map;
    List<Integer> list;
    Random rand;


    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
        
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)){
            return false;
        }else {
            map.put(val, list.size());
            list.add(val);
            return true;
        }

    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int index = map.get(val);
        int last = list.get(list.size() - 1);

        list.set(index,last);
        map.put(last, index);

        list.remove(list.size() - 1);
        map.remove(val);

        return true;
        
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
        
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(2);
        randomizedSet.insert(3);

        randomizedSet.remove(2);


    }
}
