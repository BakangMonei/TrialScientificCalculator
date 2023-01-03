package com.neizatheedev.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    // Initializing and declaring
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,
            ac,clear,
            bb1,bb2,div,
            binary,hex,octal,
            sin,cos,tan,In,log,expo,econstant,
            fact,square, squareroot,percentage,
            divide,multiply,minus,plus,pi,dot,equals,
            cosinverse,taninverse,sininverse;
    TextView tvmain,tvsec;
    int sum = 0;
    String pie = "3.1415929265";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        // Finding buttons by their ID
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        ac = (Button) findViewById(R.id.ac);
        clear = (Button) findViewById(R.id.clear);
        bb1 = (Button) findViewById(R.id.bb1);
        bb2 = (Button) findViewById(R.id.bb2);
        div = (Button) findViewById(R.id.div);
        binary = (Button) findViewById(R.id.binary);
        hex = (Button) findViewById(R.id.hex);
        octal = (Button) findViewById(R.id.octal);
        sin = (Button) findViewById(R.id.sin);
        cos = (Button) findViewById(R.id.cos);
        tan = (Button) findViewById(R.id.tan);
        In = (Button) findViewById(R.id.In);
        log = (Button) findViewById(R.id.log);
        expo = (Button) findViewById(R.id.expo);
        econstant = (Button) findViewById(R.id.econstant);
        fact = (Button) findViewById(R.id.fact);
        square = (Button) findViewById(R.id.square);
        squareroot = (Button) findViewById(R.id.squareroot);
        percentage = (Button) findViewById(R.id.percentage);
        divide = (Button) findViewById(R.id.divide);
        multiply = (Button) findViewById(R.id.multiply);
        minus = (Button) findViewById(R.id.minus);
        plus = (Button) findViewById(R.id.plus);
        pi = (Button) findViewById(R.id.pi);
        dot = (Button) findViewById(R.id.dot);
        equals = (Button) findViewById(R.id.equals);
        taninverse = (Button) findViewById(R.id.taninverse);
        cosinverse = (Button) findViewById(R.id.cosinverse);
        sininverse = (Button) findViewById(R.id.sininverse);
        // TextView
        tvmain = (TextView) findViewById(R.id.tvmain);
        tvsec = (TextView) findViewById(R.id.tvsec);

        // setOnClickListener for all buttons
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val + b1.getText().toString());
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val + b2.getText().toString());
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val + b3.getText().toString());
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val + b4.getText().toString());
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val + b5.getText().toString());
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val + b6.getText().toString());
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val + b7.getText().toString());
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val + b8.getText().toString());
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val + b9.getText().toString());
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val + b0.getText().toString());
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + ")");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if (!val.contains("."))
                {
                    tvmain.setText(val+dot.getText().toString());
                }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if (!val.equals(""))
                {
                    val = val.substring(0, val.length() - 1);
                    tvmain.setText(val);
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if (!val.equals(""))
                {
                    tvmain.setText(val + plus.getText().toString());
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                char last = val.charAt(val.length() -1);
                if (last != '-')
                {
                    tvmain.setText(val + minus.getText().toString());
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                char last = val.charAt(val.length() -1);
                if (!val.equals(""))
                {
                    tvmain.setText(val + multiply.getText().toString());
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if (!val.equals(""))
                {
                    tvmain.setText(val + divide.getText().toString());
                }
            }
        });
        squareroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                String result = String.valueOf(r);
                tvmain.setText(result);
            }
        });
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + pie);
                tvsec.setText(pi.getText());
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "sin");
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "cos");
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "tan");
            }
        });
        In.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+ "In");
            }
        });
        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(tvmain.getText().toString());
                int fact = factorial(val);
                tvmain.setText(String.valueOf(fact));
                tvsec.setText(val + "!");
            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvmain.getText().toString());
                double square = d*d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(d + "²");
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                String replacedString = val.replace('÷','/').replace('×', '*');
                double result = NeizaTheory(replacedString);
                String r = String.valueOf(result);
                tvmain.setText(r);
                tvsec.setText(val);
            }
        });
        // to be attended
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"log");
            }
        });
        econstant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"e^");
            }
        });
        expo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+ "^" + "(-1)");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "1");
            }
        });
        // For Binary
        binary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(tvmain.getText().toString()); // Binary
                tvmain.setText(Integer.toString(a,2));
            }
        });
        // For hexadecimal
        hex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(tvmain.getText().toString()); // Hexadecimal
                tvmain.setText(Integer.toString(a,16));
            }
        });
        // For octal
        octal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(tvmain.getText().toString()); // Octal
                tvmain.setText(Integer.toString(a,8));
            }
        });
        sininverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val + sininverse.getText().toString());
            }
        });
        cosinverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val + cosinverse.getText().toString());
            }
        });
        taninverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val + taninverse.getText().toString());
            }
        });
    }
    int factorial(int n) {
        // find factorial
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }
    public static double NeizaTheory(final String str) {
        return new Object() {
            int pos = -1, ch;
            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }
            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }
            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }
            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor
            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }
            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }
            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus
                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                }
                else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                }
                else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("squareroot")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toDegrees(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toDegrees(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toDegrees(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("In")) x = Math.log(x);
                    else if (func.equals("sin-1")) x = Math.sinh(x);
                    else if (func.equals("tan-1")) x = Math.tanh(x);
                    else if (func.equals("cos-1")) x = Math.cosh(x);
                    else throw new RuntimeException("Unknown function: " + func);
                }
                else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }
                if
                (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
                return x;
            }
        }.parse();
    }
}