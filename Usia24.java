import java.util.Scanner;
public class Usia24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kategori;
        byte usia;

        System.out.println("Masukkan usia");
        usia = input.nextByte();

        if (usia >=0 && usia <=12) {
            kategori = "Anak";
        }
        else if (usia >=13 && usia <=19){
            kategori = "Remaja";
        }
        else if (usia >=20 && usia <=64){
            kategori = "Dewasa";
        }
        else if (usia >65){
            kategori = "Lansia";
        }
        else {
            kategori = "input tidak valid";
        }
        
        System.out.println("Usia : " + kategori);
    }
}