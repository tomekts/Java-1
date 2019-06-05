import java.sql.*;

public class Sql
{
    public boolean sprawdz(String login, String pass)
    {
        boolean spr=false;
        String log = login.toLowerCase();



        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:hsqldb:file:hsqldb/data/log.db", "SA", "");
            Statement state = conn.createStatement();

            ResultSet rec = state.executeQuery(
                    "select * from osoby where osoba ='"+log+"' ");


            if (rec.next())
            {
                System.out.println("sprawdzenie hasła");
                    if (rec.getString(3).equals(pass)){
                        System.out.println("hasło dobre");
                        spr=true;
                    }
            }
            state.execute("shutdown");
            state.close();
            conn.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return spr;
    }

    public boolean sprawdz(String login)
    {
        boolean spr=false;
        String log = login.toLowerCase();



        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:hsqldb:file:hsqldb/data/log.db", "SA", "");
            Statement state = conn.createStatement();

            ResultSet rec = state.executeQuery(
                    "select * from osoby where osoba ='"+log+"' ");


            if (rec.next())
            {

                    spr=true;

            }
            state.execute("shutdown");
            state.close();
            conn.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return spr;
    }

    public boolean dodaj (String pass, String use)
    {
        boolean koniec = false;
        String use1 = use.toLowerCase();

        try {
        Class.forName("org.hsqldb.jdbcDriver");
        Connection conn = DriverManager.getConnection(
                "jdbc:hsqldb:file:hsqldb/data/log.db", "SA", "");
        Statement state = conn.createStatement();

        ResultSet rec = state.executeQuery(
                "insert into osoby values (3, '"+use1+"', '"+pass+"')");



        state.execute("shutdown");
        state.close();
        conn.close();
        koniec=true;


    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }

        return koniec;
    }


    public StringBuilder pobierz() {
        StringBuilder st = new StringBuilder();
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:hsqldb:file:hsqldb/data/log.db", "SA", "");
            Statement state = conn.createStatement();

            ResultSet rec = state.executeQuery(
                    "select id, osoba, has " +
                            "from osoby " +
                            "order by id ");


            while (rec.next()) {
                st.append(rec.getInt(1));
                st.append(" ");
                st.append(rec.getString(2));
                st.append(" ");
                st.append(rec.getString(3));
                st.append("\n");
            }

            state.execute("shutdown");
            state.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
        System.out.println(st);
        return st;

    }


}





