public class Triangle {
    public static String classifyTriangle(double side1, double side2, double side3){
        String result = "Không phải tam giác";
        boolean isTriangle = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
        boolean isIsoscelesTriangle = side1 == side2 || side1 == side3 || side2 == side3;
        boolean isEquilateralTriangle = side1 == side2 && side1 == side3 && side2 == side3;

        if(isTriangle) {
            if( isEquilateralTriangle){
                result = "Tam giác đều";
            }
            else if(isIsoscelesTriangle){
                result = "Tam giác cân";
            }
            else{
                result = "Tam giác thường";
            }
        }
        return result;
    }
}
