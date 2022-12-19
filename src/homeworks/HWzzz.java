package homeworks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HWzzz {
    public static void main(String[] args) {

    }
    double s1 = 1;
    double s2 = 2;
    double s3 = 3;
    boolean isValid;
        private boolean isValid (double s1,double s2,double s3){
            if (s1+s2>s3 && s1+s3>s2 && s2+s3>s1){
                return true;
            }else{
                return false;
            }
            //if else - arba tik trumpiau
            //     return s1+s2>s3 && s1+s3>s2 && s2+s3>s1;
        }

        public void areaTriangle (double s1, double s2, double s3){

            if(isValid){
                double p = (s1+s2+s3)/2;
                double area = Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
                System.out.println("Area: " + area);
            }else{
                System.out.println("Triangle is not valid");
            }
            // return area;
        }


}