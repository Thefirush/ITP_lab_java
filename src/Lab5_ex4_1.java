import java.io.File;

public class Lab5_ex4_1 {
    private static final String PATH = "C:\\Users\\Анастасия\\IdeaProjects\\first_java\\src\\Lab5_ex4_1.java";
    public static void main(String[] args) {
        System.out.println(PATH + (checkPath(PATH) ? " exists" : " does NOT exist"));
    }
    private static boolean checkPath(String path) {
        File file = new File(path);
        return file.exists();
    }
}
