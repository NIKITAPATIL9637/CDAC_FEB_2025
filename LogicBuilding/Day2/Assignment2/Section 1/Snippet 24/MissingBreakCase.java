public class MissingBreakCase {
/* No Error --->
 public static void main(String[] args) {
 int level = 1;
 switch(level) {
 case 1:
 System.out.println("Level 1");
 case 2:
 System.out.println("Level 2");
 case 3:
 System.out.println("Level 3");
 default:
 System.out.println("Unknown level");
 }
 }
*/

/*  When level is 1, why does it print "Level 1", "Level 2", "Level 3", and
"Unknown level"? What is the role of the break statement in this situation?

The break statement plays a crucial role in a switch statement by terminating the execution of the current case block and preventing fall-through to subsequent case blocks. Without a break statement, the program continues executing all subsequent cases, even if they don't match the value being evaluated, until it reaches a break or the end of the switch block.
*/

// Corrected Code
 public static void main(String[] args) {
 int level = 1;
 switch(level) {
 case 1:
 System.out.println("Level 1");
 break;
 case 2:
 System.out.println("Level 2");
 case 3:
 System.out.println("Level 3");
 default:
 System.out.println("Unknown level");
 }
 }
} 