import java.util.Scanner;
public class MataKuliah19 {
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah19() {
        this.kodeMK = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public MataKuliah19(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Informasi Mata Kuliah");
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah: " + sksBaru);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam telah ditambah: " + this.jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (this.jumlahJam < jam) {
            System.out.println("Pengurangan invalid karena jumlah jam tidak mencukupi");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam telah dikurangi: " + this.jumlahJam);
        }
    }
    public class MataKuliahMain {
        public static void main(String[] args) {
            MataKuliah19 mk1 = new MataKuliah19("5", "Sistem Program", 3, 6);
            mk1.tampilInformasi();
            mk1.ubahSKS(8);
            mk1.tambahJam(1);
            mk1.kurangiJam(6);
            mk1.kurangiJam(5);
            mk1.tampilInformasi();
        }
    }
}

