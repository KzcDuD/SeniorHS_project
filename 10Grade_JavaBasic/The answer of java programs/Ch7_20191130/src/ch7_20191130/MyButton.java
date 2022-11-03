/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20191130;

/**
 *
 * @author xvpow
 */
public class MyButton implements Action {

    private int ans;
    private int v1, v2;

    public MyButton(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public boolean doing() {
        try {
            ans = v1 / v2;
            return true;
        } catch (Exception ex) {

        }
        return false;
    }

    public void onClick() {
        System.out.println(
                isPass("計算成功", "計算失敗", true));
    }
}
