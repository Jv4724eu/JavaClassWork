package WEEK11_MOREDATABASE;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlaceDB {
    private static final String DB_CONNECTION_URL = "jbdc:sqlite:places.sqlite";

    private static final String NAME_COL = "name";
    private static final String ELEV_COL = "elev";

    PlaceDB(){
        try (Connection conn = DriverManager.getConnection(DB_CONNECTION_URL);
        Statement statment = conn.createStatement()) {
            //Create a table in the database, if it does not exist already
            String createTableSQL = "CREATE TABLE IF NOT EXISTS places" + "(name TEXT PRIMARY KEY, elev DOUBLE)";

            statment.executeUpdate(createTableSQL);
        } catch (SQLException sqle){
            throw new RuntimeException(sqle);
        }
    }

    public List<Place> fetchAllRecords(){
        List<Place> allRecords = new ArrayList<>();
        try(Connection conn = DriverManager.getConnection(DB_CONNECTION_URL);
        Statement statement = conn.createStatement()){
            String selectALLSQL = "SELECT * FROM places";
            ResultSet rsALL = statement.executeQuery(selectALLSQL);

            while(rsALL.next()) {
                String name = rsALL.getString(NAME_COL);
                double elevation = rsALL.getDouble(ELEV_COL);
                Place placeRecord = new Place(name, elevation);
                allRecords.add(placeRecord);
            }

            return allRecords; //if there is no data, this will be empty

        } catch (SQLException sqle) {
            throw new RuntimeException(sqle); //crashes program programmer must fix cause
        }
    }




}
