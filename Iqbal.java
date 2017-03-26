public class Iqbal { 
//nama class
// deklarasi atribut

    String hidung;
    String mata;
    String warnakulit;
    String rambut;

//construktor berisi parameter

    public void set(String hidung, String mata, String warnakulit, String rambut) {
        this.hidung = hidung;
        this.mata = mata;
        this.warnakulit = warnakulit;
        this.rambut = rambut;
    }

//method mencetak

    public void lihat() {
        System.out.println("Ciri - Ciri iqbal" + " \n");
        System.out.println("Hidung      : " + hidung);
        System.out.println("Mata        : " + mata);
        System.out.println("Warna kulit : " + warnakulit);
        System.out.println("Rambut      : " + rambut);
    }
}

// pembuatan object
    class ciri {
    public static void main(String[] args) {
        Iqbal ST = new Iqbal();
        ST.set("Sedang", "Belo", "Sawo Matang", "Pendek");
        ST.lihat();

    }
}
