package com.example.userFolderFile.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folder")
public class Folder {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;
//------------------------------------------------
    @JsonIgnoreProperties({"folder"})
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
//---------------------------------------
    @JsonIgnoreProperties({"folder"})
    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    private List<File> files;
//---------------------------------------------------
    public Folder(String title, User user) {
        this.title = title;
        this.user = user;
        this.files = new ArrayList<>();
    }

    public Folder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
