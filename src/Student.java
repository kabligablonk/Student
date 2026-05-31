public class Student {
    String name;
    String course;
    String[] subjects = new String[8];
    int id;

    //constructors
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Student(String name, int id, String course){
        this.name = name;
        this.id = id;
        this.course = course;
    }

    //methods
    public void introduce(){
        String firstName = name.substring(0, name.indexOf(" "));
        System.out.println("Hello, I am " + firstName + ". My ID number is " +  id + ". My course is " + course);
    }

    public void checkSubjects(){
        for(int i = 0; i < subjects.length; i++){
            System.out.println(subjects[i]);
        }
    }

    public void addSubject(String subject) {
        int maxSubjects = 8;
        int maxSubjectCodeLength = 7;
        String[] withAddedSubjects = new String[subjects.length + 1];

        if (subject.length() != maxSubjectCodeLength) {
            System.out.println("Short subject code.");
            return;
        }

        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) {
                subjects[i] = subject;
                return;
            }
        }

        if (subjects.length >= maxSubjects) {
            System.out.println("Max subjects reached.");
            return;
        }


        for (int i = 0; i < subjects.length; i++) {
            withAddedSubjects[i] = subjects[i];
        }

        withAddedSubjects[withAddedSubjects.length - 1] = subject;

        subjects = withAddedSubjects;
    }

    public void removeSubject(String subject){
        for(int i = 0; i < subjects.length; i++){
            if (subject.equalsIgnoreCase(subjects[i])){
                subjects[i] = null;
            }
        }
    }

    //getters, setters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
