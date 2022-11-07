public class ordinal {
    // Ordinal function
    public static String main(int numb){
        String suffix = "";

        if (numb < 20){
            if (numb == 1){
                suffix = "st";
            }
            if (numb == 2){
                suffix = "nd";
            }
            if (numb == 3){
                suffix = "rd";
            }
            else {
                suffix = "th";
            }
        }
        else { //determining suffix for > 20
            String tens = Integer.toString(numb);
            tens = tens.substring(tens.length() - 2);
            String unit = Integer.toString(numb);
            unit = unit.substring(tens.length() - 1);
            
            if (tens == "1"){
                suffix = "th";
            }
            else {
                if (unit == "1"){
                    suffix = "st";
                }
                if (unit == "2"){
                    suffix = "nd";
                }
                if (unit == "3"){
                    suffix = "rd";
                }
                else {
                    suffix = "th";
                }
            }
        }
        return Integer.toString(numb) + suffix;
    }
    
}
