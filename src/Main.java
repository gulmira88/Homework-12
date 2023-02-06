public class Main {
    public static void main(String[] args) {

        Country country = new Country();
        country.setName("Kyrgyzstan");
        country.setArea(199951);
        country.setLocation("Central Asia");

        City city = new City();
        city.setName("Bishkek");
        city.setArea(19005);
        city.setPopulation(2345000);

        Adress adress = new Adress();
        adress.setCity("Bishkek");
        adress.setStreet("Jibek jolu");
        adress.setNumber(83);

        Person person = new Person();
        person.setName("Bakay");
        person.setAge(25);
        person.setNationality("Kyrgyz");

        Country country1 = new Country();
        country1.setName("Kyrsyzstan");
        country1.setArea(199951);
        country1.setLocation("Central Asia");

        City city1 = new City();
        city1.setName("Bishkek");
        city1.setArea(19005);
        city1.setPopulation(2345000);

        Adress adress1 = new Adress();
        adress1.setCity("Bishkek");
        adress1.setStreet("Jibek jolu");
        adress1.setNumber(83);


        Person person1 = new Person();
        person1.setName("Bakay");
        person1.setAge(25);
        person1.setNationality("Kyrgyz");

       Country[] countries ={country,country1};
        for (Country c:countries) {

            System.out.println(c.getName()+ " " +c.getArea()+ " " + c.getLocation());

         City[] cities ={city,city1} ;
            for (City b:cities){
                System.out.println(b.getName()+ " " + b.getArea() + " "+ b.getPopulation());

         Adress[] adresses = {adress, adress1};
                for (Adress a:adresses) {
                    System.out.println(a.getCity() +  " " + a.getStreet() + " " + a.getNumber());


           Person [] people = {person,person1} ;
                    for (Person p:people) {
                        System.out.println(p.getName() + " "+ p.getAge()+ " " + p.getNationality());

                    }

                }



            }
        }







    }
}