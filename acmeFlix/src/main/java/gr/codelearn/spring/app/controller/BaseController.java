package gr.codelearn.spring.app.controller;


import gr.codelearn.spring.app.domain.BaseModel;
import gr.codelearn.spring.app.mapper.BaseMapper;
import gr.codelearn.spring.app.service.BaseService;
import gr.codelearn.spring.app.transfer.ApiResponse;
import gr.codelearn.spring.app.transfer.resource.BaseResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

public abstract class BaseController <T extends BaseModel, R extends BaseResource> {
    abstract BaseService<T, Long> getBaseService();
    abstract BaseMapper<T, R> getBaseMapper();

    protected GlobalExceptionHandler exceptionHandler = new GlobalExceptionHandler();
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping
    public ResponseEntity<ApiResponse<List<R>>> findAll() {
        List<R> resources = getBaseMapper().toResources(getBaseService().findAll());

        return ResponseEntity.ok(ApiResponse.<List<R>>builder().data(resources).build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<R>> find(@PathVariable Long id) {
        return ResponseEntity.ok(ApiResponse.<R>builder().data(getBaseMapper().toResource(getBaseService().find(id))).build());
    }

    @PostMapping
    public ResponseEntity<ApiResponse<R>> create(@Valid @RequestBody R resource) {
        return new ResponseEntity<>(
                ApiResponse.<R>builder()
                        .data(getBaseMapper().toResource(getBaseService().create(getBaseMapper().toDomain(resource))))
                        .build(),
                HttpStatus.CREATED
        );
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        getBaseService().deleteById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@Valid @RequestBody R resource) {
        getBaseService().update(getBaseMapper().toDomain(resource));
    }
}

