public class TestPerson {
    public static void main(String[] args){

        Student s=new Student("John", "ADDRESS", "Computer Science",4,23);
        System.out.println("program: " +s.getProgram()); // Test getters
        System.out.println("year: " +s.getYear()); // Test getters
        System.out.println("fee: " +s.getFee()); // Test getters
        s.setProgram("Humanity");
        s.setYear(5);
        s.setFee(25);
        System.out.println("student: " +s.toString()); // Test getters

        System.out.println();

        Staff st=new Staff("Sam", "Home", "Engineering",10);
        System.out.println("school: " +st.getSchool()); // Test getters
        System.out.println("pay: " +st.getPay()); // Test getters
        st.setSchool("Medical");
        st.setPay(500);
        System.out.println("staff: " +st.toString()); // Test getters

    }
}
