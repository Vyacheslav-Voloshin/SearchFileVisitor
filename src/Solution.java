import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        SearchFileVisitor searchFileVisitor = new SearchFileVisitor();

        searchFileVisitor.setPartOfName("x");
        searchFileVisitor.setPartOfContent("Slon");
        searchFileVisitor.setMinSize(1);
        searchFileVisitor.setMaxSize(10000000);

        Files.walkFileTree(Paths.get("C:/Users/�����/Desktop"), searchFileVisitor);

        List<Path> foundFiles = searchFileVisitor.getFoundFiles();
        for (Path file : foundFiles) {
            System.out.println(file);
        }
    }
}
