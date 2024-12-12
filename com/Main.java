package com;


public class Main {
    public static void main(String[] args) {
        // クラスからインスタンスを作成
        Person person1 = new Person("山本太郎", 25); // インスタンス1
        Person person2 = new Person("鈴木花子", 30); // インスタンス2

        // メソッドを呼び出す
        person1.introduce();
        person2.introduce();
    }
}
