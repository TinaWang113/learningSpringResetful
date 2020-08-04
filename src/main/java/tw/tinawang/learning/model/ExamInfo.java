package tw.tinawang.learning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExamInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long examinfoId;
    private String question;

    public Long getExaminfoId() {
        return examinfoId;
    }

    public void setExaminfoId(Long examinfoId) {
        this.examinfoId = examinfoId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    
}
