package exceptions;


public class NewExc2 {
    public static void main(String[] args) {

        try {
            System.out.println(0);
            throw new RuntimeException(); // теперь проверяем являеться ли RuntimeExc наследником
            // типа указанного в каждом catch
        } catch (NullPointerException e) { // нет
            System.out.println(1);
        } catch (RuntimeException e) { // да, поэтому дальше не иде. Один try - один catch
            System.out.println(2);
        } catch (Exception e) { // не печатаем - не дошли
            System.out.println(3); // если ни в каком кеч не прописан ексепшин, то метод останавливаеться
        }
        System.out.println(4); //печатаем


        //  указываем исключчения от самого мелкого наследника и вконце общий (Exception)

    }
}
