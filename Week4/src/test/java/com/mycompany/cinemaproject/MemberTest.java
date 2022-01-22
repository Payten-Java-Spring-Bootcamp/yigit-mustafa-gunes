package com.mycompany.cinemaproject;

import com.mycompany.cinemaproject.dataAccess.abstracts.MemberDao;
import com.mycompany.cinemaproject.entities.concretes.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class MemberTest {

    @Autowired
    private MemberDao repo;

    @Test
    @Transactional
    public void testAddNew(){
        Member member = new Member();
        member.setMemberName("Yiğit");
        member.setWatchListId(2);
        member.setWatchListName("Favorite");

        Member savedMember = repo.save(member);
        assertThat(savedMember).isNotNull();
        assertThat(savedMember.getMemberId()).isGreaterThan(0);
    }

    @Test
    public void testGet(){
        Integer memberId=1;
        Optional<Member> optionalMember = repo.findById(memberId);
        assertThat(optionalMember).isPresent();
        System.out.println(optionalMember.get());
    }

    @Test
    public void testUpdate(){
        Integer memberId=1;
        Optional<Member> optionalMember=repo.findById(memberId);
        Member member = optionalMember.get();
        member.setMemberName("Ali");

        Member updatedMember= repo.findById(memberId).get();
        assertThat(updatedMember.getMemberName()).isEqualTo("Ali");
    }

}
