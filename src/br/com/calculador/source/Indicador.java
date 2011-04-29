/**
 * 
 */
package br.com.calculador.source;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author Deivid
 *
 */
public class Indicador extends View {
	
	private static final float MAXIMO_ALTURA = 200;
	private static final float MAXIMO_TELA = 30;
	
	private float x;

	public Indicador(Context context, AttributeSet attrs) {
		super(context, attrs);
		setMinimumHeight((int) MAXIMO_ALTURA);
		setMinimumWidth((int) MAXIMO_TELA);
	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		setMeasuredDimension(getSuggestedMinimumWidth(), getSuggestedMinimumHeight());
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawColor(Color.CYAN);
		Paint paint = new Paint();
		paint.setColor(Color.RED);
		RectF rect = new RectF(0,0,x,MAXIMO_ALTURA);
		canvas.drawRect(rect, paint);
	}
	
	public double getValor(){
		return x*10/MAXIMO_TELA;
	}
	
	public void setValor(double valor){
		this.x = (float) (MAXIMO_TELA*valor/10);
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getX() {
		return x;
	}

}
