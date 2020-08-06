package tw.tinawang.learning.model;

import java.sql.Date;

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
@Table(name="member_exam")
public @Data class MemberExam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_exam_id", unique = true, nullable = false)
    private Long memberExamId;
    
	@ManyToOne
	@JoinColumn(name = "mid")
	@NonNull
    private Member member;
    
	@ManyToOne
	@JoinColumn(name = "exam_id")
    private ExamInfo examInfo;
    
	@Column(name = "join_time")
	private Date joinTime;
   
}