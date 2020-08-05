package tw.tinawang.learning.contorller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.tinawang.learning.dao.ExamInfoRepostory;
import tw.tinawang.learning.model.ExamInfo;

@RestController
@RequestMapping("/api")
public class ExamController {
    @Autowired
    private ExamInfoRepostory examInfoRepostory;

    @GetMapping("/exams")
    public Collection<ExamInfo> getExams(){
        return examInfoRepostory.findAll();
    }
    
}