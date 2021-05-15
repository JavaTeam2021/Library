import java.util.ArrayList;

public class Boss extends Person {
    private String username;
    private String password;

    //crud employees
//    Librarian [] librarian = new Librarian[200];
    ArrayList<Librarian> librarian = new ArrayList<Librarian>();

    public void createLib(String name, String family, int age, int nationalId, int employeeId) {
        int i = 0;
        for (i = 0; i < librarian.size(); i++) {   //to see if employee already exists!
            if (employeeId == librarian.get(i).getEmployeeId()) {
                System.out.println("The employee already exists!");
                return;
            }
        }
        librarian.add(new Librarian(name, family, age, nationalId, employeeId));     // employee doesn't exist so we continue to create new employee
    }

    public void showLib() {
        for (int i = 0; i < librarian.size(); i++) {
            System.out.println(librarian.get(i).toString());
        }
    }

    public void deleteLib(int employeeId) {

        for (int i = 0; i < librarian.size(); i++) {
            if (employeeId != librarian.get(i).getEmployeeId() && librarian.get(i + 1) == null) {
                System.err.println("Employee Not Found !");
                break;
            } else if (employeeId == librarian.get(i).getEmployeeId()) {
                librarian.remove(i);
                break;
            }
        }
    }

    public void updateLib(int employeeId,String new_name,int new_age){   //    to update name & age
        for(int i=0;i<librarian.size();i++){
            if(employeeId != librarian.get(i).getEmployeeId() && librarian.get(i+1)==null){
                System.err.println("Employee Not Found !");
                break;
            }else if( employeeId == librarian.get(i).getEmployeeId()){
                librarian.get(i).setName(new_name);
                librarian.get(i).setAge(new_age);
            }
        }
    }

    public void updateLib(int employeeId,String new_name,String new_family){   // tp update name & family
        for(int i=0;i<librarian.size();i++){
            if(employeeId != librarian.get(i).getEmployeeId() && librarian.get(i+1)==null){
                System.err.println("Employee Not Found !");
                break;
            }else if( employeeId == librarian.get(i).getEmployeeId()){
                librarian.get(i).setName(new_name);
                librarian.get(i).setFamily(new_family);
            }
        }
    }

    public void updateLib(int employeeId,int new_age){   // to update age only
        for(int i=0;i<librarian.size();i++){
            if(employeeId != librarian.get(i).getEmployeeId() && librarian.get(i+1)==null){
                System.err.println("Employee Not Found !");
                break;
            }else if( employeeId == librarian.get(i).getEmployeeId()){
                librarian.get(i).setAge(new_age);
            }
        }
    }

    public boolean libSignInVerify(int employeeId,int nationalId){
        for(int i=0;i<librarian.size();i++){
            if(employeeId==librarian.get(i).getEmployeeId() && nationalId==librarian.get(i).getnId()){
                return true;
            }
        }
        System.err.println("either username or password is incorrect! try again");
        return false;
    }




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boss(String name, String family, int age, int nId, String username, String password) {
        super(name, family, age, nId);
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString() + "Boss{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
