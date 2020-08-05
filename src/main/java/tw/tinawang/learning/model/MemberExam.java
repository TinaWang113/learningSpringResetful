package tw.tinawang.learning.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public @Data class MemberExam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MemberExamId;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "mid")
    private Member member;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "examId")
    private ExamInfo examInfo;
    @NonNull
    private Date joinTime;
   
}