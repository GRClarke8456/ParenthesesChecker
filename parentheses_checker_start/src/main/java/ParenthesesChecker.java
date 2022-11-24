import java.util.Stack;

public class ParenthesesChecker {

//    Do I need a constructor?

//    check parentheses
//    takes in string
//    return a boolean

//    return true if the string contains "correct" pairs of parentheses
//    return false if not

//    Situation where they return false
//    more opening or closing brackets of particular type
//    (), <>, {}, [],
//    start with a closing bracket

//    Using a stack -
    Stack<String> parenthesesCheck = new Stack<>();

//    Passing for empty string
    /*
    check to see if there are any brackets
    takes in a string
    return a boolean(true), if not false
    use Stack
     */
//    Method
    public boolean checkBracket(String parenthesesCheck){
        if (parenthesesCheck.contains("")){
            return true;
        }
        return false;
    }

//    Passing with one pair
    /*
    check brackets to find one pair - for loop? if statement
    what am I trying to say? = if there is one pair of bracket, return true, if not return false
    take in a string
    return boolean (true)
     */
//    arrangement
//    Method
    public boolean checkParentheses(String parenthesesCheck){
        return parenthesesCheck.contains("()") || parenthesesCheck.contains("<>") ||
                parenthesesCheck.contains("{}") || parenthesesCheck.contains("[]");
    }

//    fails if only one opening
    /*
    connects to passing with one pair
     */

//    fails if only one closing
    /*
    connects to passing with one pair
     */


//    pass if nested
    /*
    check to see if there are nested brackets - if statement
    take in a string
    return a boolean(true)
     */
//    Method
    public boolean nestedBracketCheck(String parenthesesCheck){
        return parenthesesCheck.contains("(())") || parenthesesCheck.contains("<<>>") ||
                parenthesesCheck.contains("{{}}") || parenthesesCheck.contains("[[]]");

    }
//    fails if one pair left open
    /*
    connects to nested pair
     */

//    fails if one pair is not open
    /*
    connects to nested pair
     */



//    pass if parentheses match in text
    /*
    checking a whole string for matching single parentheses - for loop and if statement
    if match - return true boolean
    Easier here to actually use a Stack
     */
//    Method
    public boolean matchParenthesesInText(String parenthesesCheck){
        if(parenthesesCheck.contains("(") && parenthesesCheck.contains(")")){
//            check if there's an opening bracket
            if (parenthesesCheck.contains(")") && !parenthesesCheck.contains("(")){
                return false;
            }
//            check if there's a closing bracket
            if (parenthesesCheck.contains("(") && !parenthesesCheck.contains(")")){
                return false;
            }
            if (parenthesesCheck.contains("{") && parenthesesCheck.contains("}")){
                if (parenthesesCheck.contains("{"))
                    return true;
            }
            return true;
        }
        if (parenthesesCheck.contains("{") & parenthesesCheck.contains("}")){
//            checking if there's a closing bracket
            if (parenthesesCheck.contains("{") && !parenthesesCheck.contains("}")){
                return false;
            }
            if (!parenthesesCheck.contains("{") && parenthesesCheck.contains("}")){
                return false;
            }
            return true;
        }
        return false;
    }

//    fails if no closing brackets in text
    /*
    connects to parentheses match
     */

//    fails if no opening brackets in text
    /*
    connects to parentheses match
     */



//    passing if multiple parentheses pairs
    /*
    checking a whole string of text - find matching multiple brackets
    if statement - return true if complete match
     */
//    Method
    public boolean multiplePairBrackets (String parenthesesCheck){
        if (parenthesesCheck.contains("(") && parenthesesCheck.contains("(") &&
        parenthesesCheck.contains(")") && parenthesesCheck.contains(")")
        ) {
//          Checking if one bracket is left open
            if (parenthesesCheck.contains("(") && parenthesesCheck.contains("(") &&
                    parenthesesCheck.contains(")")) {
                return false;
            }
//            Checking if one bracket is not open
            if (parenthesesCheck.contains("(") && parenthesesCheck.contains(")") &&
                    parenthesesCheck.contains(")")){
                return false;
            }
            return true;
        }
//        checking for multiple braces
        if (parenthesesCheck.contains("{") && parenthesesCheck.contains("{") &&
        parenthesesCheck.contains("}") && parenthesesCheck.contains("}")){
            return true;
        }
        return false;
    }

//    && !parenthesesCheck.contains(")") - this did not work in the multiple brackets
//    fails if one bracket left open
    /*
    connects to multiple brackets
     */

//    fails if one bracket not open
    /*
    connects to multiple brackets
     */



//    pass for lots of nested brackets
    /*
    Checking whole string of text for nested brackets
    if statement - return true
     */
//    Method
    public boolean checkingForNestedBrackets (String parenthesesCheck){
        if (parenthesesCheck.contains("(") && parenthesesCheck.contains("))")){
            return true;
        }
        return false;
    }

//    Extension - Methods
// Update current methods

}
