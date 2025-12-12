package tacos;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Table
@Data
@Entity
public class Taco {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Date createdAt = new Date();

	@NotNull
	@Size(min = 3, message = "Name must be at least 3 characters long")
	private String name;

	@NotNull
	@Size(min = 1, message = "You must choose at least 1 ingredien")
	@ManyToMany()
	private List<Ingredient> ingredients;
}
