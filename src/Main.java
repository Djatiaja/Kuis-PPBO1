import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RakyatJelata agus = new RakyatJelata("agus","Jogja", 110000000);
        RakyatJelata Feli = new RakyatJelata("Feli","Jogja", 90000000);
        RakyatJelata Siti = new RakyatJelata("Siti","Jogja", 108000000);
        RakyatJelata Paiman = new RakyatJelata("Paiman","Bandung", 70000000);
        RakyatJelata Joko = new RakyatJelata("Joko","Jogja", 40000000);

        PNS Bambang = new PNS("Bambang",500000, "Jogja", "Jogja", 3, agus, Feli, Siti);
        Bambang.masukanRakyat(Paiman,Joko,Feli);
        PNS Gilang = new PNS("Gilang", 6000000, "Bandung", "Bandung", 2, Paiman);

        DPRD Bowo = new DPRD("Bowo", 10000000, "Jogja", "Jogja");
        Gubernur Raka = new Gubernur("Raka", 15000000, "Jogja", "Jogja", Bambang);
        Raka.masukPNSList(Gilang);

        Raka.tambahAPBN(1000000);
        Bambang.salurBantuan();

        agus.bayarPajak(1000000);
        Feli.bayarPajak(1000000);
        Siti.bayarPajak(1000000);
        Paiman.bayarPajak(1000000);
        Joko.bayarPajak(1000000);

        Bambang.bayarPajak(2000000);
        Gilang.bayarPajak(2000000);

        Bowo.bayarPajak(3000000);
        Raka.bayarPajak(3000000);

        Bowo.kunjunganKerja();
        Bowo.kunjunganKerja();
        Bowo.kunjunganKerja();

        Bambang.getTunjanan();
        Bowo.getTunjangan();
        Raka.getTunjangan();


    }

}