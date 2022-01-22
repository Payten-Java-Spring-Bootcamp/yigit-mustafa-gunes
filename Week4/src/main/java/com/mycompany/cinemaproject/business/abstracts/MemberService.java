package com.mycompany.cinemaproject.business.abstracts;

import com.mycompany.cinemaproject.core.utilities.results.DataResult;
import com.mycompany.cinemaproject.core.utilities.results.Result;
import com.mycompany.cinemaproject.dataAccess.abstracts.MemberDao;
import com.mycompany.cinemaproject.entities.concretes.Member;

import java.util.List;

public interface MemberService {
    DataResult<List<Member>> getAll();
    Result add(Member member);
}
