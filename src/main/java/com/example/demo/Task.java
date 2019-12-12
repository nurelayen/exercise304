package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Size(min=4)
    private String tasko;

    @NotNull
    @Size(min=3)
    private String  duedate;

    @NotNull
    @Size(min=3)
    private String priority;

    public Task(@Size(min = 4) String tasko, @NotNull @Size(min = 3) String duedate, @NotNull @Size(min = 3) String priority) {
        this.tasko = tasko;
        this.duedate = duedate;
        this.priority = priority;
    }

    public Task() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTasko() {
        return tasko;
    }

    public void setTasko(String tasko) {
        this.tasko = tasko;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}

