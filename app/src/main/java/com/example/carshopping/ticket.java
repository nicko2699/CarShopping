package com.example.carshopping;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class ticket extends Activity {

    float ticketFinal;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        Bundle ticket = getIntent().getExtras();
        contadorArticles(ticket);
        cuentaTotal(ticket);

        startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ticket.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    public void contadorArticles(Bundle ticket){

        int cerealNum = ticket.getInt("CheeriosNum");
        int milkNum = ticket.getInt("LecheNum");
        int platanoNum = ticket.getInt("PlatanoNum");
        int breadNum = ticket.getInt("PanNum");
        int cereal2Num = ticket.getInt("CornFlakesNum");
        int cheeseNum = ticket.getInt("QuesoNum");
        int cookiesNum = ticket.getInt("GalletasNum");
        int oilNum = ticket.getInt("AceiteNum");
        int peanuttNum = ticket.getInt("CacahuateNum");
        int coffeeNum = ticket.getInt("CafeNum");

        TextView cereal1Contador = (TextView) findViewById(R.id.cereal1Cont);
        cereal1Contador.setText(""+cerealNum);
        TextView milkContador = (TextView) findViewById(R.id.milkCont);
        milkContador.setText(""+milkNum);
        TextView platanoContador = (TextView) findViewById(R.id.platanoCont);
        platanoContador.setText(""+platanoNum);
        TextView breadContador = (TextView) findViewById(R.id.breadCont);
        breadContador.setText(""+breadNum);
        TextView cereal2Contador = (TextView) findViewById(R.id.cereal2Cont);
        cereal2Contador.setText(""+cereal2Num);
        TextView cheeseContador = (TextView) findViewById(R.id.cheeseCont);
        cheeseContador.setText(""+cheeseNum);
        TextView cookiesContador = (TextView) findViewById(R.id.cookieCont);
        cookiesContador.setText(""+cookiesNum);
        TextView oilContador = (TextView) findViewById(R.id.oilCont);
        oilContador.setText(""+oilNum);
        TextView peanuttContador = (TextView) findViewById(R.id.peanuttCont);
        peanuttContador.setText(""+peanuttNum);
        TextView coffeeContador = (TextView) findViewById(R.id.coffeeCont);
        coffeeContador.setText(""+coffeeNum);

    }

    public void cuentaTotal(Bundle ticket){

        float cerealPrice = ticket.getFloat("CerealPrecio");
        float milkPrice = ticket.getFloat("LechePrecio");
        float platanoPrice = ticket.getFloat("PlatanoPrecio");
        float panPrice = ticket.getFloat("PanPrecio");
        float cereal2Price = ticket.getFloat("CornFlakesPrecio");
        float cheesePrice = ticket.getFloat("QuesoPrecio");
        float cookiesPrice = ticket.getFloat("GalletasPrecio");
        float oilPrice = ticket.getFloat("AceitePrecio");
        float peanuttPrice= ticket.getFloat("CacahuatePrecio");
        float coffeePrice = ticket.getFloat("CafePrecio");

        ticketFinal = cerealPrice + milkPrice + platanoPrice + panPrice + cereal2Price +
                      cheesePrice+ + cookiesPrice + oilPrice + peanuttPrice + coffeePrice;

        TextView ticketCuenta = (TextView) findViewById(R.id.totalTextTicket);
        ticketCuenta.setText("$"+ticketFinal);
    }



}