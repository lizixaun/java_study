package com.lzixuan.encap;

/**
 * @author 李子煊
 * @version 1.0
 */

class Account{
    public String name;
    private int salary;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length()<=4) {
            this.name = name;
        }
        else {
            System.out.println("名字长度为2到4位");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 20 ) {
            this.salary = salary;

        }
        else {
            System.out.println("大于20元");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6 ) {
            this.password = password;
        }
        else {
            System.out.println("password必须为6位");
        }
    }
}
