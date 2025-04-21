import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> list = new ArrayList<>();
    public List<Student> getAll(){
        return list;
    }

    public void addSV(Student s){
        if (s.getId().isEmpty()||s.getName().isEmpty()){
            System.out.println("Không được bỏ trống");
        }
        list.add(s);
    }

    public boolean updateStudent(String cu,Student moi){
        if (moi.getId().isEmpty() || moi.getId() == null){
            System.out.println("Không được để trống trường này");
        }

        if(moi.getId().equals(cu)){
            System.out.println("Id trùng, vui lòng nhập lại");
        }

        for (Student s: list){
            if (!s.getId().equals(cu)&&s.getName().equals(moi.getId())){
                System.out.println("Không được bỏ trống");
                return false;
            }
        }
        for (int i=0; i <list.size();i++){
            if (list.get(i).getId().equals(cu)){
                list.set(i,moi);
            }
        }
        return false;
    }
}
