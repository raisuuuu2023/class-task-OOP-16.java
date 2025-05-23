import java.util.Date;

class Student {
    private int id;
    private String name;
    private String program;

    public Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }
}

class Instructor {
    private int id;
    private String name;
    private String department;
    private String title;

    public Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }
}

class Course {
    private int id;
    private String syllabus;
    private String title;
    private String credits;
    private String prerequisite;

    public Course(int id, String syllabus, String title, String credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public int getId() {
        return id;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public String getTitle() {
        return title;
    }

    public String getCredits() {
        return credits;
    }

    public String getPrerequisite() {
        return prerequisite;
    }
}

class CourseOffering {
    private int studentId;
    private int instructorId;
    private int courseId;
    private Date time;
    private int sectionNo;
    private int roomId;
    private int year;
    private int semester;

    public CourseOffering(int studentId, int instructorId, int courseId, Date time,
                          int sectionNo, int roomId, int year, int semester) {
        this.studentId = studentId;
        this.instructorId = instructorId;
        this.courseId = courseId;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public int getCourseId() {
        return courseId;
    }

    public Date getTime() {
        return time;
    }

    public int getSectionNo() {
        return sectionNo;
    }

    public int getRoomId() {
        return roomId;
    }

    public int getYear() {
        return year;
    }

    public int getSemester() {
        return semester;
    }
}

public class practiceprblm07 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", "CSE");
        Instructor i1 = new Instructor(101, "Dr. Bob", "CSE", "Professor");
        Course c1 = new Course(1001, "OOP Syllabus", "OOP", "3", "Intro to Programming");

        CourseOffering offer1 = new CourseOffering(
                s1.getId(), i1.getId(), c1.getId(), new Date(), 1, 301, 2025, 1
        );
    }
}
