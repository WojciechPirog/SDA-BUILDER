public class Publisher {
    private String name;
    private String adress;
    private int nip;

    public Publisher(String name, String adress, int nip) {
        this.name = name;
        this.adress = adress;
        this.nip = nip;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getNip() {
        return nip;
    }
}
