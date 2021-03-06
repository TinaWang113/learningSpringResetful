package tw.tinawang.learning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tw.tinawang.learning.model.Member;

@Repository
public interface MemberRepository extends JpaRepository <Member, Long> {

    
}