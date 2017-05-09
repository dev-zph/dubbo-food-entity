/**
 * 
 */
package dubbo.out.food.querybean;

import java.util.Date;

/**
 * 骑士视角 订单详情返回对象
 * 
 * @author 陈佳
 * @createTime 2017�?4�?10�? 下午2:39:07
 * 
 */
public class OrderBeanForSender {

	/**
	 * 订单id
	 */
	private Integer orderId;
	/**
	 * 订单编号
	 */
	private String orderNum;
	/**
	 * 买家名称
	 */
	private String userName;
	/**
	 * 买家地址
	 */
	private String userAddress;
	/**
	 * 买家电话
	 */
	private String userPhone;
	/**
	 * 商铺名称
	 */
	private String shopName;
	/**
	 * 商铺地址
	 */
	private String shopAddress;
	/**
	 * 商品联系电话
	 */
	private String shopPhone;
	/**
	 * 订单状�??
	 */
	private Integer orderStatus;
	/**
	 * 订单创建时间
	 */
	private Date addTime;
	
	/**
	 * @return the orderNum
	 */
	public String getOrderNum() {
		return orderNum;
	}
	/**
	 * @param orderNum the orderNum to set
	 */
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userAddress
	 */
	public String getUserAddress() {
		return userAddress;
	}
	/**
	 * @param userAddress the userAddress to set
	 */
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	/**
	 * @return the userPhone
	 */
	public String getUserPhone() {
		return userPhone;
	}
	/**
	 * @param userPhone the userPhone to set
	 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	/**
	 * @return the shopName
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * @param shopName the shopName to set
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * @return the shopAddress
	 */
	public String getShopAddress() {
		return shopAddress;
	}
	/**
	 * @param shopAddress the shopAddress to set
	 */
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	/**
	 * @return the shopPhone
	 */
	public String getShopPhone() {
		return shopPhone;
	}
	/**
	 * @param shopPhone the shopPhone to set
	 */
	public void setShopPhone(String shopPhone) {
		this.shopPhone = shopPhone;
	}
	/**
	 * @return the orderStatus
	 */
	public Integer getOrderStatus() {
		return orderStatus;
	}
	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * @return the addTime
	 */
	public Date getAddTime() {
		return addTime;
	}
	/**
	 * @param addTime the addTime to set
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	/**
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	
}
