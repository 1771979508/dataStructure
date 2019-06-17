package linkedList;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年6月17日 下午10:18:29	
*/
/*
 * 
 * 	输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 *
 * 
 * */

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class MergeOrderLinkedList {
    /*
    public ListNode Merge(ListNode list1,ListNode list2) {
        // 递归实现
        if(list1 == null){
            return list2;
        }  
        if(list2 == null){
            return list1;
        }
        // 新定义一个链表用来存储排序之后的链表
        ListNode newList = null;
        // 判断链表值得大小，进行单调递增
        if(list1.val<list2.val){
            // 如果链表1的第一个节点的值小于链表2的第一个节点的值，则将链表1的第一个值赋给新链表成为新链表中的第一个元素
            newList = list1;
            // 接下来进入递归模式，调用自己的函数继续进行比较，然后接入新链表的后面
            newList.next = Merge(list1.next,list2);
        }else{
            newList = list2;
            newList.next = Merge(list1,list2.next);
        }
        return newList;
    }
    */
    
    public ListNode Merge(ListNode list1,ListNode list2) {
        
        // 非递归实现
        if(list1 == null){
            return list2;
        }  
        if(list2 == null){
            return list1;
        }
        
        // 定义头节点
        ListNode mergeHead = null;
        // 定义当前节点
        ListNode current = null;
        
        // 遍历两个链表直到两个链表都被遍历完
        while(list1!=null&&list2!=null){
            // 如果链表1小于链表2
            if(list1.val <= list2.val){
                // 如果头节点为空，则将list1的节点赋过去
               if(mergeHead == null){
                   mergeHead = current =  list1;
               }else{
                   // 头节点不为空，则当前节点需要往后移动
                   current.next = list1;
                   current = current.next;
               }
                // 合并出去的节点需要往后移动
                list1 = list1.next;
            }else{
               if(mergeHead == null){
                   mergeHead = current =  list2;
               }else{
                   // 头节点不为空，当前节点的下一个节点便是追加过来的节点，并且当前节点为现在节点的下一个节点
                   current.next = list2;
                   current = current.next;
               } 
                list2 = list2.next;
            }
        }
        
        
        // 若果节点list1
        if(list1 == null){
            current.next = list2;
        }else{
            current.next = list1;
        }
        
        // 返回节点
        return mergeHead;
        
    }
    
    
    
    
    
    
    
    
    
    
}
	