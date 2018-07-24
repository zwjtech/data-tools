/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.ceying.tools.util.mybatis;
import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.base.delete.DeleteByPrimaryKeyMapper;
import tk.mybatis.mapper.common.base.delete.DeleteMapper;
import tk.mybatis.mapper.common.base.insert.InsertSelectiveMapper;
import tk.mybatis.mapper.common.base.select.*;
import tk.mybatis.mapper.common.base.update.UpdateByPrimaryKeySelectiveMapper;
import tk.mybatis.mapper.common.example.*;

/**
 * 继承自己的MyMapper
 * <p>
 * 开发人员: Cheese
 * 开发时间: 2018/2/1<br>
 */
public interface MyMapper<T> extends
        ExistsWithPrimaryKeyMapper<T>,//根据主键字段查询总数，方法参数必须包含完整的主键属性，查询条件使用等号
        SelectAllMapper<T>,//查询全部结果
        SelectByPrimaryKeyMapper<T>,//根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
        SelectCountMapper<T>,//根据实体中的属性查询总数，查询条件使用等号
        SelectMapper<T>,//根据实体中的属性值进行查询，查询条件使用等号
        SelectOneMapper<T>,//根据实体中的属性进行查询，只能有一个返回值，有多个结果是抛出异常，查询条件使用等号
        InsertSelectiveMapper<T>,//保存一个实体，null的属性不会保存，会使用数据库默认值
        UpdateByPrimaryKeySelectiveMapper<T>,//根据主键更新属性不为null的值
        DeleteByPrimaryKeyMapper<T>,//根据主键字段进行删除，方法参数必须包含完整的主键属性
        DeleteMapper<T>,//根据实体属性作为条件进行删除，查询条件使用等号
        DeleteByExampleMapper<T>,//根据Example条件删除数据
        SelectByExampleMapper<T>,//根据Example条件进行查询
        SelectCountByExampleMapper<T>,//根据Example条件进行查询总数
        SelectOneByExampleMapper<T>,//根据Example条件进行查询
        UpdateByExampleSelectiveMapper<T>,//根据Example条件更新实体`record`包含的不是null的属性值

        Marker {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
