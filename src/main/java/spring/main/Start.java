/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.impls.Stage;

/**
 *
 * @author dmalahov
 */
public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Stage myStage = context.getBean("StageBean", Stage.class);
        myStage.Act();
        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную

    }
}
