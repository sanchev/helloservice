<p align="center">
<a href="https://travis-ci.org/sanchev/helloservice"><img src="https://travis-ci.org/sanchev/helloservice.svg?branch=master"><alt="Build Status"></a>
</p>

# HelloService Project

REST сервис **/hello/contacts?nameFilter=val** возвращает контакты из базы данных в json формате.

Параметр nameFilter обязателен. В него передаётся регулярное выражение. В возвращаемых данных нет записей, в которых contacts.name совпадает с регулярным выражением.

*Пример запроса:*

/hello/contacts?nameFilter=^T.*$

Запрос возвращает контакты из БД в json формате, которые НЕ начинаются на T

## WEB Sever

* [Jetty](https://www.eclipse.org/jetty/)

По умолчанию выбран порт **8080**

## База данных

Для настройки базы данных используется файл **/resources/db.properties**

Возможные варианты:
* [H2](https://h2database.com/)
* [MySQL](https://www.mysql.com/)
* [PostgreSQL](https://www.postgresql.org/)

База данных должна иметь таблицу **contacts** с двумя полями:
* id - 64 bit integer
* name - varchar

База данных для тестов: h2db_test.mv.db

База данных по умолчанию: h2db.mv.db

## Сборка

* [Maven](https://maven.apache.org/)

## Запуск на локальном компьетере

1. Создать H2(MySQL, PostgreSQL) БД
2. Склонировать данный репозиторий
3. Настроить файл **/resources/db.properties** для доступа к созданной локальной базе
4. В терминале перейти в созданный каталог и выполнить команду **mvn clean compile exec:java**

## Автор

* **sanchev**
