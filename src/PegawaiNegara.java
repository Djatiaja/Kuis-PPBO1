public abstract class PegawaiNegara {
    static int NIPCOUNTER=0;
    int gajiPokok;
    String daerahKekuasaan, NIP, alamat, hurufDepanNIP, nama;

    public PegawaiNegara(String nama,int gajiPokok, String daerahKekuasaan, String alamat, String hurufDepanNIP) {
        NIPCOUNTER++;
        this.nama = nama;
        this.hurufDepanNIP=hurufDepanNIP;
        NIP = hurufDepanNIP +String.valueOf(NIPCOUNTER);
        this.gajiPokok = gajiPokok;
        this.daerahKekuasaan = daerahKekuasaan;
    }
}
