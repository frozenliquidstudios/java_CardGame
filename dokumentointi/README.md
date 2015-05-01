# java_CardGame by Jere Hupanen - K‰yttˆohje

##K‰ynnistys
T‰m‰ on korttipeli simulaattori jossa voi pelata eri korttipelej‰ graafisen n‰kym‰n kautta.
Ohjelman voi k‰ynnist‰‰ netBeansin kautta tai .jar tiedostosta, mutta se vaatii Java k‰yttˆymp‰ristˆn.
Pelimuodon voi valita klikkaamalla vasemmalta joko highLow tai blackJack.

##Pelimuodot

highLow:
Tarkoituksena on arvata onko seuraava kortti pienempi vai isompi kuin nykyinen kortti. Jos arvaat oikein, saat pisteen. Jos arvaat v‰‰rin, peli alkaa alusta.
Jos korttisi arvo on sama kuin seuraavan kortin arvo, peli on silti menetetty. Jos saat tarpeeksi hyv‰n tuloksen, voit tallentaa nimesi pistetilastoon.

blackJack:
Tarkoituksena on saada omien korttiesi arvo mahdollisimman l‰helle numeroa 21. Molemmat pelaajat saavat alussa 2 korttia, jonka j‰lkeen pelaaja voi joko
pit‰‰ nykyiset korttinsa, tai pyyt‰‰ lis‰‰ kortteja. Vuoro vaihtuu jakajalle vasta kun pelaaja valitsee Stay vaihtoehdon. Black Jackin s‰‰ntˆjen mukaisesti jakajan 
on pakko ottaa lis‰‰ kortteja kunnes h‰nen korttiensa arvo ylitt‰‰ 17. Jos korttien arvo ylitt‰‰ 21, kierros on h‰vitty. Jos molempien pelaajien pisteet ovat tasan,
tulee tasapeli. Ensimm‰inen pelaaja joka saavuttaa 5 voitettua kierrosta, voittaa pelin. 