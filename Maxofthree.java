public class Maxofthree {
    public static void main(String[] args) {
        int[] numbers = {45, 32, 67}; // 
        int max = numbers[0]; 

        for (int i = 1; i < 3; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
        }

        System.out.println("Maximum number is: " + max);
    }
}     