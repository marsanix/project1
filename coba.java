class dataktp{//class
    String nama; //variabel
    String tgl_lahir;
    int nik;
    String alamat;
    String golongandarah;

   dataktp (String inputnama, String inputtgl_lahir, int inputnik, String inputalamat, String inputgolongandarah){

   

    nama =inputnama;
    tgl_lahir =inputtgl_lahir;
        nik =inputnik;
    alamat =inputalamat;
   golongandarah =inputgolongandarah;

   System.out.println(nama);
    System.out.println(tgl_lahir);
    System.out.println(nik);
    System.out.println(alamat);
    System.out.println(golongandarah);

   }
}

public class coba{
    public static void main(String[] args){//method

        dataktp dataktp1 = new dataktp("adi","12-26-1999",224562323,"jalan.dr sutomo","A"); //object
        System.out.println(" ");

    }

}