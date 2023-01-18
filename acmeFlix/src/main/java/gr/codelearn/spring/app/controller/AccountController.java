package gr.codelearn.spring.app.controller;


import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.mapper.AccountMapper;
import gr.codelearn.spring.app.mapper.BaseMapper;
import gr.codelearn.spring.app.service.AccountService;
import gr.codelearn.spring.app.service.BaseService;
import gr.codelearn.spring.app.transfer.ApiResponse;
import gr.codelearn.spring.app.transfer.resource.*;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("accounts")
public class AccountController extends BaseController<Account, AccountResource> {

    private final AccountService accountService;
    private final AccountMapper accountMapper;

    @Override
    protected BaseService<Account, Long> getBaseService() {
        return accountService;
    }

    @Override
    protected BaseMapper<Account, AccountResource> getBaseMapper() {
        return accountMapper;
    }

    @GetMapping(params = {"accountId"}, path = "getViewHoursPerProfile")
    protected ResponseEntity<ApiResponse<List<Report>>> getViewHoursPerProfile (@RequestParam("accountId") Long accountId, WebRequest request){
        logger.info("Account controller, getViewHoursPerProfile method");

        try{
            List<Report> result = accountService.getViewHoursPerProfile(accountId);
            if(result != null){
                return ResponseEntity.ok(ApiResponse.<List<Report>>builder().data(result).build());
            }else{
                return ResponseEntity.notFound().build();
            }

        }catch (Exception exception){
            return (ResponseEntity<ApiResponse<List<Report>>>) exceptionHandler.handleException(exception, request);
        }
    }

    @GetMapping(path = "getHistoryPerAccount")
    protected ResponseEntity<ApiResponse<List<ReportHistoryModel>>> getHistoryPerAccount (WebRequest request){
        logger.info("Account controller, getHistoryPerAccount method");

        try{
            List<ReportHistoryModel> result = accountService.getHistoryPerAccount();
            if(result != null){
                return ResponseEntity.ok(ApiResponse.<List<ReportHistoryModel>>builder().data(result).build());
            }else{
                return ResponseEntity.notFound().build();
            }

        }catch (Exception exception){
            return (ResponseEntity<ApiResponse<List<ReportHistoryModel>>>) exceptionHandler.handleException(exception, request);
        }
    }
}
