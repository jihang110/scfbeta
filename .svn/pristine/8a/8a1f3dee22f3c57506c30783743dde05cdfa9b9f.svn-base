package com.ut.scf.web.scheduled;

import com.ut.scf.core.util.ScfDateUtil;
import com.ut.scf.dao.auto.LoanDetailMapper;
import com.ut.scf.pojo.auto.LoanDetail;
import com.ut.scf.pojo.auto.LoanDetailExample;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 逾期预警Job
 *
 * @author lukj
 */
@Component
public class OverdueWarningJob {
    private final Logger log = LoggerFactory.getLogger(OverdueWarningJob.class);

    @Autowired
    private LoanDetailMapper loanDetailMapper;

    @Scheduled(cron = "0 15 0 * * ?", zone = "GMT+08:00")
    public void job() {
        log.info("Overdue Warning Job start ...");
        Date date = new Date();
        Date startTime = DateUtils.addDays(date, -1);
        Date endTime = DateUtils.addDays(date, 2);
        // 查询所有3日之内到期的融资申请
        LoanDetailExample example = new LoanDetailExample();
        example.createCriteria().andLoanDueDtBetween(DateUtils.truncate(startTime, Calendar.DATE),
                DateUtils.round(endTime, Calendar.DATE)).andInvLoanStsNotEqualTo("已逾期");
        List<LoanDetail> list = loanDetailMapper.selectByExample(example);
        // 根据用户ID分别发送预警信息
        for (LoanDetail loan : list) {
            Date end = DateUtils.truncate(loan.getLoanDueDt(), Calendar.DATE);
            Date start = DateUtils.truncate(startTime, Calendar.DATE);
            int num = ScfDateUtil.getDays(start, end);
            if (num != 0) {
                send(loan.getCreateUser(), end, num - 1);
            } else {
                LoanDetail detail = new LoanDetail();
                detail.setRecUid(loan.getRecUid());
                detail.setInvLoanSts("已逾期");
                loanDetailMapper.updateByPrimaryKeySelective(detail);
            }
        }
        log.info("Overdue Warning Job end ...");
    }

    // TODO 发送消息
    @Async
    private void send(String id, Date date, int num) {
        log.info("ID为{}的用户收到逾期预警，到期时间为{}，还有{}天", id, DateFormatUtils.format(date,"yyyy-MM-dd"), num);
    }
}
