package tw.tinawang.learning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "company")
public @Data class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id", unique = true, nullable = false)
	private Long companyId;
	@NonNull
	@Column(name = "name", unique = true, nullable = false, length = 50)
	private String name;
	
}