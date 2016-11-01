package xyz.ibenben.zhongdian.system.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.ibenben.zhongdian.system.dao.StudentMapper;
import xyz.ibenben.zhongdian.system.entity.Student;
import xyz.ibenben.zhongdian.system.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentMapper studentMapper;
	@Override
	public void saveStudent(Student student) {
		
	}

	@Override
	public String getNameById(int id) {
		return studentMapper.getNameById(id);
	}
}
