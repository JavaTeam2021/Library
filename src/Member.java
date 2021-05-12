public class Member extends Person {
    private int memberId;
    public Member(){
        super();
    }
    public Member(String name, String family, int age, int nId, int memberId) {
        super(name, family, age, nId);
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return super.toString() + "Member{" +
                "memberId=" + memberId +
                '}';
    }
}

class Member_CRUD{
    Member[] members = new Member[300];
    public void AddMember(String name, String family, int age, int nationalId, int memberId) {
        int i = 0;
        for (i = 0; members[i] != null; i++) {
            if (memberId == members[i].getMemberId() || nationalId == members[i].getnId()){
                System.err.println("member Already Exists! ");
                return;
            }
        }
        members[i]= new Member(name,family,age,nationalId,memberId);
    }

    public void showMyInfo(int memberId){
        int i=0;
        for (i=0;members[i]!=null;i++){
            if(memberId != members[i].getMemberId()){
                System.err.println("User Not Found! try contact");
                return;
            }else if(memberId == members[i].getMemberId())
                break;
        }
        System.out.println(members[i].toString());
    }
}
