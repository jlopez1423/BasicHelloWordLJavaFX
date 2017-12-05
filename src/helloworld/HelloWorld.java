/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author jlopez
 */
public class HelloWorld extends Application{
    
    // The start() method is the main entry point for all JavaFX applications.
    @Override
    public void start( Stage primaryStage ) { 
        // A JavaFX application defines the user interface container by means of a stage and a scene.
        //  The JavaFX Stage class is the top-level JavaFX container.
        Button btn = new Button();
        btn.setText("Say 'Hello World!'" );
        btn.setOnAction( new EventHandler<ActionEvent>(){
            
            @Override
            public void handle( ActionEvent event ) {
                System.out.println( "Hello World" );
            }
            
        });
        
        StackPane root = new StackPane();
        root.getChildren().add( btn );
        
        // The JavaFX Scene class is the container for all content.
        Scene scene = new Scene( root, 300, 250 );
        
        primaryStage.setTitle( "Hello World!" );
        primaryStage.setScene( scene );
        primaryStage.show();
    }
    
    public static void main( String[] args ) {
        
        launch( args );
        
    }
    
}
