public class House {
    private String addres;
    private String region;  // region - область

    public House(String addres, String region) {
        this.addres = addres;
        this.region = region;
    }

    public String getAddres() {
        return addres;
    }

    public String getRegion() {
        return region;
    }
}
