package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MomeryMemberRepository();

    @Override
    public void join(Member member) {

    }

    @Override
    public Member findMember(long memberId) {
        return memberRepository.findById(memberId);
    }
}
