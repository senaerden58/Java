package ilkDeneme;

public class Kisi {
    private String isim;

    public Kisi(String isim) {
        this.isim = isim;
    }

    public String testString() {
        return isim;
    }
    public static void main(String[] args) {
        Kisi kisi = new Kisi("Ahmet");
        System.out.println(kisi.testString());
    }
}


