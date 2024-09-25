import java.util.List;

/**
 * App
 */
public class App {
    public static boolean linaerSearch(List<Integer> arr,int n,int x){
        for(int i=0 ;i <n ;i++){
            if(x==arr.get(i)){
                return true;
            }
            
        }
        return false ;
    }
    public static boolean binarySearch(List<Integer> arr,int n,int x){
        int l = 0 ; 
        int r =n -1 ;
        while (l <= r) {
            int mid= (l+r)/ 2;
            if(arr.get(mid)==x){
                return true ;
            }
            else if(arr.get(mid)< x){
                l = mid +1 ;
            }else{
                r = mid - 1;
            }
        }
        return false ;

    }
    public static void main(String[] args) {
        
    }
}