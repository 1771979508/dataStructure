package dividedAndConquer;


/*
 * 
 * 		假设我们有 n 个数据，我们期望数据从小到大排列，那完全有序的数据的有序度就是 n(n-1)/2，逆序度等于 0；
 * 			相反，倒序排列的数据的有序度就是 0，逆序度是 n(n-1)/2。
 * 			除了这两种极端情况外，我们通过计算有序对或者逆序对的个数，来表示数据的有序度或逆序度。
 * 
 * 		
 * 		思路分析:
 * 			我们用分治算法来试试。我们套用分治的思想来求数组 A 的逆序对个数。
 * 			我们可以将数组分成前后两半 A1 和 A2，分别计算 A1 和 A2 的逆序对个数 K1 和 K2，
 * 			然后再计算 A1 与 A2 之间的逆序对个数 K3。那数组 A 的逆序对个数就等于 K1+K2+K3。
 * 		
 * 		归并排序中有一个非常关键的操作，就是将两个有序的小数组，合并成一个有序的数组。
 * 		实际上，在这个合并的过程中，我们就可以计算这两个小数组的逆序对个数了。
 * 		每次合并操作，我们都计算逆序对个数，把这些计算出来的逆序对个数求和，就是这个数组的逆序对个数了。
 * 		
 * 
 * */

public class reverseCount {
	
	private int num = 0; // 全局变量或者成员变量
	
	public int count(int[] a,int n){
		num = 0;
		mergeSortCounting(a,0,n-1);
		return num;
	}
	
	private void mergeSortCounting(int[] a,int p,int r){ // a:数组  p:第一个元素   r:数组最后一个元素
		if(p>=r){
			return;
		}
		// 用中间值来进行数组切割
		int q = (p+r)/2;
		// 对切割后的两端数组再次递归切割
		mergeSortCounting(a,p,q);
		mergeSortCounting(a,q+1,r);
		// 做最后的合并
		merge(a,p,q,r);
	}
	
	public void merge(int[] a,int p,int q,int r){
		// i,j分别代表两组数组的最前端
		int i = p,j = q+1,k=0;  
		// 声明一个等长的数组
		int[] tmp = new int[r-p+1];
		// 处理两个元素都合并的
		while(i<=q && j<=r){
			// 按大小将新元素排进数组中去
			if(a[i] <= a[j]){
				tmp[k++] = a[i++];
			}else{
				// 否则，统计数组 左段 中 大于 当前右段元素值的个数
				num+=(q-i+1);
				tmp[k++] = a[j++];
			}
		}
		// 处理 单独 两个数组 [i - q]
		while(i <= q){
			tmp[k++] = a[i++];
		}
		// 处理单独 两个数组 [j - r]
		while(j<=r){
			tmp[k++] = a[j++];
		}
		// 将临时数组重新放回原来的a数组
		for(i=0;i<r-p;i++){
			a[p+i] = tmp[i];
		}
	}
	
	
}
