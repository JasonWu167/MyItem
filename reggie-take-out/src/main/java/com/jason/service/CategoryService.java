package com.jason.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jason.entity.Category;

public interface CategoryService extends IService<Category> {
    void remove(Long id);
}
