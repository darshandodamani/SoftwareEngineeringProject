
//Java Program to Calculate BMI and recommend diet
//Authors: Chidiebere Emmanuel Uhegbu, Darshan Dodamani, Midhun Kanadan
//Software Engineering Project Submission 2_Group 28

//Category	BMI Range
//severely underweight < 15

//Underweight	< 18.5
//Normal	18.5 - 25
//Overweight	25 - 30
//Obese	> 30
//

package Calculation;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;


public class CalculateBMI {

  private JFrame frame;
  private JTextField textField;
  private JTextField textField_1;
  private JTextField textField_2;

  String height="",weight="",gen="",BMI="",age="",unit="",diet="",diet_output="";
  private ButtonGroup gengp;
  private ButtonGroup unitgp;
  private ButtonGroup dietgp;
  public JRadioButton rdbtnMale;
  public JRadioButton rdbtnMetric;
  public JRadioButton rdbtnVegetarian;


  /**
   * Launch the application.
   */
  public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
          public void run() {
              try {
                  CalculateBMI window = new CalculateBMI();
                  window.frame.setVisible(true);
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }
      });
  }

  /**
   * Create the application.
   */
  public CalculateBMI() {
      initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  public void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 340, 440);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);

      JLabel lblNewLabel = new JLabel("BMI CALCULATOR");
      lblNewLabel.setBounds(100, 12, 142, 33);
      frame.getContentPane().add(lblNewLabel);

      // Age
      JLabel lblAge1 = new JLabel("Age");
      lblAge1.setBounds(25, 57, 87, 15);
      frame.getContentPane().add(lblAge1);

      textField_2 = new JTextField();
      textField_2.setBounds(113, 57, 87, 19);
      frame.getContentPane().add(textField_2);
      textField_2.setColumns(10);

      //Gender

      JLabel lblGender = new JLabel("Gender");
      lblGender.setBounds(25, 90, 70, 15);
      frame.getContentPane().add(lblGender);

      rdbtnMale = new JRadioButton("Male");
      rdbtnMale.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              gen="Male";
          }
      });
      rdbtnMale.setBounds(25, 109, 70, 23);
      frame.getContentPane().add(rdbtnMale);



      JRadioButton rdbtnFemale = new JRadioButton("Female");
      rdbtnFemale.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              gen="Female";
          }
      });
      rdbtnFemale.setBounds(99, 109, 87, 23);
      frame.getContentPane().add(rdbtnFemale);

      JRadioButton rdbtnOther = new JRadioButton("Other");
      rdbtnOther.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              gen="Other";
          }
      });
      rdbtnOther.setBounds(183, 109, 81, 23);
      frame.getContentPane().add(rdbtnOther);
      gengp = new ButtonGroup();
      gengp.add(rdbtnMale);
      gengp.add(rdbtnFemale);
      gengp.add(rdbtnOther);

      /**
       * Unit.
       */

      JLabel lblUnit = new JLabel("Unit");
      lblUnit.setBounds(25, 144, 70, 15);
      frame.getContentPane().add(lblUnit);

      rdbtnMetric = new JRadioButton("Metric (cm, kg)");
      rdbtnMetric.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              unit="Metric (cm, kg)";
          }
      });
      rdbtnMetric.setBounds(25, 163, 130, 23);
      frame.getContentPane().add(rdbtnMetric);

      JRadioButton rdbtnImperial = new JRadioButton("Imperial (in, lb)");
      rdbtnImperial.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {unit="Imperial (in, lb)";
          }
      });
      rdbtnImperial.setBounds(170, 163, 150, 23);
      frame.getContentPane().add(rdbtnImperial);

      unitgp = new ButtonGroup();
      unitgp.add(rdbtnMetric);
      unitgp.add(rdbtnImperial);


      /**
       * Height
       */
      JLabel lblHeight = new JLabel("Height");
      lblHeight.setBounds(25, 203, 87, 15);
      frame.getContentPane().add(lblHeight);

      textField = new JTextField();
      textField.setBounds(113, 203, 87, 19);
      frame.getContentPane().add(textField);
      textField.setColumns(10);

      /**
       * Weight
       */
      JLabel lblWeight = new JLabel("Weight");
      lblWeight.setBounds(25, 233, 87, 15);
      frame.getContentPane().add(lblWeight);

      textField_1 = new JTextField();
      textField_1.setColumns(10);
      textField_1.setBounds(113, 233, 87, 19);
      frame.getContentPane().add(textField_1);

      /**
       * Diet Plan
       */
      JLabel lblDietPlan = new JLabel("Diet Plan");
      lblDietPlan.setBounds(25, 275, 70, 15);
      frame.getContentPane().add(lblDietPlan);

      rdbtnVegetarian = new JRadioButton("Vegetarian");
      rdbtnVegetarian.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              diet="Vegetarian";
          }
      });
      rdbtnVegetarian.setBounds(25, 300, 130, 23);
      frame.getContentPane().add(rdbtnVegetarian);

      JRadioButton rdbtnNonVegetarian = new JRadioButton("Non-Vegetarian");
      rdbtnNonVegetarian.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              diet="Non-Vegetarian";
          }
      });
      rdbtnNonVegetarian.setBounds(170, 300, 150, 23);
      frame.getContentPane().add(rdbtnNonVegetarian);

      dietgp = new ButtonGroup();
      dietgp.add(rdbtnVegetarian);
      dietgp.add(rdbtnNonVegetarian);


      JButton btnSubmit = new JButton("Submit");
      btnSubmit.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
              calculate_bmi();
          }
      });
      btnSubmit.setBounds(20, 342, 92, 25);
      frame.getContentPane().add(btnSubmit);

      JButton btnReset = new JButton("Reset");

      btnReset.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              height="";
              weight="";
              BMI="";
              gen="";
              unit="";
              diet="";
              textField.setText("");
              textField_1.setText("");
              textField_2.setText(" ");
              rdbtnMale.setSelected(true);
          }
      });
      btnReset.setBounds(172, 342, 92, 25);
      frame.getContentPane().add(btnReset);
  }
  public void calculate_bmi() {
      if(textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || gen.isEmpty())
      {error();
          return;
      }
      double h,w,r;

      var unitSelection= rdbtnMetric.isSelected();
      var dietSelection= rdbtnVegetarian.isSelected();

      height = textField.getText();
      weight = textField_1.getText();
      age = textField_2.getText();
      h=Double.parseDouble(height);
      w=Double.parseDouble(weight);
      r=w/Math.pow((h), 2);

      if (unitSelection) {
          r=r*10000;
      }
      else{
          r = r*703;
      }

      DecimalFormat df = new DecimalFormat("###.##");
      BMI="";
      BMI+=String.valueOf(df.format(r));

      if (r < 15)
          BMI+="\t Very Severely underweight. \nYou are severely thin and need to gain weight. Please take care of your health properly.  \nFollow proper diet.";
      else if (r < 16)
          BMI+="\t Severely underweight \nYou are severely thin and need to gain weight. Please take care of your health properly.  \nFollow proper diet.";
      else if (r < 18.5)
          BMI+="\t  Underweight \n You have a lower than normal body weight.\n You can eat a it more.";
      else if (r < 25)
          BMI+="\t Normal \n You have normal body weight.\n Good Job!.";
      else if (r < 30)
          BMI+="\t Overweight \n You have a higher than normal body weight. \nTry to exercise more.";
      else
          BMI+="\t Obese \n You need to be fit! Please keep your health properly with regular exercise..";

      JFrame f =new JFrame();
      JOptionPane.showMessageDialog(f,BMI);


      if (dietSelection){
          if (r<25){
              diet_output = "Vegetarian Diet Plan: \n Breakfast: 50g whole grain cereal with 1 cup almond milk and a handful of walnut, 50g oatmeal porridge, 1 tablespoon flax seed, 1 medium banana. \n Lunch: 1 cup cooked rice, 1 cup non starchy vegetable. \n Dinner: 1 cup lentil curry with 2 wheat naan bread 150g scrambled tofu."  ;
          }
          else if (r<25){
              diet_output = "Vegetarian Diet Plan: \n Breakfast: 50g whole grain cereal with 1 cup almond milk and a handful of walnut, 50g oatmeal porridge, 1 tablespoon flax seed, 1 medium banana. \n Lunch: 1 cup cooked rice, 1 cup non starchy vegetable. \n Dinner: 1 cup lentil curry with 2 wheat naan bread 150g scrambled tofu."  ;
          }
          else if(r<30){
              diet_output = "Vegetarian Diet Plan: \n Breakfast: 500ml green smoothie, 1 cup spinach, 1 small banana, 1 cup almond milk, 1 tablespoon flaxseed, 1/2 an apple, 1/4 an avocado. \n Lunch: 1 cup cooked rice, 1 cup cooked rice, 1 cup non starchy vegetable. \n Dinner: 1 cup lentil curry with 1 wheat naan bread 150g scrambled tofu."  ;
          }
          else{
              diet_output ="Vegetarian Diet Plan:  \n Breakfast:  500ml green smoothie, 500ml green smoothie, 1 small banana, 1 cup almond milk. \n Lunch: 1/2 cup cooked rice, 2 cups salad vegetables. \n Dinner: 1 wheat naan bread, 1  cup lentil curry with";
          }
      }
      else{
          if (r<25){
              diet_output= "Non-Vegetarian Diet Plan: \n Breakfast:  2 scrambled eggs, 50g oatmeal porridge. \n Lunch: 1 cup cooked rice, 1/2 cup lentil chicken curry. \n Dinner: Chicken tortilla wrap.";
          }
          else if (r<25){
              diet_output = "Non-Vegetarian Diet Plan: \n Breakfast: 2 scrambled eggs, 50g oatmeal porridge. \n Lunch: 1 cup cooked rice, 1/2 cup lentil chicken curry. \n Dinner: Chicken tortilla wrap.";
          }
          else if(r<30){
              diet_output = "Non-Vegetarian Diet Plan: \n Breakfast: 2 boiled eggs, 40g oatmeal porridge. \n Lunch: Chicken and avocado salad, 100gms grilled chicken breast. \n Dinner: Chicken soup.";
          }
          else{
              diet_output = "Non-Vegetarian Diet Plan: \n Breakfast: 2 boiled eggs, 2 boiled eggs. \n Lunch: Chicken and avocado salad, 100gms grilled chicken breast. \n Dinner: Chicken Soup."  ;
          }
      }

      JFrame f1 =new JFrame();
      JOptionPane.showMessageDialog(f1,diet_output);

  }
  public void error() {
      JFrame f =new JFrame();
      JOptionPane.showMessageDialog(f,"Fill all the details","Alert",JOptionPane.WARNING_MESSAGE);
  }
}