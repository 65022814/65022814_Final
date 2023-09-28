import java.util.ArrayList;

class Project {
    private String projectName;
    private String description;

    public Project(String projectName, String description) {
        this.projectName = projectName;
        this.description = description;
    }

    public String getProject() {
        return projectName + " : " + description;
    }
}
interface Person {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}

interface Job {
    String getPosition();
    void setPosition(String position);
    int getEmpID();
    void setEmpID(int empID);
}

class Employee {
    private String name;
    private double age;
    private String position;
    private int empID;
    private ArrayList<Project> myProjects = new ArrayList<>();

    public Employee(String name, double age, String position, int empID) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void addProject(Project project) {
        myProjects.add(project);
    }

    public void showDetails() {
        System.out.println("Name : " + name);
        System.out.println("Position : " + position);
        System.out.println("EmpID : " + empID);
        System.out.println("Projects");
        for (Project project : myProjects) {
            System.out.println("    " + project.getProject());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee Tom = new Employee("Tom", 20, "UX/UI", 1);
        Employee Tim = new Employee("Tim", 20, "FontEnd", 2);

        Project webProject = new Project("Web A", "Developing a web application");
        Project mobileProject = new Project("Mobile app A", "Developing a mobile app");

        System.out.println("******************************");
        Tom.addProject(webProject);
        Tom.addProject(mobileProject);
        Tom.showDetails();
        System.out.println("******************************");
        Tim.addProject(webProject);
        Tim.showDetails();
    }
}
