package com.bkabatas.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "KULLANICILAR")
@Data
public class Users extends BaseEntity{
    @Id
    @SequenceGenerator(name = "user_seq_gen",sequenceName = "user_gen",initialValue = 100,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_seq_gen")
    @Column(name="ID")
    private long id;
    @Column(name = "ISIM",length = 100)
    private String firstName;
    @Column(name = "SOYISIM",length = 100)
    private String lastName;
}
