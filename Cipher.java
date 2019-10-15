/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alyshokry
 */
public class Cipher {

    // declare text and key of encryption 
     static String encrypt(String plain,int key){
        //declare an empty string Var.
        String  temp ="";
        for(int i = 0;i<plain.length();i++){
        //get the characters'index one by one from the arrayofCharacter
        //add the key to it
        if(plain.charAt(i)==' '){
        temp+= ' '; }
        else if (plain.charAt(i)+key >'z'){
        temp += ((char)(plain.charAt(i)-(26-key)));
        }
        else 
        
        temp+=((char)(plain.charAt(i)+key));
        
        }
        return temp;
        
        
        
    }
    
     static String decrypt(String plain,int key){
        //declare an empty string Var.
        String  temp ="";
        for(int i = 0;i<plain.length();i++){
            
        //get the characters'index one by one from the arrayofCharacter
        //add the key to it
        //add module 122 to solve z problem as it is the greatest
        if(plain.charAt(i)==' '){
        temp+= ' '; }
        else if (plain.charAt(i)-key <'a'){
        temp += ((char)(plain.charAt(i)-(key-26)));
        }
        else 
        
        temp+=((char)(plain.charAt(i)-key));
        }
        return temp;
        
        
        
    }
}
