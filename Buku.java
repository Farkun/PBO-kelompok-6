public class Buku extends Rak{
    private String Pengarang;
    private String ISBN;
    private int TahunMasuk;

    public Buku(int noRak, String Nama, String Penerbit, String TanggalTerbit, 
    String Pengarang, int TahunMasuk) {
        super(noRak, Nama, Penerbit, TanggalTerbit);
        this.Pengarang = Pengarang;
        this.TahunMasuk = TahunMasuk;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getTahunMasuk() {
        return TahunMasuk;
    }

    public void display() {
        System.out.println(getnoRak()+". Nama\t\t  : "+getNama());
        System.out.println("   Penerbit       : "+getPenerbit());
        System.out.println("   Tanggal Terbit : "+getTanggalTerbit());
        System.out.println("   Pengarang      : "+getPengarang());
        System.out.println("   Tahun Masuk    : "+getTahunMasuk());
        System.out.println("-------------------------------------------------------");
    }
}
