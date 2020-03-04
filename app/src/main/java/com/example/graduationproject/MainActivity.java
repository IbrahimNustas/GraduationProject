package com.example.graduationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity {

    DatabaseReference usersDatabase;
    DatabaseReference testsDatabase;
    DatabaseReference patientsDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create the DBs
String id = "55";
        usersDatabase =  FirebaseDatabase.getInstance().getReference("Users");
        patientsDatabase =  FirebaseDatabase.getInstance().getReference("Patients");
        testsDatabase =  FirebaseDatabase.getInstance().getReference("Tests").child("55");

         User user = new User("1","hello@yahoo.com","Doctor","aa11223322","0588475844","Ibrahim Anastas");
         Patient patient = new Patient("55","naseem@hotmail.com","24/4/1996","nseg424","Naseem","Male","0587461515","Jaffa Street Jerusalem","Skin Allergy",false,"0");
         Test test = new Test ("5643","55","1/1/1998","this is a temp file string","MRI Test","556","24","453","Laboratory","434",true);
        Test test2 = new Test ("5343","55","1/2/1998","this is a temp file string","Citiscan nTest","556","24","453","Laboratory","434",true);
        Test test3 = new Test ("5743","55","1/4/1998","this is a temp file string","Skin Test","556","24","453","Laboratory","434",true);
         usersDatabase.child("1").setValue(user);
        patientsDatabase.child("55").setValue(patient);
        testsDatabase.child("5643").setValue(test);
        testsDatabase.child("5343").setValue(test2);
        testsDatabase.child("5743").setValue(test3);
    }



}
