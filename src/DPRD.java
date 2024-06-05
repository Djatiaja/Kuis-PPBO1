import java.util.ArrayList;
import java.util.Arrays;

public class DPRD extends PegawaiNegara{
    ArrayList<String> aspirasiRakyat;
    int jumlahKunjungan=0;
    public DPRD(String nama,int gajiPokok, String daerahKekuasaan, String alamat) {
        super(nama ,gajiPokok, daerahKekuasaan, alamat,"D");
        this.aspirasiRakyat=new ArrayList<>();
    }
    public void kunjunganKerja(){
        System.out.println("Gubernur melakukan kunjungan kerja");
        this.jumlahKunjungan++;
    }

    public void masukAspirasiRakyat(String aspirasi){
        this.aspirasiRakyat.add(aspirasi);
    }

    public int getTunjangan(){
        int tunjangan = this.jumlahKunjungan *1000000 +this.gajiPokok;
        System.out.println("Tunjangan diterima sebanyak "+ tunjangan);
        return tunjangan;
    }

    public void bayarPajak(int pajak){
        APBN.bayarPajak(pajak);
    }
}
