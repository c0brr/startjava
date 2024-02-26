\echo Вывод всей таблицы
SELECT *
  FROM jaegers
 ORDER BY model_name;

\echo Не уничтоженные роботы
SELECT *
  FROM jaegers
 WHERE status != 'Destroyed'
 ORDER BY model_name;

\echo Роботы Mark-1 и Mark-4
SELECT *
  FROM jaegers
 WHERE mark IN('Mark-1', 'Mark-4')
 ORDER BY model_name;

\echo Все роботы кроме Mark-1 и Mark-4
SELECT *
  FROM jaegers
 WHERE mark NOT IN('Mark-1', 'Mark-4')
 ORDER BY mark DESC;

\echo Самый старый робот
SELECT *
  FROM jaegers
 WHERE launch =
       (SELECT MIN(launch)
          FROM jaegers);

\echo Роботы, которые уничтожили больше всех kaiju
SELECT model_name, mark, launch, kaiju_kill
  FROM jaegers
 WHERE kaiju_kill =
       (SELECT MAX(kaiju_kill)
          FROM jaegers)
 ORDER BY model_name;

\echo Средний вес роботов
SELECT ROUND(AVG(weight), 3) AS average_weight
  FROM jaegers;

\echo +1 убийство kaiju у роботов, которые не разрушены
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status != 'Destroyed';

\echo Вывод таблицы
SELECT *
  FROM jaegers
 ORDER BY model_name;

\echo Удаление уничтоженных роботов
DELETE
  FROM jaegers
 WHERE status = 'Destroyed';

\echo Вывод таблицы
SELECT *
  FROM jaegers
 ORDER BY model_name;