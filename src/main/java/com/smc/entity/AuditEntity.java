package com.smc.entity;

import javax.persistence.EntityListeners;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@EntityListeners(AuditingEntityListener.class)
public class AuditEntity {

  public AuditEntity() {
    super();

  }

}
