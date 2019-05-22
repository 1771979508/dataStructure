package recursive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月21日 下午9:55:34	
*/
public class recursiveTest {
	
	/**
	 *
	 * @param list 所有元素的平级集合，map包含id和pid
	 * @param pid 顶级节点的pid，可以为null
	 * @param idName id位的名称，为code
	 * @return 树
	 */
	public static List<Map<String, Object>> getTree(List<Map<String, Object>> list, String pid, String idName) {
	    List<Map<String, Object>> res = new ArrayList<Map<String,Object>>();
	        for (Map<String, Object> map : list) {
	        	
	        	System.out.println(map.get("p"+idName));
	            if(pid == null && map.get("p"+idName) == null || map.get("p"+idName) != null && map.get("p"+idName).equals(pid)){
	                String id = (String) map.get(idName);
	                map.put("children", getTree(list, id, idName));
	                res.add(map);
	            }
	        }
	    return res;
	}
	
	
	public static void main(String[] args) {

		List<String> pcodes = new ArrayList<>();
		pcodes.add(null);
		List<Map<String, Object>> list = new ArrayList<>();
		for (int i = 0, len = 10; i < len; i++){
		    Map<String, Object> map = new HashMap();
		    map.put("code", "code" + i);
		    map.put("name", "name" + i);
		    map.put("pcode", pcodes.get(0));
		    pcodes.add("code" + i);
		    Collections.shuffle(pcodes);
		    list.add(map);
		}
		

		System.out.println(recursiveTest.getTree(list, null, "code"));
		
	}
	
	
	
	
	
	
	
}
	