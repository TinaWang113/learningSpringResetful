package tw.tinawang.learning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="member_skill")
public @Data class MemberSkill {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="member_skill_id",unique=true, nullable=false)
    private Long mbSkillId;
    
    @NonNull
    @ManyToOne
    @JoinColumn(name="mid")
    private Member member;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
}