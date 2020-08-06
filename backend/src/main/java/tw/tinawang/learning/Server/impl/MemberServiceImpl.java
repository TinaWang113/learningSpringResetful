package tw.tinawang.learning.Server.impl;

import java.sql.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.tinawang.learning.Server.MemberService;
import tw.tinawang.learning.dao.MemberRepository;
import tw.tinawang.learning.model.Member;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository  memberRepository;


    @Override
    public Member saveMember(Member member) {
        member.setMid(UUID.randomUUID().toString().replaceAll("-",""));
        member.setCreateTime(new Date(System.currentTimeMillis()));
        memberRepository.save(member);
        return member;
    }

    
}