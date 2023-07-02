public class Child extends Person {

    private Adult guardian;

    public Child(String name, String lastName, Adult guardian) {
        super(name, lastName);
        this.guardian = guardian;
    }

    public Adult getGuardian() {
        return guardian;
    }

    public void setGuardian(Adult guardian) {
        this.guardian = guardian;
    }
}
