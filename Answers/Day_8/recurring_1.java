package Day_8;
public class recurring_1{
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1 };
        int []ans = {0,0};
        for(int i =0;i<arr.length-1;i++){
            int sum =1;
            for(int j =i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    sum++;
                }
            }
            if(sum>ans[1]){
                ans[0] = arr[i];
                ans[1] = sum;
            //  System.out.println(sum);
            }
        }
        System.out.println(ans[0]+" "+ans[1]);
    }
}