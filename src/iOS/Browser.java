package iOS;

public class Browser implements Safari {
    public void viewPage() {
        System.out.println("Viewing Page");
    }
    
    public void addNewTab() {
       System.out.println("New page added"); 
    }
    
    public void refreshPage() {
        System.out.println("Refreshed page");
    }
}
