public class Hyundai extends Cars{
    private double volume;

    public Hyundai(double volume) {
        this.volume = volume;
    }


    @Override
    public void print() {
        System.out.println("Красивая машина");

    }
}
