/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1509;
import java.util.Scanner;
public class Homework1509
{
    static enum Color{
    Желтой,
    Красной,
    Зеленой,
    Белой,
    Черной,
   
    }
    static enum Animal{
    Крысы,
    Коровы,
    Тигра,
    Зайца,
    Дракон,
    Змеи,
    Лошади,
    Овцы,
    Обезьяны,
    Курицы,
    Собаки,
    Свиньи
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите год:");
    int color= 0;
    int animal=0;
    int year =scanner.nextInt();
    int x = year%10;
    int y =year%100;
   
    switch (x){
        case 0:
            color = 0;
            break;
        case 2:
            color=1;
            break;
        case 4:
            color=2;
            break;
        case 6:
            color=3;
            break;
        case 8:
            color=4;
            break;        
    }
   
    switch(y){
        case 84: case 96: case 8: case 20:
            animal =0;
            break;
        case 85: case 97: case 9: case 21:
            animal=1;
            break;
        case 86: case 98: case 10:
            animal=2;
            break;
        case 87: case 99: case 11:
            animal=3;
            break;
        case 88: case 00: case 12:
            animal=4;
            break;
        case 89: case 01: case 13:
            animal=5;
            break;
        case 90: case 02: case 14:
            animal=6;
            break;
        case 91: case 03: case 15:
            animal=7;
            break;
        case 92: case 04: case 16:
            animal=8;
            break;
        case 93: case 05: case 17:
            animal=9;
            break;
        case 94: case 06: case 18:
            animal=10;
            break;
        case 95: case 07: case 19:
            animal=11;
            break;        
    }
    //System.out.print(animal);
    //System.out.print(color);
    System.out.printf("Год %s %s ", Animal.values()[animal], Color.values()[color]);
}
}