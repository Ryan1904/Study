import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B_demo1 {
    /*如果苏神在决赛中跑出9.83的成绩，那么他将至少获得银牌，
    而半决赛与决赛之间间隔的时间很短，他不能完全恢复全力冲刺消耗的精力。
    因此苏神每每想起那晚的百米飞人之战，都会感到遗憾。
    他在梦中反复重演那晚的半决赛，与现实不同的是：
    苏神完全知道所有对手完成百米比赛所用的时间。

    苏神及苏神所有对手完成百米比赛所用的时间都是互不相等的正整数。
    苏神有足够的实力控制自己的速度。

    为了保存实力且保证顺利出线，苏神需要以            【尽可能慢的速度（即最大的完赛时间）】
    至少获得小组第二。现在，他向你求助这个问题，


    请你用程序算出结果使他不再在决赛留有任何遗憾。

    输入描述:
    第一行有一个整数 n(2≤n≤10^6)，表示半决赛中                             【对手的数量】。
    第二行有 n个两两不同的正整数，分别表示苏神 n 个对手完成比赛所用的时间


    输出描述:
    一个正整数，表示苏神可至少获得第二的最大完赛时间。

    4
    1 10 11 21    ——  9

    7
    7 8 4 246 2 300 6   ——  3

    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入对手数量");
        int  OpponentNumber = sc.nextInt();
        int[] arr = GetArr(OpponentNumber);
       // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr);



        int WinNumber ;
        if (arr[1]-1  != arr[0]){
            WinNumber = arr[1] - 1;
        }else WinNumber = arr[0]-1;

        System.out.println(WinNumber);




    }

    //获取对手成绩
    public static int[] GetArr(int  OpponentNumber){
        int[] arr = new int[OpponentNumber];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入对手成绩");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }



    }






