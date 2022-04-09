package fileio;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileIOLectureExercise {
    public static void main(String[] args) throws IOException {

        // Lecture examples to work out after students
//        String myPath = "/Users/files/this.text";
//        String fileName = "test.txt";
//        String directory = "data";
//
//        // Getting the file full path from this method get
//        Path filePath = Paths.get(directory,fileName);
//
//        System.out.println("filePath.getFileName() = " + filePath.getFileName());
//        System.out.println("filePath.toString() = " + filePath.toString());
//
//        Path fakePath = Paths.get("dir1","dir2","dir3","dir4", "file.text");
//
//        System.out.println("fakePath.toAbsolutePath() = " + fakePath.toAbsolutePath());
//
//        FileManager dishes = new FileManager("dishes.txt","data");


        Path dishesPath = Paths.get("data", "dishes.txt");
        Path dishesDirectory = Paths.get("data");


        List<String> fileData = null;


        try {
            if (Files.notExists(dishesDirectory)) Files.createDirectories(dishesDirectory);
            if (Files.notExists(dishesPath)) Files.createFile(dishesPath);
            fileData = Files.readAllLines(dishesPath);

        } catch (IOException e) {
            System.out.println("Trashhhh");
        }


        for (String line : fileData) {
            System.out.println(line);
        }
        try {
            fileData.add("Whats up");
            Files.write(dishesPath, fileData);
        } catch (IOException e) {
            System.out.println("Trashhhh");
        }

    }
}
