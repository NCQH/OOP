
public class StudentManagement {

    // khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)
    private Student[] students = new Student[100];
    private int cnt = 0;

    /**
     * Phuong thuc kiem tra 2 sinh vien co cung group khong.
     * @param s1 Sinh vien 1
     * @param s2 Sinh vien 2
     * @return true neu 2 sinh vien cung group, false neu khac group
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Phuong thuc them sinh vien moi.
     * @param newStudent sinh vien moi
     */
    public void addStudent(Student newStudent) {
        if (cnt < 100) {
            students[cnt] = newStudent;
            cnt++;
        }
    }

    /**
     * Phuong thuc hien thi sinh vien theo group.
     * @return Chuoi liet ke sinh vien theo group
     */
    public String studentsByGroup() {
        String results = "";
        boolean[] checked = new boolean[cnt];

        for (int i = 0; i < cnt; i++) {
            if (!checked[i]) {
                String group = students[i].getGroup();
                results = results + group +  "\n";

                for (int j = 0; j < cnt; j++) {
                    if (students[j].getGroup().equals(group)) {
                        results = results + students[j].getInfo() + "\n";
                        checked[j] = true;
                    }
                }
            }
        }
        return results;
    }

    /**
     * Phuong thuc xoa sinh vien.
     * @param id ma sinh vien muon xoa
     */
    public void removeStudent(String id) {
        for (int i = 0; i < cnt; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < cnt; j++) {
                    students[j] = students[j + 1];
                }
                students[cnt - 1] = null;
                cnt--;
                break;
            }
        }
    }

    /**
     * Phuong thuc main de kiem tra.
     * @param args tham so dong lenh
     */
    public static void main(String[] args) {
        Student sv1 = new Student();
        sv1.setName("Nguyen Van An");
        sv1.setId("17020001");
        sv1.setGroup("K62CC");
        sv1.setEmail("17020001@vnu.edu.vn");

        Student sv2 = new Student("Nguyen Van B", "17020002", "17020001@vnu.edu.vn");
        sv2.setGroup("K62CC");

        Student sv3 = new Student("Nguyen Van C", "17020003", "17020001@vnu.edu.vn");
        sv3.setGroup("K63CC");

        System.out.println(sv1.getInfo());
        System.out.println(sv2.getInfo());
        System.out.println(sv3.getInfo());
        System.out.println(sameGroup(sv1, sv2));
        System.out.println(sameGroup(sv1, sv3));

        StudentManagement sm = new StudentManagement();
        sm.addStudent(sv1);
        sm.addStudent(sv2);
        sm.addStudent(sv3);

        System.out.println(sm.studentsByGroup());

        sm.removeStudent("17020002");

        System.out.println(sm.studentsByGroup());
    }
}
