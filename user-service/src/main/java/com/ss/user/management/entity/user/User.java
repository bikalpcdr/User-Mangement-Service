package com.ss.user.management.entity.user;

import com.ss.shared.generic.entity.AuditAbstract;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user_tb")
public class User extends AuditAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "seq_user", initialValue = 1, allocationSize = 1)
    private Long id;

    private String name;

    //todo follow this standard to create entity

}
