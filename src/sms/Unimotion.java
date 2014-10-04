//Unimotion.java
//Unimotion

// Created by Daniel Shiffman

// For information on setting Java configuration information, including 
// setting Java properties, refer to the documentation at
// http://developer.apple.com/techpubs/java/java.html

package sms;

public class Unimotion {

    // Load the JNI Interface
    static {    	
        System.loadLibrary("UnimotionLib");
    }

    // Native function
    private static native int[] readSMS();

    // Return three values as array
    public static int[] getSMSArray() {
        return readSMS(); 
    }
    
    // Return just the X
    public static int getSMSX() {
        return readSMS()[0]; 
    }

    // Return just the Y
    public static int getSMSY() {
        return readSMS()[1]; 
    }

    // Return just the Z
    public static int getSMSZ() {
        return readSMS()[2]; 
    }
}

