package com;

// 年齢判定クラス
public class AgeChecker {
    // メソッド：年齢によるメッセージを出力する
    public void checkAge(int age) {
        if (age < 18) {
            System.out.println("まだ未成年ですね。大人まであと少し！");
        } else if (age < 65) {
            System.out.println("成人ですね。人生楽しんでください！");
        } else {
            System.out.println("シニア世代ですね。知恵をたくさん教えてください！");
        }
    }
}

//forで動かす処理
for (int i = 1; i <= 10; i++) {
    System.out.println("iの値: " + i);
}




