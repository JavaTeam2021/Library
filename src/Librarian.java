public class Librarian extends Person {
    private int employeeId;

    //crud books

    public Librarian(String name, String family, int age, int nId, int employeeId) {
        super(name, family, age, nId);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return super.toString()+"Librarian{" +
                "employeeId=" + employeeId +
                '}';
    }
}
