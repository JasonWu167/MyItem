package com.jason.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jason.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
