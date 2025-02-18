import java.util.Scanner;
public class Dosen19 {
   
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    
    public Dosen19() {
        this.statusAktif = true;
    }
    
    public Dosen19(String idDosen, String nama, boolean statusAktif, 
                 int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    
    public void tampilkanInformasi() {
        System.out.println("(Informasi Dosen)");
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    
    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
    }
    
    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }
    
    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }

    public class DosenMain {
        public static void main(String[] args) {
            Dosen19 dosen1 = new Dosen19("182901", "William Afton", true, 1983, "Machine Learning");
            System.out.println("[Dosen 1]");
            dosen1.tampilkanInformasi();
            int masaKerja = dosen1.hitungMasaKerja(2024);
            System.out.println("Masa Kerja: " + masaKerja + " tahun");
            dosen1.ubahKeahlian("Biologi");
            dosen1.tampilkanInformasi();
        }
    }
}

