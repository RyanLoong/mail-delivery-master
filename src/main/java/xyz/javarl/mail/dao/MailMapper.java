package xyz.javarl.mail.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.javarl.mail.entity.OaEmail;

import java.util.List;

/**
 * @Date 2021/3/24 20:49
 * @Created by RyanLoong
 * @Classname MailMapper
 * @Description mail的dao层
 */
@Mapper
public interface MailMapper {

    List<OaEmail> findAllEmail();

    int insertEmail(OaEmail oaEmail);
}
