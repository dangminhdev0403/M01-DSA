import java.util.*;
// 3 cái Map  lưu theo dạng (key, value) , có thể quy định key , value
// HashMap không sắp xếp , thứ tự phần tử xuất hiện ngẫu nhiễn
// LinkedHashMap cái nào nhập trước in ra trước
// TreeMap sắp xếp thứ tự tăng dần


public class App {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        // LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        // TreeMap<Integer,Integer> map = new TreeMap<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            map.put(i,a);
        }
        map.put(8, 8);
        map.put(7, 10);
        map.put(6, 10);
        // ép map thành set đẻ duyệt map
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for(Map.Entry<Integer, Integer> entry : entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}
