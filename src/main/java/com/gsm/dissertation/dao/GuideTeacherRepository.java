package com.gsm.dissertation.dao;

import com.gsm.dissertation.model.GuideTeacher;
import com.gsm.dissertation.model.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GuideTeacherRepository extends JpaRepository<GuideTeacher,Integer> {

    /**
     * 根据教师账号获取对应指导教师下的所有学生
     * @param account 教师账号
     * @return 对应指导教师下的所有学生
     */
    @Query("select g from GuideTeacher g where g.t_account=?1")
    List<GuideTeacher> getGuideTeacherByAccount(String account);
}
