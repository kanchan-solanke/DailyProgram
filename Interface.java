interface Student {
    final int roll_no = 1;
    final int sub1 = 89;
    final int sub2 = 67;
    final int sub3 = 50;
}
class Details implements Student {
    void display() {
        System.out.println("Details of Student" + " " + roll_no + " " + sub3 + " " + sub2 + " " + sub1);
    }

    public static void main(String[] args) {
        Details d = new Details();
        d.display();
    }
}
