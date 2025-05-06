
class persegipanjang {
    private int panjang;
    private int lebar;  
 
    public persegipanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int hitungluasPP(){
        return panjang * lebar;
    }
}

public class persegipanjangPBO{
    public static void main (String []args){
        persegipanjang pp1 = new persegipanjang (5,2);

        int luas = pp1.hitungluasPP();
        System.out.println("luas pp1 = " + luas);
    }
}
