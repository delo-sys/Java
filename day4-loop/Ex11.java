public class Ex11 {
    public static void main(String[] args) {
    // for (int i = 0; i < 11; i++) {
    //     System.out.println();
    //     for (int j = 0; j < 11; j++) {
    //         System.out.print((i * j) + " ");
    //     }
    // }
    // Print a triangle of stars
// for (int i = 7; i >= 1; i--) {
//     for (int j = i; j >= 1; j--) {
//         System.out.print("*");
//     }
//     System.out.println();
// }
// Print a triangle of stars
for (int i = 1; i <= 7; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

    }
}
