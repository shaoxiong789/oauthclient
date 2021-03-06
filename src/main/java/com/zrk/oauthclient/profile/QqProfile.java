package com.zrk.oauthclient.profile;

import org.pac4j.core.profile.AttributesDefinition;
import org.pac4j.oauth.profile.OAuth20Profile;

import com.zrk.oauthclient.definition.QqAttributesDefinition;


/**
 * qq用户信息
 * @author zrk  
 * @date 2016年4月15日 下午5:43:50
 */
public class QqProfile extends OAuth20Profile implements ClientProfile{

	private static final long serialVersionUID = -7486869356444327781L;
	
	@Override
	protected AttributesDefinition getAttributesDefinition() {
		return new QqAttributesDefinition();
	}
	
	public String getOpenid() {
		return (String)getAttribute(QqAttributesDefinition.OPEN_ID);
	}
	
	public String getNickname() {
		return (String)getAttribute(QqAttributesDefinition.NICK_NAME);
	}
	public Integer getSex() {
		String sex = (String)getAttribute(QqAttributesDefinition.GENDER);
		if("男".equals(sex)) return 1;
		if("女".equals(sex)) return 0;
		return null;
	}
	public String getIcon(){
		String figureurl = (String)getAttribute(QqAttributesDefinition.FIGUREURL_QQ_2);	//100×100像素的QQ头像URL
		return figureurl == null || "".equals(figureurl)?(String)getAttribute(QqAttributesDefinition.FIGUREURL_QQ_1):figureurl;
	}
//	public String getProvince() {
//		return (String)getAttribute(QqAttributesDefinition.PROVINCE);
//	}
//	public String getCity() {
//		return (String)getAttribute(QqAttributesDefinition.CITY);
//	}
//	public String getFigureurl() {
//		return (String)getAttribute(QqAttributesDefinition.FIGUREURL);
//	}
//	public String getFigureurl_1() {
//		return (String)getAttribute(QqAttributesDefinition.FIGUREURL_1);
//	}
//	public String getFigureurl_2() {
//		return (String)getAttribute(QqAttributesDefinition.FIGUREURL_2);
//	}
//	public String getFigureurl_qq_1() {
//		return (String)getAttribute(QqAttributesDefinition.FIGUREURL_QQ_1);
//	}
//	public String getFigureurl_qq_2() {
//		return (String)getAttribute(QqAttributesDefinition.FIGUREURL_QQ_2);
//	}



}
