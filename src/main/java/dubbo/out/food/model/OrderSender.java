package dubbo.out.food.model;

/**
 * 订单和配送人员的关系表格
 * @author 陈佳
 * @createTime 2017�?3�?5�? 下午12:39:44
 *
 */
public class OrderSender {
    private Integer id;

    private Integer orderId;
    
    private Integer userId;
    
    private Integer isGood;

    private Integer isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the isGood
	 */
	public Integer getIsGood() {
		return isGood;
	}

	/**
	 * @param isGood the isGood to set
	 */
	public void setIsGood(Integer isGood) {
		this.isGood = isGood;
	}

	/**
	 * @return the isDel
	 */
	public Integer getIsDel() {
		return isDel;
	}

	/**
	 * @param isDel the isDel to set
	 */
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

}