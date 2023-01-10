public class BMW extends Cars{
    private String owner;

    public BMW(String owner) {
        this.owner = owner;
    }

    @Override
    public void print() {
        System.out.println("Крутая машина");
    }
}
