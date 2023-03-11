package model;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<String> history;
    public Calculator(){
        history = new ArrayList<String>();
    }

    public double sum(double num1, double num2){
        return num1 + num2;
    }
    public double sustraction(double num1, double num2){
        return num1 - num2;
    }
    public double multiplication(double num1, double num2){
        return num1 * num2;
    }
    public double division(double num1, double num2){
        return num1 / num2;
    }

    public ArrayList history(double number1, double number2, String sign, double result){
        String operation = String.valueOf(number1) + sign + String.valueOf(number2) + "=" + String.valueOf(result);
        history.add(operation);
        return (ArrayList) history;
    }

    public List<String> getHistory() {
        return history;
    }

    public List<String> orderHistory() {
        List<String> orderHistory = new ArrayList<String>();
        String[] value = new String[0];
        List<Double> result = new ArrayList<>();
        double min;
        for (int i = 0; i < history.size() ; i++) {
            value = history.get(i).split("=");
            min = Double.valueOf(value[1]);
            result.add(min);
        }

        for (int i = 0; i < result.size(); i++) {
            int minData = i;
            for (int j = i+1; j < result.size(); j++) {
                if (result.get(j) < result.get(minData)) {
                    minData = j;
                }
            }
            Double temp = result.get(minData);
            result.set(minData, result.get(i));
            result.set(i,temp);
        }

        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j <history.size() ; j++) {
                value = history.get(j).split("=");
                min = Double.valueOf(value[1]);
                if(result.get(i).equals(min)){
                    orderHistory.add(history.get(j));
                }
            }
        }
        return orderHistory;
    }
}

