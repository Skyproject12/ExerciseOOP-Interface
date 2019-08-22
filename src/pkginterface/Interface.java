package pkginterface;

import java.util.Scanner;

public class Interface  {

    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       String nama;
       Biodata bio = new Biodata();
       
        System.out.println("masukkan nama");
        nama=scan.next();
        
        bio.input(nama);
        
    }
    
}
