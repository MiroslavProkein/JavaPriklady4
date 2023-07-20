package mysql;

import java.sql.*;

public class DatabaseHelloWorld {

    public static void odstran(Connection conn) throws SQLException {
        // the mysql insert statement
        String query = "DELETE FROM knihy WHERE id = ?";
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setInt(1, 2); // Zmazeme zaznam s ID = 2
        // execute the preparedstatement
        preparedStmt.execute();
        preparedStmt.close();
        System.out.println("Zaznam bol odstraneny");
    }

    public static void vloz(Connection conn) throws SQLException {
// the mysql insert statement
        String query = "INSERT INTO knihy (nazov, autor, rok_vydania) VALUES (?, ?, ?)";
        // create the mysql insert preparedstatement
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setString(1, "Rozpravky pre deti 6");
        preparedStmt.setString(2, "Pavol Dobsinsky");
        preparedStmt.setInt(3, 1932);
        // execute the preparedstatement
        preparedStmt.execute();
        preparedStmt.close();
        System.out.println("Zaznam bol ulozeny");
    }

    // R ako READ, cize vyber dat, priamo sa pouziva ako SQL prikaz SELECT
    public static void vyber(Connection conn) throws SQLException {
        String query = "SELECT * FROM knihy"; // SQL query/prikaz na vyber vsetkych stlpcov a jej udajov z tabulky knihy

        PreparedStatement preparedStmt = conn.prepareStatement(query); // Vytvarame PreparedStatement, respe. pripravujeme SQL query na jeho uskutocnenie
        ResultSet rs = preparedStmt.executeQuery(query); // Tu sa priamo uz dane SQL vykona, vysledkom je ResultSet, ktory obsahuje jednotlive zaznami, resp. riadky tabulky

        // ... a nasledne prechadzame jednotlivymi zaznamami
        while (rs.next()) {
            int id = rs.getInt("id");
            String nazov = rs.getString("nazov");
            String autor = rs.getString("autor");
            int rokVydania = rs.getInt("rok_vydania");

            // Vypiseme vybrane udaje
            System.out.println("\nId knihy je: " + id);
            System.out.println("Nazov knihy je: " + nazov);
            System.out.println("Autor knihy je: " + autor);
            System.out.println("Rok vydania knihy je: " + rokVydania);
        }
        preparedStmt.close();
    }

    public static void aktualizuj(Connection conn) throws SQLException {
        // create the java mysql update preparedstatement
        String query = "UPDATE knihy SET nazov = ?, autor = ?, rok_vydania = ? WHERE id = ?";
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setString(1, "Hobit, skriatok"); // Pre prvy otaznik sme nastavili  nazov
        preparedStmt.setString(2, "Jozko Mrkva");
        preparedStmt.setInt(3, 1990);
        preparedStmt.setInt(4, 3); // Pre stvrty otaznik sme nastravili Id knihy aby si vedel program najst ktoru knihu
        // execute the java preparedstatement
        preparedStmt.executeUpdate();
        System.out.println("Zaznam aktualizovany!");
    }

    public static void main(String[] args) throws SQLException {
        Connection conn;
        String url = "jdbc:mysql://localhost:3306/kniznica_db";
        String username = "root";
        String password = "Password";
        System.out.println("Connecting database...");
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
        System.out.println("Vyber vsetkych zaznamov z tabulky Knihy, jedna sa o operacie R ako READ");
        vyber(conn);

        System.out.println("Aktualizuj konkretny zaznam");
        aktualizuj(conn);

        System.out.println("Vloz konkretny zaznam");
        vloz(conn);


        odstran(conn);

        System.out.println("Database connection is going to close");

        conn.close();

    }
}
