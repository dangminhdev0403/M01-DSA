import java.util.*;
// 3 cái Set  chỉ lưu các phần tử khác nhau
// HashSet không sắp xếp , thứ tự phần tử xuất hiện ngẫu nhiễn
// LinkedHashSet cái nào nhập trước in ra trước
// TreeSet sắp xếp thứ tự tăng dần


public class App {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        // HashSet<Integer> set = new HashSet<>();
        // LinkedHashSet<Integer> set = new LinkedHashSet<>();
        TreeSet<Integer> set = new TreeSet<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            set.add(a);
        }

        for(int x : set){
            System.out.print(x+" ");
        }

    }
}
