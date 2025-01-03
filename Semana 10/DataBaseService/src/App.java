import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        DataBaseService dataBase = new DataBaseService();
        ArrayList<DataBaseService> lista = new ArrayList<>();
        dataBase.connect();
        lista.add(new MySQLDatabaseService());
        lista.add(new SQLiteDataBaseService());
        lista.add(new FakeDataBaseService());

        for (DataBaseService dataBaseService : lista) {
            dataBaseService.connect();
        }

        System.out.println("Adiós.");
    }
}
