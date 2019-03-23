package group.blood.bloody.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.blood.bloody.service.AcceptorService;

@RestController
@RequestMapping("/acceptor")
public class AcceptorController {

    private final AcceptorService acceptorService;

    public AcceptorController(AcceptorService acceptorService) {
        this.acceptorService = acceptorService;
    }

}
