package tw.tinawang.learning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tw.tinawang.learning.model.MemberExam;

@Repository
public interface MemberExamRepository extends JpaRepository<MemberExam, Long>{

}