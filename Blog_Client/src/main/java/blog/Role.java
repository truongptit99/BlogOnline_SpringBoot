package blog;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Role {
	private Long id;
	
	private String name;
	
	private Date createdAt;
	
	private Date updatedAt;
}
