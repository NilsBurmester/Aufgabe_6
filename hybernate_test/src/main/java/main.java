import com.NilsBurmester.ActorEntity;
import com.NilsBurmester.Scan;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;

import static com.mysql.cj.protocol.a.MysqlTextValueDecoder.getTime;

public class main {
    public static void main(String[] args) {
        //Aufgabe 1
        /*
        ActorEntity actor0 = new ActorEntity();
        actor0.setFirstName("Heath");
        actor0.setLastName("Ledger");
        actor0.setLastUpdate(Timestamp.valueOf("2018-09-01 09:01:15"));
        actor0.insertActor(actor0);
        */
        //Aufgabe 2

        ActorEntity actor1 = new ActorEntity();
        actor1.actorQuery();

        //Aufgabe 3
    }
}
