public class Buku {
    public String judul;
    public String author;
    public String subject;
    public String genre;
    public int dds_number;
    public int isbn;

    public Buku(String judul, String author, String subject, String genre, int dds_number, int isbn) {
        this.judul = judul;
        this.author = author;
        this.subject = subject;
        this.genre = genre;
        this.dds_number = dds_number;
        this.isbn = isbn;
    }

    // Metode untuk memasukkan data baru
    public void inputData(String judul, String author, String subject, String genre, int dds_number, int isbn) {
        this.judul = judul;
        this.author = author;
        this.subject = subject;
        this.genre = genre;
        this.dds_number = dds_number;
        this.isbn = isbn;
    }

    public void searchData(String judul, String author, String subject, String genre, int dds_number, int isbn) {
        this.judul = judul;
        this.author = author;
        this.subject = subject;
        this.genre = genre;
        this.dds_number = dds_number;
        this.isbn = isbn;
    }

    // Metode untuk memperbarui data
    public void collectData(String judul, String author, String subject, String genre, int dds_number, int isbn) {
        this.judul = judul;
        this.author = author;
        this.subject = subject;
        this.genre = genre;
        this.dds_number = dds_number;
        this.isbn = isbn;
    }

}
