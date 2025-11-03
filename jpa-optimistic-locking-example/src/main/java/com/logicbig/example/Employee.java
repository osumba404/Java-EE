package com.logicbig.example;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
    
    @Version
    private long version;
    
    private String name;
    private String department;

    public Employee() {}

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public long getVersion() { return version; }
    public void setVersion(long version) { this.version = version; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", version=" + version + 
               ", name='" + name + "', department='" + department + "'}";
    }
}