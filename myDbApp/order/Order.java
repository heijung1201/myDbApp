package myDbApp.order;

public class Order {

	private int orderNum;// �ֹ���ȣ
	private int menuNum;// �޴���ȣ
	private int qty;// �ֹ�����
	private int price;// ���� �޴� ����
	private String paid;// ����Ȯ��
	private String served;// ���ĳ���Ȯ��

	public Order() {

	}

	public Order(int menuNum, int qty) {
		// �ֹ� �߰���
		this.menuNum = menuNum;
		this.qty = qty;
	}

	public Order(int menuNum, int qty, int price) {
		// �ֹ� ������
		this.menuNum = menuNum;
		this.qty = qty;
		this.price = price;
	}

	public Order(int orderNum, int menuNum, int qty, int price, String paid, String served) {
		this.orderNum = orderNum;
		this.menuNum = menuNum;
		this.qty = qty;
		this.price = price;
		this.paid = paid;
		this.served = served;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public int getMenuNum() {
		return menuNum;
	}

	public void setMenuNum(int menuNum) {
		this.menuNum = menuNum;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getServed() {
		return served;
	}

	public void setServed(String served) {
		this.served = served;
	}

	@Override
	public String toString() {
		return "�ֹ� [�ֹ���ȣ=" + orderNum + ", �޴���ȣ=" + menuNum + ", �ֹ�����=" + qty + ", �����ݾ�=" + price + ", ����ó��=" + paid
				+ "]";
	}

}