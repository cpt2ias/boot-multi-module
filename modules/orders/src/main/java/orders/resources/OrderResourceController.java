package orders.resources;

import orders.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class OrderResourceController {

    @Autowired
    private PagedResourcesAssembler<Order> assembler;

    public Page<Order> getOrders(Pageable pageable) {
        return new PageImpl<Order>(Collections.emptyList(), pageable, 0);
    }

}

