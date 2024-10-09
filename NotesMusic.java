import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class NotesMusic {
    public static void main(String[] args) {
        FileCreate();
        return;
    }
    public static boolean FileCreate() {
        String desktopPathFolder = System.getProperty("user.home") + "\\Study-Music";
        File studyMusicFolder = new File(desktopPathFolder);
    
        if (!studyMusicFolder.exists()) {
            if (studyMusicFolder.mkdir()) {
                System.out.println("Study-Music folder created on the desktop.");
            } else {
                System.out.println("Failed to create the folder.");
                return false;
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title for your text file ");
        String fileName = scanner.nextLine();
        scanner.close();
    
        String desktopPathFile = desktopPathFolder + "\\" + fileName + ".txt";
        File studyMusicFile = new File(desktopPathFile);
    
        try {
            if (studyMusicFile.createNewFile()) {
                System.out.println("File created: " + studyMusicFile.getName());
                return true;
            } else {
                System.out.println("File already exists.");
                return false;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
            return false;
        }
    }
}