/**
 * 
 */
package br.com.calculador.source;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author deivid
 *
 */
public class Ferias extends Activity {
	
	private EditText salarioText;
	private EditText diasFeriasText;
	private EditText nrDependentesText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ferias);
	}
	
	public Double calcular(View view){
		this.salarioText = (EditText) findViewById(R.id.editFeriasSalarioBase);
		this.diasFeriasText = (EditText) findViewById(R.id.editQtdDias);
		this.nrDependentesText = (EditText) findViewById(R.id.editNrDependentes);
		
		Double salario = Double.parseDouble(salarioText.getText().toString());
		Integer qtdDias = Integer.parseInt(diasFeriasText.getText().toString());
		Integer nrDependentes = Integer.parseInt(nrDependentesText.getText().toString());
		
		Double total = (salario / 12) * (qtdDias / 30); 
		
		return total;
	}
	
	public void limpar(View view){
		System.out.println("OK");
	}

}
