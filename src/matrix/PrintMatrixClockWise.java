package matrix;

import java.util.ArrayList;

/*
 * 
 * 		顺时针打印矩阵:
 * 			
 * 			输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 			例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 			则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * 
 * */

public class PrintMatrixClockWise {

	// 创建一个list集合用来暂存数据
	ArrayList arrayList = new ArrayList();
	
	public ArrayList printMatrix(int[][] matrix){
		int sr = 0; // 开始行:startRow
		int sc = 0; // 开始列:startColumn
		int er = matrix.length-1;  // 结束行:endRow
		int ec = matrix[0].length - 1;  // 结束列:endColumn
		// 如果走的行列还在矩阵的结束行列之前，则进行打印操作
		while(sr<=er && sc<=ec){
			printEdge(matrix,sr++,sc++,er--,ec--);
		}
		return arrayList;
	}
	// 打印矩阵的函数
	public void printEdge(int[][] m,int sr,int sc,int er,int ec){
		// 第一种情况，如果只有一行,则打印横行的列
		if(sr == er){
			// 遍历剩下的列
			for(int i=sc;i<=ec;i++){
				arrayList.add(m[sr][i]);  // 添加固定的行(sr)和变动的列(i)
			}
		}else if(sc == ec){  // 第二种情况，如果只有一列的话，则只打印该列的行
			for(int i=sr;i<=er;i++){
				arrayList.add(m[i][ec]);  // 添加变动的行(i)和固定的列(ec)
			}
		}else{
			// 定义当前列和行,用两个当前存储 用于判断当前位置
			int curC = sc;
			int curR = sr;
			// 当前位置未到达当前行的最右列的时候 -> 往右去时
			while(curC != ec){
				// 添加所在行和列的数据
				arrayList.add(m[sr][curC]);   //  这里默认的行在第一行的么
				// 继续往右边移动
				curC++;
			}
			// 当前位置未到达当前列的最底行 -> 往下去时
			while(curR != er){
				arrayList.add(m[curR][ec]);
				// 行往下移动
				curR++;
			}
			// 当前位置未到达当前行的最左列 -> 往左去时
			while(curC != sc){
				arrayList.add(m[er][curC]);
				curC--;
			}
			// 当前位置未到达当前列的最顶行 -> 往上去
			while(curR != sr){
				arrayList.add(m[curR][sc]);
				curR--;
			}
		}
	}
	
}
