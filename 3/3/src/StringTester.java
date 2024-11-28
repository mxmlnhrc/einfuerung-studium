public class StringTester {
    String base = "Hand in Hand und Hallo";

    //Erstellen einer Methode welche einen einzelnen Char zählt
    public int countOccurance(char to_count) {
//        Erstelen eines Counters
        int count = 0;
//        For-Schleife welche über jeden Char in einem String geht
        for(int i = 0; i < base.length(); i++) {
//            Wenn der Ziel Char in dem Char vom String vorkommt wird Counter um 1 erhöht
            if (base.charAt(i) == to_count) {
                count++;
            }
        }
        return count;
    }

//Erstellen einer Methode welche die häufigkeit von einem String in einem String zählt
    public int countOccurance(String to_count) {
//        Erstellen von einem Counter und einem welcher den Index im String wieder spiegelt
        int lastindex = 0;
        int counter = 0;
//        For-Schleife welche jeden Char im String durchgeht
        for(int i = 0; i < base.length(); i++) {
//            Wenn der zu zählende String in dem Abgetasteten String ist
            if(base.indexOf(to_count, lastindex) != -1){
//                Der letzte gefundene Index wird übergeben (lastindex)
                lastindex = base.indexOf(to_count, lastindex)+to_count.length();
//                Counter wird +1 gerechnet
                counter++;
            }
        }
        return counter;
    }
}
