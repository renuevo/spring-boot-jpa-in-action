package com.github.renuevo.infrastructure.common

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(value = [AuditingEntityListener::class])
abstract class AuditEntity(

  @CreatedBy
  @Column(updatable = false, nullable = false)
  var createdBy: String = "",

  @CreatedDate
  @Column(updatable = false, nullable = false)
  var createdAt: LocalDateTime = LocalDateTime.MIN,

  @LastModifiedBy
  @Column(nullable = false)
  var updatedBy: String = "",

  @LastModifiedDate
  @Column(nullable = false)
  var updatedAt: LocalDateTime = LocalDateTime.MIN

)
