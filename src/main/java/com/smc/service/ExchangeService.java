package com.smc.service;

import com.smc.entity.StockExchangeEntity;
import com.smc.repository.ExchangeRepository;
import com.smc.utils.CommonResult;
import com.smc.utils.ResponseCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExchangeService {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ExchangeRepository exchangeRepository;

	public CommonResult save(StockExchangeEntity stockExchange) {
		try {
			exchangeRepository.save(stockExchange);
			return CommonResult.build(ResponseCode.SUCCESS, "SUCCESS!");
		} catch (Exception e) {
			logger.error("Fail to create exchange data:", e);
			return CommonResult.build(ResponseCode.ERROR_ACCESS_DB, "DB ERROR!");
		}
	}


	public CommonResult updateStockExchange(StockExchangeEntity stcokExchange) {
		try {
			StockExchangeEntity oldExchange = exchangeRepository.findById(stcokExchange.getExchangeid()).get();
			oldExchange.setAddress(stcokExchange.getAddress());
			oldExchange.setBrief(stcokExchange.getBrief());
			oldExchange.setRemarks(stcokExchange.getRemarks());
			oldExchange.setStockExchange(stcokExchange.getStockExchange());
			exchangeRepository.save(oldExchange);
			return CommonResult.build(ResponseCode.SUCCESS, "SUCCESS!");
		} catch (Exception e) {
			logger.error("Fail to update exchange data:", e);
			return CommonResult.build(ResponseCode.ERROR_ACCESS_DB, "DB ERROR!");
		}
	}

	
	public CommonResult findAll() {
		try {
			List<StockExchangeEntity> exchange = exchangeRepository.findAll();
			return CommonResult.build(ResponseCode.SUCCESS, "SUCCESS!", exchange);
		} catch (Exception e) {
			logger.error("Fail to query exchange data:", e);
			return CommonResult.build(ResponseCode.ERROR_ACCESS_DB, "DB ERROR!");
		}
	}

	public CommonResult findById(int id) {
		try {
			StockExchangeEntity stockExchange = exchangeRepository.findById(id).get();
			return CommonResult.build(ResponseCode.SUCCESS, "SUCCESS!", stockExchange);
		} catch (Exception e) {
			logger.error("Fail to query exchange data:", e);
			return CommonResult.build(ResponseCode.ERROR_ACCESS_DB, "DB ERROR!");
		}
	}

}
