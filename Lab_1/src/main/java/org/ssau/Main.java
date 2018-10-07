package org.ssau;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Темы:
    * книги - Omazon
    * сериалы - HisShows
    * авиарейсы - AviaBuyers
    * погода - GisMeteor
    * фильмы – Afishka
    * любая тема на ваш выбор - отели

Требования:
    1. Должен быть доменный объект согласно вашей тематике.
    2. Объекту должен храниться в базе.
    3. Объект должен быть доступен через CRUD Rest API
    4. Должен быть рест-контроллер с хотя бы одним рест-поинтом, в котором применяется бизнес логика (например,
        валидация какого-нибудь поля)
    5. В системе должно быть два или более юзеров. Один из них должен обладать ролью ADMIN, другой USER
    6. Должна быть настроена security:
        a. USER имеет возможность только просматривать объекты в браузере – возможность менять данные у него быть
            не должно
        b. ADMIN может менять данные.
    7. У ADMIN’a должна быть html страница, на которой он может:
        a. видеть все объекты
        b. Удалять\создавать
        c. (*) Редактировать существующий объект
    8. USER имеет отдельную страничку, на которой он:
        a. Видит объекты доменной модели в виде таблицы или списка
        b. Объекты выводятся постранично (т.е. пользователь видит 10 первых объектов, но может нажать кнопку вперед или
            назад, чтобы отобразить вторые 10 объектов)
        c. (*) юзер может фильтровать объекты по имени (например, если он введет man для кейса из лекции то ему
            выведутся только superman и batman, а сусанин нет)
    9. Страница USER’a должны быть красиво оформлена, например, с помощью bootstrap.css
    10. (*) Возможность регистрации новых пользователей с ролью USER при помощи формы регистрации
*/

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        //  pg_ctl -D /usr/local/var/postgres start

        SpringApplication.run(Main.class, args);
    }
}
