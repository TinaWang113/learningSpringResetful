package tw.tinawang.learning.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public @Data class Member {
    
    @Id
    private String mid;
    @NonNull
    private String fname;
    @NonNull
    private String lname;

    private Date createDate;
    
}