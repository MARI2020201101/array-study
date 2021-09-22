package InitTest;

public class BlockTest {
    static {
        //클래스가 먼저 로딩되고
        System.out.println(" static {  } ");
    }
    {
        //인스턴스 블록수행하고
        System.out.println("  {   }  ");
    }
    public BlockTest(){
        //생성자가 불린다
        System.out.println(" created ... ");
    }
    public static void main(String[] args) {
        System.out.println(" start ---");
        BlockTest b1 = new BlockTest();
        BlockTest b2 = new BlockTest();
        System.out.println("--- end ");
    }
}
