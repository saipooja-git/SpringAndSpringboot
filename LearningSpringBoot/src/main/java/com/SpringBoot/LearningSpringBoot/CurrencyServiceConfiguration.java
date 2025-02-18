package com.SpringBoot.LearningSpringBoot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="currency-server")
@Component
public class CurrencyServiceConfiguration {

private String url;
private String userName;
private String key;

//public CurrencyServiceConfiguration(String url, String userName, String key) {
//	super();
//	this.url = url;
//	this.userName = userName;
//	this.key = key;
//}
public void setUrl(String url) {
	this.url = url;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public void setKey(String key) {
	this.key = key;
}
public String getUrl() {
	return url;
}
public String getUserName() {
	return userName;
}
public String getKey() {
	return key;
}
//@Override
//public String toString() {
//	return "CurrencyServiceConfiguration [url=" + url + ", userName=" + userName + ", key=" + key + "]";
//}

}
