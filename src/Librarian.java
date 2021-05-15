import java.util.ArrayList;
public class Librarian extends Person {
    private int employeeId;

    //crud books
    Shelf myshelf = new Shelf();
    ArrayList<Member> members=new ArrayList<Member>();
    public void addBooks(String isbn,String name,int amount) {
        myshelf.create(isbn, name, amount);
    }
    public void showBooks(){
        myshelf.read();
    }
    public void updateBooks(String isbn,String new_name,boolean new_flag){ //updtae both name & flag --> Shelf
        myshelf.update(isbn, new_name, new_flag);
    }
    public void updateBooks(String isbn,String new_name){ //update name only --> Shelf
        myshelf.update(isbn, new_name);
    }
    public void updateBooks(String isbn,boolean new_flag){ //update availability flag only --> Shelf
        myshelf.update(isbn, new_flag);
    }
    public void deleteBooks(String isbn){
        myshelf.delete(isbn);
    }

    public void addMember(String name, String family, int age, int nationalId, int memberId) {
        int i = 0;
        for (i = 0; i<members.size(); i++) {
            if (memberId == members.get(i).getMemberId() || nationalId == members.get(i).getnId()) {
                System.err.println("member Already Exists! ");
                return;
            }
        }
        members.add(new Member(name, family, age, nationalId, memberId));
    }
    public void showMember(){
        for (int i=0;i<members.size();i++){
            System.out.println(members.get(i).toString());
        }
    }
    public void updateMember(int memberId,String new_name,String new_family){  //update both name and family
        int i;
        for(i=0;i<members.size();i++){
            if(memberId == members.get(i).getMemberId()){
                break;
            }
        }
        System.out.print("member found :   ");
        System.out.println(members.get(i).toString());
        members.get(i).setName(new_name);
        members.get(i).setFamily(new_family);
    }

    public void updateMember(int memberId,String new_name,int new_age){  //update name and age
        int i;
        for(i=0;i<members.size();i++){
            if(memberId == members.get(i).getMemberId()){
                break;
            }
        }
        System.out.print("member found :   ");
        System.out.println(members.get(i).toString());
        members.get(i).setName(new_name);
        members.get(i).setAge(new_age);
    }

    public void updateMember(int memberId,int new_age){  //update  age omly
        int i;
        for(i=0;i<members.size();i++){
            if(memberId == members.get(i).getMemberId()){
                break;
            }
        }
        System.out.print("member found :   ");
        System.out.println(members.get(i).toString());
        members.get(i).setAge(new_age);
    }

    public void deleteMember(int memberId){
        int i=0;
        for(i=0;i<members.size();i++){
            if(memberId==members.get(i).getMemberId()){
                break;
            }
        }
        System.out.print("member found :  ");
        System.out.println(members.get(i).toString());
        members.remove(i);
    }

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
    public Librarian(){}
    @Override
    public String toString() {
        return super.toString()+"Librarian{" +
                "employeeId=" + employeeId +
                '}';
    }
}
