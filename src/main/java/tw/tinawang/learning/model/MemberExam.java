package tw.tinawang.learning.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MemberExam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MemberExamId;

    @ManyToOne
    @JoinColumn(name = "mid")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "examId")
    private ExamInfo examInfo;
    private Date joinTime;

    public Long getMemberExamId() {
        return MemberExamId;
    }

    public void setMemberExamId(Long memberExamId) {
        MemberExamId = memberExamId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public ExamInfo getExamInfo() {
        return examInfo;
    }

    public void setExamInfo(ExamInfo examInfo) {
        this.examInfo = examInfo;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }


    
}