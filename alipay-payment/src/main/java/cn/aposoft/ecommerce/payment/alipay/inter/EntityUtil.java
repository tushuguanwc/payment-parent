package cn.aposoft.ecommerce.payment.alipay.inter;

import java.util.Map;

import cn.aposoft.ecommerce.payment.alipay.impl.PayResponse;

/**
 * 支付与退款的过程封装
 * 
 * @author Yujinshui
 *
 */
public interface EntityUtil {
	/**
	 * [支付]将返回的map结果解析成PayResponse-javabean
	 * 
	 * @param xml
	 * @return
	 */
	PayResponse parsePayResponseXml(String xml);

	/**
	 * 将返回的xml字符串解析成map类型返回
	 * 
	 * @param xml
	 * @return
	 * @author Yujinshui
	 * @time 2015年11月12日 下午8:24:28
	 */
	Map<String, String> parseMapXml(String xml);
}
