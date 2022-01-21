package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Сергей");
        User u2 = new User("Вадим");
        User u3 = new User("Пётр");

        u1.sendMessage(u2,"Привет!");
        u1.sendMessage(u2,"Меня зовут Сергей");
        u2.sendMessage(u1,"Привет!");
        u2.sendMessage(u1,"Рад знакомству");
        u2.sendMessage(u1,"Привет!");
        u3.sendMessage(u1,"Привет, есть вопрос");
        u3.sendMessage(u1,"Можешь занять до 10 500 рублей");
        u3.sendMessage(u1,"Обещаю отдать вовремя");
        u1.sendMessage(u3,"Знаю я твои до '10' ");
        u1.sendMessage(u3,"Ты мне еще прошлогодние не отдал");
        u1.sendMessage(u3,"мой ответ НЕТ");
        u3.sendMessage(u1,"Понял тебя");

        MessageDatabase.showDialog(u1,u3);
    }

}
