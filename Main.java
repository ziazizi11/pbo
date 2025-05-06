//Enkapsulasi
class Mobil{
    String warna;
    String merk;
    
    Mobil(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }
    void Info(){
        System.out.println("- Mobil ini berwarna: " + warna + ", dan merk: "+ merk);
    }
}
class Motor{
    String warna;
    String merk;
    
    Motor(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }
    void Info1(){
        System.out.println("- Motor ini berwarna: " + warna + ", dan merk: "+ merk);
    }
}
public class Main{
    public static void main(String[] args){
        Mobil mobilA = new Mobil("Merah", "Toyota");
        mobilA.Info();
        Mobil mobilB = new Mobil("Hitam", "Honda");
        mobilB.Info();
        Mobil mobilC = new Mobil("Putih", "Tesla");
        mobilC.Info();
        Motor motorA = new Motor("Putih", "PCX");
        motorA.Info1();
    }
}