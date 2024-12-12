package com;

import java.util.ArrayList;
import java.util.List;

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

public class Example {
    public static void main(String[] args) {
        // List 型でリストを宣言し、ArrayList で初期化
        List<String> list = new ArrayList<>();

        // 要素の追加
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // 要素の取得
        System.out.println("1番目の要素: " + list.get(0)); // Apple

        // 要素の削除
        list.remove("Banana");
        System.out.println("現在のリスト: " + list);

        // リストサイズ
        System.out.println("リストのサイズ: " + list.size());
    }
}



function sum(a, b) {
    return a + b;
}

// メソッドを呼び出してみる
console.log(sum(3, 5)); // 出力: 8


package example;

public class Main {
    public static void main(String[] args) {
        // Personクラスのインスタンスを作成
        Person person = new Person("山本太郎", 25);

        // メソッドを呼び出す
        person.introduce();
    }
}
