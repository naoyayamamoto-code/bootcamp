package com.sample;

import com.AgeChecker;

// メインクラス
public class Myproject {
    public static void main(String[] args) {
        AgeChecker checker = new AgeChecker(); // AgeCheckerクラスのインスタンスを作成

        // 年齢をいくつかチェックしてみる
        checker.checkAge(15); // 15歳
        checker.checkAge(30); // 30歳
        checker.checkAge(70); // 70歳
    }
}
