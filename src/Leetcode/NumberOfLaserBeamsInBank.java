package Leetcode;

public class NumberOfLaserBeamsInBank {

    public static int numberOfBeamsOptimized(String[] bank) {
        int prev = 0, ans = 0;

        for (String s: bank) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    count++;
                }
            }
            if (count > 0) {
                ans += prev * count;
                prev = count;
            }
        }

        return ans;
    }

    public static int numberOfBeams(String[] bank) {
        // Variable countOfBeams
        // Iterate through each row
        // count number of security devices on each row
        // add number of security devices to an array of ints
        // multiply r1 devices by r2 devices if r2 devices not zero

        int countOfBeams = 0;
        int[] devicesPerRow = new int[bank.length];
        devicesPerRow = getDevicesPerRow(devicesPerRow, bank);

        // [3, 0, 2, 1]
        int i = 0;
        int j = 1;

        while(j < devicesPerRow.length) {
            int left = devicesPerRow[i];
            int right = devicesPerRow[j];
            if (right == 0) {
                j++;
            } else {
                int product = left * right;
                countOfBeams += product;
                i = j;
                j++;
            }
        }
        return countOfBeams;
    }

    public static int[] getDevicesPerRow(int[] devicesPerRow, String[] bank) {
        for (int i = 0; i < bank.length; i++) {
            int noOfDevices = 0;
            for (char c : bank[i].toCharArray()) {
                if (c == '1') {
                    noOfDevices+= 1;
                }
            }
            devicesPerRow[i] = noOfDevices;
        }
        return devicesPerRow;
    }
}
