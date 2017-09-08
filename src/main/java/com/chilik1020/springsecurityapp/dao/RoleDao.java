package com.chilik1020.springsecurityapp.dao;

import com.chilik1020.springsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
