package tw.tinawang.learning.model;

import java.sql.Date;

import javax.annotation.Generated;
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

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "members")
public class Member {

    @Id
    @NonNull
    @Column(name = "mid", unique = true, nullable = false, length = 50)
    private String mid;

    @NonNull
    @Column(name = "email", unique = true, nullable = false, length = 50)
    private String email;
    
    @NonNull
	@Column(name = "password", nullable = false, length = 50)
	private String password;
    
    @NonNull
	@Column(name = "first_name", nullable = false, length = 50)
	private String firstName;
    
    @NonNull
	@Column(name = "last_name", nullable = false, length = 50)
	private String lastName;
    
    @Column(name = "create_time")
	private Date createTime;
    
    @Column(name = "update_time")
	private Date updateTime;
    
}