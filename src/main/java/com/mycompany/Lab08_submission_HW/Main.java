/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lab08_submission_HW;

public class Main {
    
    static boolean Checkfor3(int n){
        
        String r = n + "";
        return r.contains("3");
        
    }
    
    static boolean CheckifPrime(int n){
          if(n==1||n==0)return false;
   
          for(int i=2; i<n; i++){
                if(n%i==0)return false;
          }
          return true;
    }
    
    
    static void populateLists(int n, LinkedList forPrimeNums,  LinkedList forPrimeNumsWith3){
        for(int i = 0; i<=n; i++){
            if(CheckifPrime(i) == true){
                Node new_node = new Node(i);
                forPrimeNums.append(new_node);
                if(Checkfor3(i) == true){
                    Node new_node2 = new Node(i);
                    forPrimeNumsWith3.append(new_node2);
                }    
            }    
        }
    }
    
    
            
    public static void main(String[] args) {
       LinkedList primeNums = new LinkedList();
       LinkedList primeNumsWith3 = new LinkedList();
       
       
       populateLists(43, primeNums, primeNumsWith3);
       System.out.println(primeNumsWith3.getSum());
       
    }
      
       
   }
