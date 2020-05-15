package com.ITSI.itsiweb.repositories.accountability;

import com.ITSI.itsiweb.entities.accountability.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface AccountRepository extends JpaRepository<Account, Integer> {
    @Query(value = "select * from account t where t.level = :level", nativeQuery = true)
    List<Account> getAllFrom(@Param("level") int level);
}
