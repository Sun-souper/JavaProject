package com.qf.pojo;

public class Employee {
    private Integer id;
    private String name;
    private String region;
    private String department;


    public Employee() {
    }

    public Employee(Integer id, String name, String region, String department) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.department = department;
    }

    /**
     * 获取
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return region
     */
    public String getRegion() {
        return region;
    }

    /**
     * 设置
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 获取
     *
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置
     *
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return "employee{id = " + id + ", name = " + name + ", region = " + region + ", department = " + department + "}";
    }
}
