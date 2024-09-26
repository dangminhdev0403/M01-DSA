import java.util.*;

public class App {

    public static int firstPos(List<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;

        int index = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                index = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;

            } else {
                r = mid - 1;
            }
        }
        return index;
    }

    public static int lastPos(List<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;

        int index = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                index = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;

            } else {
                l = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        int tongThieu = 0 ;
        for(int i = 0 ; i < n ; i++){
            int thieu = k - arr.get(i);
            int fisrtThieu = firstPos(arr, thieu);
            if(fisrtThieu != -1){
                int lastThieu = lastPos(arr, thieu);
                tongThieu += lastThieu - fisrtThieu + 1 ;
            }
        }

        System.out.println(tongThieu);
    }
}
