package com.example.carshopping;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class articles extends Activity {

    String precioArticulo;
    Bundle ticket = new Bundle();
    float precioArticulos = 0;
    int cerealCont = 0, milkCont = 0, platanoCont = 0, breadCont = 0, cereal2Cont = 0,
        cheeseCont = 0, cookieCont = 0, oilCont = 0, peanuttCont = 0, coffeeCont = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        setOnClickProducts();
    }

    public void setOnClickProducts(){
        Button cerealButton = (Button) findViewById(R.id.cerealButton);
        cerealButton.setOnClickListener(this::onClickProducts);

        Button milkButton = (Button) findViewById(R.id.milkButton);
        milkButton.setOnClickListener(this::onClickProducts);

        Button platanoButton = (Button) findViewById(R.id.platanoButton);
        platanoButton.setOnClickListener(this::onClickProducts);

        Button panButton = (Button) findViewById(R.id.breadButton);
        panButton.setOnClickListener(this::onClickProducts);

        Button cereal2Button = (Button) findViewById(R.id.cereal2Button);
        cereal2Button.setOnClickListener(this::onClickProducts);

        Button cheeseButton = (Button) findViewById(R.id.cheeseButton);
        cheeseButton.setOnClickListener(this::onClickProducts);

        Button cookiesButton = (Button) findViewById(R.id.cookieButton);
        cookiesButton.setOnClickListener(this::onClickProducts);

        Button oilButton = (Button) findViewById(R.id.oilButton);
        oilButton.setOnClickListener(this::onClickProducts);

        Button peanuttButton = (Button) findViewById(R.id.peanuttButton);
        peanuttButton.setOnClickListener(this::onClickProducts);

        Button coffeeButton = (Button) findViewById(R.id.coffeeButton);
        coffeeButton.setOnClickListener(this::onClickProducts);

    }

    public void onClickProducts(View view){
        switch (view.getId()){
            case R.id.cerealButton:
                textView = (TextView)findViewById(R.id.cerealText);
                precioArticulo = textView.getText().toString();
                precioArticulo = precioArticulo.replaceAll("[^\\\\.1234567890]", "");
                precioArticulos = Float.parseFloat(precioArticulo);
                cerealCont++;
                ticket.putFloat("CerealPrecio", precioArticulos*cerealCont);
                ticket.putInt("CheeriosNum",cerealCont);
                break;
            case R.id.milkButton:
                textView = (TextView)findViewById(R.id.milkText);
                precioArticulo = textView.getText().toString();
                precioArticulo = precioArticulo.replaceAll("[^\\\\.1234567890]", "");
                precioArticulos = Float.parseFloat(precioArticulo);
                milkCont++;
                ticket.putFloat("LechePrecio", precioArticulos*milkCont);
                ticket.putInt("LecheNum", milkCont);
                break;
            case R.id.platanoButton:
                textView = (TextView)findViewById(R.id.platanoText);
                precioArticulo = textView.getText().toString();
                precioArticulo = precioArticulo.replaceAll("[^\\\\.1234567890]", "");
                precioArticulos = Float.parseFloat(precioArticulo);
                platanoCont++;
                ticket.putFloat("PlatanoPrecio", precioArticulos*platanoCont);
                ticket.putInt("PlatanoNum", platanoCont);
                break;
            case R.id.breadButton:
                textView = (TextView)findViewById(R.id.breadText);
                precioArticulo = textView.getText().toString();
                precioArticulo = precioArticulo.replaceAll("[^\\\\.1234567890]", "");
                precioArticulos = Float.parseFloat(precioArticulo);
                breadCont++;
                ticket.putFloat("PanPrecio", precioArticulos*breadCont);
                ticket.putInt("PanNum", breadCont);
                break;
            case R.id.cereal2Button:
                textView = (TextView) findViewById(R.id.cereal2Text);
                precioArticulo = textView.getText().toString();
                precioArticulo = precioArticulo.replaceAll("[^\\\\.1234567890]", "");
                precioArticulos = Float.parseFloat(precioArticulo);
                cereal2Cont++;
                ticket.putFloat("CornFlakesPrecio", precioArticulos*cereal2Cont);
                ticket.putInt("CornFlakesNum", cereal2Cont);
                break;
            case R.id.cheeseButton:
                textView = (TextView)findViewById(R.id.cheeseText);
                precioArticulo = textView.getText().toString();
                precioArticulo = precioArticulo.replaceAll("[^\\\\.1234567890]", "");
                precioArticulos = Float.parseFloat(precioArticulo);
                cheeseCont++;
                ticket.putFloat("QuesoPrecio", precioArticulos*cheeseCont);
                ticket.putInt("QuesoNum", cheeseCont);
                break;
            case R.id.cookieButton:
                textView = (TextView)findViewById(R.id.cookieText);
                precioArticulo = textView.getText().toString();
                precioArticulo = precioArticulo.replaceAll("[^\\\\.1234567890]", "");
                precioArticulos = Float.parseFloat(precioArticulo);
                cookieCont++;
                ticket.putFloat("GalletasPrecio", precioArticulos*cookieCont);
                ticket.putInt("GalletasNum", cookieCont);
                break;
            case R.id.oilButton:
                textView = (TextView)findViewById(R.id.oilText);
                precioArticulo = textView.getText().toString();
                precioArticulo = precioArticulo.replaceAll("[^\\\\.1234567890]", "");
                precioArticulos = Float.parseFloat(precioArticulo);
                oilCont++;
                ticket.putFloat("AceitePrecio", precioArticulos*oilCont);
                ticket.putInt("AceiteNum", oilCont);
                break;
            case R.id.peanuttButton:
                textView = (TextView)findViewById(R.id.peanuttText);
                precioArticulo = textView.getText().toString();
                precioArticulo = precioArticulo.replaceAll("[^\\\\.1234567890]", "");
                precioArticulos = Float.parseFloat(precioArticulo);
                peanuttCont++;
                ticket.putFloat("CacahuatePrecio", precioArticulos*peanuttCont);
                ticket.putInt("CacahuateNum", peanuttCont);
                break;
            case R.id.coffeeButton:
                textView = (TextView)findViewById(R.id.coffeeText);
                precioArticulo = textView.getText().toString();
                precioArticulo = precioArticulo.replaceAll("[^\\\\.1234567890]", "");
                precioArticulos = Float.parseFloat(precioArticulo);
                coffeeCont++;
                ticket.putFloat("CafePrecio", precioArticulos*coffeeCont);
                ticket.putInt("CafeNum", coffeeCont);
                break;
        }

    }

    public void onClickFinish(View view)
    {
        Intent ticketTotal = new Intent(articles.this, ticket.class);
        ticketTotal.putExtras(ticket);
        startActivity(ticketTotal);

    }


}