package homework.entities;

public abstract class TechMastStudent {
    private String name;
    private String branch;

    public TechMastStudent() {
    }

    public TechMastStudent(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public abstract double getDiem();

    public String getHocLuc(){
        if( getDiem() < 5 ){
            return "YẾU";
        } else if (getDiem() >= 5 && getDiem() < 6.5) {
            return "TRUNG BINH";
        } else if ( getDiem() >= 6.5 && getDiem() < 7.5) {
            return "KHA";
        } else if (getDiem() >= 7.5 && getDiem() <= 10) {
            return "GIOI";
        }else {
            return " LỖi ";
        }
    }
}
