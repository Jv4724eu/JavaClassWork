package WEEK11_MOREDATABASE;

import java.util.List;

public class Controller {
    private PlaceGUI gui;
    private PlaceDB db;

    public static void main(String[] args) {
        new Controller().startApp();
    }

    private void startApp(){
        db = new PlaceDB();

        List<Place> allData = db.fetchAllRecords();

        gui = new PlaceGUI(this);
        gui.setListData(allData);
    }

    List<Place> getAllData(){
        return db.fetchAllRecords();
    }
}
