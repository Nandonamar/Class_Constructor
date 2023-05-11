
class Pemain {
    String nama;
    double nyawa;

    // Object member
    Senjata senjata;
    Kostum kostum;

    Pemain(String nama, double nyawa) {
        this.nama = nama;
        this.nyawa = nyawa;
    }

    void equipSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    void equipKostum(Kostum kostum) {
        this.kostum = kostum;
    }

    void tampil() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Nyawa : " + this.nyawa + "hp");
        this.senjata.tampil();
        this.kostum.tampil();
    }
}

// senjata
class Senjata {
    double kekuatanSerangan;
    String nama;
    Senjata(String nama, double kekuatanSerangan){
        this.nama = nama;
        this.kekuatanSerangan = kekuatanSerangan;
    }
    void tampil(){
        System.out.println("Senjata : " + this.nama + ", Serangan : " + this.kekuatanSerangan);
    }
}

// Kostum
class Kostum{
    double kekuatanBertahan;
    String nama;

    Kostum(String nama, double kekuatanBertahan){
        this.nama = nama;
        this.kekuatanBertahan = kekuatanBertahan;
    }
    void tampil(){
        System.out.println("Kostum : " + this.nama + " , Bertahan : " + this.kekuatanBertahan);

    }
}
class Pertama{
    public static void main(String[]args){

        //membuat object Pemain
        Pemain Pemain1 = new Pemain("Fernando",95);

        Pemain Pemain2 = new Pemain("Yeremias",93);

        //membuat object senjata
        Senjata Shootgun = new Senjata("Shootgun",100);
        Senjata Bambu_Runcing = new Senjata("Bambu_Runcing",50);

        //membuat object Kostum
        Kostum Loreng = new Kostum("Loreng", 75);
        Kostum Armor = new Kostum("Armor", 90);

        Pemain1.equipSenjata(Shootgun);
        Pemain1.equipKostum(Loreng);
        Pemain1.tampil();

        Pemain2.equipSenjata(Bambu_Runcing);
        Pemain2.equipKostum(Armor);
        Pemain2.tampil();

    }
}
