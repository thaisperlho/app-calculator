package com.example.app02;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tela extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela);
        
        final EditText campo1=(EditText)findViewById(R.id.edtv1);
        final EditText campo2=(EditText)findViewById(R.id.edtv2);
        final TextView resposta=(TextView)findViewById(R.id.edtt);
        final Button botaosoma=(Button)findViewById(R.id.btn1);
        final Button botaosub=(Button)findViewById(R.id.btn2);
        final Button botaodiv=(Button)findViewById(R.id.btn3);
        final Button botaomult=(Button)findViewById(R.id.btn4);
        final Button botaoraiz=(Button)findViewById(R.id.btn5);
        final Button botaopot=(Button)findViewById(R.id.btn6);
        
        botaosoma.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			try{	double v1,v2,r;
				v1=Double.parseDouble(campo1.getText().toString());
				v2=Double.parseDouble(campo2.getText().toString());
				r=v1+v2;
				resposta.setText(String.valueOf(r));
				
			}catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(Tela.this,"Valores inválidos", Toast.LENGTH_LONG).show();
			}
			}
        	
        });
        botaosub.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			try{	double v1,v2,r2;
				v1=Double.parseDouble(campo1.getText().toString());
				v2=Double.parseDouble(campo2.getText().toString());
				r2=v1-v2;
				resposta.setText(String.valueOf(r2));
				
			}catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(Tela.this,"Valores inválidos", Toast.LENGTH_LONG).show();
			}
			}
        	
        });
        botaodiv.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			try{	double v1,v2,r3;
				v1=Double.parseDouble(campo1.getText().toString());
				v2=Double.parseDouble(campo2.getText().toString());
				r3=v1/v2;
				resposta.setText(String.valueOf(r3));
				
			}catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(Tela.this,"Valores inválidos", Toast.LENGTH_LONG).show();
			}
			}
        	
        });
        botaomult.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			try{	double v1,v2,r4;
				v1=Double.parseDouble(campo1.getText().toString());
				v2=Double.parseDouble(campo2.getText().toString());
				r4=v1*v2;
				resposta.setText(String.valueOf(r4));
				
			}catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(Tela.this,"Valores inválidos", Toast.LENGTH_LONG).show();
			}
			}
        	
        });
        botaoraiz.setOnClickListener(new Button.OnClickListener(){

        	@Override
        	public void onClick(View arg0) {
        	// TODO Auto-generated method stub
        	try{	double v1,v2,r4, soma;
        	v1=Double.parseDouble(campo1.getText().toString());
        	v2=Double.parseDouble(campo2.getText().toString());
        	soma=v1+v2;
        	r4= Math.sqrt(soma);
        	resposta.setText(String.valueOf(r4));

        	}catch (Exception e) {
        	// TODO: handle exception
        	Toast.makeText(Tela.this,"Valores inválidos", Toast.LENGTH_LONG).show();
        	}
        	}

        	});
        	botaopot.setOnClickListener(new Button.OnClickListener(){

        	@Override
        	public void onClick(View arg0) {
        	// TODO Auto-generated method stub
        	try{	double v1,v2,r4;
        	v1=Double.parseDouble(campo1.getText().toString());
        	v2=Double.parseDouble(campo2.getText().toString());
        	r4= Math.pow(v1,v2);
        	resposta.setText(String.valueOf(r4));

        	}catch (Exception e) {
        	// TODO: handle exception
        	Toast.makeText(Tela.this,"Valores inválidos", Toast.LENGTH_LONG).show();
        	}
        	}

        	});      

        
           

		
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tela, menu);
        return true;
    }
    
}
