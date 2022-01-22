package com.mycompany.cinemaproject.business.concretes;

import com.mycompany.cinemaproject.business.abstracts.MemberService;
import com.mycompany.cinemaproject.business.abstracts.MovieService;
import com.mycompany.cinemaproject.core.utilities.results.DataResult;
import com.mycompany.cinemaproject.core.utilities.results.Result;
import com.mycompany.cinemaproject.core.utilities.results.SuccessDataResult;
import com.mycompany.cinemaproject.core.utilities.results.SuccessResult;
import com.mycompany.cinemaproject.dataAccess.abstracts.MemberDao;
import com.mycompany.cinemaproject.dataAccess.abstracts.MovieDao;
import com.mycompany.cinemaproject.entities.concretes.Member;
import com.mycompany.cinemaproject.entities.concretes.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberManager implements MemberService {

    private MemberDao memberDao;

    @Autowired
    public MemberManager(MemberDao memberDao) {
        super();
        this.memberDao=memberDao;
    }

    @Override
    public DataResult<List<Member>> getAll() {
        return new SuccessDataResult<List<Member>>(this.memberDao.findAll(),"Data Listed");

    }

    @Override
    public Result add(Member member) {
        this.memberDao.save(member);
        return new SuccessResult("Member Added");
    }
}
