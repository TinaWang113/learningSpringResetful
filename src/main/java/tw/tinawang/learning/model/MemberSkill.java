package tw.tinawang.learning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MemberSkill {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long mbSkillId;

    @ManyToOne
    @JoinColumn(name="mid")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "skillId")
    private Skill skill;

    public Long getMbSkillId() {
        return mbSkillId;
    }

    public void setMbSkillId(Long mbSkillId) {
        this.mbSkillId = mbSkillId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    
}