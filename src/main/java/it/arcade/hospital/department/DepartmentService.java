package it.arcade.hospital.department;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    void addDepartment(Department department){
        departmentRepository.save(department);
    }

    void updateDepartment(Department department){
        departmentRepository.save(department);
    }

    void deleteDepartment(Department department){
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
