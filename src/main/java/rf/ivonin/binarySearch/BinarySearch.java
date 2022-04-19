package rf.ivonin.binarySearch;

import org.testng.annotations.Test;
import java.util.Arrays;

import static rf.ivonin.bubbleSort.BubbleSort.sort;

public class BinarySearch {

    @Test
    void binarySearchTest() {
        var intArray = new int[]{15, 90, 0, 1, 7, 98, 65, 9, 11, 42};
        var sortedArray = sort(intArray);
        System.out.println(binarySearch(sortedArray, 42));



    }

    private static int binarySearch(int[] arrayToSearch, int element) {
        var lowIndex = 0;
        var highIndex = arrayToSearch.length - 1;

        // Вернем -1, если в массиве не найдено совпадений
        var elementPos = -1;

        // Если lowIndex меньше, чем highIndex, в массиве все еще есть элементы, продолжаем перебирать
        while (lowIndex <= highIndex) {
            var midIndex = (lowIndex + highIndex) / 2;
            // если элемент равен arrayToSearch[midIndex] поиск завершен, выходим из цикла
            if (element == arrayToSearch[midIndex]) {
                elementPos = midIndex;
                break;
                // если элемент равен arrayToSearch[midIndex] поиск завершен, выходим из цикла
            } else if (element < arrayToSearch[midIndex]) {
                highIndex = midIndex - 1;
            } else if (element > arrayToSearch[midIndex]) {
                lowIndex = midIndex + 1;
            }
        }
        return elementPos;
    }

}
