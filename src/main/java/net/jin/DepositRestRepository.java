package net.jin;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DepositRestRepository extends CrudRepository<Deposit, Long>{

}