/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfstudy.WeekWork;

/**
 *
 * @author Dylan
 */
public class Week17_to_Week18 {
    
/*
查找不連續的數組的第一個元素。

不連續是指不比數組的前一個元素大1。

例如，如果我們有一個數組[1,2,3,4,6,7,8]，然後1再2然後3則4是所有連續的，但6不是，所以這是第一個非連續編號。

如果整個數組是連續的，則返回null。

數組將始終至少包含2元素1，並且所有元素均為數字。這些數字也將都是唯一的並且按升序排列。數字可以是正數或負數，第一個非連續數也可以是正數或負數！

*/

static Integer find(final int[] array) {
        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i] + 1 != array[i+1]) {
                    return array[i+1];
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            return null;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] m = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(Week17_to_Week18.find(m));

    }

    
}
