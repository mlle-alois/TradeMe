package trademe.domain;

import trademe.domain.enums.Department;

import java.util.List;
import java.util.Objects;

public final class GeographicZone {

    private final List<Department> departmentList;

    private GeographicZone(List<Department> departmentList) {
        this.departmentList = Objects.requireNonNull(departmentList);
    }

    public static GeographicZone of(List<Department> departmentList) {
        return new GeographicZone(departmentList);
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("- Departments : \n");
        for (Department department : departmentList) {
            result.append(department).append("\n");
        }
        return result.toString();
    }
}
