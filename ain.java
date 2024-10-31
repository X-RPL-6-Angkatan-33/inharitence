import java.time.Year;
import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Usia: " + age);
    }
}
class Student extends Person {
    private int studentNumber;
    private int score;
    private String major;

    public Student(String name, int age, int studentNumber, int score, String major) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Nomor Induk Mahasiswa: " + studentNumber);
        System.out.println("Nilai: " + score);
        System.out.println("Jurusan: " + major);
    }

    // Getter and Setter methods for encapsulation
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

class Teacher extends Person {
    private String subject;
    private int yearIn;

    public int lamamengajar(){
        int yearNow = Year.now().getValue();
        int hasil = yearNow - yearIn;
        return hasil;
    }


    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mata Pelajaran: " + subject);
    
    }

    // Getter and Setter methods for encapsulation
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

class FullTime extends Teacher {
    private int annualSalary;
    private String unit;

    

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Gaji Tahunan: " + annualSalary);
        System.out.println("Unit: " + unit);
        System.out.println(super.lamamengajar());
    }

    // Getter and Setter methods for encapsulation
    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public FullTime(String name, int age, String subject, int annualSalary, String unit) {
        super(name, age, subject);
        this.annualSalary = annualSalary;
        this.unit = unit;
    }
}

class PartTime extends Teacher {
    private int hoursWorked;
    private int hourlyRate;

    public PartTime(String name, int age, String subject, int hoursWorked, int hourlyRate) {
        super(name, age, subject);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jam Kerja: " + hoursWorked);
        System.out.println("Gaji per Jam: " + hourlyRate);
        System.out.println("Total Gaji: " + calculateSalary());
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}

public class ain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pilih Teacher / Student");
            System.out.println("1 Teacher");
            System.out.println("2 Student");
            int pilih = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilih) {
                case 1 -> {
                    System.out.println("Anda memilih Teacher");
                    System.out.print("Masukkan nama: ");
                    String teacherName = scanner.nextLine();
                    System.out.print("Masukkan usia: ");
                    int teacherAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan mata pelajaran: ");
                    String subject = scanner.nextLine();
                    
                    System.out.println("Pilih tipe guru:");
                    System.out.println("1 FullTime");
                    System.out.println("2 PartTime");
                    int teacherType = scanner.nextInt();
                    scanner.nextLine();
                    switch (teacherType) {
                        case 1 -> {
                            System.out.print("Masukkan gaji tahunan: ");
                            int annualSalary = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Masukkan unit: ");
                            String unit = scanner.nextLine();
                            FullTime fullTimeTeacher = new FullTime(teacherName, teacherAge, subject, annualSalary, unit);
                            fullTimeTeacher.printInfo();
                        }
                        case 2 -> {
                            System.out.print("Masukkan jam kerja per minggu: ");
                            int hoursPerWeek = scanner.nextInt();
                            System.out.print("Masukkan bayaran per jam: ");
                            int hourlyRate = scanner.nextInt();
                            scanner.nextLine();
                            PartTime partTimeTeacher = new PartTime(teacherName, teacherAge, subject, hoursPerWeek, hourlyRate);
                            partTimeTeacher.printInfo();
                        }
                        default -> System.out.println("Pilihan tidak valid");
                    }
                }
                
                case 2 -> {
                    System.out.println("Anda memilih Student");
                    System.out.print("Masukkan nama: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Masukkan usia: ");
                    int studentAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nomor induksiswa: ");
                    int studentNumber = scanner.nextInt();
                    System.out.print("Masukkan nilai: ");
                    int score = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan jurusan: ");
                    String major = scanner.nextLine();
                    
                    Student student = new Student(studentName, studentAge, studentNumber, score, major);
                    student.printInfo();
                }
                
                default -> System.out.println("Pilihan tidak valid");
            }
        }
    }
}