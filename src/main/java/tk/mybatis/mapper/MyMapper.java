package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author zb
 * @create 2019-12-16 10:49
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
