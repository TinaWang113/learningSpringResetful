package tw.tinawang.learning.contorller;

import tw.tinawang.learning.model.Member;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.tinawang.learning.Server.MemberService;
import tw.tinawang.learning.dao.MemberRepository;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberService memberService;

    @GetMapping("/members")
    public Collection<Member> members() {
        return memberRepository.findAll();
    }

    @GetMapping("/member/{id}")
    public ResponseEntity<?> getMember(@PathVariable Long id) {
        Optional<Member> member = memberRepository.findById(id);
        return member.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/member")
    public ResponseEntity<Member> createMember(@Validated @RequestBody Member member) throws Exception {
        Member result = memberService.saveMember(member);
        return ResponseEntity.ok().body(result);
    }

    @PutMapping(value="member/{id}")
    public ResponseEntity<Member> updateMember (@PathVariable String id, @RequestBody Member member) {
        Member result =  memberRepository.save(member);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/member/{id}")
    public ResponseEntity<?> deletMember(@PathVariable Long id){
        memberRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}