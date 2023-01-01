// Evaluate Reverse Polish Notation
class ques_1{
    public static boolean isStringAnInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } 
        catch (NumberFormatException e) {
            return false;
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<tokens.length;i++){
            if(isStringAnInteger(tokens[i])){
                st.push(Integer.parseInt(tokens[i]));
            }
            else{
                int b = st.pop();
                int a = st.pop();
                int res = 0;
                if(tokens[i].equals("/")){
                    res = a/b;
                }
                else if(tokens[i].equals( "*")){
                    res = a*b;
                }
                else if(tokens[i].equals("+")){
                    res = a+b;
                }
                else{
                    res = a-b;
                }
                st.push(res);
            }
        }
        return st.pop();
    }
}