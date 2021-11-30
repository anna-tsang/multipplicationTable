package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        String mulTab = "";
        if(isValid(start, end)){
            mulTab = generateTable(start, end);
            return mulTab;
        }
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start,end);
    }

    public Boolean isInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        String tmp = "";
        for(int i = start; i <= end; i++){
            if(start <= i){
                tmp += generateLine(start, i) + "\r\n";
            }
        }
        return tmp.substring(0, tmp.length() -2);
    }

    public String generateLine(int start, int row) {
        String tmp = "";
        while(start <= row){
            if(start != row){
                tmp += generateSingleExpression(start,row) + "  ";
            } else {
                tmp += generateSingleExpression(start,row);
            }
            start++;
        }
        return tmp;
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + multiplicand*multiplier;
    }
}
