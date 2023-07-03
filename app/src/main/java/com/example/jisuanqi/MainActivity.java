package com.example.jisuanqi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView calc_result;
    private Boolean isClickequ = false;
    private Boolean zhengfushu = false;
    private double num1 = 0,num2 = 0,reslut = 0 ,num3=0,i=2;
    private String op = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc_result = findViewById(R.id.result);
        Button btn_0 = findViewById(R.id.btn_0); //通过 findViewById()获取到布局文件中的元素
        Button btn_1 = findViewById(R.id.btn_1);
        Button btn_2 = findViewById(R.id.btn_2);
        Button btn_3 = findViewById(R.id.btn_3);
        Button btn_4 = findViewById(R.id.btn_4);
        Button btn_5 = findViewById(R.id.btn_5);
        Button btn_6 = findViewById(R.id.btn_6);
        Button btn_7 = findViewById(R.id.btn_7);
        Button btn_8 = findViewById(R.id.btn_8);
        Button btn_9 = findViewById(R.id.btn_9);
        Button btn_dot = findViewById(R.id.btn_dot);
        Button btn_sum = findViewById(R.id.btn_sum);
        Button btn_sub = findViewById(R.id.btn_sub);
        Button btn_mult = findViewById(R.id.btn_mult);
        Button btn_div = findViewById(R.id.btn_div);
        Button btn_clr = findViewById(R.id.btn_c);
        Button btn_equ = findViewById(R.id.btn_equ);
        Button btn_gen = findViewById(R.id.btn_gen);
        Button btn_zhengfu = findViewById(R.id.btn_zhengfu);
        Button btn_zhengxian= findViewById(R.id.btn_zhengxian);

        btn_0.setOnClickListener(this); //setOnClickListener() 方法为按钮注册一个监听器，点击按钮时就会执行监听器中的 onClick() 方法。
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_sum.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_mult.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_clr.setOnClickListener(this);
        btn_equ.setOnClickListener(this);
        btn_gen.setOnClickListener(this);
        btn_zhengfu.setOnClickListener(this);
        btn_zhengxian.setOnClickListener(this);
    }

    @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_zhengfu: //R.id.XXX 这句话中的 R 指的就是 gen 目录中的 R.java 文件，R文件中对应的id指的是我们需要去找的那个控件的id
                if(isClickequ){
                    calc_result.setText("");
                    isClickequ = false;//判断是否按了“=”按钮
                }
                zhengfushu = i % 2 == 0;
                i++;
                break;

            case R.id.btn_0:
                if(isClickequ){//判断是否按了“=”按钮
                    calc_result.setText("");
                    isClickequ = false;
                }
                calc_result.setText(calc_result.getText().toString()+"0");//获取结果区文本转换为字符串并+0
                break;
            case R.id.btn_1:
                if(isClickequ){
                    calc_result.setText("");
                    isClickequ = false;
                } //判断是否按下了正负切换键
               if(zhengfushu) {calc_result.setText(calc_result.getText().toString()+"-1");}
                else calc_result.setText(calc_result.getText().toString()+"1");
                break;
            case R.id.btn_2:
                if(isClickequ){
                    calc_result.setText("");
                    isClickequ = false;
                }
                if(zhengfushu) {calc_result.setText(calc_result.getText().toString()+"-2");}
                else calc_result.setText(calc_result.getText().toString()+"2");
                break;
            case R.id.btn_3:
                if(isClickequ){
                    calc_result.setText("");
                    isClickequ = false;
                }
                if(zhengfushu) {calc_result.setText(calc_result.getText().toString()+"-3");}
                else calc_result.setText(calc_result.getText().toString()+"3");
                break;
            case R.id.btn_4:
                if(isClickequ){
                    calc_result.setText("");
                    isClickequ = false;
                }
                if(zhengfushu) {calc_result.setText(calc_result.getText().toString()+"-4");}
                else calc_result.setText(calc_result.getText().toString()+"4");
                break;
            case R.id.btn_5:
                if(isClickequ){
                    calc_result.setText("");
                    isClickequ = false;
                }
                if(zhengfushu) {calc_result.setText(calc_result.getText().toString()+"-5");}
                else calc_result.setText(calc_result.getText().toString()+"5");
                break;
            case R.id.btn_6:
                if(isClickequ){
                    calc_result.setText("");
                    isClickequ = false;
                }
                if(zhengfushu) {calc_result.setText(calc_result.getText().toString()+"-6");}
                else calc_result.setText(calc_result.getText().toString()+"6");
                break;
            case R.id.btn_7:
                if(isClickequ){
                    calc_result.setText("");
                    isClickequ = false;
                }
                if(zhengfushu) {calc_result.setText(calc_result.getText().toString()+"-7");}
                else calc_result.setText(calc_result.getText().toString()+"7");
                break;
            case R.id.btn_8:
                if(isClickequ){
                    calc_result.setText("");
                    isClickequ = false;
                }
                if(zhengfushu) {calc_result.setText(calc_result.getText().toString()+"-8");}
                else calc_result.setText(calc_result.getText().toString()+"8");
                break;
            case R.id.btn_9:
                if(isClickequ){
                    calc_result.setText("");
                    isClickequ = false;
                }
                if(zhengfushu) {calc_result.setText(calc_result.getText().toString()+"-9");}
                else calc_result.setText(calc_result.getText().toString()+"9");
                break;
            case R.id.btn_c:
                if(isClickequ){
                    calc_result.setText("");
                    isClickequ = false;
                }
                calc_result.setText("");
                break;
            case R.id.btn_dot:
                if(isClickequ){
                    calc_result.setText("");
                    isClickequ = false;
                }
                 calc_result.setText(calc_result.getText().toString()+".");
                    break;
            case R.id.btn_sum:
                String strnum1 = calc_result.getText().toString(); //将结果区域的内容传递给strnum1
                if(strnum1.equals("")){
                    break; //判断是否为空
                }
                num1 = Double.parseDouble(strnum1); //strnum1转换为浮点型传递给num1
                calc_result.setText("");
                op ="+";
                isClickequ =false;
            case R.id.btn_sub:
                strnum1 = calc_result.getText().toString();
                if(strnum1.equals("")){
                    break;
                }
                num1 = Double.parseDouble(strnum1);
                calc_result.setText("");
                op ="-";
                isClickequ =false;
            case R.id.btn_mult:
                strnum1 = calc_result.getText().toString();
                if(strnum1.equals("")){
                    break;
                }
                num1 = Double.parseDouble(strnum1);
                calc_result.setText("");
                op ="*";
                isClickequ =false;
            case R.id.btn_div:
                strnum1 = calc_result.getText().toString();
                if(strnum1.equals("")){
                    break;
                }
                num1 = Double.parseDouble(strnum1);
                calc_result.setText("");
                op ="/";
                isClickequ =false;
            case R.id.btn_gen:
                strnum1 = calc_result.getText().toString();
                if(strnum1.equals("")){
                    break;
                }
                num1 = Double.parseDouble(strnum1);
                calc_result.setText("");
                op ="√";
                isClickequ =false;
            case R.id.btn_zhengxian:
                strnum1 = calc_result.getText().toString();
                if(strnum1.equals("")){
                    break;
                }
                num1 = Double.parseDouble(strnum1);
                num3 = Math.toRadians(num1);
                calc_result.setText("");
                op ="sin";
                isClickequ =false;
            case R.id.btn_equ:
                if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")){//需要输入两个数字的运算符
                    String strnum2 = calc_result.getText().toString();
                if(strnum2.equals("")){
                    break;
                }
                num2 = Double.parseDouble(strnum2);}
                calc_result.setText("");
                switch (op){
                    case "+":
                        reslut = num1+num2;
                        break;
                    case "-":
                        reslut = num1-num2;
                        break;
                    case "*":
                        reslut = num1*num2;
                        break;
                    case "/":
                        if(num2==0){
                            Toast.makeText(MainActivity.this, "除数不能为0", Toast.LENGTH_LONG).show();
                            break;
                        }
                        reslut = num1/num2;
                        break;
                    case "√":
                        if(num1<0){
                            Toast.makeText(MainActivity.this, "开平方根的数不能为负数", Toast.LENGTH_LONG).show();
                            reslut=0.0;
                            break;
                        }
                        reslut = Math.sqrt(num1);
                        break;
                    case "sin":
                        reslut = Math.sin(num3);
                        break;
                    default:reslut = 0.0;
                        break;
                }
                calc_result.setText(reslut+"");
                op = "";
                isClickequ =true;

        }
    }
}