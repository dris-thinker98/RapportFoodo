package com.example.rapportfoodo;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

public class SecondFragment extends Fragment {
    private TextView name,steps,ingredients;
    DatabaseReference reff;
    Data d;
    Data obj;
    private String r;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater,container,savedInstanceState);
        View v= inflater.inflate(R.layout.fragment_second, container, false);
        r=d.getName();
       /*
        if(r.contains("Chocolate"))
            r="dessert";
        if(r.equals("Noodles")||r.equals("Meat")||r.equals("Seafood")||r.equals("Soup"))
            r=r.toLowerCase();
        if(r.contains("Vegetable"))
            r="vegetable";
        if(r.contains("Rice"))
            r="rice";
        if(r.contains("Egg"))
            r="egg";
        if(r.contains("French"))
            r="Fried";

        */

        name=v.findViewById(R.id.name);
        name.setText(r);
        steps=v.findViewById(R.id.steps);
        ingredients=v.findViewById(R.id.ingredients);
        Log.i("hello","tanishi"+r);
        String na="";
        if(r.equals("Noodles")) {
            ingredients.setText(Data.noodles[1]);
            steps.setText(Data.noodles[2]);
        }
        if(r.equals("Meat")){
            ingredients.setText(Data.meat[1]);
            steps.setText(Data.meat[2]);
        }

        if(r.equals("Seafood")){
            ingredients.setText(Data.seafood[1]);
            steps.setText(Data.seafood[2]);
        }
        if(r.equals("Soup")){
            ingredients.setText(Data.soup[1]);
            steps.setText(Data.soup[2]);
        }
        if(r.contains("Vegetable")) {
            ingredients.setText(Data.vegetable[1]);
            steps.setText(Data.vegetable[2]);
        }
        if(r.contains("Rice")){
            ingredients.setText(Data.rice[1]);
            steps.setText(Data.rice[2]);
        }
        if(r.contains("Egg")) {
            ingredients.setText(Data.egg[1]);
            steps.setText(Data.egg[2]);
        }
        if(r.contains("French")){
            ingredients.setText(Data.fried[1]);
            steps.setText(Data.fried[2]);
        }
        if(r.contains("Chocolate")){
            ingredients.setText(Data.dessert[1]);
            steps.setText(Data.dessert[2]);
        }
        if(r.equals("Bread")){
            ingredients.setText(Data.bread[1]);
            steps.setText(Data.bread[2]);
        }
        if(r.contains("Dairy")){
            ingredients.setText(Data.dairy[1]);
            steps.setText(Data.dairy[2]);
        }


        /*
        reff= FirebaseDatabase.getInstance().getReference("rapport-foodo-default-rtdb");
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot snap : snapshot.getChildren()) {
                    Log.i("Inside"," Firebase");
                    //GenericTypeIndicator<Map<String, String>> genericTypeIndicator = new GenericTypeIndicator<Map<String, String>>() {};
                    Map<String, String> map = (Map<String, String>) snap.getValue();
                    Log.i("hello","String"+map.get("Recipe"));
                    if(map.get("Recipe").equals(r))
                    {
                        name.setText("Recipe");
                        ingredients.setText(map.get("Ingredients"));
                       // steps.setText(map.get("Instructions"));
                        break;
                    }
                    }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

         */
        return v;
    }
}