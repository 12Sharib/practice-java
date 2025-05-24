package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Combinations {
  private static void impl(){
    int n=4, k=2;

    List<List<Integer>> list = new ArrayList<>();

    find(list,new ArrayList<>(), n, k, 1);

    System.out.println(list);
  }

  private static void find(List<List<Integer>> list, List<Integer> temp,int n, int k, int start) {
    if (temp.size() == k){
      list.add(new ArrayList<>(temp));
      return;
    }

    for (int i =start;i<=n;i++){
      temp.add(i);
      find(list, temp, n, k, i+1);
      temp.remove(temp.size()-1);
    }

  }

  public static void main(String[] args) {

    impl();

  }

}
