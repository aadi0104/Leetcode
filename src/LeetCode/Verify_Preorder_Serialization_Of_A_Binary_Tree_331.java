package LeetCode;
public class Verify_Preorder_Serialization_Of_A_Binary_Tree_331 {

	public boolean main(String[] args) {
		String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
		return Verify_Preorder_Serialization_Of_A_Binary_Tree(preorder);
	}

	public boolean Verify_Preorder_Serialization_Of_A_Binary_Tree(String preorder) {
		int vac = 1;
		String[] ch = preorder.split(",");
		for (int i = 0; i < ch.length; i++) {
			vac--;
			if (vac < 0) {
				return false;
			}
			if (!ch[i].equals("#")) {
				vac += 2;
			}
		}
		return (vac == 0);
	}

}
