package latmain;
import java.util.*;
public class LatMain {
    public static void main(String[] args) {
        Lat i=new Lat();
        do {Scanner in = new Scanner(System.in);
        System.out.print("masukkan nama : ");
        String n = in.nextLine();
        System.out.print("masukkan alamat : ");
        String a = in.nextLine();
        Lat.showdata(n,a);}
        while(i.ID()==true);
    }
}