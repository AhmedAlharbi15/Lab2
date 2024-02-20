//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//      Q1:
//        String[] dictionary = { "cat", "dog", "red", "is", "am" };
//
//        int maxLength = findMaxLength(dictionary);
//
//        List<String> longestWords = findLongestWords(dictionary, maxLength);
//
//        System.out.println("");
//        for (String word : longestWords) {
//            System.out.println(word);
//        }
//    }
//    public static int findMaxLength(String[] dictionary) {
//        int maxLength = 0;
//        for (String word : dictionary) {
//            maxLength = Math.max(maxLength, word.length());
//        }
//        return maxLength;
//    }
//    public static List <String> findLongestWords(String[] dictionary, int maxLength) {
//        List<String> longestWords = new ArrayList<>();
//        for (String word : dictionary) {
//            if (word.length() == maxLength) {
//                longestWords.add(word);
//            }
//        }
//        return longestWords;
//    }
//
//        Q2:
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("");
//        String[] elements = scanner.nextLine().split(" ");
//
//        int[] array = new int[elements.length];
//        for (int i = 0; i < elements.length; i++) {
//            array[i] = Integer.parseInt(elements[i]);
//        }
//
//        Map<Integer, Integer> occurrenceMap = countOccurrences(array);
//
//        for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
//            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
//        }
//    }
//    public static Map<Integer, Integer> countOccurrences(int[] array) {
//        Map<Integer, Integer> occurrenceMap = new HashMap<>();
//        for (int num : array) {
//            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
//        }
//        return occurrenceMap;
//    }
//
//        Q3:
//        int[] array = {1, 4, 17, 7, 25, 3, 100};
//
//        int k = 3;
//
//        int[] largestElements = findKLargestElements(array, k);
//
//        System.out.println(k + " 3 largest elements of the said array are:\n");
//        for (int num : largestElements) {
//            System.out.print(num + " ");
//        }
//    }
//
//    public static int[] findKLargestElements(int[] array, int k) {
//
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
//
//        for (int num : array) {
//            maxHeap.offer(num);
//        }
//        int[] result = new int[k];
//        for (int i = 0; i < k; i++) {
//            result[i] = maxHeap.poll();
//        }
//        return result;
//    }
//
//       Q4:
//        int[] array = {5, 4, 3, 2, 1};
//
//        reverseArray(array);
//
//        System.out.println("Reversed Array:");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//    }
//
//    public static void reverseArray(int[] array) {
//        int start = 0;
//        int end = array.length - 1;
//
//        while (start < end) {
//            int temp = array[start];
//            array[start] = array[end];
//            array[end] = temp;
//
//            start++;
//            end--;
//        }
//    }


//    Q5:
//     Scanner scanner = new Scanner(System.in);
//     int[] array = null;
//     int size = 0;
//     boolean isStopped = false;
//
//     while (!isStopped) {
//        System.out.println("\nMenu:");
//        System.out.println("1. Accept elements of an array");
//        System.out.println("2. Display elements of an array");
//        System.out.println("3. Search the element within array");
//        System.out.println("4. Sort the array");
//        System.out.println("5. To Stop");
//
//        System.out.print("Enter your choice: ");
//         int choice =scanner.nextInt();
//
//         switch (choice) {
//          case 1:
//           System.out.print("Enter the size of the array: ");
//            size = scanner.nextInt();
//            array = new int[size];
//            System.out.println("Enter elements of the array:");
//             for (int i = 0; i < size; i++) {
//                array[i] = scanner.nextInt();
//                   }
//                 break;
//                case 2:
//                 if (array == null) {
//                  System.out.println("Array is not initialized yet.");
//                   } else {
//                  System.out.println("Elements of the array:");
//                   System.out.println(Arrays.toString(array));
//                    }
//                    break;
//                case 3:
//                    if (array == null) {
//                        System.out.println("Array is not initialized yet.");
//                    } else {
//                        System.out.print("Enter the element to search: ");
//                        int searchElement = scanner.nextInt();
//                        boolean found = false;
//                        for (int i = 0; i < size; i++) {
//                            if (array[i] == searchElement) {
//                                System.out.println("Element found at index " + i);
//                                found = true;
//                                break;
//                            }
//                        }
//                        if (!found) {
//                            System.out.println("Element not found in the array.");
//                        }
//                    }
//                    break;
//                case 4:
//                    if (array == null) {
//                        System.out.println("Array is not initialized yet.");
//                    } else {
//                        Arrays.sort(array);
//                        System.out.println("Array sorted successfully.");
//                    }
//                    break;
//                case 5:
//                    System.out.println("Stopping the program.");
//                    isStopped = true;
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
//            }
//        }


//      Q6:
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the minimum value of the range: ");
//        int min = scanner.nextInt();
//
//        System.out.print("Enter the maximum value of the range: ");
//        int max = scanner.nextInt();
//
//        System.out.print("Enter the number of random numbers to generate: ");
//        int count = scanner.nextInt();
//
//        generateRandomNumbers(min, max, count);
//    }
//
//    public static void generateRandomNumbers(int min, int max, int count) {
//        Random random = new Random();
//
//        System.out.println("Random numbers within the specified range:");
//        for (int i = 0; i < count; i++) {
//            int randomNumber = random.nextInt(max - min + 1) + min;
//            System.out.print(randomNumber);
//            if (i < count - 1) {
//                System.out.print(" - ");
//            }
//        }
//    }
//

//      Q7:
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a password: ");
//        String password = scanner.nextLine();
//
//        int totalScore = calculateScore(password);
//
//        String strength;
//        if (totalScore >= 8) {
//            strength = "strong";
//        } else if (totalScore >= 5) {
//            strength = "moderately strong";
//        } else {
//            strength = "weak";
//        }
//
//        System.out.println("Password is " + strength + ".");
//
//    }
//    public static int calculateScore(String password) {
//        int lengthScore = checkLength(password.length());
//        int specialCharacterScore = checkSpecialCharacters(password);
//        int upperLowerCaseScore = checkUpperCaseLowerCase(password);
//
//        return lengthScore + specialCharacterScore + upperLowerCaseScore;
//    }
//
//    public static int checkLength(int length) {
//        if (length >= 8) {
//            return 3;
//        } else if (length >= 6) {
//            return 2;
//        } else {
//            return 0;
//        }
//    }
//
//    public static int checkSpecialCharacters(String password) {
//        if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
//            return 2;
//        } else {
//            return 0;
//        }
//    }
//    public static int checkUpperCaseLowerCase(String password) {
//        if (password.matches(".*[A-Z].*") && password.matches(".*[a-z].*")) {
//            return 3;
//        } else {
//            return 0;
//        }
//
//    }
//
//     Q8 :
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of Fibonacci terms to generate: ");
//        int n = scanner.nextInt();
//
//        System.out.println("Fibonacci sequence with " + n + " terms:");
//        Fibonacci(n);
//
//    }
//
//    public static void Fibonacci (int n) {
//        int a = 0, b = 1;
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(a + " ");
//            int next = a + bS;
//            a = b;
//            b = next;
//        }
//    }
}
