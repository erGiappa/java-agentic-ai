package day10;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args){

        PaymentService service = new PaymentService();

        service.makePayment(100);
    }
}
