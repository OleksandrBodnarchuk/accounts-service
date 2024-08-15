package pl.alex.accounts.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

  @GetMapping("/test")
  public String test() {
    return "Hello from [accounts-service]";
  }
}
