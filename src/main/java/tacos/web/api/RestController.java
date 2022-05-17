package tacos.web.api;
//package tacos.web.api;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tacos.Ingredient;
import tacos.data.IngredientRepository;

public class RestController {
	@RestController
	@RequestMapping(path = "/ingredients", produces = "application/json")
	@CrossOrigin(origins = "*")
	public class IngredientController {
	private IngredientRepository ingredientRepo;
	@Autowired
	EntityLinks entityLinks;
	public IngredientController(IngredientRepository ingredientRepo) {
	this.ingredientRepo = ingredientRepo;
	}
}
