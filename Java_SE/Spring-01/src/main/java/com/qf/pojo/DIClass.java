package com.qf.pojo;


import java.util.Date;
import java.util.*;

public class DIClass {
    private int id;
    private String name;

    private Date birthday;

    private int[] arr;

    private List<String> list;
    private Set<String> set;
    private Map<Integer, String> HashMap;

    private MyClass myClass;


    public DIClass() {
    }

    public DIClass(int id, String name, Date birthday, int[] arr, List<String> list, Set<String> set, Map<Integer, String> HashMap, MyClass myClass) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.arr = arr;
        this.list = list;
        this.set = set;
        this.HashMap = HashMap;
        this.myClass = myClass;
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
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
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置
     *
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取
     *
     * @return arr
     */
    public int[] getArr() {
        return arr;
    }

    /**
     * 设置
     *
     * @param arr
     */
    public void setArr(int[] arr) {
        this.arr = arr;
    }

    /**
     * 获取
     *
     * @return list
     */
    public List<String> getList() {
        return list;
    }

    /**
     * 设置
     *
     * @param list
     */
    public void setList(List<String> list) {
        this.list = list;
    }

    /**
     * 获取
     *
     * @return set
     */
    public Set<String> getSet() {
        return set;
    }

    /**
     * 设置
     *
     * @param set
     */
    public void setSet(Set<String> set) {
        this.set = set;
    }

    /**
     * 获取
     *
     * @return HashMap
     */
    public Map<Integer, String> getHashMap() {
        return HashMap;
    }

    /**
     * 设置
     *
     * @param HashMap
     */
    public void setHashMap(Map<Integer, String> HashMap) {
        this.HashMap = HashMap;
    }

    /**
     * 获取
     *
     * @return myClass
     */
    public MyClass getMyClass() {
        return myClass;
    }

    /**
     * 设置
     *
     * @param myClass
     */
    public void setMyClass(MyClass myClass) {
        this.myClass = myClass;
    }

    public String toString() {
        return "DIClass{id = " + id + ", name = " + name + ", birthday = " + birthday + ", arr = " + arr + ", list = " + list + ", set = " + set + ", HashMap = " + HashMap + ", myClass = " + myClass + "}";
    }
}
