package DynamicProgramming;

/** 
 * BlocKOut [��������] n������ɫ�ķ����ų�һ�У���ͬ��ɫ���������ڵķ���Ⱥ������
 * ������ȥ��������У���ʱ�ұߵķ���������ƶ���ֱ�����з���������
 * xΪ���������ڷ���������÷�Ϊx^2, int[]��ʾ��ʼ���鲼��(��ͬ���ִ�����ͬ��ɫ)�������÷�
 * 
 * describe:����
 * ������������dp�����⣬����������״̬ʱ�����ر����ס���dp[i][j]��ʾi-j֮������÷�,��ô��2�ַ�����
 * 1.�ҵ���j��ʼ�������쵽p,ֱ�Ӱ�p-j��һ������;
 * 2.��i��ʼ�������쵽q,��a[q]==a[j], a[q+1]!=a[j]�������м��q+1..p-1һ���ǿ��Ա������ģ�Ȼ��2�����ӵ�һ��;
 * �����ڶ��ַ���������dp(i,j)���ǲ���׼ȷ���������, �����������һ��ά�ȣ���dp(i,j,k)��ʾ
 * ԭ����i-j���ұ�������k����ɫ����a[j]�ķ������õ������С������÷֡�������2�־��߶�����������״̬ת�Ʒ��������ˣ�
 * dp(i,j,k) = dp(i,p-1,0)+(j-i+k+1)*(j-i+k+1)(p�Ǵ�j��ʼ�����������Զ���±�)
 * dp(i,j,k) = max{dp(q+1,p-1,0)+dp(i,q,j-p+k+1)}(p����a[q]==a[j]&&a[q+1]!=a[j])
 * ���ѷ��֣�״̬һ����O(n^3)����������O(n)�������ʱ�临�Ӷ�ΪO(n^4)��
 * �����ü��仯�����ķ�������⡣����q��ȡֵ��Χһ�㶼�Ƚ�С����˶��ڴ󲿷����ݣ�����㷨������Ч�ʶ��ܸߡ�
 * (������)
 */
public class BlocKOut {
 	
	public static void main(String[] args) { 
		
	} 

}