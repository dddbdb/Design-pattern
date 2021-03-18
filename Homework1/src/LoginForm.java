public class LoginForm extends AbstractButton {
    AbstractButton CircleButton=new AbstractButton() {
        @Override
        void view() {
            super.view();
            System.out.println("I'm CircleButton\n");
        }
    };
    AbstractButton RectangleButton=new AbstractButton() {
        @Override
        void view() {
            super.view();
            System.out.println("I'm RectangleButton\n");
        }
    };
    void display(){
        CircleButton.view();
        RectangleButton.view();
    };
}
