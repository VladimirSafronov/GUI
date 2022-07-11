package firstGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGui gui = new SimpleGui();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame(); //создаем фрейм (холст)
        button = new JButton("click me"); //создаем кнопку, в конструкторе текст, отображаемый на кнопке

        button.addActionListener(this); //регестрируем заинтересованность в кнопке. Передаваемый объект должен
        // реализовывать ActionListener

        frame.getContentPane().add(button); //добавляем кнопку в панель фрейма
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //завершаем работу программы при закрытии окна, если этого
        //не сделать, приложение будет висеть вечно
        frame.setSize(300, 300); //присваиваем размер фрейму в пикселах
        frame.setVisible(true); //делаем фрейм видимым
    }

    @Override //реализуем метод интерфейса - фактический метод обработки событий
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked");
    }
}
