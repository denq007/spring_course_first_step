package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook()
    {
        System.out.println("Мы берем книгу из UniLibrary " );
    }

    public void getMagazine()
    {
        System.out.println("Мы берем журнал из UniLibrary");
    }

    public String returnBook()
    {
        System.out.println("Возвращаем книгу в UniLibrary");
        return "OK";
    }

    public  String returnMagazine()
    {
        System.out.println("Возвращаем журнал в UniLibrary");
        return "OK";
    }

    public void addBook()
    {
        System.out.println("Добавляем книгу");
    }

    public void addMagazine()
    {
        System.out.println("Добавляем журнал");
    }

}
