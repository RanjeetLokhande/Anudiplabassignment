package githublab;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "this is the easiest example";
		String[] list = str1.split("\\s");
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i].length() > list[j].length()) {   //ascending='>'&&descending='<'
					String temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
			System.out.println(list[i]);
		}
	}

}

// har word chya length nusar tyachi position tharnar ascending kivha descending order.
