package in.myapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_CASES")
@Data
public class DC_Cases_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long case_id;
	private Long case_number;
	private Long app_Id;
	private Long plan_id;
}
