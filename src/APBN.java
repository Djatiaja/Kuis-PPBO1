public class APBN {
    static int DANA_APBN;

    public static void bayarPajak (int pajak){
        DANA_APBN +=pajak;
        System.out.println("Berhasil membayar pajak sebanyak "+pajak);
    }
}
