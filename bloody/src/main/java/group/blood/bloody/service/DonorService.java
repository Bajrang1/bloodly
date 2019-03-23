package group.blood.bloody.service;

import group.blood.bloody.modal.Donor;
import group.blood.bloody.repository.DonorRepo;

public class DonorService {
    private final DonorRepo donorRepo;

    public DonorService(DonorRepo donorRepo) {
        this.donorRepo = donorRepo;
    }

    public Donor createDonor(Donor donor) {
        return donorRepo.save(donor);
    }
}
