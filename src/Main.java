public class Main {
    public static void main(String[] args) {
        Printable[] printables = {createObjects("Hyundai"),  createObjects("Mercedes"), createObjects("BMW")};
        for (Printable printable:printables) {
            printable.print();
        }
    }
    public static  Printable createObjects(String className){
        switch (className){
            case "Hyundai":
                return new Hyundai(2.5);
            case "Mercedes":
                return new Mercedes(2010);
            case "BMW":
                return new BMW("woman");
        }
        return null;
    }
}


