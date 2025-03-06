// File Handler Example using OOPS 

abstract class FileHandler{
    abstract void openFile();
}
class TextFile extends FileHandler{
    @Override
    public void openFile(){
        System.out.println("Opening Text File !");
    }
}
class PDFFile extends FileHandler{
    @Override
    void openFile(){
        System.out.println("Opening PDF File");
    }
}
public class eightExample {
    public static void main(String[] args) {
        FileHandler file = new TextFile();
        file.openFile();

        file = new PDFFile();
        file.openFile();
    }
}
