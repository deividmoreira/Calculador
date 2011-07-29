package br.com.calculador.source;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Principal extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        
        ImageButton imageRescicao = (ImageButton) findViewById(R.id.imageRescicao);
        imageRescicao.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Principal.this, Rescicao.class));
			}
		});
    }
}