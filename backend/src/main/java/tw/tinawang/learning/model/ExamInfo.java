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
@Table(name="exam_info")
public @Data class ExamInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="exam_id", unique=true, nullable=false)
    private Long examId;

    @ManyToOne
    @JoinColumn(name="certificate_id")
    @NonNull
    private Certificate certificate;

    @ManyToOne
    @JoinColumn(name="vendor_id")
    @NonNull
    private Vendor vendor;

    @NonNull
    @Column(name="exam_date")
    private Date examDate;

    @NonNull
    @Column(name="publish_date")
    private Date publishDate;
}
