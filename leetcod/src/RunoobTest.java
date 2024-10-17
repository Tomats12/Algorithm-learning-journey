import java.util.HashMap;

public class RunoobTest {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, null);
        Sites.put(null, "Taobao");
        Sites.put(3, null);
        System.out.println(Sites);
    }
}
