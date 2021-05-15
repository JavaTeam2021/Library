import java.util.ArrayList;
import java.lang.Math;
class Member_CRUD {
//    Member[] members = new Member[300];
      ArrayList<Member> members= new ArrayList<Member>();

    public void AddMember(String name, String family, int age, int nationalId, int memberId) {
        int i = 0;
        for (i = 0; i<members.size(); i++) {
            if (memberId == members.get(i).getMemberId() || nationalId == members.get(i).getnId()) {
                System.err.println("member Already Exists! ");
                return;
            }
        }
        members.add(new Member(name, family, age, nationalId, memberId));
    }

    public void showMyInfo(int memberId) {
        int i = 0;
        for (i = 0; i<members.size(); i++) {
            if (memberId != members.get(i).getMemberId()) {
                System.err.println("User Not Found! try contact");
                return;
            } else if (memberId == members.get(i).getMemberId())
                break;
        }
        System.out.println(members.get(i).toString());
    }


    public boolean memberVerifySignIn(int memberId,int nationalId){
        for (Member member : members) {
            if (memberId == member.getMemberId() && nationalId == member.getnId()) {
                return true;
            }
        }
        return false;
    }

    public void updateProfile(int memberId,String name,String family,int age){
        for(int i=0;i<members.size();i++){
            if(memberId==members.get(i).getMemberId()){
                members.get(i).setName(name);
                members.get(i).setFamily(family);
                members.get(i).setAge(age);
                System.out.print("Changes: ");
                members.get(i).toString();
                return;

            }
        }
        System.err.println("There must be a Problem in your memberId check your spelling please");
    }

    public void memberSignUp(String name,String family,int age,int nationalId){
        int memID=(int)(Math.random()*(999999-1+1)+1);
        members.add(new Member(name,family,age,nationalId,memID));
        for (int i=0;i<members.size();i++){
            if(memID==members.get(i).getMemberId()){
                System.out.print("your account info: ");
                System.out.println(members.get(i).toString());
                break;
            }
        }
    }

    public void deleteAccount(int memberId,int nationalId){
        for(int i=0;i<members.size();i++){
            if(memberId==members.get(i).getMemberId() && nationalId==members.get(i).getnId()){
                members.remove(i);
                return;
            }
        }
        System.err.println("memberId or password is incorrect check it again!");
    }

}
