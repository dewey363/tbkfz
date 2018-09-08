package com.tbk.repository;

import com.tbk.base.repository.BaseRepository;
import com.tbk.entity.Shop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

public interface ShopRepository extends BaseRepository<Shop,String> {

    @Query(value = "select t from Shop t where t.deleted = 0 order by t.priority")
    Page<Shop> findTopN(Pageable pageable);
}
