package pl.alex.app.accounts.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @GetMapping("/status/check")
    public String status() {
        return "accounts-service is working";
    }
}
