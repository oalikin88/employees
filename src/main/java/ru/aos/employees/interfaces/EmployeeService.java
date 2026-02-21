package ru.aos.employees.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.aos.employees.models.EmployeeDto;
import ru.aos.employees.models.EmployeeRequest;

/**
 *
 * @author Oleg Alikin
 */

public interface EmployeeService {

    EmployeeDto create(EmployeeRequest request);
    EmployeeDto getById(Long id);
    EmployeeDto update(Long id, EmployeeRequest request);
    Page<EmployeeDto> getAll(Pageable pageable);
    void delete(Long id);
}
