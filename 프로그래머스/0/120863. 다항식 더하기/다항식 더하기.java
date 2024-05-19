class Solution {
    public String solution(String polynomial) {
        int xNum = 0;
        int constNum = 0;
        for(String value : polynomial.split(" ")) {
            if(value.contains("x")) {
                value = value.replace("x", "");
                
                if(value.equals("")) {
                    xNum++;
                } else {
                    xNum += Integer.parseInt(value);    
                }
                
            } else if(!value.equals("+")) {
                constNum += Integer.parseInt(value);
            }
        }
        
        String answer;
        if(xNum > 1) {
            answer = xNum + "x";
        } else if (xNum == 1) {
            answer = "x";
        } else {
            answer = "";
        }
        if(constNum > 0) {
            if("".equals(answer)) {
                answer = "" + constNum;
            } else {
                answer += " + " + constNum;
            }
        }
        
        return answer;
    }
}