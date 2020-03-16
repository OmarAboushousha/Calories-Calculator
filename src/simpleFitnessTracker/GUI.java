package simpleFitnessTracker;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUI extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		
		Activity activity = new Activity();
		  
		Text title1 = new Text("FITNESS TRACKER");
		title1.setFill(Color.BLACK);
		title1.setFont(Font.font(null, FontWeight.BOLD, 32));
		title1.setX(115);
		title1.setY(30);
		
		Text title2 = new Text("ACTIVITIES");
		title2.setFill(Color.BLACK);
		title2.setFont(Font.font(null, FontWeight.BOLD, 32));
		title2.setX(170);
		title2.setY(30);
		
		Text title3 = new Text("ACTIVITY RESULTS");
		title3.setFill(Color.BLACK);
		title3.setFont(Font.font(null, FontWeight.BOLD, 32));
		title3.setX(110);
		title3.setY(30);
		
		Button button1 = new Button();
		button1.setText("Add Activity");
		button1.setLayoutY(70);
		
		Button button2 = new Button();
		button2.setText("Get Results");
		button2.setLayoutY(105);
		
		Button button3 = new Button();
		button3.setText("Exit");
		button3.setLayoutY(140);
		
		Button button4 = new Button();
		button4.setText("Yes");
		button4.setLayoutY(70);
		button4.setVisible(false);
		
		Button button5 = new Button();
		button5.setText("No");
		button5.setLayoutY(105);
		button5.setVisible(false);
		
		Button button6 = new Button();
		button6.setText("Return To Main Menu");
		button6.setLayoutX(280);
		button6.setLayoutY(44);
		button6.setVisible(false);
		
		Text text1 = new Text("Choose an option:");
		text1.setFill(Color.BLACK);
		text1.setFont(Font.font(null, FontWeight.NORMAL, 14));
		text1.setY(60);
		  
		Text text2 = new Text(); 
		text2.setFill(Color.BLACK);
		text2.setFont(Font.font(null, FontWeight.NORMAL, 14));
		text2.setY(60);
			
		Text text3 = new Text(); 
		text3.setFill(Color.BLACK);
		text3.setFont(Font.font(null, FontWeight.NORMAL, 14));
		text3.setY(95);
			
		Text text4 = new Text(); 
		text4.setFill(Color.BLACK);
		text4.setFont(Font.font(null, FontWeight.NORMAL, 14));
		text4.setY(115);
		
		Text text5 = new Text(); 
		text5.setFill(Color.BLACK);
		text5.setFont(Font.font(null, FontWeight.NORMAL, 14));
		text5.setY(170);
		
		Text text6 = new Text(); 
		text6.setFill(Color.BLACK);
		text6.setFont(Font.font(null, FontWeight.NORMAL, 14));
		text6.setY(60);
		
		Text text7 = new Text(); 
		text7.setFill(Color.BLACK);
		text7.setFont(Font.font(null, FontWeight.NORMAL, 14));
		text7.setY(189);
		
		Text text8 = new Text();
		text8.setFill(Color.BLACK);
		text8.setFont(Font.font(null, FontWeight.NORMAL, 14));
		text8.setY(60);
		
		Text result = new Text();
		result.setFill(Color.BLACK);
		result.setFont(Font.font(null, FontWeight.NORMAL, 14));
		result.setY(130);
			
		TextField userTextField = new TextField();
		userTextField.setLayoutX(275);
		userTextField.setLayoutY(79);
		userTextField.setVisible(false);
		
		Stage thirdStage = new Stage();
		Group root3 = new Group(text8, title3);
		
		thirdStage.setTitle("ACTIVITY RESULTS");
		thirdStage.setScene(new Scene(root3, 500, 500));
		
		String activities[] = {"Swimming", "Running", "Kick Boxing", "Strength Training"};
		
		ComboBox<String> menu = new ComboBox<String>(FXCollections.observableArrayList(activities));
		
		menu.setLayoutX(120);
		menu.setLayoutY(44);
		menu.setVisible(false);
		
		button1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				text1.setVisible(false);
				text3.setVisible(false);
				text4.setVisible(false);
				text5.setVisible(false);
				text6.setVisible(false);
				text7.setVisible(false);
				button1.setVisible(false);
				button2.setVisible(false);
				button3.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
				userTextField.setVisible(false);
				result.setVisible(true);
				result.setText(null);
				button6.setVisible(true);
				button6.setOnAction(new EventHandler<ActionEvent>() {
			
					@Override
					public void handle(ActionEvent event) {
						text1.setVisible(true);
						button1.setVisible(true);
						button2.setVisible(true);
						button3.setVisible(true);
						menu.setVisible(false);
						text2.setVisible(false);
						text3.setVisible(false);
						text4.setVisible(false);
						text5.setVisible(false);
						text6.setVisible(false);
						text7.setVisible(false);
						button4.setVisible(false);
						button5.setVisible(false);
						userTextField.setVisible(false);
						button6.setVisible(false);
						result.setVisible(false);
					}
				});
				menu.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent event) {
					
						text3.setVisible(false);
						userTextField.setVisible(false);
					}
				});
				text2.setVisible(true);
				text2.setText("Choose an activity:");
				menu.setVisible(true);
				menu.setValue("None");
				menu.setOnAction(new EventHandler<ActionEvent>() {
			
					@Override
					public void handle(ActionEvent event) {
					
						text3.setVisible(true);
						text3.setText("Enter the duration of the activity in minutes:");
						userTextField.setVisible(true);
						userTextField.setText("");
						userTextField.setOnAction(new EventHandler<ActionEvent>() {

							@Override
							public void handle(ActionEvent event) {
							
								if(userTextField.getText().contains("-")
								|| userTextField.getText().equals("0")
								|| userTextField.getText().equals("")
								|| (userTextField.getText().contains("0") == false
									&& userTextField.getText().contains("1") == false
									&& userTextField.getText().contains("2") == false
									&& userTextField.getText().contains("3") == false
									&& userTextField.getText().contains("4") == false
									&& userTextField.getText().contains("5") == false
									&& userTextField.getText().contains("6") == false
									&& userTextField.getText().contains("7") == false
									&& userTextField.getText().contains("8") == false
									&& userTextField.getText().contains("9") == false))
								{
									text5.setVisible(false);
									result.setVisible(false);
									text4.setVisible(true);
									text4.setText("Invalid input.");
								}
								else 
								{
									text4.setVisible(false);
									if(menu.getValue() == "Swimming") 
									{
										activity.setTime(Integer.parseInt(userTextField.getText()));
										activity.calculateTotalCaloriesBurnt(4);
										activity.calculateTotalHeartRate((float)0.002);
										activity.calculateSCC(4);
										activity.calculateSHRC((float)0.002);
										result.setText("Activity Type: SWIMMING   Time: "
												+ userTextField.getText() + " minutes"
												+ "\n(Total Calories Burnt: "
												+ activity.getTotalCaloriesBurnt()
												+ "   Total Heart Rate: "
												+ activity.getTotalHeartRate() + ")");
									}
									else if(menu.getValue() == "Running")
									{
										activity.setTime(Integer.parseInt(userTextField.getText()));
										activity.calculateTotalCaloriesBurnt(5);
										activity.calculateTotalHeartRate((float)0.003);
										activity.calculateRCC(5);
										activity.calculateRHRC((float)0.003);
										result.setText("Activity Type: RUNNING   Time: "
												+ userTextField.getText() + " minutes"
												+ "\n(Total Calories Burnt: "
												+ activity.getTotalCaloriesBurnt()
												+ "   Total Heart Rate: "
												+ activity.getTotalHeartRate() + ")");
									}
									else if(menu.getValue() == "Kick Boxing")
									{
										activity.setTime(Integer.parseInt(userTextField.getText()));
										activity.calculateTotalCaloriesBurnt(3);
										activity.calculateTotalHeartRate((float)0.005);
										activity.calculateKBCC(3);
										activity.calculateKBHRC((float)0.005);
										result.setText("Activity Type: KICK BOXING   Time: "
												+ userTextField.getText() + " minutes"
												+ "\n(Total Calories Burnt: "
												+ activity.getTotalCaloriesBurnt()
												+ "   Total Heart Rate: "
												+ activity.getTotalHeartRate() + ")");
									}
									else
									{
										activity.setTime(Integer.parseInt(userTextField.getText()));
										activity.calculateTotalCaloriesBurnt(5);
										activity.calculateTotalHeartRate((float)0.006);
										activity.calculateSTCC(5);
										activity.calculateSTHRC((float)0.006);
										result.setText("Activity Type: STRENGTH TRAINING   Time: "
												+ userTextField.getText() + " minutes"
												+ "\n(Total Calories Burnt: "
												+ activity.getTotalCaloriesBurnt()
												+ "   Total Heart Rate: "
												+ activity.getTotalHeartRate() + ")");
									}
									text5.setVisible(true);
									text5.setText("\nActivity recorded successfully.");
								}			
							}
						});
					}	
				});
			}
		});	
		button2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				text2.setVisible(false);
				text3.setVisible(false);
				text4.setVisible(false);
				text5.setVisible(false);
				text6.setVisible(false);
				menu.setVisible(false);
				text7.setVisible(true);
				activity.sortActivities();
				text8.setText("Results:\n\nTotal Calories Burnt: "
						+ activity.getTotalCaloriesBurnt() + " calories\nTotal Heart Rate: "
						+ activity.getTotalHeartRate() + " beats/minute\n\nActivity Ranks:\n\n\t1. "
						+ activity.printActivityName() + ":\n\t    Calories Burnt: "
						+ activity.printCaloriesBurnt() + " calories\n"
						+ "\t    Heart Rate Increase: " + activity.printHeartRateIncrease()
						+ " beats/minute" + "\n\n\t2. " + activity.printActivityName()
						+ ":\n\t    Calories Burnt: " + activity.printCaloriesBurnt()
						+ " calories\n" + "\t    Heart Rate Increase: "
						+ activity.printHeartRateIncrease() + " beats/minute\n\n\t3. " 
						+ activity.printActivityName() +":\n\t    Calories Burnt: "
						+ activity.printCaloriesBurnt() + " calories\n\t    Heart Rate Increase: "
						+ activity.printHeartRateIncrease() + " beats/minute\n\n\t4. "
						+ activity.printActivityName() + ":\n\t    Calories Burnt: "
						+ activity.printCaloriesBurnt() + " calories\n\t    Heart Rate Increase: "
						+ activity.printHeartRateIncrease() + " beats/minute");
				text7.setText("Results printed successfully.");
				thirdStage.show();
			}
		});
		button3.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				text1.setVisible(false);
				text2.setVisible(false);
				text3.setVisible(false);
				text4.setVisible(false);
				text5.setVisible(false);
				text7.setVisible(false);
				button1.setVisible(false);
				button2.setVisible(false);
				button3.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
				menu.setVisible(false);
				userTextField.setVisible(false);
				text6.setVisible(true);
				text6.setText("Are you sure you want to exit?");
				button4.setVisible(true);
				button5.setVisible(true);
				
				button4.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						System.exit(0);
					}
				});
				button5.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						text6.setVisible(false);
						button4.setVisible(false);
						button5.setVisible(false);
						text1.setVisible(true);
						button1.setVisible(true);
						button2.setVisible(true);
						button3.setVisible(true);
					}
				});
			}
		});
		Group root1 = new Group(title1, button1, button2, button3, button4, button5, button6, text1,
				text2, text3, text4, text5, text6, text7, result, menu, userTextField);
		Scene scene = new Scene(root1, 500, 500);
		
		primaryStage.setTitle("FITNESS TRACKER");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

