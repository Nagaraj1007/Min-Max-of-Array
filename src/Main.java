
public class Main {

    public static int sumOfMinimumAndMaximum(int array[]){
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for (int elements : array){
            minimum = Math.min(elements, minimum);
            maximum = Math.max(elements, maximum);
        }
        return maximum + minimum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfMinimumAndMaximum(new int[]{1,3,4,1}));
    }
}