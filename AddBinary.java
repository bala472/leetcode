class AddBinary {
    public String addBinary(String a, String b) {
    int i = a.length()-1;
    int j = b.length()-1;
    int calc = 0;
    StringBuilder result = new StringBuilder();
    while (i>=0 || j>=0) 
    {
        int sum=calc;
        if (j>=0)
        {
            sum = sum + b.charAt(j)-'0';
            j--;
        }
        if (i>=0)
        {
            sum = sum+a.charAt(i)-'0';
            i--;
        }
        result.append(sum%2);
        calc= sum/2;
    }
    if (calc!=0)
    {
        result.append(calc);
    }
    return result.reverse().toString();
    }
}
