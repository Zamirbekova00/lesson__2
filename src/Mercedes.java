public class Mercedes extends Cars{
    private int yearOfIssue;

    public Mercedes(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public void print() {
        System.out.println("Классная тачка");
    }
}
