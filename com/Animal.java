package com;

// Animal クラス（親クラス）
class Animal {
    private Object console;
    
        void constructor(name, sound) {
            this.name = name;  // 動物の名前
            this.sound = sound; // 動物の鳴き声
        }
    
        // カプセル化されたメソッド
        void makeSound() {
            console.log(`${this.name} says ${this.sound}`);
    }
}

// Dog クラス（Animal を継承）
class Dog extends Animal {
    constructor(name, breed) {
        super(name, "woof"); // 親クラスのコンストラクタを呼び出し
        this.breed = breed; // 犬種
    }

    // ポリモーフィズムの例（オーバーライド）
    makeSound() {
        console.log(`${this.name} barks loudly!`);
    }
}

// インスタンス生成
const genericAnimal = new Animal("Generic Animal", "some sound");
const dog = new Dog("Buddy", "Golden Retriever");

// メソッドを呼び出し
genericAnimal.makeSound(); // Generic Animal says some sound
dog.makeSound();           // Buddy barks loudly!