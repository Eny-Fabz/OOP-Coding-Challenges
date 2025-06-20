public class MainApp {

    public static void main(String[] args) {
    
    Admin curAdmin = new Admin(1234, "Minato", "yb2#KX53$4");
    
    User curUser = new User(4455, "Eniola");
    
    curAdmin.performOperation(new Update());
    
    curUser.performOperation(new View());
    
    }
    
    }
    