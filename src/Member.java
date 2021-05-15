import java.util.ArrayList;
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

