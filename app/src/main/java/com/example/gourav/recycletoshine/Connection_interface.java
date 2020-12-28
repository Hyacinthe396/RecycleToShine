package com.example.gourav.recycletoshine;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_interface extends AppCompatActivity {
    public static Connection myinterface_db() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cony = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmw", "root", "12345");

            return cony;

        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;


    }
}


// @Override
//protected void onCreate(Bundle savedInstanceState) {
// super.onCreate(savedInstanceState);
// setContentView(R.layout.activity_connection_interface);


// }
//}
