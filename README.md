# Proiect-Java-Associate
Examenul practic de absolvire curs Telecom Academy

EXAMEN FINAL
JAVA 1 Associate

Un adăpost găzduiește două tipuri de animale : domestice și sălbatice. Orice
animal are un nume și o vârstă. Un animal sălbatic are, în plus, un grad de pericol care
este un număr natural cuprins între 0 și 5 (0 – pașnic, 5 – foarte periculos), iar despre
un animal domestic trebuie să știm în plus dacă este de interior sau de exterior.
 În adăpost NU pot exista două sau mai multe animale cu același nume.
 
Se cere realizarea unei aplicații care gestionează un singur adăpost și care are
următoarele cazuri de utilizare :

1. adaugaAnimal – adaugă un animal în adăpost. Se va arunca excepția
NumeDejaExistentException dacă există deja în adăpost un animal cu același
nume
2. afiseazaAnimale – afișează toate animalele din adăpost în ordinea în care au
fost adăugate
3. afiseazaAnimaleDomestice – afișează numai animalele domestice din adăpost
4. afiseazaSortat – afișează toate animalele în ordine alfabetică, după nume
5. adoptaAnimal – șterge animalul adoptat din adăpost
6. iesire – închide aplicația
Pentru fiecare caz de utilizare dintre cele de mai sus, aplicația poate primi de la
tastatură următoarele comenzi :
1. „ADAUGA_ANIMAL «tip» «nume» «vârstă» «inf»” : unde «tip» este tipul
animalului („sălbatic” sau „domestic”), iar «inf» este informația adițională
corespunzătoare fiecărui tip particular de animal (pentru „salbatic”, «inf» este
gradul de pericol, pentru „domestic”, «inf» poate fi „true” : animalul este de
interior sau „false” : „animalul nu este de interior”)
2. „AFIS”
3. „AFIS_DOMESTICE”
4. „AFIS_SORT”
5. „ADOPTA «nume»” : unde «nume» reprezintă numele animalului care urmează
să fie adoptat
6. „EXIT”
Bonus : Se va realiza un fir de execuție care va rula în fundal și va afișa o dată la 30
de secunde numărul animalelor din adăpost.

Despre implementare :
- Se va respecta principiul encapsulării claselor;
- Se va folosi Singleton Pattern unde se poate;
- Se vor folosi cât mai multe expresii lambda;
- Un animal este reprezentat ca șir de caractere în următorul format :
„«nume» «vârstă»”. Două animale sunt egale dacă au același nume;
- Design-ul claselor va fi în conformitate cu cerința;
- Se vor respecta principiile OOP și standardele de scriere a codului;
