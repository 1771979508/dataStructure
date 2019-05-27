package array;
import java.util.ArrayList;

public class minNumForArray {
    
    /*
    *    找到旋转数组中的第一个元素即可
    */
    
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }else{
            // 遍历整个数组
            for(int i=0;i<array.length;i++){// 因为是非减排序数组
                // 所以如果遇到前一个比后一个大的情况就说明找到了旋转数组
                if(array[i]>array[i+1]){ 
                    // 返回后面的旋转数组
                    return array[i+1];
                }
            }
            // 再次返回旋转数组的第一条数据
            return array[0];
        }
        
    }
}