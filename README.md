# smda-parser

####Парсер для загрузки данных в БД Intersystems Cache. На вход принимает csv таблицы и xml файлы с данными. Использует механизм Cache Java Binding для загрузки.
####В папке CacheClassesXML находятся файлы классов Cache и gof файлы с данными.
####Загрузка данных:
1. В студии открыть свою рабочую область. Перетащить xml файл.
2. Очистить старые данные. Для этого в портале зайти в раздел "Глобалы" и удалить все глобалы с именем smda.*
3. Перетащить gof файл в студию
3(alternative). Скомпилировать через Eclipse и запустить парсер.
