package in.myapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_INCOME")
@Data
public class DC_INCOME_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long income_id;
	private Long case_num;
	private Long emp_Income;
	private Long property_income;
}
