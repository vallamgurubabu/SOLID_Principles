class DataAccess {
    private Database db;

    public DataAccess(Database db) {
        this.db = db;
    }

    public void loadData() {
        db.connect();
        System.out.println("Data loaded");
    }
}