/*
Object�����ж����ֱ�ӻ��߼�Ӹ��ࡣ
�����ж��������ж��󶼾߱��Ĺ��ܡ�

Object�����Ѿ��ṩ�˶Զ����Ƿ���ͬ�ķ�����

����Զ�������Ҳ�бȽ���ͬ�Ĺ��ܣ�û�б�Ҫ���¶��塣
ֻҪ��Ϯ�����еĹ��ܣ������Լ����бȽ����ݼ��ɣ�����Ǹ��ǡ�
*/
class Demo 
{
	private int num;
	Demo(int num)
	{
		this.num = num;
	}
	public boolean equals(Object obj)//Object obj = new Demo(); ��̬
	{
		Demo d = (Demo)obj;//����ת��
		return this.num == d.num;
	}
	/*
	public boolean compare(Demo d)
	{
		return this.num == num;
	}
	*/
}

class Person 
{

}

class  ObjectDemo
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo(4);
		Demo d2 = new Demo(4);
		Person p = new Person();
		System.out.println(d1.equals(p));
	}
}
