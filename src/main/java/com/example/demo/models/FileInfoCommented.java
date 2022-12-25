//package com.example.demo.models;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@Entity
//@Table(name = "fileinfo")
//public class FileInfoCommented {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String description;
//    private String originalName;
//    private String storageName;
//    // формат файла - img/jpeg
//    private String mimeType;
//    private Long size;
//    private LocalDateTime uploadDateTime;
//
//}