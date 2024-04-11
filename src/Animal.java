public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Animal(){
        this("Mèo",1); // Gọi đến constructor có tham số tương ứng, bắt buộc phải đứng ở dòng đầu tiên trong constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name; //Từ khóa this. sẽ đại diện cho đối tượng đang sử dụng
    }

    public int getAge(){
        return age;
    }

}
