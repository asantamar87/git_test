#Ejercicio 1
Select count(*) as TOTAL_REGISTROS from flights;

#Ejercicio2
Select origin, avg(ArrDelay) AS Retraso_Llegada, avg(DepDelay) AS Retraso_Salida
from Flights
group by origin;

#Ejercicio 3

#Retard promig d’arribada dels vols, per mesos i segons l’aeroport origen. A més,
#volen que els resultat es mostrin de la següent forma (fixa’t en l’ordre de les files):

select origin, avg(Arrdelay), month, case when depdelay > 0 then "Retard" else "" end as Retraso
from flights
group by month
having retraso= 'retard';

#Ejercicio 4

# Posible solucion al Ejercicio 4
Select  a.city, avg(f.arrdelay), f.month, f.depdelay
from flights left join airports ON f.origin = a.iata
group by f.origin;

# Ejercicio 5

Select count(f.cancelled) as Cancelados
from flights f, carriers c
where f.UniqueCarrier= c.code
and f.cancelled>0
group by c.description
order by Cancelados desc;

# Ejercicio 6
Select flightNum as Identificador, sum(distance) as Distancia
from flights
group by flightNum
order by Distancia desc limit 10;

# Ejercicio 7
Select c.description as Compañia, avg(f.ArrDelay) AS Retraso_Llegada
from flights f, carriers c
where f.origin= c.code
group by f.origin
having  Retraso_Llegada <10;
