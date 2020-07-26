package SelfStudy;

public class replit_180 {

        public static void main(String[] args) {
            System.out.println(coverString("java [me]thods", "[me]") ) ; //java [me]thods
        }

        public static String coverString(String main, String coverME) {
            main = main.replace(coverME,"["+coverME+"]");
            return main;

        }

    }

