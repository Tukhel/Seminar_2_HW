// Необходимо реализовать:
// 1. Интерфейс ActorBehavoir, который будет содержать
// описание возможных действий актора в очереди/магазине
// 2. Абстрактный класс Actor, который хранит в себе
// параметры актора, включая состояние готовности сделать
// заказ и факт получения заказа. Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих
// “персональных данных” abstract
// 3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir
package Seminar_2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Andrey");
        Human human2 = new Human("Alexsander");
        Human human3 = new Human("Olga");
        Human human4 = new Human("Elizaveta");

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);

        market.update();
    }
}
