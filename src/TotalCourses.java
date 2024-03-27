public class Course {
    String ara[] = {"ArtificialIntelligence", " Security ", "OperationResearch", " Networking", "EmbeddedSystems"};



    private int isOff=0;
    Course(){
        System.out.println("Select Four Courses:");
        for (int i = 1; i <= ara.length ; i++) {
            System.out.println(i+". "+ara[i]);
        }
        int x=0, total=0;
        for (int i = 0; i < 4; i++) {
            x = Main.scanner.nextInt();
            total+=x;
        }
        isOff = 15-total;

    }
    public int getIsOff() {
        return this.isOff;
    }
}
