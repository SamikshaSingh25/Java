import java.util.*;
public class rightdna {
    // public static boolean isStrong(String s){
    //     int countX=0;
    //     for(int i=0;i<s.length();i++){
    //         char curr = s.charAt(i);
    //         if(curr=='x'){
    //             countX++;
    //             if(countX==3){
    //                 if(i+1<s.length() && s.charAt(i+1)=='y'){
    //                     i++;
    //                     countX=0;  //reset
    //                 }
    //                 else{
    //                     return false;
    //                 }
    //             }
    //         }
    //         else{
    //             countX=0; //reset
    //         }  
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     String test1 = "xxxy";
    //     System.out.println(isStrong(test1));
    //     String test2 = "xxxx";
    //     System.out.println(isStrong(test2));
    //     String test3 = "xxxyxxxy";
    //     System.out.println(isStrong(test3));
    // }

    public static void main(String[] args) { 

       ArrayList <Integer>  arr= new ArrayList<>();
       arr.add(1);
       arr.add(12);
       arr.add(135);
       arr.add(2,76);
       System.out.println(arr);
       System.out.println(arr.get(2));
       arr.set(0,23);
       System.out.println(arr);
       arr.remove(1);
       System.out.println(arr);
       arr.clear();
       System.out.println(arr);
    } 

 

    
}
