package BinaryConversions;

public class ConvertDateToBinary {

    public String convertDateToBinary(String date) {
        StringBuilder ans =  new StringBuilder();
        String[] arr = date.split("-");
        for(int i = 0; i<arr.length; i++){
            int value = Integer.parseInt(arr[i]);
            String ff = Integer.toBinaryString(value); // Crucial method here
            ans.append(ff);
            if(i != arr.length-1){
                ans.append('-');
            }
        }
        return ans.toString();
    }

}
