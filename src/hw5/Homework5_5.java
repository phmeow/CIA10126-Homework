package hw5;

import java.util.Random;

public class Homework5_5 {
    /*
    身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法genAuthCode(),
    當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫與數字的亂數組合,
    如: 本次隨機產生驗證碼為:GLSe3X81
     */

    public static void main(String[] args) {
        System.out.println("本次隨機產生驗證碼為: " + genAuthCode());
    }

    /**
     * 取得隨機8位英數驗證碼
     *
     * @return 8位英數驗證碼
     */
    public static String genAuthCode() {
        String codePool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder authCode8 = new StringBuilder();
        int codeLength = 8;
        Random random = new Random();
        for (int i = 0; i < codeLength; i++) {
            authCode8.append(codePool.charAt(random.nextInt(codePool.length())));
        }
        return String.valueOf(authCode8);
    }
}
