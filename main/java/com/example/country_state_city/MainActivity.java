package com.example.country_state_city;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Spinner Country,State,City;
    ImageButton ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Country=findViewById(R.id.Country);
        State=findViewById(R.id.State);
        City=findViewById(R.id.City);
        ok=findViewById((R.id.ok));

        String C[] = {"India","UK","Portugal"};
        String ii[] = {"Uttar Pradesh","Maharashtra","Rajasthan"};
        String uu[] = {"England","Scotland","Wales"};
        String pp[] = {"Lisbon District","Porto District","Algarve District"};
        String iu[] = {"Lucknow","Kanpur","Agra"};
        String im[] = {"Pune","Mumbai","Nagpur"};
        String ir[] = {"Jaipur","Jodhpur","Udaipur"};
        String ue[] = {"London","Manchester","Bristol"};
        String us[] = {"Edinburgh","Glasglow","Aberdeen"};
        String uw[] = {"Cardiff"," St Davids","Newport"};
        String pl[] = {"Lisbon","Mafra","Loures"};
        String pc[] = {"Porto","Penafiel","Vila nova de Gaia"};
        String pa[] = {"Faro","Albufeira","Sagres"};


        ArrayAdapter<String> a=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, C);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Country.setAdapter(a);

        Country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0)
                {
                    ArrayAdapter<String> aa=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, ii);
                    aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    State.setAdapter(aa);

                    State.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if (i == 0)
                            {
                                ArrayAdapter<String> ba=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, iu);
                                ba.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                City.setAdapter(ba);
                            }
                            if(i==1)
                            {
                                ArrayAdapter<String> bb=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, im);
                                bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                City.setAdapter(bb);
                            }
                            if(i==2)
                            {
                                ArrayAdapter<String> bc=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, ir);
                                bc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                City.setAdapter(bc);
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                if(i==1)
                {
                    ArrayAdapter<String> ab=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, uu);
                    ab.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    State.setAdapter(ab);

                    State.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if (i == 0)
                            {
                                ArrayAdapter<String> ba=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, ue);
                                ba.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                City.setAdapter(ba);
                            }
                            if(i==1)
                            {
                                ArrayAdapter<String> bb=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, us);
                                bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                City.setAdapter(bb);
                            }
                            if(i==2)
                            {
                                ArrayAdapter<String> bc=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, uw);
                                bc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                City.setAdapter(bc);
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                if(i==2)
                {
                    ArrayAdapter<String> ac=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, pp);
                    ac.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    State.setAdapter(ac);

                    State.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if (i == 0)
                            {
                                ArrayAdapter<String> ba=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, pl);
                                ba.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                City.setAdapter(ba);
                            }
                            if(i==1)
                            {
                                ArrayAdapter<String> bb=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, pc);
                                bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                City.setAdapter(bb);
                            }
                            if(i==2)
                            {
                                ArrayAdapter<String> bc=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, pa);
                                bc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                City.setAdapter(bc);
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), City.getSelectedItem()+ ", "+ State.getSelectedItem()+", "+Country.getSelectedItem().toString(), Toast.LENGTH_LONG).show();

            }
        }
        );


    }
}