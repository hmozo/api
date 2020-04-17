package se.magnus.api.core.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
public interface ProductService {
	@GetMapping(
		value = "/product/{productId}",
		produces = "application/json")
	Product getProduct(@PathVariable int productId);
	
	@GetMapping("/")
		String getProduct2();
}
