public class luckySum {
    public static void main(String[] args) {
        
    }

    public static int func(int a, int b, int c) {
        int sum = 0;
        for (int d : new int[] {a,b,c}) {
            if (d == 13) {
                break;
            }
            sum += d;
        }
        return sum;
    }
}
