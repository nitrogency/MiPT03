package com.example.mipt03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import com.itis.libs.parserng.android.expressParser.MathExpression;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView tvInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInput = findViewById(R.id.tvInput);
    }

    public boolean equalsZero(){
        if(tvInput.getText().toString().equals("0")){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isNull(){
        int length = tvInput.getText().length();
        if(length == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void onClearButtonClick(View view) {
        if(!equalsZero()){
            tvInput.setText(tvInput.getText().toString().substring(0, tvInput.getText().length() - 1));
            if(isNull()){
                tvInput.setText("0");
            }
        }
    }
    public void onClearAllButtonClick(View view) {
        tvInput.setText("0");
    }
    public void onMultiplyButtonClick(View view){
        tvInput.append("*");
    }
    public void onDivideButtonClick(View view){
        tvInput.append("/");
    }
    public void onMinusButtonClick(View view){
        if(equalsZero()){
            tvInput.setText("-");
        }
        else {
            tvInput.append("-");
        }
    }
    public void onPlusButtonClick(View view){
        if(equalsZero()){
            tvInput.setText("+");
        }
        else {
            tvInput.append("+");
        }
    }
    public void onRootButtonClick(View view){
        if(equalsZero()){
            tvInput.setText("√");
        }
        else {
            tvInput.append("√");
        }
    }
    public void onDotButtonClick(View view){
        tvInput.append(".");
    }
    public void onResultButtonClick(View view){
        MathExpression expression = new MathExpression(tvInput.getText().toString());
        String result = expression.solve();
        if(result == "SYNTAX ERROR"){
            result = tvInput.getText().toString();
        }
        else{
            tvInput.setText(result);
        }

    }

    public void onNum1ButtonClick(View view){
        if(equalsZero()){
            tvInput.setText("1");
        }
        else {
            tvInput.append("1");
        }
    }
    public void onNum2ButtonClick(View view){
        if(equalsZero()){
            tvInput.setText("2");
        }
        else {
            tvInput.append("2");
        }
    }
    public void onNum3ButtonClick(View view){
        if(equalsZero()){
            tvInput.setText("3");
        }
        else {
            tvInput.append("3");
        }
    }
    public void onNum4ButtonClick(View view){
        if(equalsZero()){
            tvInput.setText("4");
        }
        else {
            tvInput.append("4");
        }
    }
    public void onNum5ButtonClick(View view){
        if(equalsZero()){
            tvInput.setText("5");
        }
        else {
            tvInput.append("5");
        }
    }
    public void onNum6ButtonClick(View view){
        if(equalsZero()){
            tvInput.setText("6");
        }
        else {
            tvInput.append("6");
        }
    }
    public void onNum7ButtonClick(View view){
        if(equalsZero()){
            tvInput.setText("7");
        }
        else {
            tvInput.append("7");
        }
    }
    public void onNum8ButtonClick(View view){
        if(equalsZero()){
            tvInput.setText("8");
        }
        else {
            tvInput.append("8");
        }
    }
    public void onNum9ButtonClick(View view){
        if(equalsZero()){
            tvInput.setText("9");
        }
        else {
            tvInput.append("9");
        }
    }
    public void onNum0ButtonClick(View view){
        tvInput.append("0");
    }
}