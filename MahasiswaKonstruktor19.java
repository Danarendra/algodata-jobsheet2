import java.util.Scanner;
public class MahasiswaKonstruktor19 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);  
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru){
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kinerja sangat baik.";
        } else if (ipk >= 3.0){
            return "Kinerja baik." ;
        } else if (ipk >= 2.0){
            return "Kinerja cukup.";
        } else{
            return "Kinerja kurang.";
        }
    }

    public MahasiswaKonstruktor19(String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

public static void main(String[] args) {
 MahasiswaKonstruktor19 mhs1 = new MahasiswaKonstruktor19();
 mhs1.nama = "Muhammad Ali Farhan";
 mhs1.nim = "2441720171";
 mhs1.kelas = "SI 2J";
 mhs1.ipk = 3.55;

 mhs1.tampilkanInformasi();
 mhs1.ubahKelas("SI 2K");
 mhs1.updateIpk(3.60);
 mhs1.tampilkanInformasi();

 MahasiswaKonstruktor19 mhs2 = new MahasiswaKonstruktor19("Annisa Nabila", "2141720160", 3.25, "TI 2L");
 mhs2.updateIpk(3.30);
 mhs2.tampilkanInformasi();
 }
}

