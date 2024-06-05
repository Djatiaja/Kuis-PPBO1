import java.util.ArrayList;

public class Gubernur extends PegawaiNegara {
    ArrayList<PNS> listPNS;

    public Gubernur(String nama,int gajiPokok, String daerahKekuasaan,String alamat, PNS... pns) {
        super(nama,gajiPokok, daerahKekuasaan, alamat, "G");
        for (PNS pn:pns){
            if (pn.alamat != this.daerahKekuasaan){
                System.out.println("Alamat "+pn.nama+" bukan di daerah kekuasaan" + this.daerahKekuasaan);
                continue;
            }
            if (this.listPNS.indexOf(pn) <0){
                this.listPNS.add(pn);
            }else{
                System.out.println(pn.nama+" sudah berada di dalam list");
            }
        }
    }

    public void masukPNSList(PNS... pns){
        for (PNS pn:pns){
            if (pn.alamat != this.daerahKekuasaan){
                System.out.println("Alamat "+pn.nama+" bukan di daerah kekuasaan" + this.daerahKekuasaan);
                continue;
            }
            if (this.listPNS.indexOf(pn) <0){
                this.listPNS.add(pn);
            }else{
                System.out.println(pn.nama+" sudah berada di dalam list");
            }
        }
    }
    public void tambahAPBN(int sejumlah){
        APBN.DANA_APBN +=sejumlah;
        System.out.println("APBN bertambah sebanyak "+sejumlah);
    }

    public int getTunjangan(){
        int tunjangan = this.gajiPokok;
        if (this.listPNS != null){
           tunjangan += this.listPNS.size()*100000;
        }
        System.out.println("Tunjangan diterima sebanyak " + tunjangan);
        return tunjangan;
    }
    public void bayarPajak(int pajak){
        APBN.bayarPajak(pajak);
    }
}
