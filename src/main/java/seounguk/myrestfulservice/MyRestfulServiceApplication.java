package seounguk.myrestfulservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class MyRestfulServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(MyRestfulServiceApplication.class, args);

		/*/
		String[] allBeanNames = ac.getBeanDefinitionNames();
		for(String beanName : allBeanNames){
			log.info("BeanName={}, {}",beanName, beanName.hashCode());
		}
		 */
	}
}
