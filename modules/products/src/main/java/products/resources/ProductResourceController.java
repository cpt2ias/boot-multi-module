package products.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.web.bind.annotation.RestController;
import products.domain.Product;

import java.util.Collections;

@RestController
public class ProductResourceController {

    @Autowired
    private PagedResourcesAssembler<Product> assembler;

    public Page<Product> getProducts(Pageable pageable) {
        return new PageImpl<Product>(Collections.emptyList(), pageable, 0);
    }

}

