interface NotificationService {
    void sendNotification(String message);
}
/* evităm dependențele directe între modulele de nivel înalt și cele de nivel scăzut.
În schimb, ambele module depind de abstracții (interfețe), iar detaliile sunt furnizate
 de clasele care implementează aceste interfețe.*/

//evit dependentele directe(aveam in notif class cu new email service si daca mai voiam si sms modificam notif)
//asa folosesc o interfata care e implemetata in clase si
//injectez dependenta prin interfata(abstractie) si ambele depind de abstractie
//nu cu new ci cu interfata se leaga clasele intre ele


//in class bus @Autowired Sofer sofer sau prin constructor sau prin param la o fctie
//dar injectarea prin constr e mai ok