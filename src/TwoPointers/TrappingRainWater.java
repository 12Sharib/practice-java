package TwoPointers;

public class TrappingRainWater {
  private static void impl(int [] height){

    int n = height.length;
    int [] leftMax = new int[n];
    int [] rightMax = new int[n];
     leftMax[0] = height[0];
    for(int i=1;i<n;i++){
      leftMax[i] = Math.max(leftMax[i-1], height[i]);
    }

    rightMax[n-1] = height[n-1];
    for(int i=n-2;i>=0;i--){
      rightMax[i] = Math.max(rightMax[i+1], height[i]);
    }
    int ans = 0;
    for (int i=0;i<n;i++){
      ans += Math.min(leftMax[i], rightMax[i]) - height[i];
    }

    int left = 0;
    int right = n-1;

    int lmax = 0;
    int rmax = 0;
    int a = 0;

    while (left < right){
      lmax = Math.max(lmax, height[left]);
      rmax = Math.max(rmax, height[right]);

      if(height[left] < height[right]){
        a+=Math.min(lmax, rmax) - height[left];
        left++;
      }else {
        a+=Math.min(lmax, rmax) - height[right];

        right--;
      }
    }

    System.out.println(a);


  }

  public static void main(String[] args) {
    impl(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});

  }

}
