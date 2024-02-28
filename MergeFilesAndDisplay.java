import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class MergeFilesAndDisplay {
public static void main(String[] args) {
 // Specify the paths of the two input files
 String inputFile1 = "path/to/firstFile.txt";
 String inputFile2 = "path/to/secondFile.txt";
 // Specify the path of the output file
 String outputFile = "path/to/outputFile.txt";
 try {
 // Read data from the first file
 BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
 String data1 = "";
 String line1;
 while ((line1 = reader1.readLine()) != null) {
 data1 += line1 + "\n";
 }
 reader1.close();
 // Read data from the second file
 BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
 String data2 = "";
 String line2;
 while ((line2 = reader2.readLine()) != null) {
 data2 += line2 + "\n";
 }
 reader2.close();
 // Merge data from both files
 String mergedData = data1 + data2;
 // Write the merged data into the output file
 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
 writer.write(mergedData);
 writer.close();
 System.out.println("Merged data written to " + outputFile);
// Display the contents of the output file
 System.out.println("Contents of the merged file:");
 BufferedReader mergedReader = new BufferedReader(new FileReader(outputFile));
 String line;
 while ((line = mergedReader.readLine()) != null) {
 System.out.println(line);
 }
 mergedReader.close();
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
}