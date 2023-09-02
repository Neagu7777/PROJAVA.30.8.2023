package ConstructorPerson;

import java.util.Date;
/*У нас есть класс Person.
1)Сделать его правильным- создать геттеры и сеттеры, проверить, что он соответствует тем правилам, которые мы обсуждали.
2)Создать класс пенсионный фонд в нем создать такие поля:
а)Наименование пенсионного фонда .
б)булеан переменная, является ли он государственный
в)дата создания
г)количество участников фонда.
3)Добавить сеттеры и геттеры этому классу, заблокируют прямой доступ к переменным.
4)Добавить метод "info"- выводить информацию по фонду. Если фонд государственный, то информация должна содержать строку о том, сколько тысячи человек использует фонд. Для негосударственного фонда сколько не тысяч человек использует фонд.
5)Запретите менять дату создания фонда(отобрать сеттер).

 */
public class PensionFund {
    private String fundName;
    private boolean isGovernmental;
    private Date creationDate;
    private int participantCount;


    public PensionFund(String fundName, boolean isGovernmental, Date creationDate, int participantCount) {

        this.fundName = fundName;
        this.creationDate = creationDate;
        this.participantCount = participantCount;
        this.isGovernmental = isGovernmental;
    }


    public String getFundName() {
        return fundName;

    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public boolean isGovernmental() {
        return isGovernmental;

    }

    public void setGovernmental(boolean governmental) {
        isGovernmental = governmental;

    }

    public Date getCreationDate() {

        return creationDate;
    }

    // Запрещаем изменение даты создания фонда
//    public void setCreationDate(Date creationDate) {
//        this.creationDate = creationDate;

//    }

    public int getParticipantCount() {
        return participantCount;

    }

    public void setParticipantCount(int participantCount) {
        this.participantCount = participantCount;

    }

    public void info() {
        if (isGovernmental) {
            System.out.println("Государственный фонд, используется " + participantCount/1000 + " тысяч человек.");
        } else {
            System.out.println("Негосударственный фонд, используется " + participantCount + " не тысяч человек.");
        }
    }
}







