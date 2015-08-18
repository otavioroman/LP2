/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;

/**
 *
 * @author 41440927
 */
public class Lp2_03g12_lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name = IOManager.readKeyboard("Qual seu nome?");
        //System.out.println(resp);
        Gamer gamer = new Gamer(name, 0, 0);
        System.out.println("O gamer criado é: "+gamer);
        
        File file = new File("C:/Temp/arquivo.txt");
        
        IOManager.saveGamer(gamer,file);
        Gamer gamer2 = IOManager.readGamer(file);
        System.out.println("O gamer lido é: "+gamer2);
    }
    
}
