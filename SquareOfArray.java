public class SquareOfArray {
    public static int[] squareArray(int[] numbers) {
        int[] squaredArray = new int[numbers.length];
        for (int index = 0; index < numbers.length; index++){
            squaredArray[index] = numbers[index] * numbers[index];
        }
        sortArray(squaredArray);
        return squaredArray;
    }


    private static int[] sortArray(int[] numbers) {
        for (int index = 0; index < numbers.length-1; index++){
            for (int indexes = index+1; indexes < numbers.length; indexes++){
                if(numbers[index] > numbers[indexes]){
                    int temp = numbers[index];
                    numbers[index] = numbers[indexes];
                    numbers[indexes] = temp;
                }
            }
        }
        return numbers;
    }
}
