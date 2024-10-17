package com.udacity.pricing.domain.price;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.udacity.pricing.domain.price.Price;

@RepositoryRestResource(collectionResourceRel = "prices", path = "prices")
public interface PriceRepository extends CrudRepository<Price, Long> {
}

