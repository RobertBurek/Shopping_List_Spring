package pl.robertburek.shoppinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ShoppingListApplication {


    public static List<Product> products = new ArrayList<>();
    public static List<String> categories = new ArrayList<>();

    static {
//        products.add(new Product(1, "Mleko b/l", 0, false, Product.Category.NABIAŁ));
//        products.add(new Product(2, "Coca cola", 2, true, Product.Category.NAPOJE));
//        products.add(new Product(3, null, 0, false, null));
//        products.add(new Product(4, "Masło", 4, false, Product.Category.NABIAŁ));
//        products.add(new Product(5, "Śmietana 12%", 3, true, Product.Category.NABIAŁ));
//        products.add(new Product(6, "Chleb słonacznikowy", 0, false, Product.Category.PIECZYWO));
//        products.add(new Product(7, "Piwo", 0, false, Product.Category.NAPOJE));
//        products.add(new Product(8, "Kiwi", 0, false, Product.Category.OWOCE));
//        products.add(new Product(9, "Pomarańcza", 0, false, Product.Category.OWOCE));
//        products.add(new Product(10, null, 0, false, null));
//        products.add(new Product(11, "Orzeszki ziemne", 0, false, Product.Category.PRZEKĄSKI));
//        products.add(new Product(12, "Chipsy paprykowe", 0, false, Product.Category.PRZEKĄSKI));
//        products.add(new Product(13, null, 0, false, null));
//        products.add(new Product(14, "Popcorn maślany", 0, false, Product.Category.PRZEKĄSKI));
//        products.add(new Product(15, "Marchew", 0, false, Product.Category.WARZYWA));

        products.add(new Product(1,"Almette Serek",0,false,Product.Category.NABIAŁ));
        products.add(new Product(2,"Bagietka św.czosnek",0,false, Product.Category.ART_MĄCZNE));
        products.add(new Product(3,"Banany Premium św.",4,true,Product.Category.OWOCE));
        products.add(new Product(4,"Baton zboż.Chocapic",1,false, Product.Category.SŁODYCZE));
        products.add(new Product(5,"Bella podpaski B.G.N",0,false, Product.Category.ART_PRZEMYSŁOWE));
        products.add(new Product(6,"BIO Ciastka owsiane",0,false, Product.Category.SŁODYCZE));
        products.add(new Product(7,"Bułka Kajzerka świeża ",0,false, Product.Category.ART_MĄCZNE));
        products.add(new Product(8,"C.Minis Baton zboż.",0,false, Product.Category.SŁODYCZE));
        products.add(new Product(9,"Camembert 129g",0,false,Product.Category.NABIAŁ));
        products.add(new Product(10,"Cheetosy pizza zielone",2,true,Product.Category.PRZEKĄSKI));
        products.add(new Product(11,"Chipsy Cheetos",3,false,Product.Category.PRZEKĄSKI));
        products.add(new Product(12,"Chipsy Monst.Munch.",0,false,Product.Category.PRZEKĄSKI));
        products.add(new Product(13,"Chipsy ziem.pap.",0,false,Product.Category.PRZEKĄSKI));
        products.add(new Product(14,"Chleb biały",0,false, Product.Category.ART_MĄCZNE));
        products.add(new Product(15,"Chleb raz.na ma.św.",0,false, Product.Category.ART_MĄCZNE));
        products.add(new Product(16,"Chleb tostowy biały",1,true, Product.Category.ART_MĄCZNE));
        products.add(new Product(17,"Chrupki BBQ",0,false,Product.Category.PRZEKĄSKI));
        products.add(new Product(18,"Chusteczki hig. intymnej CIEN",1,true, Product.Category.ART_PRZEMYSŁOWE));
        products.add(new Product(19,"Chusteczki higieniczne 90/100",2,true, Product.Category.ART_PRZEMYSŁOWE));
        products.add(new Product(20,"Coca—cola nap.gaz.",2,false,Product.Category.NAPOJE));
        products.add(new Product(21,"Cukier wanilinowy",3,false, Product.Category.PRZYPRAWY));
        products.add(new Product(22,"Cytryny",3,true,Product.Category.OWOCE));
        products.add(new Product(23,"Czek.z orz.lask.",0,false, Product.Category.SŁODYCZE));
        products.add(new Product(24,"Czekolada z s.migdał",0,false, Product.Category.SŁODYCZE));
        products.add(new Product(25,"Czosnek granulowany",0,false, Product.Category.PRZYPRAWY));
        products.add(new Product(26,"Ćwiartka z kurczaka",4,false, Product.Category.MIĘSO));
        products.add(new Product(27,"D.Szynka got.299g",0,false, Product.Category.WĘDLINY));
        products.add(new Product(28,"Donut Milka św",3,false, Product.Category.SŁODYCZE));
        products.add(new Product(29,"Fasola zielona świeża",0,false, Product.Category.WARZYWA));
        products.add(new Product(30,"Favita Ser",0,false,Product.Category.NABIAŁ));
        products.add(new Product(31,"Folia spożywcza",0,false, Product.Category.ART_PRZEMYSŁOWE));
        products.add(new Product(32,"Frytki mrożone 7x7",1,false, Product.Category.MROŻONKI));
        products.add(new Product(33,"Granola M.Czek.—kok.",0,false, Product.Category.SŁODYCZE));
        products.add(new Product(34,"Groszek kons.puszka",2,true, Product.Category.SŁOIKI_PUSZKI));
        products.add(new Product(35,"Gruszki",2,true,Product.Category.OWOCE));
        products.add(new Product(36,"Herbata Rooibos, Pu—erh",0,false,Product.Category.NAPOJE));
        products.add(new Product(37,"Herbata ziel.79g",0,false,Product.Category.NAPOJE));
        products.add(new Product(38,"Herbatniki Maltanki",0,false, Product.Category.SŁODYCZE));
        products.add(new Product(39,"Jabłka",4,true,Product.Category.OWOCE));
        products.add(new Product(40,"Jaja L",0,false,Product.Category.NABIAŁ));
        products.add(new Product(41,"Jog.nat.3% b.lakt.",3,false,Product.Category.NABIAŁ));
        products.add(new Product(42,"Kabanosy drob.Tar.",1,true, Product.Category.WĘDLINY));
        products.add(new Product(43,"Ketchup łagodny",0,false, Product.Category.SŁOIKI_PUSZKI));
        products.add(new Product(44,"Kiełb. krak. sucha",2,true, Product.Category.WĘDLINY));
        products.add(new Product(45,"Kiełki sort.",1,false, Product.Category.WARZYWA));
        products.add(new Product(46,"Kinder Bueno baton",0,false, Product.Category.SŁODYCZE));
        products.add(new Product(47,"Koncentrat pom.",0,false, Product.Category.SŁOIKI_PUSZKI));
        products.add(new Product(48,"Koperek św.",0,false, Product.Category.WARZYWA));
        products.add(new Product(49,"Kopytka",1,true, Product.Category.MROŻONKI));
        products.add(new Product(50,"Koreczki śledziowe",0,false,Product.Category.PRZEKĄSKI));
        products.add(new Product(51,"Kukurydza konserw.",0,false, Product.Category.SŁOIKI_PUSZKI));
        products.add(new Product(52,"Lipton Herb.mroż.",0,false,Product.Category.NAPOJE));
        products.add(new Product(53,"Lipton Ice Tea",2,true,Product.Category.NAPOJE));
        products.add(new Product(54,"Liście laurowe",0,false, Product.Category.PRZYPRAWY));
        products.add(new Product(55,"Lody jogurt. 469ml",0,false, Product.Category.SŁODYCZE));
        products.add(new Product(56,"Lody Sandwich",6,true, Product.Category.SŁODYCZE));
        products.add(new Product(57,"Lody Twister",0,false, Product.Category.SŁODYCZE));
        products.add(new Product(58,"Łosoś dziki 9,378",0,false,Product.Category.PRZEKĄSKI));
        products.add(new Product(59,"Łosoś wędzony199g 2",0,false,Product.Category.PRZEKĄSKI));
        products.add(new Product(60,"Majonez KANIA",1,true, Product.Category.SŁOIKI_PUSZKI));
        products.add(new Product(61,"Makaron kokard.500g",0,false, Product.Category.ART_MĄCZNE));
        products.add(new Product(62,"Maseczki 2x6ml",0,false, Product.Category.ART_PRZEMYSŁOWE));
        products.add(new Product(63,"Masło w promocji",6,false,Product.Category.NABIAŁ));
        products.add(new Product(64,"Masz.d.gol. Venus",0,false, Product.Category.ART_PRZEMYSŁOWE));
        products.add(new Product(65,"Mąka tortowa459 1kg",0,false, Product.Category.ART_MĄCZNE));
        products.add(new Product(66,"Miesz chińska mroż.",0,false, Product.Category.MROŻONKI));
        products.add(new Product(67,"Miesz. żur. i nerk.",0,false,Product.Category.PRZEKĄSKI));
        products.add(new Product(68,"Mieszanka sałat",0,false, Product.Category.WARZYWA));
        products.add(new Product(69,"Mięso miel.w.—woł.",0,false, Product.Category.MIĘSO));
        products.add(new Product(70,"Mięso mielone woł.Pr",0,false, Product.Category.MIĘSO));
        products.add(new Product(71,"Migdały łuskane",0,false, Product.Category.PRZYPRAWY));
        products.add(new Product(72,"Mleczko wan.w czekol",0,false, Product.Category.SŁODYCZE));
        products.add(new Product(73,"Mleko bez laktozy",0,false,Product.Category.NABIAŁ));
        products.add(new Product(74,"Nat.pietruszki św.",1,false, Product.Category.WARZYWA));
        products.add(new Product(75,"Nekt.pomar.59%1,5L",0,false,Product.Category.NAPOJE));
        products.add(new Product(76,"Nutella kr.cz.359g",0,false, Product.Category.SŁOIKI_PUSZKI));
        products.add(new Product(77,"Oetker Budyń",0,false, Product.Category.PRZYPRAWY));
        products.add(new Product(78,"Ogórki ziel świeże",1,false, Product.Category.WARZYWA));
        products.add(new Product(79,"Orzechy nerkow.XXL",0,false,Product.Category.PRZEKĄSKI));
        products.add(new Product(80,"Paluszki serowe",0,false,Product.Category.NABIAŁ));
        products.add(new Product(81,"Paluszki słone",1,false,Product.Category.PRZEKĄSKI));
        products.add(new Product(82,"Papr żółta św. luz",0,false, Product.Category.WARZYWA));
        products.add(new Product(83,"Papryka c. świeża",0,false, Product.Category.WARZYWA));
        products.add(new Product(84,"Parówki Berlinki",0,false, Product.Category.WĘDLINY));
        products.add(new Product(85,"Patyczki kosmetyczne",0,false, Product.Category.ART_PRZEMYSŁOWE));
        products.add(new Product(86,"Pieczarki świeże",0,false, Product.Category.WARZYWA));
        products.add(new Product(87,"Pierogi z kap./grzyb",1,true, Product.Category.MROŻONKI));
        products.add(new Product(88,"Piwo Lech Free Lim.Mięta",1,false,Product.Category.NAPOJE));
        products.add(new Product(89,"Piwo Perlenb. 0,5L",4,false,Product.Category.NAPOJE));
        products.add(new Product(90,"Pizza Margherit399g",2,true, Product.Category.MROŻONKI));
        products.add(new Product(91,"Płatki Corn Flakes",0,false,Product.Category.PRZEKĄSKI));
        products.add(new Product(92,"Płatki kosmetyczne",0,false, Product.Category.ART_PRZEMYSŁOWE));
        products.add(new Product(93,"Płyn do płukania jam.ust. DENTALUX",2,true, Product.Category.ART_PRZEMYSŁOWE));
        products.add(new Product(94,"Pomarańcze",3,true,Product.Category.OWOCE));
        products.add(new Product(95,"Pomidor kiśc świeży",1,false, Product.Category.WARZYWA));
        products.add(new Product(96,"Pomidory w puszce",0,false, Product.Category.SŁOIKI_PUSZKI));
        products.add(new Product(97,"Popcorn do mik.solony",1,true,Product.Category.PRZEKĄSKI));
        products.add(new Product(98,"Przyprawa Majeranek",1,false, Product.Category.PRZYPRAWY));
        products.add(new Product(99,"Pstrąg łososiowy wędzony",0,false,Product.Category.PRZEKĄSKI));
        products.add(new Product(100,"Ptasie mleczko",1,false, Product.Category.SŁODYCZE));
        products.add(new Product(101,"Pure Frankfurterki",0,false, Product.Category.WĘDLINY));
        products.add(new Product(102,"Ryż Basmati",0,false, Product.Category.ART_MĄCZNE));
        products.add(new Product(103,"Schab wieprzowy b/k",0,false, Product.Category.MIĘSO));
        products.add(new Product(104,"Ser Gouda",2,true,Product.Category.NABIAŁ));
        products.add(new Product(105,"Ser Mozzarella",0,false,Product.Category.NABIAŁ));
        products.add(new Product(106,"Ser topiony pl.200g",0,false,Product.Category.NABIAŁ));
        products.add(new Product(107,"Ser topiony w plastrah",2,true,Product.Category.NABIAŁ));
        products.add(new Product(108,"Ser w plastrach",0,false,Product.Category.NABIAŁ));
        products.add(new Product(109,"Serek wiej.bez lak.",0,false,Product.Category.NABIAŁ));
        products.add(new Product(110,"Skrzydła z kurczaka",0,false, Product.Category.MIĘSO));
        products.add(new Product(111,"Sokołów Kabanosy",0,false, Product.Category.WĘDLINY));
        products.add(new Product(112,"Szczypiorek św.",0,false, Product.Category.WARZYWA));
        products.add(new Product(113,"Szynka got.delik.",0,false, Product.Category.WĘDLINY));
        products.add(new Product(114,"Szynka Szwar.kroj.",0,false, Product.Category.WĘDLINY));
        products.add(new Product(115,"Twaróg półtł. klin.",1,false,Product.Category.NABIAŁ));
        products.add(new Product(116,"Tymb.Nekt.eop29%",0,false,Product.Category.NAPOJE));
        products.add(new Product(117,"Wafle ryżowe",0,false, Product.Category.SŁODYCZE));
        products.add(new Product(118,"Whisky",1,true,Product.Category.NAPOJE));
        products.add(new Product(119,"Wino Alm. Alent.",3,true,Product.Category.NAPOJE));
        products.add(new Product(120,"Wino Cardal",2,false,Product.Category.NAPOJE));
        products.add(new Product(121,"Wkładki hig.long",0,false, Product.Category.ART_PRZEMYSŁOWE));
        products.add(new Product(122,"Woreczki śniadaniowe",0,false, Product.Category.ART_PRZEMYSŁOWE));
        products.add(new Product(123,"Worki na śmieci 69L",0,false, Product.Category.ART_PRZEMYSŁOWE));
        products.add(new Product(124,"Wrigleys Guma II",0,false, Product.Category.SŁODYCZE));
        products.add(new Product(125,"Wykałaczki",1,false, Product.Category.ART_PRZEMYSŁOWE));
        products.add(new Product(126,"Zapiekanka z mocarellą i pieczarkami",2,true, Product.Category.MROŻONKI));
        products.add(new Product(127,"Ziemniaki 5kg, św",1,false, Product.Category.WARZYWA));
        products.add(new Product(128,"Zmywacz do paznokci CIEN",1,true, Product.Category.ART_PRZEMYSŁOWE));
        products.add(new Product(129,"Zupa błyskaw.",1,false,Product.Category.PRZEKĄSKI));
        products.add(new Product(130,"Żurawina susz.",1,false,Product.Category.PRZEKĄSKI));

        categories.add(Product.Category.NAPOJE.toString().toLowerCase());
        categories.add(Product.Category.WARZYWA.toString().toLowerCase());
        categories.add(Product.Category.OWOCE.toString().toLowerCase());
        categories.add(Product.Category.NABIAŁ.toString().toLowerCase());
        categories.add(Product.Category.PRZEKĄSKI.toString().toLowerCase());
        categories.add(Product.Category.SŁODYCZE.toString().toLowerCase());
        categories.add(Product.Category.ART_PRZEMYSŁOWE.toString().toLowerCase());
        categories.add(Product.Category.ART_MĄCZNE.toString().toLowerCase());
        categories.add(Product.Category.WĘDLINY.toString().toLowerCase());
        categories.add(Product.Category.MROŻONKI.toString().toLowerCase());
        categories.add(Product.Category.PRZYPRAWY.toString().toLowerCase());
        categories.add(Product.Category.MIĘSO.toString().toLowerCase());
        categories.add(Product.Category.SŁOIKI_PUSZKI.toString().toLowerCase());

    }



	public static void main(String[] args) {

		SpringApplication.run(ShoppingListApplication.class, args);
	}

}
