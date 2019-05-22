package recursive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月21日 下午10:05:36	
*/
public class recursiveMine {
	
	public static List<Map<String,Object>> getTree(List<Map<String,Object>> list,String[] name){
		List<Map<String,Object>> res = new ArrayList<Map<String,Object>>();
		int count = 0;
		for(Map<String, Object> map : list){
			for(String key : map.keySet()){
				if(key.equals(name[count])){
					map.put("children", getTree(list, name));
					res.add(map);
				}else{
					count++;
					continue;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		String[] strings = new String[]{"截排水工程","填方工程"};
		String[] docs = new String[]{"截排水工程原材料检验试验资料","截排水工程测量放样资料","截排水工程原材料报验资料","截排水工程主要设备报验资料","截排水工程安全交底资料"};
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		for(int b=0;b<strings.length;b++){
			for(int a=0;a<docs.length;a++){
				Map<String,Object> map = new HashMap<>();
				map.put(strings[b],docs[a]);
				list.add(map);
			}
		}
		System.out.println(list);
		
		System.out.println(recursiveMine.getTree(list,strings));
		
	}
	
}
	