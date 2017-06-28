package com.ut.scf.service.test.bpm;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.DeploymentBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class BpmServiceTest {

	@Autowired
	private RepositoryService repositoryService;

	@Test
	public void testDeploy() {
		// 创建发布配置对象
		DeploymentBuilder builder = repositoryService.createDeployment();
		// 设置发布信息
		builder.addClasspathResource("resources/PubCustRelaBpm.bpmn");
		// 完成发布
		builder.deploy();
	}
}
