package group.blood.bloody.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import group.blood.bloody.modal.Acceptor;

@Repository
public interface AcceptorRepo extends CrudRepository<Acceptor, Long> {

}
