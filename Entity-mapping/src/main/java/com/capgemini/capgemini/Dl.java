package com.capgemini.capgemini;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Dl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dlNo;
    private LocalDate expDate;
    private LocalDate issueDate;
    private String type;

    public Dl() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDlNo() {
        return dlNo;
    }

    public void setDlNo(int dlNo) {
        this.dlNo = dlNo;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public Dl(int dlNo, LocalDate issueDate, LocalDate expDate, String type) {
        this.dlNo = dlNo;
        this.issueDate = issueDate;
        this.expDate = expDate;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dlNo=" + dlNo +
                ", expDate=" + expDate +
                ", issueDate=" + issueDate +
                ", type='" + type + '\'' +
                '}';
    }
}
