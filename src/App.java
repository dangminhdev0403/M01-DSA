import java.util.*;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt() ;
        
        List <Integer> arr = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            arr.add(sc.nextInt());
        }

        //  Collections.sort(arr) ;   sắp xếp  Tăng dần 

      Collections.sort(arr,new Comparator<Integer>() {

        @Override
        public int compare(Integer a, Integer b) {
            //  -1  a đứng trước b
            //  1  a đứng sau b
            //  0 giữ im vị trí
            if(a > b) return -1;

            else return 1 ;
        }

        
      }) ;
        for(int x : arr){
            System.out.print(x+" ");
        } 
    }
}