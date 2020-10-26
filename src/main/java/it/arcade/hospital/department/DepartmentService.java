package it.arcade.hospital.department;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    void addDepartment (Department department){
        departmentRepository.save(department);
    }

    void updateDepartment (Department department){
        departmentRepository.save(department);
    }

    void deleteDepartment (Department department){
        departmentRepository.delete(department);
    }

    public Optional<Department> getDepartmentById(Integer id){
        return departmentRepository.findById(id);
    }

    public List<Department> getAllDepartments(){
        List<Department> departments = (List<Department>) departmentRepository.findAll();
        return departments;
    }
}
