public class Customer {
    public int id;
    public String nama;
    private String password;

    public void Login(int id, String nama, String password) {
        this.id = id;
        this.nama = nama;
        this.password = password;
    }

    public void insertData(int id, String nama, String password) {
        this.id = id;
        this.nama = nama;
        this.password = password;
    }

    public void logout(int id, String nama, String password) {
        this.id = id;
        this.nama = nama;
        this.password = password;
    }

}
