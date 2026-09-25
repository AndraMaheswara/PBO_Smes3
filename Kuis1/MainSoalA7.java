package Kuis1;

public class MainSoalA7 {
    public static void main(String[] args) {

        Kulkas kulkas = new Kulkas("Polytron");
        kulkas.tampilkanInfo();
        kulkas.lebihDingin(); kulkas.lebihDingin();
        kulkas.tampilkanInfo();
        kulkas.lebihDingin(); kulkas.lebihDingin();
        kulkas.tampilkanInfo();
        kulkas.aturSuhu(5);
        kulkas.aturSuhu(9);
        kulkas.tampilkanInfo();
        
    }
}