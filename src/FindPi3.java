public class FindPi3{

    public static void main(String args[]){
// ���������� ���������� � ��������� ����������:
        int N=20,k;
// ��������� �������� � ������������ ���������:
        double Pi=2,q=Math.sqrt(2);
// ���������� ����� "��":
        for(k=1;k<=N;k++){
            Pi*=2/q;
            q=Math.sqrt(2+q);}
// ����� ���������� �� �����:
        System.out.println();
        System.out.println("���������� �� "+N+" ����������:");
        System.out.println(Pi);}
}
