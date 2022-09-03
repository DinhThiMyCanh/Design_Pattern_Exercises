package Adapter;

public class Client {

	public static void main(String[] args) {
		VietNameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
		client.send("xin chaÌo");
	}

}
