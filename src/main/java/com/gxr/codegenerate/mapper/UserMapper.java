package com.gxr.codegenerate.mapper;

import com.gxr.codegenerate.model.entity.User;
import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户 映射层。
 *
 * @author gxr
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
