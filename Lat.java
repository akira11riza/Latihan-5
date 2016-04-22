package latmain;
public class Lat {
    private static int ID=1;
    private static String nama,alamat;
    private final int max=3;
    
    public Lat(){
        nama="";
        alamat="";
    }
    public Lat(String n, String a){
        nama=n;
        alamat=a;
    }
    public static void showdata(String n,String a ){
        System.out.println("ID      : "+ID++);
        System.out.println("nama    : "+n);
        System.out.println("alamat  : "+a);
    }
    public boolean ID(){
        double temp = ID;
        temp = this.ID;
        if(temp <= max){
            this.ID = this.ID;
            return true;
        }
            else{
            return false;
        }
    }
}