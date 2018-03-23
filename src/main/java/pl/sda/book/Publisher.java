package pl.sda.book;

public class Publisher {

    private String name;
    private String address;
    private String NIP;

    public Publisher(String name, String address, String NIP) {
        this.name = name;
        this.address = address;
        this.NIP = NIP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
}
