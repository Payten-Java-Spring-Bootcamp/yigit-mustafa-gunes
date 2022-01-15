package com.mycompany.cinemaproject.dataAccess.abstracts;

import com.mycompany.cinemaproject.entities.concretes.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberDao extends JpaRepository<Member, Integer> {
}
