package group.blood.bloody.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import group.blood.bloody.modal.Donor;

@Repository
public interface DonorRepo extends CrudRepository<Donor, Long> {


}
