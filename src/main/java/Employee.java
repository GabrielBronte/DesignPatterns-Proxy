public class Employee {
    private String name;
    private boolean isAdministrator;

    public Employee(String name, boolean isAdministrator) {
        this.name = name;
        this.isAdministrator = isAdministrator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdministrator() {
        return isAdministrator;
    }

    public void setAdministrator(boolean isAdministrator) {
        this.isAdministrator = isAdministrator;
    }
}