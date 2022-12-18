public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Anna", 65, 198, 118);
        Person person2 = new Person("Sam", 41, 168, 75);
        Person person3 = new Person("Bill", 11, 139, 31);
        Person person4 = new Person("Jessica", 25, 165, 52);
        Person person5 = new Person("Jenifer", 0, 49, 4);
        Person person6 = new Person("Alisa", 49, 158, 51);
        Person person7 = new Person("Bruce", 71, 187, 71);
        Person person8 = new Person("Sarah", 19, 171, 61);
        Person person9 = new Person("Laura", 57, 172, 61);
        Person person10 = new Person("Monica", 25, 175, 89);

        SuperannuationFund forPerson1 = new SuperannuationFund("Pupkin and Ko", false, "15.07.1981",44, 748.89, 3525.77);
        SuperannuationFund forPerson2 = new SuperannuationFund("NPF", true, "21.09.2007",15, 1184.11, 9514.78);
        SuperannuationFund forPerson3 = new SuperannuationFund("No fund", false, "",0, 0, 0);
        SuperannuationFund forPerson4 = new SuperannuationFund("PensCorp", false, "15.07.2022",8, 4556.99, 5500);
        SuperannuationFund forPerson5 = new SuperannuationFund("No fund", false, "",0, 0, 0);;
        SuperannuationFund forPerson6 = new SuperannuationFund("Social Protection fund", true, "26.10.1991",31, 897.11, 7538.03);
        SuperannuationFund forPerson7 = new SuperannuationFund("National Pension fund", true, "30.11.1970",52, 1965.75, 6784.88);
        SuperannuationFund forPerson8 = new SuperannuationFund("New State fund", true, "21.11.2021",1, 2358.07,3154.44);
        SuperannuationFund forPerson9 = new SuperannuationFund("Horns and hooves", false, "15.07.1983",39, 5481.24, 35110);
        SuperannuationFund forPerson10 = new SuperannuationFund("Freedom Peak Financial", true, "01.07.2022",4, 7780.87, 8584.88);

        System.out.println("Attention!! Minimum hours worked aren't counted");

        person1.name();
        forPerson1.pensionCalculation();

        person2.name();
        forPerson2.pensionCalculation();

        person3.name();
        forPerson3.pensionCalculation();

        person4.name();
        forPerson4.pensionCalculation();

        person5.name();
        forPerson5.pensionCalculation();

        person6.name();
        forPerson6.pensionCalculation();

        person7.name();
        forPerson7.pensionCalculation();

        person8.name();
        forPerson8.pensionCalculation();

        person9.name();
        forPerson9.pensionCalculation();

        person10.name();
        forPerson10.pensionCalculation();

    }


}