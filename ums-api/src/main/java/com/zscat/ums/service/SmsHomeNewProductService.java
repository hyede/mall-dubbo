package com.zscat.ums.service;

import com.zscat.ums.model.SmsHomeNewProduct;

import java.util.List;

/**
 * 首页新品管理Service
 * Created by zscat on 2018/11/6.
 */
public interface SmsHomeNewProductService {
    /**
     * 添加首页推荐
     */

    int create(List<SmsHomeNewProduct> homeNewProductList);

    /**
     * 修改推荐排序
     */
    int updateSort(Long id, Integer sort);

    /**
     * 批量删除推荐
     */
    int delete(List<Long> ids);

    /**
     * 更新推荐状态
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 分页查询推荐
     */
    List<SmsHomeNewProduct> list(String productName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
