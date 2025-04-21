public class Student {
    private String id;
    private String name;
    private int Mark;

    public Student(String id, String name, int mark) {
        this.id = id;
        this.name = name;
        Mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return Mark;
    }

    public void setMark(int mark) {
        Mark = mark;
    }
}
