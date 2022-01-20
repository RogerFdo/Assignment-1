public class BMIcalculator {
    public static double calculatebmi(double weight, double height) {
        weight = (weight * 703);
        height = height * height;
        double bmi = weight / height;
        return weight / height;
    }

    public static String message(double bmi) {
        if (bmi > 30) {
            return "You are obese";
        } else if (bmi < 18) {
            return "You are underweight";
        } else {

            return "Your BMI is perfect";
        }


    }
}