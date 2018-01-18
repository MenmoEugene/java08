abstract class Student
{
	abstract public void study();
	public void sleep()
	{
		System.out.println("line_sleep");
	}
}

class BaseStudent extends Student
{
	public void study()
	{
		System.out.println("base_study");
	}
}

class DashStudent extends Student 
{
	public void study()
	{
		System.out.println("project_study");
	}
	public void sleep()
	{
		System.out.println("hard_sleep");
	}
}
class doSome
{
	public void doSome(Student stu)
	{
		stu.study();
		stu.sleep();
	}
}

class printline
{
	public void printline()
	{
		System.out.println("------------------");
	}
}
class duotai2
{
	public static void main(String[] args) 
	{
		printline l = new printline();
		doSome ds = new doSome();
		ds.doSome(new BaseStudent());
		l.printline();
		ds.doSome(new DashStudent());
	}
}

/*
�ڶ�̬�г�Ա�������ص㣺
	�ڱ���ʱ�ڣ��������ñ��������������Ƿ��е��õķ���������� ����ͨ�������û�� ����ʧ�ܡ�
	������ʱ�ڣ����Ķ��������������Ƿ��е��õķ�����
	���ܽ���ǣ�
					��Ա�����ڶ�̬����ʱ�����뿴��ߣ����п��ұߡ�

	�ڶ�̬�У���Ա�������ص㣺
								���۱�������У����ο����(�����ͱ�����������)��
	�ڶ�̬�У���̬��Ա�������ص㣺
									���۱�������У����ο���ߡ�
*/