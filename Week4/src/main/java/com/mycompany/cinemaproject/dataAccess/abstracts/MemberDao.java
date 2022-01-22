package com.mycompany.cinemaproject.dataAccess.abstracts;

import com.mycompany.cinemaproject.entities.concretes.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao extends JpaRepository<Member, Integer> {
}
