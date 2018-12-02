package com.example.c.ujshistoria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class historia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);
        Log.e(tag:"jose sanchez", msg "OnCreate")
    }
//Codificado por sAfOrA
    public class DSCTemperatura
    {
        /*
        La relación entre grados Celsius (C) y grados Fahrenheit (F) es la siguiente: F - 32 = 1,8 * C
        */
        double FahrenheitCelsius(double grado)
        {
            double gCelsius=(grado-32)/1.8;
            return gCelsius;
        }

        double CelsiusFahrenheit(double grado)
        {
            double gFahrenheit=(grado*1.8)+32;
            return gFahrenheit;
        }

            DSCTemperatura temp = new DSCTemperatura();

            int opcion=0;
            String cadena;
            do{
                cadena=JOptionPane.showInputDialog("\n [1] Convertir Fahrenheit - Celsius \n [2] Convertir Celsius - Fahrenheit");
                opcion=Integer.parseInt(cadena);
            }while(opcion<1 || opcion>2);
            cadena=JOptionPane.showInputDialog("Ingrese la temperatura: ");
            grado=Double.parseDouble(cadena);

            switch(opcion)
            {
                case 1: {
                    gCelsius=temp.FahrenheitCelsius(grado);
                    JOptionPane.showMessageDialog(null," TEMPERATURA: "+gCelsius + " Celsius");
                };break;
                case 2: {
                    gFahrenheit=temp.CelsiusFahrenheit(grado);
                    JOptionPane.showMessageDialog(null," TEMPERATURA: "+gFahrenheit +" Fahrenheit");
                };break;
            }
        }
    }


    
}
