package com.ut.scf.core.util;

/**
 * Description:等额本息工具类
 * 
 */
 
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
  
/**
 * 等额本息还款，也称定期付息，即借款人每月按相等的金额偿还贷款本息，其中每月贷款利息按月初剩余贷款本金计算并逐月结清。把按揭贷款的本金总额与利息总额相加，
 * 然后平均分摊到还款期限的每个月中。作为还款人，每个月还给银行固定金额，但每月还款额中的本金比重逐月递增、利息比重逐月递减。
 */
  
public class AverageCapitalPlusInterestUtils {
	
	public static final int AMT_SHOW_SCALE = 2;//金额显示精度
  
	public static final int AMT_SCALE = 6;//金额保存精度
	
	public static final int INTEREST_SCALE = 18;//利率保存精度，如设12位，则1千万本金会误差1分钱。
	
  
    /**
     * 等额本息计算获取还款方式为等额本息的每月偿还本金和利息
     * 
     * 公式：每月偿还本息=〔贷款本金×月利率×(1＋月利率)＾还款月数〕÷〔(1＋月利率)＾还款月数-1〕
     * 
     * @param invest
     *            总借款额（贷款本金）
     * @param yearRate
     *            年利率
     * @param month
     *            还款总月数
     * @return 每月偿还本金和利息,不四舍五入，直接截取小数点最后两位
     */
    public static BigDecimal getPerMonthPrincipalInterest(BigDecimal invest, BigDecimal yearRate, int totalmonth) {
 
    	BigDecimal monthRate = getMonthRateByYearRate(yearRate);
        BigDecimal monthIncome = invest
                .multiply(monthRate.multiply(getPrincipalInterestRate(monthRate,totalmonth)))
                .divide(getInterestRate(monthRate,totalmonth), AMT_SHOW_SCALE, BigDecimal.ROUND_HALF_UP);
        return monthIncome;
     
    }
  
    /**
     * 等额本息计算获取还款方式为等额本息的每月偿还利息
     * 
     * 公式：每月偿还利息=贷款本金×月利率×〔(1+月利率)^还款月数-(1+月利率)^(还款月序号-1)〕÷〔(1+月利率)^还款月数-1〕
     * @param invest
     *            总借款额（贷款本金）
     * @param yearRate
     *            年利率
     * @param month
     *            还款总月数
     * @return 每月偿还利息
     */
    public static Map<Integer, BigDecimal> getPerMonthInterest(BigDecimal invest, BigDecimal yearRate, int totalmonth) {
 
        Map<Integer, BigDecimal> map = new HashMap<Integer, BigDecimal>();
        BigDecimal monthRate = getMonthRateByYearRate(yearRate);
        BigDecimal monthInterest;
        for (int i = 1; i < totalmonth + 1; i++) { 
            BigDecimal multiply = invest.multiply(monthRate);
            BigDecimal sub  = getPrincipalInterestRate(monthRate,totalmonth).subtract((new BigDecimal(1).add(monthRate)).pow(i-1));
            monthInterest = multiply.multiply(sub).divide(getPrincipalInterestRate(monthRate,totalmonth).subtract(new BigDecimal(1)), INTEREST_SCALE, BigDecimal.ROUND_HALF_UP);
            monthInterest = monthInterest.setScale(AMT_SCALE, BigDecimal.ROUND_HALF_UP);
            map.put(i, monthInterest);
        }
        return map;     
    }
  
    /**
     * 等额本息计算获取还款方式为等额本息的每月偿还本金
     * 
     * @param invest
     *            总借款额（贷款本金）
     * @param yearRate
     *            年利率
     * @param month
     *            还款总月数
     * @return 每月偿还本金
     */
    public static Map<Integer, BigDecimal> getPerMonthPrincipal(BigDecimal invest, BigDecimal yearRate, int totalmonth) {
 
    	BigDecimal monthRate = getMonthRateByYearRate(yearRate);
        BigDecimal monthIncome = invest
                .multiply(monthRate.multiply(getPrincipalInterestRate(monthRate,totalmonth)))
                .divide(getInterestRate(monthRate,totalmonth), AMT_SCALE, BigDecimal.ROUND_HALF_UP);
        Map<Integer, BigDecimal> mapInterest = getPerMonthInterest(invest, yearRate, totalmonth);
        Map<Integer, BigDecimal> mapPrincipal = new HashMap<Integer, BigDecimal>();
  
        for (Map.Entry<Integer, BigDecimal> entry : mapInterest.entrySet()) { 
            mapPrincipal.put(entry.getKey(), monthIncome.subtract(entry.getValue()));         
        }
        return mapPrincipal;     
    }
  
    /**
     * 等额本息计算获取还款方式为等额本息的总利息
     * 
     * @param invest
     *            总借款额（贷款本金）
     * @param yearRate
     *            年利率
     * @param month
     *            还款总月数
     * @return 总利息
     */
    public static BigDecimal getInterestCount(BigDecimal invest, BigDecimal yearRate, int totalmonth) {
 
        BigDecimal count = new BigDecimal(0);
        Map<Integer, BigDecimal> mapInterest = getPerMonthInterest(invest, yearRate, totalmonth);
  
        for (Map.Entry<Integer, BigDecimal> entry : mapInterest.entrySet()) { 
            count = count.add(entry.getValue());         
        }
        return count.setScale(AMT_SHOW_SCALE, BigDecimal.ROUND_HALF_UP);
     
    }
  
    /**
     * 应还本金总和
     * @param invest
     *            总借款额（贷款本金）
     * @param yearRate
     *            年利率
     * @param month
     *            还款总月数
     * @return 应还本金总和
     */
    public static BigDecimal getPrincipalInterestCount(BigDecimal invest, BigDecimal yearRate, int totalmonth) {
 
    	BigDecimal monthRate = getMonthRateByYearRate(yearRate);
        BigDecimal perMonthInterest = invest
                .multiply(monthRate.multiply(getPrincipalInterestRate(monthRate,totalmonth)))
                .divide(getInterestRate(monthRate,totalmonth), INTEREST_SCALE, BigDecimal.ROUND_HALF_UP);
        BigDecimal count = perMonthInterest.multiply(new BigDecimal(totalmonth));
        count = count.setScale(AMT_SHOW_SCALE, BigDecimal.ROUND_HALF_UP);
        return count;
     
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
    	Map<Integer, BigDecimal> mapPrincipal = getPerMonthPrincipal(invest, yearRate, totalmonth);//每月还本金集合
    	BigDecimal principalInterestCount = getPrincipalInterestCount(invest, yearRate, totalmonth);//应还本息总和
    	for (int i = 1; i <= totalmonth; i++) {
    		Map<String, Object> map = new HashMap<String, Object>();
    		map.put("months", i);//月份
    		map.put("principal", mapPrincipal.get(i).setScale(AMT_SHOW_SCALE, BigDecimal.ROUND_HALF_UP));//月供本金
    		map.put("interest", mapInterest.get(i).setScale(AMT_SHOW_SCALE, BigDecimal.ROUND_HALF_UP));//月供利息
    		principalInterestCount = principalInterestCount.subtract(mapPrincipal.get(i)).subtract(mapInterest.get(i));
    		map.put("lastPrincipalInterestCount", principalInterestCount.setScale(AMT_SHOW_SCALE,BigDecimal.ROUND_HALF_UP));//剩余本息
    		list.add(map);
		}    	
    	return list;
    }
 
    /**
     * (1＋月利率)＾还款月数
     * @param monthRate
     * @param totalmonth
     * @return
     */
    public static BigDecimal getPrincipalInterestRate(BigDecimal monthRate,int totalmonth){
    	return (new BigDecimal(1).add(monthRate)).pow(totalmonth); 	
    }
    
    /**
     * (1+月利率)^还款月数-1
     * @param monthRate
     * @param totalmonth
     * @return
     */
    public static BigDecimal getInterestRate(BigDecimal monthRate,int totalmonth){
    	return (new BigDecimal(1).add(monthRate)).pow(totalmonth).subtract(new BigDecimal(1));
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
     * @param args 
     */
    public static void main(String[] args) {
 
        BigDecimal invest = new BigDecimal("1000000"); // 本金
        int month = 30*12;
        BigDecimal yearRate = new BigDecimal(0.0475); // 年利率
        System.out.println("等额本息---本金："+invest);
        System.out.println("等额本息---共"+month+"期");
        BigDecimal monthRate = getMonthRateByYearRate(yearRate);
        System.out.println("等额本息---月利率："+monthRate);
        BigDecimal perMonthPrincipalInterest = getPerMonthPrincipalInterest(invest, yearRate, month);
        System.out.println("等额本息---每月还款本息：" + perMonthPrincipalInterest);
        BigDecimal count = getInterestCount(invest, yearRate, month);
        System.out.println("等额本息---总利息：" + count);
        BigDecimal principalInterestCount = getPrincipalInterestCount(invest, yearRate, month);
        System.out.println("等额本息---应还本息总和：" + principalInterestCount);    
        /*Map<Integer, BigDecimal> mapInterest = getPerMonthInterest(invest, yearRate, month);
        System.out.println("等额本息---每月还款利息：" + mapInterest);
        Map<Integer, BigDecimal> mapPrincipal = getPerMonthPrincipal(invest, yearRate, month);
        System.out.println("等额本息---每月还款本金：" + mapPrincipal);*/        
        System.out.println("等额本息---还款详情------------------------------");
        List<Map<String, Object>> list = getListPrincipalInterest(invest, yearRate, month);
        for (Map<String, Object> map : list) {
        	 System.out.println("第"+map.get("months")+"月,月供本金："+map.get("principal")+
        			 ",月供利息："+map.get("interest")+",剩余："+map.get("lastPrincipalInterestCount"));
		}        
    } 
}