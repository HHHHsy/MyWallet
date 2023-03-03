package xyz.hrxcy.service;

import xyz.hrxcy.pojo.Details;

public interface DetailsService {
    //查询消费明细
    Details queryDetailsByUserId(String userId);
}
