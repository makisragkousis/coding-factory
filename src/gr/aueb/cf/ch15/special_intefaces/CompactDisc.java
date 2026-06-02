package gr.aueb.cf.ch15.special_intefaces;

public class CompactDisc implements IProduct{
    private int id;
    private String title;
    private String manufacturer;
    private int capacity;

    public CompactDisc() {}

    public CompactDisc(int id, String title, String manufacturer, int capacity) {
        this.id = id;
        this.title = title;
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
