public class Bird extends Animal{ // Sử dụng từ khóa extends để thừa kế
    // Khi triển khai kế thừa thì lớp lấy tất cả thuộc tính và phương thức từ lớp cha trừ private
    private int id;

    

    public String go(){

        return "Bird is going";
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    // supper Gọi đến constructor có tham số tương ứng ở lớp cha gần nhất
}
