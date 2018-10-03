#Ejercicio 1
Select count(*) as TOTAL_REGISTROS from flights;

#Ejercicio2
Select origin, avg(ArrDelay) AS Retraso_Llegada, avg(DepDelay) AS Retraso_Salida
from Flights
group by origin;

#Ejercicio 3
Select origin, avg(ArrDelay) AS Retraso_Llegada, month, depdelay
from Flights
where depdelay >0
group by origin;

#Ejercicio 4

Select origin, avg(ArrDelay) AS Retraso_Llegada, month, case when depdelay > 0 then "Retard" else "" end as Retraso
from Flights
group by origin
having retraso= 'retard';

# Posible solucion al Ejercicio 4
Select  a.city, avg(f.arrdelay), f.month, f.depdelay
from Flights f, airports a
where f.origin = a.iata
group by f.origin;

# Ejercicio 5

Select count(f.cancelled), c.description
from flights f, carriers c
where f.UniqueCarrier= c.code
and f.cancelled>0
group by c.description
order by count(f.cancelled) desc;

# Ejercicio 6
Select flightNum as Identificador, distance as Distancia
from flights
group by flightNum
order by distance desc
limit 10;

# Ejercicio 7
Select origin, c.description as Compañia, avg(ArrDelay) AS Retraso_Llegada
from flights f, carriers c
where f.origin= c.code and arrdelay >10
group by origin;
