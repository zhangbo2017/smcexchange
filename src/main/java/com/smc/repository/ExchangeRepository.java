package com.smc.repository;

import com.smc.entity.StockExchangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author BoZhang
 * E-mail:dlzbo@cn.ibm.com
 * @version date：May 12, 2020 7:57:25 PM
*/
public interface ExchangeRepository extends JpaRepository<StockExchangeEntity, Integer> {

    @Query(name = "findByExchange", nativeQuery = true,
    value = "SELECT * from stockexchange  where stockexchange = :stockexchange")
    StockExchangeEntity findByExchange(String stockexchange);

}

