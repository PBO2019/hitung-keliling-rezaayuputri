public class lingkaran {
    private double phi = 3.14;
    private double jari = 10;
    private double keliling;

    public void hitung(){
        keliling = 2 * phi * jari;
        System.out.println("keliling Lingkaran" + keliling);
    }
    public static void main (String [] args){
        lingkaran ku = new lingkaran();
        ku.hitung();
    }


}
