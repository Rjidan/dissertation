package com.gsm.dissertation.service;

import com.gsm.dissertation.dao.GuideTeacherRepository;
import com.gsm.dissertation.model.GuideTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuideTeacherServiceImpl implements GuideTeacherService {
    @Autowired
    private GuideTeacherRepository guideTeacherRepository;

    /**
     * 根据教师账号获取对应指导教师下的所有学生
     * @param account 教师账号
     * @return 对应指导教师下的所有学生
     */
    @Override
    public List<GuideTeacher> getGuideTeacherByAccount(String account) {
        List<GuideTeacher> list_GuideTeacher = guideTeacherRepository.getGuideTeacherByAccount(account);
        return list_GuideTeacher;
    }
}
