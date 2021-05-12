public class Member extends Person {
    private Long memberId;

    public Member(String name, String family, int age, int nId, Long memberId) {
        super(name, family, age, nId);
        this.memberId = memberId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return super.toString()+"Member{" +
                "memberId=" + memberId +
                '}';
    }
}
