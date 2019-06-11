package orderInt;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年6月11日 下午11:38:53	
*/
/*
*    整体思路：  1.统计奇数的个数
                2.新建一个等长的数组，设置两个指针，奇数指针从0开始，偶数指针从奇数个数的末尾开始 遍历，填数
*    
*/
public class adjustArrAno1 {
    public void reOrderArray(int [] array) {
        if(array.length == 0 || array.length == 1){
            return;
        }
        // 奇数的个数
        int oddCount = 0;
        // 奇数的指针
        int oddBegin = 0;
        // 新建一个等长数组
        int[] newArray = new int[array.length];
        
        // 遍历统计奇数的个数
        for(int i=0;i<array.length;i++){
            if((array[i]&1)==1){
                oddCount++;
            }
        }
        
        // 遍历数组将是奇数的数组放进新的数组中 - 秒在自增，你放进去一个数字则长度增加
        for(int i=0;i<array.length;i++){
            // 如果是奇数放到新数组中的第一个
            if((array[i]&1)==1){
                newArray[oddBegin++] = array[i];
            }else{// 如果是偶数则放在奇数的后面
                newArray[oddCount++] = array[i];
            }
        }
        
        // 循环将排序好的新数组放进旧的数组中去
        for(int i=0;i<array.length;i++){
            array[i] = newArray[i];
        }
        
    }
}