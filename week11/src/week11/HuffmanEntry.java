package week11;

public class HuffmanEntry {
	private int frequency;
	private String word;
	private HuffmanEntry left;
	private HuffmanEntry right;
	private String code;

	public HuffmanEntry(int newFreq, String newValue, HuffmanEntry l, HuffmanEntry r, String s) {
		frequency = newFreq;
		word = newValue;
		left = l;
		right = r;
		code = s;
	}

	public int getKey() {
		return frequency;
	}

	public String getValue() {
		return word;
	}

	public String getCode() {
		return code;
	}

	public HuffmanEntry getLeft() {
		return left;
	}

	public HuffmanEntry getRight() {
		return right;
	}

	public void setCode(String newCode) {
		code = newCode;
	}
}
