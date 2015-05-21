package com.afr.coh.rsg;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

public class MainFrame
  extends JFrame implements ActionListener
{
  private static final long serialVersionUID = 2601875315263598602L;
  private JPanel contentPane;
  private JTextField pointsTextField;
  private JProgressBar progressBar;
  private Main main;
  private JTextArea generatorTextArea;
  private JCheckBox chckbxGermanyAtb;
  private JCheckBox chckbxGermanySos;
  private JCheckBox chckbxGermanyPoh;
  private JCheckBox chckbxRussiaAtb;
  private JCheckBox chckbxRussiaSos;
  private JCheckBox chckbxRussiaPoh;
  private JCheckBox chckbxPolandPoh;
  public JButton generateButton = new JButton("Generate");
  private JTable table;
  private JScrollPane scrollPane;
  
  public static void main(String[] args)
  {
    EventQueue.invokeLater(new MainFrame$1());
  }
  
  public void showOutput()
  {
    boolean russiaAtb = false;
    boolean germanyAtb = false;
    
    boolean russiaSos = false;
    boolean germanySos = false;
    
    boolean russiaPoh = false;
    boolean germanyPoh = false;
    boolean polandPoh = false;
    
    int pointsMax = Integer.valueOf(this.pointsTextField.getText()).intValue();
    if (this.chckbxRussiaAtb.isSelected()) {
      russiaAtb = true;
    }
    if (this.chckbxGermanyAtb.isSelected()) {
      germanyAtb = true;
    }
    if (this.chckbxRussiaSos.isSelected()) {
      russiaSos = true;
    }
    if (this.chckbxGermanySos.isSelected()) {
      germanySos = true;
    }
    if (this.chckbxRussiaPoh.isSelected()) {
      russiaPoh = true;
    }
    if (this.chckbxGermanyPoh.isSelected()) {
      germanyPoh = true;
    }
    if (this.chckbxPolandPoh.isSelected()) {
      polandPoh = true;
    }
    if (russiaAtb)
    {
      HashMap<String, Integer> unitsRussiaAtb = this.main.getRandomUnits("Russia ATB", pointsMax);
      this.generatorTextArea.setText(this.generatorTextArea.getText() + "Russia ATB:");
      for (String name : unitsRussiaAtb.keySet()) {
        this.generatorTextArea.setText(this.generatorTextArea.getText() + "\n" + "(x" + unitsRussiaAtb.get(name) + ") " + name);
      }
      this.generatorTextArea.setText(this.generatorTextArea.getText() + "\n\n");
    }
    if (germanyAtb)
    {
      HashMap<String, Integer> unitsGermanyAtb = this.main.getRandomUnits("Germany ATB", pointsMax);
      this.generatorTextArea.setText(this.generatorTextArea.getText() + "Germany ATB:");
      for (String name : unitsGermanyAtb.keySet()) {
        this.generatorTextArea.setText(this.generatorTextArea.getText() + "\n" + "(x" + unitsGermanyAtb.get(name) + ") " + name);
      }
      this.generatorTextArea.setText(this.generatorTextArea.getText() + "\n\n");
    }
    if (russiaSos)
    {
      HashMap<String, Integer> unitsRussiaSos = this.main.getRandomUnits("Russia SOS", pointsMax);
      this.generatorTextArea.setText(this.generatorTextArea.getText() + "Russia SOS:");
      for (String name : unitsRussiaSos.keySet()) {
        this.generatorTextArea.setText(this.generatorTextArea.getText() + "\n" + "(x" + unitsRussiaSos.get(name) + ") " + name);
      }
      this.generatorTextArea.setText(this.generatorTextArea.getText() + "\n\n");
    }
    if (germanySos)
    {
      HashMap<String, Integer> unitsGermanySos = this.main.getRandomUnits("Germany SOS", pointsMax);
      this.generatorTextArea.setText(this.generatorTextArea.getText() + "Germany SOS:");
      for (String name : unitsGermanySos.keySet()) {
        this.generatorTextArea.setText(this.generatorTextArea.getText() + "\n" + "(x" + unitsGermanySos.get(name) + ") " + name);
      }
      this.generatorTextArea.setText(this.generatorTextArea.getText() + "\n\n");
    }
    if (russiaPoh)
    {
      HashMap<String, Integer> unitsRussiaPoh = this.main.getRandomUnits("Russia POH", pointsMax);
      this.generatorTextArea.setText(this.generatorTextArea.getText() + "Russia POH:");
      for (String name : unitsRussiaPoh.keySet()) {
        this.generatorTextArea.setText(this.generatorTextArea.getText() + "\n" + "(x" + unitsRussiaPoh.get(name) + ") " + name);
      }
      this.generatorTextArea.setText(this.generatorTextArea.getText() + "\n\n");
    }
    if (germanyPoh)
    {
      HashMap<String, Integer> unitsGermanyPoh = this.main.getRandomUnits("Germany POH", pointsMax);
      this.generatorTextArea.setText(this.generatorTextArea.getText() + "Germany POH:");
      for (String name : unitsGermanyPoh.keySet()) {
        this.generatorTextArea.setText(this.generatorTextArea.getText() + "\n" + "(x" + unitsGermanyPoh.get(name) + ") " + name);
      }
      this.generatorTextArea.setText(this.generatorTextArea.getText() + "\n\n");
    }
    if (polandPoh)
    {
      HashMap<String, Integer> unitsPolandPoh = this.main.getRandomUnits("Poland POH", pointsMax);
      this.generatorTextArea.setText(this.generatorTextArea.getText() + "Poland POH:");
      for (String name : unitsPolandPoh.keySet()) {
        this.generatorTextArea.setText(this.generatorTextArea.getText() + "\n" + "(x" + unitsPolandPoh.get(name) + ") " + name);
      }
      this.generatorTextArea.setText(this.generatorTextArea.getText() + "\n\n");
    }
    this.generatorTextArea.setCaretPosition(0);
  }
  
  public MainFrame()
  {
    setTitle("COH Random Scenario Generator");
    setDefaultCloseOperation(3);
    setBounds(100, 100, 452, 479);
    this.contentPane = new JPanel();
    this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(this.contentPane);
    
    JTabbedPane tabbedPane = new JTabbedPane(1);
    GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
    gl_contentPane.setHorizontalGroup(
      gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(tabbedPane, -1, 426, 32767));
    
    gl_contentPane.setVerticalGroup(
      gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(tabbedPane, -1, 431, 32767));
    

    JPanel generatorPanel = new JPanel();
    tabbedPane.addTab("Generator", null, generatorPanel, null);
    
    this.chckbxGermanyAtb = new JCheckBox("Germany ATB");
    this.chckbxGermanyAtb.setSelected(true);
    
    JScrollPane generatorScrollPane = new JScrollPane();
    
    this.generatorTextArea = new JTextArea();
    this.generatorTextArea.setEditable(false);
    generatorScrollPane.setViewportView(this.generatorTextArea);
    
    this.chckbxGermanySos = new JCheckBox("Germany SOS");
    
    this.chckbxGermanyPoh = new JCheckBox("Germany POH");
    
    this.chckbxRussiaAtb = new JCheckBox("Russia ATB");
    this.chckbxRussiaAtb.setSelected(true);
    
    this.chckbxRussiaSos = new JCheckBox("Russia SOS");
    
    this.chckbxRussiaPoh = new JCheckBox("Russia POH");
    
    this.chckbxPolandPoh = new JCheckBox("Poland POH");
    
    JLabel lblPoints = new JLabel("Points:");
    
    this.pointsTextField = new JTextField();
    this.pointsTextField.setText("750");
    this.pointsTextField.setColumns(10);
    
    JButton generateButton = new JButton("Generate");
    
    generateButton.addActionListener(this);
    
























    this.progressBar = new JProgressBar();
    GroupLayout gl_generatorPanel = new GroupLayout(generatorPanel);
    gl_generatorPanel.setHorizontalGroup(
      gl_generatorPanel.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(gl_generatorPanel.createSequentialGroup()
      .addContainerGap()
      .addGroup(gl_generatorPanel.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.chckbxGermanyAtb)
      .addComponent(this.chckbxGermanySos)
      .addComponent(this.chckbxRussiaAtb)
      .addComponent(this.chckbxRussiaSos)
      .addComponent(this.chckbxRussiaPoh)
      .addComponent(this.chckbxGermanyPoh, -1, -1, 32767)
      .addGroup(gl_generatorPanel.createSequentialGroup()
      .addComponent(lblPoints)
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.pointsTextField, 0, 0, 32767))
      .addComponent(this.chckbxPolandPoh)
      .addComponent(generateButton)
      .addComponent(this.progressBar, 0, 0, 32767))
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(generatorScrollPane, -1, 308, 32767)));
    
    gl_generatorPanel.setVerticalGroup(
      gl_generatorPanel.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(gl_generatorPanel.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.chckbxGermanyAtb)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.chckbxGermanySos)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.chckbxGermanyPoh)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.chckbxRussiaAtb)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.chckbxRussiaSos)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.chckbxRussiaPoh)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.chckbxPolandPoh)
      .addGap(79)
      .addGroup(gl_generatorPanel.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(lblPoints)
      .addComponent(this.pointsTextField, -2, -1, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(generateButton)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 82, 32767)
      .addComponent(this.progressBar, -2, -1, -2)
      .addContainerGap())
      .addComponent(generatorScrollPane, -1, 403, 32767));
    
    generatorPanel.setLayout(gl_generatorPanel);
    
    JPanel pointCostPanel = new JPanel();
    tabbedPane.addTab("Point Cost", null, pointCostPanel, null);
    this.contentPane.setLayout(gl_contentPane);
    
    this.main = new Main();
    this.main.init();
    
    TableModel tableModel = new MainFrame$3(this, this.main.getMasterListCount() + 20, 2);
    








    int rowCount = 0;
    
    List<Unit> unitsRussiaAtb = this.main.getMasterList("Russia ATB");
    tableModel.setValueAt("<html><b>Russia ATB</b></html>", rowCount, 0);
    rowCount++;
    for (Unit unit : unitsRussiaAtb)
    {
      tableModel.setValueAt(unit.getName(), rowCount, 0);
      tableModel.setValueAt(Integer.valueOf(unit.getPoints()), rowCount, 1);
      rowCount++;
    }
    List<Unit> unitsGermanyAtb = this.main.getMasterList("Germany ATB");
    rowCount++;
    tableModel.setValueAt("<html><b>Germany ATB</b></html>", rowCount, 0);
    rowCount++;
    for (Unit unit : unitsGermanyAtb)
    {
      tableModel.setValueAt(unit.getName(), rowCount, 0);
      tableModel.setValueAt(Integer.valueOf(unit.getPoints()), rowCount, 1);
      rowCount++;
    }
    List unitsRussiaSos = this.main.getMasterList("Russia SOS");
    rowCount++;
    tableModel.setValueAt("<html><b>Russia SOS</b></html>", rowCount, 0);
    rowCount++;
    for (int i = 0; i < unitsRussiaSos.size(); i++) 
    {
     	Unit	unit  = (Unit)unitsRussiaSos.get(i);
      tableModel.setValueAt(unit.getName(), rowCount, 0);
      tableModel.setValueAt(Integer.valueOf(unit.getPoints()), rowCount, 1);
      rowCount++;
    }
    List unitsGermanySos = this.main.getMasterList("Germany SOS");
    rowCount++;
    tableModel.setValueAt("<html><b>Germany SOS</b></html>", rowCount, 0);
    rowCount++;
    for (int i = 0; i < unitsGermanySos.size(); i++) {
    	Unit	unit  = (Unit)unitsGermanySos.get(i);
	
      tableModel.setValueAt(unit.getName(), rowCount, 0);
      tableModel.setValueAt(Integer.valueOf(unit.getPoints()), rowCount, 1);
      rowCount++;
    }
    List unitsRussiaPoh = this.main.getMasterList("Russia POH");
    rowCount++;
    tableModel.setValueAt("<html><b>Russia POH</b></html>", rowCount, 0);
    rowCount++;
    for (int i = 0; i < unitsRussiaPoh.size(); i++) 
    {
    	Unit	unit  = (Unit)unitsRussiaPoh.get(i);
      tableModel.setValueAt(unit.getName(), rowCount, 0);
      tableModel.setValueAt(Integer.valueOf(unit.getPoints()), rowCount, 1);
      rowCount++;
    }
    List unitsGermanyPoh = this.main.getMasterList("Germany POH");
    rowCount++;
    tableModel.setValueAt("<html><b>Germany POH</b></html>", rowCount, 0);
    rowCount++;
    for (int i = 0; i < unitsGermanyPoh.size(); i++) 
    {
    	Unit	unit  = (Unit)unitsGermanyPoh.get(i);
      tableModel.setValueAt(unit.getName(), rowCount, 0);
      tableModel.setValueAt(Integer.valueOf(unit.getPoints()), rowCount, 1);
      rowCount++;
    }
    List unitsPolandPoh = this.main.getMasterList("Poland POH");
    rowCount++;
    tableModel.setValueAt("<html><b>Poland POH</b></html>", rowCount, 0);
    rowCount++;
    for (int i = 0; i < unitsPolandPoh.size(); i++) 
    {
    	Unit	unit  = (Unit)unitsPolandPoh.get(i);
      tableModel.setValueAt(unit.getName(), rowCount, 0);
      tableModel.setValueAt(Integer.valueOf(unit.getPoints()), rowCount, 1);
      rowCount++;
    }
    pointCostPanel.setLayout(new BoxLayout(pointCostPanel, 0));
    
    this.scrollPane = new JScrollPane();
    pointCostPanel.add(this.scrollPane);
    
    this.table = new JTable();
    this.scrollPane.setViewportView(this.table);
    
    this.table.setModel(tableModel);
    
    JTableHeader tableHeader = new JTableHeader();
    this.table.setTableHeader(tableHeader);
  }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton evento = (JButton)e.getSource();
	 if(evento.getText().equals(generateButton.getText())){
		 generatorTextArea.setText("");
		 this.main.init();
		 
		 showOutput();
	 }
}
}
