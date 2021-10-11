package estruturais.composite;
import java.util.List;


public class CompositeMain {

    public static void main(String[] args) {
        FileSystemItem file1 = new File("File1.txt");
        FileSystemItem file2 = new File("File2.txt");
        FileSystemItem file3 = new File("File3.txt");
        FileSystemItem file4 = new File("File4.txt");

        FileSystemItem sf1 = new Folder("sf1", List.of(file1));
        FileSystemItem sf2 = new Folder("sf2", List.of(file2, sf1));
        FileSystemItem folder = new Folder("folder", List.of(sf2, file3, file4));


        folder.print("");
    }
}
