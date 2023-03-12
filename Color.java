// public enum Color {
//     RESET("\u001B[0m"),
//     GREEN("\u001B[32m"),
//     RED("\u001B[31m"),
//     BLACK("\u001B[30m");
        
//     private final String color;
        
//     Color(String color) {
//         this.color = color;
//     }

//     public String getColor() {
//         return color;
//     }
        
//     public static Color calculate(double value) {
//         if (value < 30) {
//             return BLACK;
//         } else if (value < 60) {
//             return RED;
//         } else if (value <= 100) {
//             return GREEN;
//         }

//         throw new IllegalArgumentException("Value must");
//     }
// }