package exercise.entities;

public class StudentBiz extends TechMastStudent {
    private static int autoId ;
    private int id;
    private double marKetingPoint;
    private double salesPoint;

    public StudentBiz() {
    }

    @Override
    public double getDiem() {
        return ( 2 * getMarKetingPoint() + getSalesPoint()) / 3;
    }

    public StudentBiz(String name, String branch, double marKetingPoint, double salesPoint) {
        super(name, branch);
        this.id = autoId++;
        this.marKetingPoint = marKetingPoint;
        this.salesPoint = salesPoint;
    }

    public double getMarKetingPoint() {
        return marKetingPoint;
    }

    public void setMarKetingPoint(double marKetingPoint) {
        this.marKetingPoint = marKetingPoint;
    }

    public double getSalesPoint() {
        return salesPoint;
    }

    public void setSalesPoint(double salesPoint) {
        this.salesPoint = salesPoint;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        StudentBiz.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentBiz{" +
                "id=" + id +
                ", marKetingPoint=" + marKetingPoint +
                ", salesPoint=" + salesPoint + ",Điểm TB =" + getDiem() +
                ",Học Lực=" + getHocLuc() +
                '}';
    }
}
