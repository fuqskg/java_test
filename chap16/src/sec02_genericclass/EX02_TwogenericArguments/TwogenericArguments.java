package sec02_genericclass.EX02_TwogenericArguments;

class KeyValue<K, V>{
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}

public class TwogenericArguments {

	public static void main(String[] args) {
		//제네릭 타입 변수 K, V가 각각 String, Integer타입으로 결정
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		kv1.setKey("사과");
		kv1.setValue(1000);
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("key: " + key1 + " value: " + value1);
		
		//제네릭 타입 변수 K, V가 각각 Integer, String타입으로 결정
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setKey(404);
		kv2.setValue("Not Found(요청한 페이지를 찾을 수 없습니다.)");
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		System.out.println("key: " + key2 + " value: " + value2);
		
		//Void: 해당 제네릭 타입변수의 필드를 사용하지 않는다는 걸 의미
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("키값만 사용");
		String key3 = kv3.getKey();
		System.out.println("key : " + key3);
	}

}
