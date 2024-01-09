package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;

import java.util.List;

public interface CategoryService {

    /**
     * 新增分类
     * @param categoryDTO
     */
    void createCategory(CategoryDTO categoryDTO);


    /**
     * 分页查询
     * @param categoryPageQueryDTO
     * @return
     */
    PageResult page(CategoryPageQueryDTO categoryPageQueryDTO);

    void enableOrDisable(Integer status, Long id);

    void modifyCategory(CategoryDTO categoryDTO);

    List<Category> getByCategory(Integer type);

    void deleteById(Long id);
}
