package hk.ust.mingzheliu.develop;

import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Cal extends MainActivity {

    String a,b;
    boolean c=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        Toolbar myToolbar = findViewById(R.id.cal_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public void one(View view)
    {
        if(c)
        {
            TextView textView = findViewById(R.id.num1);
            String num = textView.getText().toString();
            num = num+1;
            textView.setText(num);
        }
        else
        {
            TextView textView = findViewById(R.id.num2);
            String num = textView.getText().toString();
            num = num+1;
            textView.setText(num);
        }
    }

    public void two(View view)
    {
        if(c)
        {
            TextView textView = findViewById(R.id.num1);
            String num = textView.getText().toString();
            num = num+2;
            textView.setText(num);
        }
        else
        {
            TextView textView = findViewById(R.id.num2);
            String num = textView.getText().toString();
            num = num+2;
            textView.setText(num);
        }
    }

    public void three(View view)
    {
        if(c)
        {
            TextView textView = findViewById(R.id.num1);
            String num = textView.getText().toString();
            num = num+3;
            textView.setText(num);
        }
        else
        {
            TextView textView = findViewById(R.id.num2);
            String num = textView.getText().toString();
            num = num+3;
            textView.setText(num);
        }
    }

    public void four(View view)
    {
        if(c)
        {
            TextView textView = findViewById(R.id.num1);
            String num = textView.getText().toString();
            num = num+4;
            textView.setText(num);
        }
        else
        {
            TextView textView = findViewById(R.id.num2);
            String num = textView.getText().toString();
            num = num+4;
            textView.setText(num);
        }
    }

    public void five(View view)
    {
        if(c)
        {
            TextView textView = findViewById(R.id.num1);
            String num = textView.getText().toString();
            num = num+5;
            textView.setText(num);
        }
        else
        {
            TextView textView = findViewById(R.id.num2);
            String num = textView.getText().toString();
            num = num+5;
            textView.setText(num);
        }
    }

    public void six(View view)
    {
        if(c)
        {
            TextView textView = findViewById(R.id.num1);
            String num = textView.getText().toString();
            num = num+6;
            textView.setText(num);
        }
        else
        {
            TextView textView = findViewById(R.id.num2);
            String num = textView.getText().toString();
            num = num+6;
            textView.setText(num);
        }
    }

    public void seven(View view)
    {
        if(c)
        {
            TextView textView = findViewById(R.id.num1);
            String num = textView.getText().toString();
            num = num+7;
            textView.setText(num);
        }
        else
        {
            TextView textView = findViewById(R.id.num2);
            String num = textView.getText().toString();
            num = num+7;
            textView.setText(num);
        }
    }

    public void eight(View view)
    {
        if(c)
        {
            TextView textView = findViewById(R.id.num1);
            String num = textView.getText().toString();
            num = num+8;
            textView.setText(num);
        }
        else
        {
            TextView textView = findViewById(R.id.num2);
            String num = textView.getText().toString();
            num = num+8;
            textView.setText(num);
        }
    }

    public void nine(View view)
    {
        if(c)
        {
            TextView textView = findViewById(R.id.num1);
            String num = textView.getText().toString();
            num = num+9;
            textView.setText(num);
        }
        else
        {
            TextView textView = findViewById(R.id.num2);
            String num = textView.getText().toString();
            num = num+9;
            textView.setText(num);
        }
    }

    public void zero(View view)
    {
        if(c)
        {
            TextView textView = findViewById(R.id.num1);
            String num = textView.getText().toString();
            num = num+0;
            textView.setText(num);
        }
        else
        {
            TextView textView = findViewById(R.id.num2);
            String num = textView.getText().toString();
            num = num+0;
            textView.setText(num);
        }
    }

    public void plus(View view)
    {
        TextView num1 = findViewById(R.id.num1);
        TextView function = findViewById(R.id.function);
        TextView num2 = findViewById(R.id.num2);
        a = num1.getText().toString();
        b = "1";
        c = false;
        function.setVisibility(View.VISIBLE);
        function.setText("+");
        num2.setVisibility(View.VISIBLE);
    }

    public void minus(View view)
    {
        TextView num1 = findViewById(R.id.num1);
        TextView function = findViewById(R.id.function);
        TextView num2 =  findViewById(R.id.num2);
        a = num1.getText().toString();
        b = "2";
        c = false;
        function.setVisibility(View.VISIBLE);
        function.setText("-");
        num2.setVisibility(View.VISIBLE);
    }

    public void mul(View view)
    {
        TextView num1 = findViewById(R.id.num1);
        TextView function = findViewById(R.id.function);
        TextView num2 = findViewById(R.id.num2);
        a = num1.getText().toString();
        b = "3";
        c = false;
        function.setVisibility(View.VISIBLE);
        function.setText("x");
        num2.setVisibility(View.VISIBLE);
    }

    public void dev(View view)
    {
        TextView num1 = findViewById(R.id.num1);
        TextView function = findViewById(R.id.function);
        TextView num2 = findViewById(R.id.num2);
        a = num1.getText().toString();
        b = "4";
        c = false;
        function.setVisibility(View.VISIBLE);
        function.setText("÷");
        num2.setVisibility(View.VISIBLE);
    }

    public void equal(View view)
    {
        TextView num2 = findViewById(R.id.num2);
        TextView es = findViewById(R.id.es);
        TextView answer = findViewById(R.id.answer);
        es.setVisibility(View.VISIBLE);
        answer.setVisibility(View.VISIBLE);
        int i = Integer.parseInt(num2.getText().toString());
        int j = Integer.parseInt(a);
        int f = Integer.parseInt(b);
        switch (f)
        {
            case 1: String r1 = new Integer(i+j).toString();answer.setText(r1);break;
            case 2: String r2 = new Integer(i-j).toString();answer.setText(r2);break;
            case 3: String r3 = new Integer(i*j).toString();answer.setText(r3);break;
            case 4: String r4 = new Integer(i/j).toString();answer.setText(r4);break;}
    }

    public void clear(View view)
    {
        TextView num1 = findViewById(R.id.num1);
        TextView functiom = findViewById(R.id.function);
        TextView num2 = findViewById(R.id.num2);
        TextView es = findViewById(R.id.es);
        TextView answer = findViewById(R.id.answer);
        num1.setText(null);
        functiom.setText(null);
        num2.setText(null);
        answer.setText(null);
        functiom.setVisibility(View.GONE);
        num2.setVisibility(View.GONE);
        es.setVisibility(View.GONE);
        answer.setVisibility(View.GONE);
        c = true;
    }
}
