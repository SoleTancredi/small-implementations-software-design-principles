public class Triangle implements IFigura{
    private float base;
    private float height;

    public Triangle(float base, float height) {
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
        return "Base " + this.getBase() + " Height " + this.getHeight();
    }

    @Override
    public float area() {
        return (getBase() * getHeight()) / 2;
    }
}
