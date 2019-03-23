package group.blood.bloody.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.blood.bloody.modal.Donor;
import group.blood.bloody.service.DonorService;

@RestController
@RequestMapping("/donor")
public class DonoController {

    private static final Logger logger = LoggerFactory.getLogger(DonoController.class);
    private final DonorService donorService;

    public DonoController(DonorService donorService) {
        this.donorService = donorService;
    }

    @PostMapping
    public Donor getBlock(@RequestBody Donor donor){
        return donorService.createDonor(donor);
    }
}
