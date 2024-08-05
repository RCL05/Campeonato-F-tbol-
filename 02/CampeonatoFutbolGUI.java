package com.mycompany.campeonatofutbol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CampeonatoFutbolGUI extends JFrame {
    private JTextField nombreCampeonatoField;
    private JTextField fechaInicioField;
    private JTextField fechaFinField;
    private JTextField nombreEquipoField;
    private JTextField colorUniformeEquipoField;
    private JTextField nombreJugadorField;
    private JTextField golesField;
    private JTextField asistenciasField;
    private JTextField nombreArbitroField;
    private JTextField numeroLicenciaArbitroField;
    private JComboBox<String> equipo1ComboBox;
    private JComboBox<String> equipo2ComboBox;
    private JTextArea resultadoArea;

    private List<Equipo> equipos;
    private List<Arbitro> arbitros;

    public CampeonatoFutbolGUI() {
        equipos = new ArrayList<>();
        arbitros = new ArrayList<>();

        setTitle("Campeonato de Fútbol");
        setSize(700, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(0, 1, 10, 10));
        add(mainPanel, BorderLayout.CENTER);

        // Panel para los datos del campeonato
        JPanel campeonatoPanel = createPanel("Datos del Campeonato");
        mainPanel.add(campeonatoPanel);

        campeonatoPanel.add(createLabel("Nombre del Campeonato:"));
        nombreCampeonatoField = new JTextField(20);
        campeonatoPanel.add(nombreCampeonatoField);

        campeonatoPanel.add(createLabel("Fecha de Inicio (dd/MM/yyyy):"));
        fechaInicioField = new JTextField(20);
        campeonatoPanel.add(fechaInicioField);

        campeonatoPanel.add(createLabel("Fecha de Fin (dd/MM/yyyy):"));
        fechaFinField = new JTextField(20);
        campeonatoPanel.add(fechaFinField);

        // Panel para los datos del equipo
        JPanel equipoPanel = createPanel("Datos del Equipo");
        mainPanel.add(equipoPanel);

        equipoPanel.add(createLabel("Nombre del Equipo:"));
        nombreEquipoField = new JTextField(20);
        equipoPanel.add(nombreEquipoField);

        equipoPanel.add(createLabel("Color Uniforme del Equipo:"));
        colorUniformeEquipoField = new JTextField(20);
        equipoPanel.add(colorUniformeEquipoField);

        JButton addEquipoButton = new JButton("Añadir Equipo");
        equipoPanel.add(addEquipoButton);
        addEquipoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEquipo();
            }
        });

        // Panel para los datos del jugador
        JPanel jugadorPanel = createPanel("Datos del Jugador");
        mainPanel.add(jugadorPanel);

        jugadorPanel.add(createLabel("Nombre del Jugador:"));
        nombreJugadorField = new JTextField(20);
        jugadorPanel.add(nombreJugadorField);

        jugadorPanel.add(createLabel("Goles:"));
        golesField = new JTextField(5);
        jugadorPanel.add(golesField);

        jugadorPanel.add(createLabel("Asistencias:"));
        asistenciasField = new JTextField(5);
        jugadorPanel.add(asistenciasField);

        JButton addJugadorButton = new JButton("Añadir Jugador");
        jugadorPanel.add(addJugadorButton);
        addJugadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addJugador();
            }
        });

        // Panel para los datos del árbitro
        JPanel arbitroPanel = createPanel("Datos del Árbitro");
        mainPanel.add(arbitroPanel);

        arbitroPanel.add(createLabel("Nombre del Árbitro:"));
        nombreArbitroField = new JTextField(20);
        arbitroPanel.add(nombreArbitroField);

        arbitroPanel.add(createLabel("Número de Licencia:"));
        numeroLicenciaArbitroField = new JTextField(10);
        arbitroPanel.add(numeroLicenciaArbitroField);

        JButton addArbitroButton = new JButton("Añadir Árbitro");
        arbitroPanel.add(addArbitroButton);
        addArbitroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addArbitro();
            }
        });

        // Panel para los encuentros
        JPanel encuentroPanel = createPanel("Generar Encuentro");
        mainPanel.add(encuentroPanel);

        encuentroPanel.add(createLabel("Equipo 1:"));
        equipo1ComboBox = new JComboBox<>();
        encuentroPanel.add(equipo1ComboBox);

        encuentroPanel.add(createLabel("Equipo 2:"));
        equipo2ComboBox = new JComboBox<>();
        encuentroPanel.add(equipo2ComboBox);

        JButton generarEncuentroButton = new JButton("Generar Encuentro");
        encuentroPanel.add(generarEncuentroButton);
        generarEncuentroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarEncuentro();
            }
        });

        // Área para mostrar resultados
        JPanel resultadoPanel = new JPanel();
        resultadoPanel.setLayout(new BorderLayout());
        resultadoArea = new JTextArea(10, 50);
        resultadoArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultadoArea);
        resultadoPanel.add(scrollPane, BorderLayout.CENTER);

        JButton generarCampeonatoButton = new JButton("Generar Campeonato");
        resultadoPanel.add(generarCampeonatoButton, BorderLayout.SOUTH);
        generarCampeonatoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarCampeonato();
            }
        });

        add(resultadoPanel, BorderLayout.SOUTH);
    }

    private JPanel createPanel(String title) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 10));
        panel.setBorder(BorderFactory.createTitledBorder(title));
        return panel;
    }

    private JLabel createLabel(String text) {
        return new JLabel(text);
    }

    private void addEquipo() {
        String nombreEquipo = nombreEquipoField.getText();
        String colorUniforme = colorUniformeEquipoField.getText();
        if (!nombreEquipo.isEmpty() && !colorUniforme.isEmpty()) {
            Equipo equipo = new Equipo();
            equipo.setNombreEquipo(nombreEquipo);
            equipo.setColorUniforme(colorUniforme);
            equipos.add(equipo);
            equipo1ComboBox.addItem(nombreEquipo);
            equipo2ComboBox.addItem(nombreEquipo);
            nombreEquipoField.setText("");
            colorUniformeEquipoField.setText("");
            resultadoArea.append("Equipo añadido: " + nombreEquipo + "\n");
        } else {
            resultadoArea.append("Por favor, complete los datos del equipo.\n");
        }
    }

    private void addJugador() {
        String nombreJugador = nombreJugadorField.getText();
        int goles = Integer.parseInt(golesField.getText());
        int asistencias = Integer.parseInt(asistenciasField.getText());

        if (!nombreJugador.isEmpty()) {
            Jugador jugador = new Jugador();
            jugador.setNombre(nombreJugador);
            jugador.setEstadisticas(new Estadisticas());
            jugador.getEstadisticas().setGoles(goles);
            jugador.getEstadisticas().setAsistencias(asistencias);

            String nombreEquipo = (String) equipo1ComboBox.getSelectedItem();
            for (Equipo equipo : equipos) {
                if (equipo.getNombreEquipo().equals(nombreEquipo)) {
                    equipo.getJugadores().add(jugador);
                    break;
                }
            }

            nombreJugadorField.setText("");
            golesField.setText("");
            asistenciasField.setText("");
            resultadoArea.append("Jugador añadido: " + nombreJugador + " al equipo " + nombreEquipo + "\n");
        } else {
            resultadoArea.append("Por favor, complete los datos del jugador.\n");
        }
    }

    private void addArbitro() {
        String nombreArbitro = nombreArbitroField.getText();
        int numeroLicencia = Integer.parseInt(numeroLicenciaArbitroField.getText());
        if (!nombreArbitro.isEmpty() && numeroLicencia > 0) {
            Arbitro arbitro = new Arbitro();
            arbitro.setNombre(nombreArbitro);
            arbitro.setNumeroLicencia(numeroLicencia);
            arbitros.add(arbitro);
            nombreArbitroField.setText("");
            numeroLicenciaArbitroField.setText("");
            resultadoArea.append("Árbitro añadido: " + nombreArbitro + "\n");
        } else {
            resultadoArea.append("Por favor, complete los datos del árbitro.\n");
        }
    }

    private void generarEncuentro() {
        String equipo1 = (String) equipo1ComboBox.getSelectedItem();
        String equipo2 = (String) equipo2ComboBox.getSelectedItem();
        if (equipo1 != null && equipo2 != null && !equipo1.equals(equipo2)) {
            Encuentro encuentro = new Encuentro();
            encuentro.setEquipo1(equipo1);
            encuentro.setEquipo2(equipo2);
            encuentro.setArbitro(arbitros.get(0)); // Seleccionamos el primer árbitro para simplificar

            resultadoArea.append("Encuentro generado: " + equipo1 + " vs " + equipo2 + "\n");
        } else {
            resultadoArea.append("Por favor, seleccione equipos diferentes para el encuentro.\n");
        }
    }

    private void generarCampeonato() {
        try {
            Campeonato campeonato = new Campeonato();
            campeonato.setNombreCampeonato(nombreCampeonatoField.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            campeonato.setFechaInicio(sdf.parse(fechaInicioField.getText()));
            campeonato.setFechaFin(sdf.parse(fechaFinField.getText()));
            campeonato.setEquipoList(equipos);
            campeonato.setArbitros(arbitros);

            // Aquí puedes agregar la lógica para generar el calendario, resultados, etc.

            resultadoArea.append("Campeonato generado: " + campeonato.getNombreCampeonato() + "\n");
        } catch (Exception ex) {
            resultadoArea.append("Error: " + ex.getMessage() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CampeonatoFutbolGUI().setVisible(true);
            }
        });
    }
}
