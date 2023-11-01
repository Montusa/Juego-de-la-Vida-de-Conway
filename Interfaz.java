import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Interfaz {
    private JFrame frame;
    private Tablero tablero;
    private JButton evolucionarBtn;
    private JButton resetBtn;
    private JButton randomBtn;

    Interfaz(int filas, int columnas){
        this.frame = new JFrame("Juego de la vida");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(600,650);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(filas,columnas));

        this.tablero = new Tablero(filas, columnas, mainPanel);

        this.evolucionarBtn = new JButton("Evolve");
        this.evolucionarBtn.setMargin(new Insets(10,10,10,10)); //agregar margen

        this.resetBtn = new JButton("Reset");
        this.resetBtn.setMargin(new Insets(10,10,10,10));

        detectarClickBotones();

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); //centrar el panel
        buttonPanel.add(evolucionarBtn);
        buttonPanel.add(resetBtn);
        buttonPanel.add(randomBtn);

        this.frame.add(mainPanel, BorderLayout.CENTER);
        this.frame.add(buttonPanel, BorderLayout.SOUTH);
    }

    private void detectarClickBotones(){
        this.evolucionarBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                tablero.actualizar();
            }
        });

        this.resetBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tablero.reset();
            }
        });

        this.randomBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tablero.random();
            }
        });
    }

    public void mostrarGui(){
        this.frame.setVisible(true);
    }

}
