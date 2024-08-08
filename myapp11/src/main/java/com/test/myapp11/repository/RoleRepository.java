package com.test.myapp11.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.myapp11.entity.Roles;

public interface RoleRepository extends JpaRepository<Roles, Long> {

}
