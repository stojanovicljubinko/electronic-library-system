package osnova;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SMRTNIK
 */
public class KontrolerKviz {

    private final String[] KLJUCEVIKVIZA = {"Ivo Andric", "Branislav Nusic", "29.", "1916.", "Jovan Jovanovic Zmaj", "Sta ce mi kuca? U Beogradu cu dobiti ulicu.", "Bela", "Vodja", "Mesa Selimovic", "Otadzbina", "Pa sta ako je Copic, nije medjed!", "Ive Andrica i Isidore Sekulic", "Svaka strofa – katastrofa.", "Ovo nikad nisam pio.", "guslar", "Ja sam vam sve ovo napisao, pa jos i da vam čitam!"};

    public String[] getKLJUCEVIKVIZA() {
        return KLJUCEVIKVIZA;
    }

    public final ArrayList<String> odaberiIgru(int i) {
        ArrayList<String> lista = new ArrayList<>();
        switch (i) {
            case 1:
                lista.add("Koji srpski pisac je 1961. godine osvojio Nobelovu nagradu?");
                lista.add("Dositej Obradovic");
                lista.add("Svetozar Markovic");
                lista.add("Ivo Andric");
                lista.add("Desanka Maksimovic");
                break;
            case 2:
                lista.add("Ko je svoju zenu nazvao kravom, pa zbog toga zavrsio na sudu?");
                lista.add("Branislav Nusic");
                lista.add("Stevan Sremac");
                lista.add("Milos Crnjanski");
                lista.add("Momo Kapor");
                break;
            case 3:
                lista.add("Branko Radicevic je preminuo u kojoj godini zivota?");
                lista.add("58.");
                lista.add("29.");
                lista.add("31.");
                lista.add("20.");
                break;
            case 4:
                lista.add("Kada je umro Petar Kocic?");
                lista.add("1918.");
                lista.add("1924.");
                lista.add("1958.");
                lista.add("1916.");
                break;
            case 5:
                lista.add("Pisac koji je imao preko 398 pseudonima, od kojih su mnogi bili likovi iz njegovih dela je?");
                lista.add("Simo Matavulj");
                lista.add("Stevan Sremac");
                lista.add("Ivo Andric");
                lista.add("Jovan Jovanovic Zmaj");
                break;
            case 6:
                lista.add("Jovan Ducic je, kao diplomata, cesto dolazio u Beograd i odsedao u hotelu.\n Jednom ga prijatelj upita\n"
                        + "„Duka, što stalno odsedaš po hotelima, kad možeš u Beogradu sebi da kupis kucu?”\n"
                        + "A pesnik odgovori:");
                lista.add("Nisam ja za grada. Veliko je to mesto.");
                lista.add("Sta ce mi kuca? U Beogradu cu dobiti ulicu.");
                lista.add("Sta ce mi kuca? Imam kucu u Valjevu.");
                lista.add("Nisam ja za ovako velike sredine.");
                break;
            case 7:
                lista.add("Srpski pisac i njegova zena, persirali su jedno drugom do kraja zivota, a ona se zvala?");
                lista.add("Magdalena");
                lista.add("Ljiljana");
                lista.add("Bela");
                lista.add("Lepa");
                break;
            case 8:
                lista.add("Koji srpski pesnik je zajedno u gimnaziji u Tuzli sedeo u klupi zajedno sa patrijarhom Pavlom?");
                lista.add("Mesa Selimovic");
                lista.add("Isak Ignjatovic");
                lista.add("Petar Kocic");
                lista.add("Radoje Domanovic");
                break;
            case 9:
                lista.add("Najpoznatije delo Radoja Domanovica je?");
                lista.add("San jednog ministra");
                lista.add("Vodja");
                lista.add("Glasam za slepce");
                lista.add("Mrtvo more");
                break;
            case 10:
                lista.add("Laza K. Lazarevic pored pripovetke Na bunaru, u objavljuje i U dobri cas hajduci u kom casopisu?");
                lista.add("Srpski knjizevni glasnik");
                lista.add("Otadzbina");
                lista.add("Zora");
                lista.add("Lasta");
                break;
            case 11:
                lista.add("Svaki put kad bi Branko Copic prolazio ulicom, raja bi uzvikivala “Hej, eno Branko Copic, gle, Branko Copic”. Piscu je to dosadilo, te je jednom prilikom odbrusio jednoj zeni:");
                lista.add("Pa sta ako je Copic, nije medjed!");
                lista.add("Ja sam samo covek.");
                lista.add("Sta? Ako sam pisac nisam covek?");
                lista.add("Molim vas, neprijatno mi je.");
                break;
            case 12:
                lista.add("Velom tajne do danasnjih dana ostala je obavijena prica da je izmedju koga postojalo nešto više od prijateljstva?");
                lista.add("Desanke Maksimovic i Isaka Ignjatovica");
                lista.add("Ive Andrica i Isidore Sekulic");
                lista.add("Milosa Crnjanskog i Jelisavete Markovic");
                lista.add("Radoja Domanovica i Isidore Sekulic");
                break;
            case 13:
                lista.add("Doneo mladi pesnik svoje stihove Lazi Kostiću i moli ga za misljenje. Kada je Kostic pesme procitao, mladom kolegi je napisao:");
                lista.add("Odlicno. Svaka cast!");
                lista.add("Odlicno samo tako nastavi!");
                lista.add("Veoma ponosan, Laza.");
                lista.add("Svaka strofa – katastrofa.");
                break;
            case 14:
                lista.add("Tin Ujevic, za opkladu, vezanih ociju, proba razna vina i pogađa: \"Crno, preklanjska berba. Doneli ste ga od Ginića. Sicevačko, lanjsko, trose ga kod Trandafilovica i Tri seljaka. Smederevsko, ovogodisnje, nije najbolje. Vinograd okrenut jugozapadu.\" A onda mu u čaši donesu vodu. Pesnik proba i kaže:");
                lista.add("Ovo je voda!");
                lista.add("Donesite mi nesto bolje.");
                lista.add("Ovo nikad nisam pio.");
                lista.add("Ne mozes zafrkati mene - starog vuka.");
                break;
            case 15:
                lista.add("Koju rec je Vuk Karadzic ispustio u svom recniku, koja je veoma doprinela njegovom radu?");
                lista.add("guslar");
                lista.add("penkalo");
                lista.add("pesnik");
                lista.add("pesma");
                break;
            case 16: 
                lista.add("Organizovano je knjizevno vece u cast i Ive Andrica, kome je prisustvovao i sam pisac. Posle uobicajene diskusije jedan od prisutnih je zamolio Andrica da procita odlomak iz neke svoje knjige, na sta je pisac odgovorio:");
                lista.add("Rado cu ga procitati.");
                lista.add("To je moj omiljeni deo.");
                lista.add("Hvala vam za ovu cast!");
                lista.add("Ja sam vam sve ovo napisao, pa jos i da vam čitam!");

        }
        return lista;
    }
}
