package tw.tinawang.learning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tw.tinawang.learning.model.ExamInfo;


@Repository
public interface ExamInfoRepostory extends JpaRepository<ExamInfo, Long>{
    
}