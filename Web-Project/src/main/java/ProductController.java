import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product")
public class ProductController {

	@RequestMapping(value="{productId}", method = RequestMethod.GET)
	public @ResponseBody Product getProduct(@PathVariable int productId)
	{
		Product product1 = new Product();
		
		product1.setProductId(productId);
		product1.setName("Widget1");
		product1.setDescription("test");
		product1.setPrice(99.99);
		
		return product1; // Spring Handles Json Conversion automatically with RequestMapping
	}
}
