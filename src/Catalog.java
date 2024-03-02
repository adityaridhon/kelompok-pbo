public class Catalog {
    public int id;
    public String buku;
    public String author;

    // Konstruktor
    public Catalog(int id, String buku, String author) {
        this.id = id;
        this.buku = buku;
        this.author = author;
    }

    // Metode untuk memasukkan data baru
    public void insertData(int id, String buku, String author) {
        this.id = id;
        this.buku = buku;
        this.author = author;
    }

    // Metode untuk memperbarui data
    public void updateData(String buku, String author) {
        this.buku = buku;
        this.author = author;
    }
}
