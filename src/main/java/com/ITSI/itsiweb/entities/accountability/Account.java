package com.ITSI.itsiweb.entities.accountability;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.List;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private int level;
    @NotNull
    private int code;
    @JsonIgnore
    @Null
    @ManyToOne
    private Account upperAccount;
    @Null
    @OneToMany(mappedBy = "upperAccount", cascade = CascadeType.ALL)
    private List<Account> subAccounts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Account getUpperAccount() {
        return upperAccount;
    }

    public void setUpperAccount(Account upperAccount) {
        this.upperAccount = upperAccount;
    }

    public List<Account> getSubAccounts() {
        return subAccounts;
    }

    public void setSubAccounts(List<Account> subAccounts) {
        this.subAccounts = subAccounts;
    }
}
