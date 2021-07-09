import java.util.Scanner;

public class ObjectPractice {

    static String nama;
    static int hargaSatuan;
    static int jumlahBarang;
    static int hargaTotal;
    static int hargaDiskon;
    static int hargaBayar;

    Scanner input = new Scanner(System.in);

    ObjectPractice(String nama, int hargaSatuan, int jumlahBarang){
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlahBarang = jumlahBarang;

    }
    int HargaTotal(int hargaSatuan, int jumlahBarang){
        hargaTotal = hargaSatuan * jumlahBarang;
        return hargaTotal;
    }
    int Diskon(int hargaTotal){
        if(hargaTotal >= 100000){
            hargaDiskon = 10;
            return hargaDiskon;
        }
        if(hargaTotal < 100000 && hargaTotal > 50000){
            hargaDiskon = 5;
            return hargaDiskon;
        }
        else{
            hargaDiskon = 0;
            return hargaDiskon;
        }

    }
    int HargaBayar(int hargaTotal, int diskon){
        hargaBayar = hargaTotal - (hargaTotal *diskon / 100);
        return hargaBayar;
    }

    public static void main(String[] args) {
        ObjectPractice makanan = new ObjectPractice("Ayam Geprek", 20000 ,3);
        hargaTotal = makanan.HargaTotal(hargaSatuan, jumlahBarang);
        hargaDiskon = makanan.Diskon(hargaTotal);
        hargaBayar = makanan.HargaBayar(hargaTotal, hargaDiskon);
        System.out.println(nama);
        System.out.println(hargaDiskon); 
        System.out.println(hargaTotal);
        System.out.println(hargaBayar);

        System.out.println("--------");

        ObjectPractice minuman = new ObjectPractice("Ice Cream", 8000 ,2);
        hargaTotal = minuman.HargaTotal(hargaSatuan, jumlahBarang);
        hargaDiskon = minuman.Diskon(hargaTotal);
        hargaBayar = minuman.HargaBayar(hargaTotal, hargaDiskon);
        System.out.println(nama);
        System.out.println(hargaDiskon);
        System.out.println(hargaTotal);
        System.out.println(hargaBayar);      

        System.out.println("---------");



    }

} 