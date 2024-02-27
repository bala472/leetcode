class RomanToInteger {
    public int romanToInt(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                if(i+1<s.length()&&s.charAt(i+1)!=s.charAt(i)){
                    result=result-1;
                }else{
                    result=result+1;
                }   
            }
            else if(s.charAt(i)=='V'){
                if(i+1<s.length()&&s.charAt(i+1)!='I'&&s.charAt(i+1)!='V'){
                    result=result-5;
                }else{
                    result=result+5;
                } 
            }
            else if(s.charAt(i)=='X'){
                if(i+1<s.length()&&s.charAt(i+1)!='I'&&s.charAt(i+1)!='V'&&s.charAt(i+1)!='X'){
                    result=result-10;
                }else{
                    result=result+10;
                } 
            }
            else if(s.charAt(i)=='L'){
                if(i+1<s.length()&&s.charAt(i+1)!='I'&&s.charAt(i+1)!='V'&&s.charAt(i)!='X'&&s.charAt(i)!='L'){
                    result=result-50;
                }else{
                    result=result+50;
                }
            }
            else if(s.charAt(i)=='C'){
                if(i+1<s.length()&& s.charAt(i+1)!='I'&&s.charAt(i+1)!='V'&&s.charAt(i+1)!='X'&&s.charAt(i+1)!='L'&&s.charAt(i+1)!='C'){
                    result=result-100;
                }else{
                    result=result+100;
                } 
            }
            else if(s.charAt(i)=='D'){
                if(i+1<s.length()&&s.charAt(i+1)!='I'&&s.charAt(i+1)!='V'&&s.charAt(i+1)!='X'&&s.charAt(i+1)!='L'&&s.charAt(i+1)!='C'&&s.charAt(i+1)!='D'){
                    result=result-500;
                }else{
                    result=result+500;
                } 
            }
            else if(s.charAt(i)=='M'){
                    result=result+1000;
                } 
            }
            return result;
        }
}
        