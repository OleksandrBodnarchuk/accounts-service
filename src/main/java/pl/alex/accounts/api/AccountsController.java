package pl.alex.accounts.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

  @Value("${server.port}")
  private String serverPort;

  @GetMapping("/test")
  public String test() {
    return "Hello from [accounts-service] at port: " + serverPort;
  }
}
