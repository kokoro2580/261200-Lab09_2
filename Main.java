import oop.lsp.*; ///นำเข้าแพคเกจ oop.lsp

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //สร้างนกต่างชนิดกัน
        Moveable penguin = new Penguin(); ///สร้างเพนกวิน
        Moveable ostrich = new Ostrich(); ///สร้างนกกระจอกเทศ
        Flyable sparrow = new Sparrow(); ///สร้างนกกระจอก
        Flyable eagle = new Eagle();///สร้างอินทรี

        List<Moveable> birds = new ArrayList<>(); ///สร้าง Array ที่สมาชิกมี Moveable ชื่อ birds
        birds.add(penguin);
        birds.add(ostrich);
        birds.add(sparrow);
        birds.add(eagle);

        System.out.println("All birds moving:");
        for (Moveable bird : birds) {
            bird.move(); ///เรียกทุกตัวที่มี method move
        } // ← ปิด loop ตรงนี้ให้ชัด

        System.out.println("\nFlying birds:");
        List<Flyable> flyingBirds = new ArrayList<>(); ///สร้าง Array ที่สมาชิกมี Flyable ชื่อ flyingBirds
        flyingBirds.add(sparrow);
        flyingBirds.add(eagle);

        for (Flyable flyingBird : flyingBirds) {
            flyingBird.fly(); ///เรียกทุกตัวที่มี method fly
        }
    }
}
