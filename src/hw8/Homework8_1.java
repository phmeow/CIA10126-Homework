package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class Homework8_1 {
    /*
    請建立一個Collection物件並將以下資料加入:
    Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
    Object物件、“Snoopy”、BigInteger(“1000”)
    */
    public static void main(String[] args) {
        ArrayList<Object> datas = new ArrayList<>();
        datas.add(100);
        datas.add(3.14);
        datas.add(21L);
        datas.add((short) 100);
        datas.add(5.1);
        datas.add("Kitty");
        datas.add(100);
        Object object = null;
        datas.add(object);
        datas.add("Snoopy");
        datas.add(new BigInteger("1000"));

        // 印出這個物件裡的所有元素: 使用Iterator

        for (Iterator<Object> it = datas.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
        System.out.println("==================================");

        // 印出這個物件裡的所有元素: 使用傳統for

        for (int i = 0; i < datas.size(); i++) {
            Object obj = datas.get(i);
            System.out.println(obj);
        }
        System.out.println("==================================");

        // 印出這個物件裡的所有元素: 使用foreach

        for (Object data : datas) {
            System.out.println(data);
        }
        System.out.println("==================================");

        // 移除不是java.lang.Number相關的物件

        Iterator<Object> it = datas.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if (!(obj instanceof Number)) {
                it.remove();
            }
        }

        // 再次印出這個集合物件的所有元素, 觀察是否已將非Number相關的物件移除成功

        for (Object data : datas) {
            System.out.println(data);
        }
    }
}
