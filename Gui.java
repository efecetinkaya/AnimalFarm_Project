package animalfarm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop.Action;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

//buttonlar gözükmüyor, ardı ardına eklenen hayvanlardan ilki ready olmuyor,buton bir kez kullanılabiilyor.
public class Gui {

	public static void main(String[] args) {
		//ImageIcon image = new ImageIcon("images.jpg");
		
		ArrayList<Animal> currentAnimals = new ArrayList<>();
		JFrame frame = new JFrame();
		frame.setLayout(null);
		JPanel header = new JPanel();
		JPanel body = new JPanel();
		JPanel footer = new JPanel();
		JPanel tablopanel = new JPanel();
		JPanel buttons = new JPanel();
		frame.add(header);
		frame.add(body);
		frame.add(tablopanel);
		frame.add(buttons);
        
		frame.add(footer);
		
		JButton sellButton = new JButton();
		sellButton.setVisible(false);
		buttons.setLayout(null);
		DefaultTableModel model = new DefaultTableModel(); 
		JTable table = new JTable(model); 
		model.addColumn("Col1"); 
		model.addColumn("Col2"); 
	    table.setRowHeight(25);
//	    sutun1.setPreferredWidth(100);
//	    sutun2.setPreferredWidth(50);
	   
	    
	
		
		
		JLabel label1 = new JLabel("Welcome to the Animal Farm");
		label1.setLayout(null);
		label1.setForeground(Color.WHITE);
		label1.setBounds(90, 20, 170, 40);
		
		String yemsayisi = "10";
		JLabel yem = new JLabel("Current Forage:");
		yem.setLayout(null);
		yem.setForeground(Color.BLACK);
		yem.setBounds(300, 10, 100, 20);
		
		JLabel yemsayisilabel = new JLabel(yemsayisi);
		yemsayisilabel.setLayout(null);
		yemsayisilabel.setForeground(Color.BLACK);
		yemsayisilabel.setBounds(400, 10, 30, 20);
		
		String parasayisi = "100";
		JLabel para = new JLabel("Money:");
		para.setLayout(null);
		para.setForeground(Color.BLACK);
		para.setBounds(300, 50, 100, 15);
		
		JLabel paralabel = new JLabel(parasayisi);
		paralabel.setLayout(null);
		paralabel.setForeground(Color.BLACK);
		paralabel.setBounds(400, 50, 30, 15);
		
		JButton yemsatinal = new JButton("Buy Forage");
		yemsatinal.setLayout(null);
		yemsatinal.setBackground(Color.BLACK);
		yemsatinal.setForeground(Color.WHITE);
		yemsatinal.setBorderPainted(false);
		yemsatinal.setBounds(350, 70, 120, 20);
		
		
		
		
		JButton button1 = new JButton("Feed and Sell");
		button1.setBounds(0,0,150,25);
		button1.setEnabled(false);
		JButton button2 = new JButton("Feed and Sell");
		button2.setBounds(0,25,150,25);
		button2.setEnabled(false);
		JButton button3 = new JButton("Feed and Sell");
		button3.setBounds(0,50,150,25);
		button3.setEnabled(false);
		JButton button4 = new JButton("Feed and Sell");
		button4.setBounds(0,75,150,25);
		button4.setEnabled(false);
		JButton button5 = new JButton("Feed and Sell");
		button5.setBounds(0,100,150,25);
		button5.setEnabled(false);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		buttons.add(button1);
		buttons.add(button2);
		buttons.add(button3);
		buttons.add(button4);
		buttons.add(button5);
		
		yemsatinal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int parasayisi_int = Integer.parseInt(paralabel.getText());
				if(parasayisi_int>=10) {
					parasayisi_int-=10;
					int yemsayisi_int = Integer.parseInt(yemsayisilabel.getText());
					yemsayisi_int++;
					String yemSayisiString = String.valueOf(yemsayisi_int);
					
					yemsayisilabel.setText(yemSayisiString);
				}else {
					JOptionPane alert = new JOptionPane();
					alert.showMessageDialog(null, "Insufficent Balance");
				}
						
				String parasayisiString = String.valueOf(parasayisi_int);
				paralabel.setText(parasayisiString);
				
				
				};
		});
		
		JLabel production = new JLabel("Animals:");
		production.setForeground(Color.WHITE);
		production.setBounds(10, 10, 160, 20);
		
		JLabel sheep_time = new JLabel("Sheep - produces wool, production time = 5");
		sheep_time.setForeground(Color.WHITE);
		sheep_time.setBounds(10, 20, 300, 50);
		
		JLabel cow_time = new JLabel("Cow - produces milk, production time = 7");
		cow_time.setForeground(Color.WHITE);
		cow_time.setBounds(10, 20, 300, 100);
		
		JLabel chicken_time = new JLabel("Chicken - produces egg, production time = 3");
		chicken_time.setForeground(Color.WHITE);
		chicken_time.setBounds(10, 20, 300, 150);
		
		JLabel goat_time = new JLabel("Goat - produces wool, production time = 10");
		goat_time.setForeground(Color.WHITE);
		goat_time.setBounds(10, 20, 300, 200);
		
		JLabel animalLabel = new JLabel("Type of the animal:");
		JComboBox<String> animalText = new JComboBox<String>();
//		String abc = animalText.getSelectedItem().toString();
//		JTextField animalTextText = abc;
		
		animalText.addItem("sheep");
		animalText.addItem("cow");
		animalText.addItem("chicken");
		animalText.addItem("goat");
		animalLabel.setBounds(10, 20, 300, 250);
		animalText.setBounds(143, 135, 80, 20);
		
		JLabel ageLabel = new JLabel("Age of the animal:");
		JTextField ageText = new JTextField();
		ageLabel.setBounds(10, 20, 300, 300);
		ageText.setBounds(143, 160, 80, 20);
		
		
		
		JLabel genderLabel = new JLabel("Gender of the animal:");
		JComboBox<String> genderText = new JComboBox<String>();
		
		genderText.addItem("male");
		genderText.addItem("female");
		
		
		genderLabel.setBounds(10, 20, 300, 350);
		genderText.setBounds(143, 185, 80, 20);
		
		JButton saveBotton = new JButton("Save");
		saveBotton.setBackground(Color.DARK_GRAY);
		saveBotton.setBorderPainted(false);
		saveBotton.setForeground(Color.white);
		saveBotton.setBounds(230,207,65,20);
		

		
		
		
		JLabel animalList = new JLabel();
		animalList.setBounds(10,200,1000,100);
		
		saveBotton.doClick();
		saveBotton.addActionListener(new ActionListener() {
			boolean alertOccured = false;

			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				table.add(parasayisi, animalList);//columnları just in time ekle ve içindeki nesneyi onunla özdeşleştir.
				 Animal animal = new Animal() {
					
					@Override
					public void obtainProduct() {
						// TODO Auto-generated method stub
						
					}
				};
				
				switch (animalText.getSelectedItem().toString()) {
				case "sheep":
					animal = new Sheep(Integer.parseInt(ageText.getText().toString()), animalText.getSelectedItem().toString(), genderText.getSelectedItem().toString());
					break;
				case "cow":
					animal = new Cow(Integer.parseInt(ageText.getText().toString()), animalText.getSelectedItem().toString(), genderText.getSelectedItem().toString());
					break;
				case "chicken":
					animal = new Chicken(Integer.parseInt(ageText.getText().toString()), animalText.getSelectedItem().toString(),genderText.getSelectedItem().toString());
					break;
				case "goat":
					animal = new Goat(Integer.parseInt(ageText.getText().toString()), animalText.getSelectedItem().toString(), genderText.getSelectedItem().toString());
					break;

				default:
					JOptionPane alert = new JOptionPane();
					alert.showMessageDialog(null, "Unvalid animal type");
					alertOccured = true;
					break;
				}

				if (!alertOccured) {
					
					JOptionPane panelimiz = new JOptionPane();
					panelimiz.showMessageDialog(null, "Record is saved");
					
					currentAnimals.add(animal);
					
					
					currentAnimals.get(currentAnimals.size()-1).setType(animalText);
				    currentAnimals.get(currentAnimals.size()-1).setAge(ageText); //aşağıdaki getText()ler silindi
					currentAnimals.get(currentAnimals.size()-1).setGender(genderText);
					
					String hayvanbilgi = ( currentAnimals.get(currentAnimals.size()-1).getType()+" "+currentAnimals.get(currentAnimals.size()-1).age.getText()+" "+currentAnimals.get(currentAnimals.size()-1).getGender());
					System.out.println(hayvanbilgi);
					
					model.addRow(new Object[]{hayvanbilgi, "not ready"});
					//table.setValueAt(hayvanbilgi, currentAnimals.size()-1, 0);
					//table.setValueAt("not ready", currentAnimals.size()-1, 1);
					
					System.out.println(currentAnimals.get(currentAnimals.size()-1).type+" "+currentAnimals.get(currentAnimals.size()-1).age+" "+currentAnimals.get(currentAnimals.size()-1).gender);
					final Animal animal_copy = animal;
					//animalList.setText( animalList.getText()+" " + currentAnimals.get(currentAnimals.size()-1).type +" "+currentAnimals.get(currentAnimals.size()-1).age+" "+currentAnimals.get(currentAnimals.size()-1).gender);
					
					ArrayList<JButton> listOfButtons = new ArrayList<>();
					listOfButtons.add(button1);
					listOfButtons.add(button2);
					listOfButtons.add(button3);
					listOfButtons.add(button4);
					listOfButtons.add(button5);
					
					
				 
					for(JButton btn : listOfButtons ) {
						btn.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								int yemsayisi_int = Integer.parseInt(yemsayisilabel.getText());
								if(yemsayisi_int>0) {
								yemsayisi_int--;
								String yemSayisiString = String.valueOf(yemsayisi_int);
								yemsayisilabel.setText(yemSayisiString);
								int parasayisi_int = Integer.parseInt(paralabel.getText());
								 
								switch (animal_copy.getType()){
								case "sheep": 
									parasayisi_int+=Sheep.sellPrice;
									break;
								case "cow":
									parasayisi_int+=Cow.sellPrice;
									break;
								case "chicken":
									parasayisi_int+=Chicken.sellPrice;
									break;
								case "goat":
									parasayisi_int+=Goat.sellPrice;
									break;
								default:
									
								}
								
								String parasayisiString = String.valueOf(parasayisi_int);
								paralabel.setText(parasayisiString);
								button1.setEnabled(false);
								
								}else {
									JOptionPane alert = new JOptionPane();
									alert.showMessageDialog(null, "Insufficent Forage");
									
								}
								
							}
							
						});
					}
						
						
						
					
					
					
					
					switch (animal.type.getSelectedItem().toString()) {
					case "sheep": {
						
					    Timer myTimer = new Timer();
						TimerTask gorev = new TimerTask() {
							
							@Override
							public void run() {
								
								table.setValueAt(" ready", currentAnimals.size()-1, 1);
								listOfButtons.get(currentAnimals.size()-1).setEnabled(true);
	 							System.out.println("deneme123");
	
							}
						};
						myTimer.schedule(gorev, Sheep.productionTime);
//						
						break;
					}
					case "cow": {
						
						Timer myTimer = new Timer();
						TimerTask gorev = new TimerTask() {
							
							@Override
							public void run() {
								
								
								table.setValueAt(" ready", currentAnimals.size()-1, 1);
								listOfButtons.get(currentAnimals.size()-1).setEnabled(true);
	 							System.out.println("deneme123");
							}
						};
						myTimer.schedule(gorev,Cow.productionTime);
//						
						break;
					}
					case "chicken": {
						
						Timer myTimer = new Timer();
						TimerTask gorev = new TimerTask() {
							
							@Override
							public void run() {
								
								
								table.setValueAt(" ready", currentAnimals.size()-1, 1);
								listOfButtons.get(currentAnimals.size()-1).setEnabled(true);
	 							System.out.println("deneme123");
							}
						};
						myTimer.schedule(gorev,Chicken.productionTime);
//						
						break;
					}
					case "goat": {
						
						Timer myTimer = new Timer();
						TimerTask gorev = new TimerTask() {
							
							@Override
							public void run() {
								
								
								table.setValueAt(" ready", currentAnimals.size()-1, 1);
								listOfButtons.get(currentAnimals.size()-1).setEnabled(true);
	 							System.out.println("deneme123");
							}
						};
						
						myTimer.schedule(gorev,Goat.productionTime);
//						
						break;
					}
					
					default:
						
					}
					
//					sellButton.setBounds(20,20,6,2);
//					sellButton.setVisible(false);
//					sellButton.setBackground(Color.blue);
//					sellButton.setBorderPainted(false);
//					sellButton.setForeground(Color.white);
					
					
//					animal = null;
					//animalList.setText(currentAnimals.get(i).type.getText() +" "+currentAnimals.get(i).age.getText()+" "+currentAnimals.get(i).gender.getText());
					
//					System.out.println(currentAnimals.size()-1);
					
				}
				
				
			}
			
		});

	JLabel currentAnimalsHeader = new JLabel(
			"Current Animals:");currentAnimalsHeader.setForeground(Color.WHITE);currentAnimalsHeader.setBounds(10,180,100,100);

	header.setBackground(Color.darkGray);header.setBounds(0,0,1000,75);header.setLayout(new BorderLayout());

	body.setBackground(new Color(182,182,182));body.setBounds(0,75,1000,250);body.setLayout(new BorderLayout());

	tablopanel.setBackground(Color.BLUE);tablopanel.setBounds(0,330,300,250);tablopanel.setLayout(new BorderLayout());

	buttons.setBackground(Color.orange);buttons.setBounds(300,330,300,250);buttons.setLayout(new BorderLayout());

//		footer.setBackground(Color.darkGray);
//	    footer.setBounds(0, 120, 1000, 1000);
//		footer.setLayout(new BorderLayout());
//		

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);frame.setSize(500,500);frame.setVisible(true);frame.setResizable(true);

	header.add(label1);

	body.add(yem);body.add(yemsayisilabel);body.add(para);body.add(paralabel);body.add(yemsatinal);

	body.add(saveBotton);body.add(production);body.add(sheep_time);body.add(cow_time);body.add(chicken_time);body.add(goat_time);body.add(animalLabel);body.add(animalText);body.add(ageLabel);body.add(ageText);body.add(genderLabel);body.add(genderText);body.add(currentAnimalsHeader);body.add(animalList);body.setLayout(new BorderLayout());body.setLayout(new BorderLayout());body.add(sellButton);tablopanel.add(table);

}

}
