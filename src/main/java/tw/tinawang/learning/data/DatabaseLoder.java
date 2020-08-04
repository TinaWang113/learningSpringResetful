package tw.tinawang.learning.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tw.tinawang.learning.dao.MemberRepository;
import tw.tinawang.learning.model.Member;

@Component
public class DatabaseLoder implements CommandLineRunner {
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public void run(String... args) throws Exception{
        Member member = new Member("Test", "Tester");
        memberRepository.save(member);

    }
    
}