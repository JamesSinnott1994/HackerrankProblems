package CodeEditor;

public class Editor {

    public static void main(String[] args) {

        int[] numbers = {3,3,5,2,3};

        problem(numbers);
    }

    public static int problem(int[] numbers) {

        boolean arrayComplete = false;
        int finalResult = 0;

        while (!arrayComplete) {

            // Step 1: Get index
            int index = -1;
            int x = -1;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    index = i;
                    x = numbers[i];
                    break;
                }
            }

            // No such element, finish algorithm
            if (index == -1) {
                arrayComplete = true;
                return finalResult;
            }

            // Step 2: Subtract x
            for (int i = index; i < numbers.length; i++) {
                if (numbers[i] < x) {
                    break;
                } else {
                    numbers[i] = numbers[i] - x;
                }
            }

            // Step 3: Add x to final result
            System.out.println("x: " + x);
            finalResult += x;

        }

        return finalResult;

    }
}
