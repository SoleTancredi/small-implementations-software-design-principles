public class Rectangle {
    private float base;
    private float height;

    public Rectangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public float getHeight() {
        return height;
    }

    // what should be displayed?
    @Override
    public String toString() {
        return "Base " + this.getBase() + " Altura " + this.getHeight();
    }

    public float area(){
        return this.getBase() * this.getHeight();
    }
}