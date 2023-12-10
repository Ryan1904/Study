import java.util.Arrays;
import java.util.Scanner;

public class C_demo1 {
    /*
他想用a 个大小形状相同的箱子把光碟装起来，每个箱子里存放光碟的个数是相同的。
当他把光碟尽可能放进a个箱子中,可能会余下b个光碟无法放入 (b一定小于 a)。
由于神父喜欢通过数质数的方式让自己冷静下来，对质数比较敏感，所以他准备的箱子一定会是      [质数个]。
假如现在你知道了一些a,b，你能通过这些数据得出神父至少有多少光碟吗?*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int max = Arrays.stream(a).max().getAsInt();

        for (int i = 0; i < n; i++) {
            for (int j = max; ; j++) {
                if (j == a[i]){

                }

            }
        }







    }
}
