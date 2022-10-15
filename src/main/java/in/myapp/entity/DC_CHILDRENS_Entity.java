package in.myapp.entity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_CHILDRENS")
@Data
public class DC_CHILDRENS_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long children_Id;
	private Long case_num;
	private Date children_dob;
	private Long children_ssn;
}
