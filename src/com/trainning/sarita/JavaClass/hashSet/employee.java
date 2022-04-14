package com.trainning.sarita.JavaClass.hashSet;

public class employee {
    private int eid;
    private String ename;
    private String edapartment;
    private int eage;
    public employee(int eid, String ename, String edepartment, int eage) {
        this.eid = eid;
        this.ename = ename;
        this.edapartment = edepartment;
        this.eage = eage;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEdapartment() {
        return edapartment;
    }

    public void setEdapartment(String edapartment) {
        this.edapartment = edapartment;
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }
    @Override
    public String toString(){
        return " Employee: "+ eid +" "+ ename +" "+ edapartment +" "+eage;
    }

}


