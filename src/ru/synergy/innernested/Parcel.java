package ru.synergy.innernested;

public class Parcel {
    private String recepient;
    private int mass;

    /// ...


    class Destination {
        private String street;
        private int homeNumber;
        private int roomNumber;

       // private static int a; // невозможно в inner классе

//        enum Abc{
//            a,b,c
//        }
        // перечисление enum невозможно в inner классе

        public void doSmth(){
            System.out.println(mass);
        }

    }


    /// ...

}

