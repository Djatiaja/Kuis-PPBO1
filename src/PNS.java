import java.util.ArrayList;

public class PNS extends PegawaiNegara{
    int golongan;
    ArrayList<RakyatJelata> listRakyat;

    public PNS(String nama,int gajiPokok, String daerahKekuasaan, String alamat,int golongan,RakyatJelata... rakyat) {
        super(nama,gajiPokok, daerahKekuasaan,alamat, "P");
        this.golongan = golongan;
        this.listRakyat = new ArrayList<>();
        for (RakyatJelata rak:rakyat){
            if (rak.alamat != this.daerahKekuasaan){
                System.out.println("Alamat "+rak.nama+" bukan di daerah kekuasaan "+this.daerahKekuasaan);
                continue;
            }

            if (listRakyat.indexOf(rak) < 0){
                this.listRakyat.add(rak);
            }else {
                System.out.println();
                System.out.println(rak.nama+" ada pada listRakyat");
            }
        }
    }

    public int getTunjanan (){
        int tunjangan = this.golongan * 100000 +this.gajiPokok;
        System.out.println("Tunjangan diterima sebanyak " + tunjangan);
        return tunjangan;
    }

    public void bayarPajak(int pajak){
        APBN.bayarPajak(pajak);
    }

    public void salurBantuan(){

        for (RakyatJelata rakyat:listRakyat){
            if (rakyat.jumlahKekayaan <100000000 && APBN.DANA_APBN >= 1000000){
                rakyat.jumlahKekayaan += 1000000;
                APBN.DANA_APBN -=APBN.DANA_APBN -1000000;
                System.out.println(rakyat.nama +" telah mendapatkan bantuann sebanyak 1000000");
            } else if (APBN.DANA_APBN < 1000000) {
                System.out.println("APBN tidak cukup untuk menyalurkan bantuan");
                break;
            }

        }
    }

    public void masukanRakyat(RakyatJelata... rakyatJelata){
        for (RakyatJelata rakyat:rakyatJelata) {
            if (rakyat.alamat != this.daerahKekuasaan) {
                System.out.println("Alamat "+rakyat.nama+" bukan di daerah kekuasaan "+this.daerahKekuasaan);
                continue;
            }
            if (listRakyat.indexOf(rakyat) < 0) {
                this.listRakyat.add(rakyat);
            } else {
                System.out.println();
                System.out.println(rakyat.nama+" ada pada listRakyat");
            }
        }
    }
}
