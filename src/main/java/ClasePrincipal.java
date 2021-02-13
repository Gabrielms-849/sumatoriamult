/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gdms
 */
public class ClasePrincipal {
    public static void main(String[] args) {

        int m_1[][]              = new int[3][3];
        int m_2[][]              = new int[3][3];
        int m_resultado_suma[][] = new int[3][3];
        int m_3[][]              = new int[3][2];
        int m_resultado_mult[][] = new int[2][2];

        //m_1
        for (int i = 0; i < m_1.length; i++) {
            for (int j = 0; j < m_1.length; j++) {
                m_1[i][j] = (int) (Math.random() * 5);
            }
        }

        //m_2
        for (int i = 0; i < m_2.length; i++) {
            for (int j = 0; j < m_2.length; j++) {
                m_2[i][j] = (int) (Math.random() * 5);
            }
        }
        //m_3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                m_3[i][j] = (int) (Math.random() * 5);
            }
        }

        
        //Sumamos
        for (int i = 0; i < m_1.length; i++) {
            for (int j = 0; j < m_2.length; j++) {
                m_resultado_suma[i][j] = m_1[i][j] + m_2[i][j];
                }
        }

        

    
        
        //Multiplicamos
        for (int i = 0; i < 4; i++) {

            if (m_resultado_mult[0][0] == 0) {
                int temporal = (m_resultado_suma[0][0] * m_3[0][0])
                        + (m_resultado_suma[0][1] * m_3[1][0])
                        + (m_resultado_suma[0][2] * m_3[2][0]);

                m_resultado_mult[0][0] = temporal;

            } else if (m_resultado_mult[1][0] == 0) {
                int temporal = (m_resultado_suma[1][0] * m_3[0][0])
                        + (m_resultado_suma[1][1] * m_3[1][0])
                        + (m_resultado_suma[1][2] * m_3[2][0]);

                m_resultado_mult[1][0] = temporal;

            } else if (m_resultado_mult[0][1] == 0) {
                int temporal = (m_resultado_suma[0][0] * m_3[0][1])
                        + (m_resultado_suma[0][1] * m_3[1][1])
                        + (m_resultado_suma[0][2] * m_3[2][1]);

                m_resultado_mult[0][1] = temporal;

            } else if (m_resultado_mult[1][1] == 0) {
                int temporal = (m_resultado_suma[1][0] * m_3[0][1])
                        + (m_resultado_suma[1][1] * m_3[1][1])
                        + (m_resultado_suma[1][2] * m_3[2][1]);

                m_resultado_mult[1][1] = temporal;

            }
        }

        //imprimimos
        for (int i = 0; i < 3; i++) {

            if (i < 2) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[ " + m_resultado_suma[i][j] + " ]");
                }
                if (i == 1) {
                    System.out.print("   x   ");
                } else {
                    System.out.print("       ");
                }
            } else {
                System.out.print("                      ");
            }

            for (int j = 0; j < 2; j++) {
                System.out.print("[ " + m_3[i][j] + " ]");
            }
            if (i == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }
            
            if(i < 2){
                for (int j = 0; j < 2; j++) {
                    System.out.print("[ " + m_resultado_mult[i][j] + " ]");
                }
            }
            System.out.println("");
        }

    }
    
}
