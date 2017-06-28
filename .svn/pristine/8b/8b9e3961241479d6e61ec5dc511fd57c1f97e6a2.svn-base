/**
 * Description:等额本息工具类
 */
package com.ut.scf.core.util;  
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;  
import java.util.List;
import java.util.Map;  
  
/**  
 * 等额本金是指一种贷款的还款方式，是在还款期内把贷款数总额等分，每月偿还同等数额的本金和剩余贷款在该月所产生的利息，这样由于每月的还款本金额固定，  
 * 而利息越来越少，借款人起初还款压力较大，但是随时间的推移每月还款数也越来越少。  
 */  
public class AverageCapitalUtils {  
	
	public static final int AMT_SHOW_SCALE = 2;//金额显示精度
	  
	public static final int AMT_SCALE = 6;//金额保存精度
	
	public static final int INTEREST_SCALE = 18;//利率保存精度，如设12位，则1千万本金会误差1分钱。
  
    /**  
     * 等额本金计算获取还款方式为等额本金的每月偿还本金和利息  
     *   
     * 公式：每月偿还本金=(贷款本金÷还款月数)+(贷款本金-已归还本金累计额)×月利率  
     *   
     * @param invest  
     *            总借款额（贷款本金）  
     * @param yearRate  
     *            年利率  
     * @param month  
     *            还款总月数  
     * @return 每月偿还本金和利息,四舍五入  
     */  
    public static Map<Integer, BigDecimal> getPerMonthPrincipalInterest(BigDecimal invest, BigDecimal yearRate, int totalMonth) {  
        Map<Integer, BigDecimal> map = new HashMap<Integer, BigDecimal>();  
        // 每月本金  
        BigDecimal monthPri = getPerMonthPrincipal(invest, totalMonth);  
        // 获取月利率  
        BigDecimal monthRate = getMonthRateByYearRate(yearRate);  
        for (int i = 1; i <= totalMonth; i++) { 
        	//double monthRes = monthPri + (invest - monthPri * (i - 1)) * monthRate; 
            BigDecimal monthRes = monthPri.add(invest.subtract(monthPri.multiply(new BigDecimal(i - 1))).multiply(monthRate));  
            monthRes = monthRes.setScale(AMT_SCALE, BigDecimal.ROUND_HALF_UP);  
            map.put(i, monthRes);  
        }  
        return map;  
    }  
  
    /**  
     * 等额本金计算获取还款方式为等额本金的每月偿还利息  
     *   
     * 公式：每月应还利息=剩余本金×月利率=(贷款本金-已归还本金累计额)×月利率  
     *   
     * @param invest  
     *            总借款额（贷款本金）  
     * @param yearRate  
     *            年利率  
     * @param month  
     *            还款总月数  
     * @return 每月偿还利息  
     */  
    public static Map<Integer, BigDecimal> getPerMonthInterest(BigDecimal invest, BigDecimal yearRate, int totalMonth) {  
        Map<Integer, BigDecimal> inMap = new HashMap<Integer, BigDecimal>();  
        BigDecimal principal = getPerMonthPrincipal(invest, totalMonth);  
        Map<Integer, BigDecimal> map = getPerMonthPrincipalInterest(invest, yearRate, totalMonth);  
        for (Map.Entry<Integer, BigDecimal> entry : map.entrySet()) {  
           // BigDecimal principalBigDecimal = new BigDecimal(principal);  
           // BigDecimal principalInterestBigDecimal = entry.getValue();  
            BigDecimal interestBigDecimal = entry.getValue().subtract(principal);  
            interestBigDecimal = interestBigDecimal.setScale(AMT_SCALE, BigDecimal.ROUND_HALF_UP);  
            inMap.put(entry.getKey(), interestBigDecimal);  
        }  
        return inMap;  
    }  
  
    /**  
     * 等额本金计算获取还款方式为等额本金的每月偿还本金  
     *   
     * 公式：每月应还本金=贷款本金÷还款月数  
     *   
     * @param invest  
     *            总借款额（贷款本金）  
     * @param yearRate  
     *            年利率  
     * @param month  
     *            还款总月数  
     * @return 每月偿还本金  
     */  
    public static BigDecimal getPerMonthPrincipal(BigDecimal invest, int totalMonth) {  
        BigDecimal monthIncome = invest.divide(new BigDecimal(totalMonth), AMT_SCALE, BigDecimal.ROUND_HALF_UP);
        return monthIncome;
    }  
  
    /**  
     * 等额本金计算获取还款方式为等额本金的总利息  
     *   
     * @param invest  
     *            总借款额（贷款本金）  
     * @param yearRate  
     *            年利率  
     * @param month  
     *            还款总月数  
     * @return 总利息  
     */  
    public static BigDecimal getInterestCount(BigDecimal invest, BigDecimal yearRate, int totalMonth) {  
        BigDecimal count = new BigDecimal(0);  
        Map<Integer, BigDecimal> mapInterest = getPerMonthInterest(invest, yearRate, totalMonth);  
        for (Map.Entry<Integer, BigDecimal> entry : mapInterest.entrySet()) {  
            count = count.add(entry.getValue());  
        }  
        return count;
    }  
  
    /**
     * 等额本金计算获取还款方式为等额本金的总还款金额
     * @param invest
     * @param yearRate
     * @param totalMonth
     * @return
     */
    public static BigDecimal getPrincipalCount(BigDecimal invest, BigDecimal yearRate, int totalMonth){
    	return invest.add(getInterestCount(invest, yearRate, totalMonth));
    }
    
    /**
     * 根据年利率获取月利率
     * @param yearRate  年利率
     * @return  monthRate  月利率
     */
     public static BigDecimal getMonthRateByYearRate(BigDecimal yearRate){
     	BigDecimal monthRate = yearRate.divide(new BigDecimal(12),INTEREST_SCALE,BigDecimal.ROUND_HALF_UP);
     	return monthRate;
     }
    
     /**
      * 生成还款计划表
      * @param invest
      * @param yearRate
      * @param totalmonth
      * @return
      */
     public static List<Map<String, Object>>  getListPrincipalInterest(BigDecimal invest, BigDecimal yearRate, int totalmonth){
     	List<Map<String, Object>> list= new ArrayList<Map<String, Object>>();
     	Map<Integer, BigDecimal> mapInterest = getPerMonthInterest(invest, yearRate, totalmonth);//每月还利息集合
     	BigDecimal principal = getPerMonthPrincipal(invest, totalmonth);//每月还本金集合
     	BigDecimal principalInterestCount = getInterestCount(invest, yearRate, totalmonth).add(invest);//应还本息总和
     	Map<Integer, BigDecimal> perMonthPrincipalInterest = getPerMonthPrincipalInterest(invest, yearRate, totalmonth);
     	for (int i = 1; i <= totalmonth; i++) {
     		Map<String, Object> map = new HashMap<String, Object>();
     		map.put("months", i);//月份
     		map.put("principalInterest", perMonthPrincipalInterest.get(i).setScale(AMT_SHOW_SCALE,BigDecimal.ROUND_HALF_UP));
     		map.put("principal", principal.setScale(AMT_SHOW_SCALE, BigDecimal.ROUND_HALF_UP));//月供本金
     		map.put("interest", mapInterest.get(i).setScale(AMT_SHOW_SCALE, BigDecimal.ROUND_HALF_UP));//月供利息
     		principalInterestCount = principalInterestCount.subtract(principal).subtract(mapInterest.get(i));
     		map.put("lastPrincipalInterestCount", principalInterestCount.setScale(AMT_SHOW_SCALE,BigDecimal.ROUND_HALF_UP));//剩余本息
     		list.add(map);
 		}    	
     	return list;
     }
     
    /**  
     * @param args  
     */  
    public static void main(String[] args) {  
        BigDecimal invest = new BigDecimal("1000000"); // 本金  
        int month = 30*12;
        BigDecimal yearRate = new BigDecimal(0.0475); // 年利率  
        System.out.println("等额本金---本金："+invest);
        System.out.println("等额本金---共"+month+"期");
        BigDecimal monthRate = getMonthRateByYearRate(yearRate);
        System.out.println("等额本金---月利率："+monthRate);
        /*Map<Integer, BigDecimal> getPerMonthPrincipalInterest = getPerMonthPrincipalInterest(invest, yearRate, month);  
        System.out.println("等额本金---每月本息：" + getPerMonthPrincipalInterest);  */
        BigDecimal benjin = getPerMonthPrincipal(invest, month);  
        System.out.println("等额本金---每月本金:" + benjin.setScale(AMT_SHOW_SCALE,BigDecimal.ROUND_HALF_UP));  
        /*Map<Integer, BigDecimal> mapInterest = getPerMonthInterest(invest, yearRate, month);  
        System.out.println("等额本金---每月利息:" + mapInterest);*/   
        BigDecimal count = getInterestCount(invest, yearRate, month);  
        System.out.println("等额本金---总利息：" + count.setScale(AMT_SHOW_SCALE,BigDecimal.ROUND_HALF_UP));
        System.out.println("等额本金---还款总额：" + getPrincipalCount(invest, yearRate, month).setScale(AMT_SHOW_SCALE,BigDecimal.ROUND_HALF_UP));
        System.out.println("等额本金---还款详情------------------------------");
        List<Map<String, Object>> list = getListPrincipalInterest(invest, yearRate, month);
        for (Map<String, Object> map : list) {
        	 System.out.println("第"+map.get("months")+"月,月供本息："+map.get("principalInterest")+",月供本金："+map.get("principal")+
        			 ",月供利息："+map.get("interest")+",剩余："+map.get("lastPrincipalInterestCount"));
		} 
    }  
}  
