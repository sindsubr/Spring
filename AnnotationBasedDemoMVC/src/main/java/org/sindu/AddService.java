package org.sindu;

import org.springframework.stereotype.Component;

@Component
public class AddService {
public Integer add(int num1,int num2) {
	return num1+num2;
}
}
