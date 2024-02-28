public class StringArraySort {
public static void main(String[] args) {
// Sample array of strings
String[] stringArray = {"Banana", "Apple", "Orange", "Grape", "Kiwi"};
// Sorting the array using compareTo() function
for (int i = 0; i < stringArray.length - 1; i++) {
for (int j = i + 1; j < stringArray.length; j++) {
if (stringArray[i].compareTo(stringArray[j]) > 0) {
// Swap if the current element is greater than the next
String temp = stringArray[i];
stringArray[i] = stringArray[j];
stringArray[j] = temp;
}
}
}
// Displaying the sorted array
System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
}
}