package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Account;

public interface AccountService {
    Account findByEmail(String email);
}
