package com.devfun.web_boot.dao;
import java.util.HashMap;
 
import com.devfun.web_boot.dto.StatisticDto;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
 
}