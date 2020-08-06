package tw.tinawang.learning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tw.tinawang.learning.model.MemberSkill;

@Repository
public interface MemberSkillRepository extends JpaRepository<MemberSkill, Long>{

}