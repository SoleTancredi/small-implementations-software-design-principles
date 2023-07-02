public class Main {
    public static void main(String[] args){

        Adult adult = new Adult("Roque", "Perez", "123456", "4512-8956-2356");
        Child child = new Child("Luke", "Perez", adult);

        child.getGuardian().paid();

    }
}
