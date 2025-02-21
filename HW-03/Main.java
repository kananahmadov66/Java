public class Main
{
    public static void main(String[] args)
    {

        Human human1=new Human("human1","hum1",2000);
        Human human2=new Human("human2","hum2",2005);
        Family family1=new Family(human1,human2);

        Human human3=new Human("human3","hum3",2010);
        Human human4=new Human("human4","hum4",2015);
        Family family2=new Family(human3,human4);

        String[][] human5Schedule = {
                {DayOfWeek.MONDAY.name(), "drink"},
                {DayOfWeek.WEDNESDAY.name(), "drink more"},
                {DayOfWeek.FRIDAY.name(), "party"},
        };
        Human human5 = new Human("human5", "hum5", 2020);
        human5.setSchedule(human5Schedule);

        String[][] human6Schedule = {
                {DayOfWeek.MONDAY.name(), "Drawing"},
                {DayOfWeek.WEDNESDAY.name(), "Playing badminton"},
                {DayOfWeek.FRIDAY.name(), "Reading books"},
                {DayOfWeek.SATURDAY.name(), "Partying"}
        };
        Human human6=new Human("human6","hum6",1980,90,human6Schedule);
        Human human7=new Human("human7","hum7",1975);
        Pet dog=new Pet(Species.DOG,"bd",6,66,new String[]{"eat","sleep","bark","drink"});
        family2.addChild(human6);
        family2.addChild(human7);
        family2.addChild(human5);
        family2.setPet(dog);
        System.out.println(family2);
        System.out.println("----------------------------");
        family2.deleteChild(new Human("human7","hum7",1975));
        System.out.println(family2);
    }
}