/*
1����̬������
	���������ָ�����Լ����������
	���������Ҳ���Խ����Լ����������
2����̬��ǰ��
	������������֮���й�ϵ��Ҫô�̳У�Ҫôʵ��
	ͨ������һ��ǰ�᣺���ڸ���
3����̬�ĺô�
	��̬�ĳ��ִ�����߳������չ�ԡ�
4����̬�ľ�����
	��Ȼ�������չ�ԣ�����ֻ��ʹ�ø�������÷��ʸ����еĳ�Ա
5����̬��Ӧ��
6����̬�ĳ����ڴ����е��ص㣨��̬ʹ�õ�ע�����
����
è������
*/

abstract class Animals
{
	abstract void eat();
}

class Cat extends Animals
{
	public void eat()
	{
		System.out.println("eat...fish");
	}
	public void catchMouse()
	{
		System.out.println("catch...mouse");
	}
}

class Dog extends Animals
{
	public void eat()
	{
		System.out.println("eat...bone");
	}
	public void catchThief()
	{
		System.out.println("bite...thief");
	}
}

class duotai
{
	public static void main(String[] args) 
	{
		Animals a = new Cat();
		a.eat();
		Cat c = (Cat)a;
		c.catchMouse();

		Animals a1 = new Dog();
		a1.eat();
		Dog d = (Dog)a1;
		d.catchThief();
	}
}
