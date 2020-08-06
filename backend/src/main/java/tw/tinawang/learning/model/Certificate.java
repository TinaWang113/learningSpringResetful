package tw.tinawang.learning.model;

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
@Table(name ="certificate")
public @Data class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "certificate_id", unique = true, nullable = false)
    private Long certificateId;
    
    @Column(name = "name", unique = true, nullable = false, length = 50)
    private String name;
    
	@ManyToOne
	@JoinColumn(name = "skill_id")
	@NonNull
    private Skill skill;
    
	@ManyToOne
	@JoinColumn(name = "company_id")
	@NonNull
	private Company company;

}