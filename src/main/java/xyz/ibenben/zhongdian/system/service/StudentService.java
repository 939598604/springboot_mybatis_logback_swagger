package xyz.ibenben.zhongdian.system.service;

import xyz.ibenben.zhongdian.system.entity.Student;

public interface StudentService {
	public void saveStudent(Student student);
	public String getNameById(int id);
}
