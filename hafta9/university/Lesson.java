public class Lesson {
    private int id;
    private String name;
    private int v, f;

    public Lesson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getV() {
        return v;
    }

    public int getF() {
        return f;
    }

    public void setV(int v) {
        this.v = v;
    }

    public void setF(int f) {
        this.f = f;
    }

}
