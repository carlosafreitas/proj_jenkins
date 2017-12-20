/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Carlos
 */
public class Calcular {
    private float num01;
    private float num02;

    public float getNum01() {
        return num01;
    }

    public void setNum01(float num01) {
        this.num01 = num01;
    }

    public float getNum02() {
        return num02;
    }

    public void setNum02(float num02) {
        this.num02 = num02;
    }
    
    public float soma(float num01, float num02){
        
        return (num01 + num02);
    }
            
}
