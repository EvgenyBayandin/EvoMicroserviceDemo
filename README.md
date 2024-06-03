Проект демонстрирует работу микросервсисного приложения.

Для запуска приложения, первоначально запускаем ServerEurekaApplication, затем остальные модули.

В проекте содержатся модули Book, Person, PersonWithBook.

Запросы:

hppt://localhost/book-microservice/book/1 - возвращает книгу по id (1-3)

hppt://localhost/person-microservice/person/1 - возвращает читателя по id (1-3)

hppt://localhost/person-with-book-microservice/reader/1/2 - возвращает читателя, читающего книгу по personId (1-3) / bookid (1-3) 
