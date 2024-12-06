import java.util.Scanner;
import java.util.Stack;

public class LargestAreaInHistogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size:");
        int n = scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int[] rb= new int[n]; //right boundary-> next smaller element on right ka index-> will be putting indexes here(rb-lb=width)
        Stack<Integer> strb =new Stack<>();
        strb.push(arr.length-1);//last wala element
        rb[arr.length-1]=arr.length ; //agar right me usse chota koi element na ho
        
        for (int i = arr.length-2; i >= 0; i--) {
            while(strb.size()>0 && arr[i] <= arr[strb.peek()]){
                strb.pop();  //apne se bade wale ko pop kara dega ..rukega tab jab apne se bada milega
            }
            if(strb.size() == 0){
                rb[i]=arr.length; //agar iss se chota na aya ho
            }
            else{
                rb[i] = strb.peek();
            }
            strb.push(i);
        }

        int[] lb= new int[n]; //left boundary-> next smaller element on left ka index
        Stack<Integer> stlb =new Stack<>();
        stlb.push(0);//first wala element
        lb[0]=-1 ; //agar left me usse chota koi element na ho
        
        for (int i = 1; i < arr.length; i++) {
            while(stlb.size()>0 && arr[i] <= arr[stlb.peek()]){
                stlb.pop();  //apne se bade wale ko pop kara dega ..rukega tab jab apne se bada milega
            }
            if(stlb.size() == 0){
                lb[i]=-1; //agar iss se chota na aya ho
            }
            else{
                lb[i] = stlb.peek();
            }
            stlb.push(i);
        }
        
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = rb[i]-lb[i]-1;
            System.out.println("width:"+width);
            int area = arr[i]*width;
            System.out.println("area:"+area);
            if(area > maxArea){
                maxArea=area;
            }
        }
        System.out.println("Max Area:"+maxArea);
        
    }
}
