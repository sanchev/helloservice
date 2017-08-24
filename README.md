<p align="center">
<a href="https://travis-ci.org/sanchev/helloservice"><img src="https://travis-ci.org/sanchev/helloservice.svg?branch=master"><alt="Build Status"></a>
</p>

# HelloService Project

REST сервис **/hello/contacts?nameFilter=val** возвращает контакты из базы данных в json формате.

Параметр nameFilter обязателен. В него передаётся регулярное выражение. В возвращаемых данных нет записей, в которых contacts.name совпадает с регулярным выражением.

## WEB Sever

* [Jetty](https://www.eclipse.org/jetty/)

## База данных

Для настройки базы данных используется файл /resources/db.properties

Возможные варианты:
* [H2](https://h2database.com/)
* [MySQL](https://www.mysql.com/)
* [PostgreSQL](https://www.postgresql.org/)

База данных должна иметь таблицу contacts с двумя полями:
* id - 64 bit integer
* name - varchar

База данных для тестов: h2db_test.mv.db

База данных по умолчанию: h2db.mv.db

## Сборка

* [Maven](https://maven.apache.org/)

## Автор

* **sanchev**
