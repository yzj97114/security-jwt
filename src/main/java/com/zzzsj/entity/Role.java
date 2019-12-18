package com.zzzsj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 79282
 */
@Data
@Entity
public class Role {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}

