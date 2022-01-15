package DesignPattern;


interface DatabaseExecutor {
    public void executeDatabase(String query) throws Exception;
}

class DatabaseExecutorImpl implements DatabaseExecutor {
    @Override
    public void executeDatabase(String query) {
        System.out.println("Executing query ..." + query);
    }
}

class DatabaseExecutorProxy implements DatabaseExecutor {
    boolean ifAdmin;
    DatabaseExecutorImpl databaseExecutor;

    public DatabaseExecutorProxy(String name, String pwd) {
        if (name == "Admin" && pwd == "Admin") {
            ifAdmin = true;
            databaseExecutor = new DatabaseExecutorImpl();
        }
    }

    @Override
    public void executeDatabase(String query) throws Exception {
        if (ifAdmin) {
            databaseExecutor.executeDatabase(query);
        } else {
            throw new Exception("Delete now allowed");
        }
    }
}

public class ProxyDesignPatternExample {
    public static void main(String[] args) throws Exception {
        DatabaseExecutor admin= new DatabaseExecutorProxy("Admin","Admin");
        admin.executeDatabase("Delete");

        DatabaseExecutor nonAdmin= new DatabaseExecutorProxy("Admin","");
       // nonAdmin.executeDatabase("Delete");
    }
}
