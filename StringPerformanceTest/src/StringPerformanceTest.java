public class StringPerformanceTest {
    public static void main(String [] args){
            long startTime = System.currentTimeMillis();
            StringBuffer sb = new StringBuffer("Hello");
            for (int i=0;i<100000;i++)
            {
                sb.append("Java");
            }
            System.out.println("Excecution Time " + (System.currentTimeMillis()-startTime)+ " ms");
            startTime = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder("Hello");
            for (int i=0;i<100000;i++)
            {
                sb2.append("Java");
            }
            System.out.println("Excecution Time " + (System.currentTimeMillis()-startTime)+ " ms");
        }
    }


