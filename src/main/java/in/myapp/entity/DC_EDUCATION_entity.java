package in.myapp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_EDUCATION")
@Data
public class DC_EDUCATION_entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long edu_Id;
	private Long case_num;
	private String highest_qualification;
	private Date graduation_year;
}
