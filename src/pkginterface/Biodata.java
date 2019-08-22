package pkginterface;
public class Biodata implements tampung {
    private String nama;

    public Biodata() {
    }

    public Biodata(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
    
    @Override
    public void input(String nama) {
        System.out.println("nama"+nama);   
    }

    
    
}
