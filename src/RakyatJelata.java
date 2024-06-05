public class RakyatJelata {

    String alamat, nama;
    int jumlahKekayaan;

    public RakyatJelata(String nama,String alamat, int jumlahKekayaan){
        this.alamat = alamat;
        this.nama = nama;
        this.jumlahKekayaan = jumlahKekayaan;
    }

    public void bayarPajak(int pajak){
        APBN.bayarPajak(pajak);
    }
}
