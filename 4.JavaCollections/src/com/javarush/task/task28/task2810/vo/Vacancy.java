package com.javarush.task.task28.task2810.vo;



/**
 * Created by chumak on 17.08.17.
 */
public class Vacancy {
    private String title, salary, city, companyName, siteName, url;

    public String getTitle() {
        return title;
    }

    public String getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getSiteName() {
        return siteName;
    }

    public String getUrl() {
        return url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vacancy)) return false;

        Vacancy vacancy = (Vacancy) o;

        if (!getTitle().equals(vacancy.getTitle())) return false;
        if (!getSalary().equals(vacancy.getSalary())) return false;
        if (!getCity().equals(vacancy.getCity())) return false;
        if (!getCompanyName().equals(vacancy.getCompanyName())) return false;
        if (!getSiteName().equals(vacancy.getSiteName())) return false;
        return getUrl().equals(vacancy.getUrl());
    }

    @Override
    public int hashCode() {
        int result = getTitle().hashCode();
        result = 31 * result + getSalary().hashCode();
        result = 31 * result + getCity().hashCode();
        result = 31 * result + getCompanyName().hashCode();
        result = 31 * result + getSiteName().hashCode();
        result = 31 * result + getUrl().hashCode();
        return result;
    }
}
