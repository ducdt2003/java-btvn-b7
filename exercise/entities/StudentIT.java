package exercise.entities;

public class StudentIT extends TechMastStudent {
    private static int autoId ;
    private int id;
    private double javaPoint;
    private double htmlPoint;
    private double cssPoint;


    public StudentIT() {
    }

    @Override
    public double getDiem() {
        return ( 2 * getJavaPoint() + getHtmlPoint() + getCssPoint()) / 4;
    }

    public StudentIT(String name, String branch, double javaPoint, double htmlPoint, double cssPoint) {
        super(name, branch);
        this.id = autoId++;
        this.javaPoint = javaPoint;
        this.htmlPoint = htmlPoint;
        this.cssPoint = cssPoint;
    }

    public double getJavaPoint() {
        return javaPoint;
    }

    public void setJavaPoint(double javaPoint) {
        this.javaPoint = javaPoint;
    }

    public double getHtmlPoint() {
        return htmlPoint;
    }

    public void setHtmlPoint(double htmlPoint) {
        this.htmlPoint = htmlPoint;
    }

    public double getCssPoint() {
        return cssPoint;
    }

    public void setCssPoint(double cssPoint) {
        this.cssPoint = cssPoint;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        StudentIT.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentIT{" +
                "id=" + id +
                ", javaPoint=" + javaPoint +
                ", htmlPoint=" + htmlPoint +
                ", cssPoint=" + cssPoint + ",Điểm Trung Binh= " + getDiem() + ",Học lực="
        + getHocLuc() +
        '}';
    }
}
