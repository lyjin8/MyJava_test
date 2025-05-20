package ly.innerclass.innerclassObject;

public class Human {
    //套娃警告
    public void eat(){
        class Heart{
            public void jump()
            {
                System.out.println("吃饭能维持心跳");
            }
        }
        //局部内部类
        new Heart().jump();
    }
}
