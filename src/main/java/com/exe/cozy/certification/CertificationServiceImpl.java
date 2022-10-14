package com.exe.cozy.certification;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

@Service("CertificationServiceImpl")
public class CertificationServiceImpl implements CertificationService{

	@Override
	public void certifiedPhoneNumber(String customerTel, String cerNum) {
		String api_key = "NCSL3WPD86IM5CB6";
		String api_secret = "OBIB1RRN7FZ5LVACUE0OPXYNFJDVI1K0";
		
		Message coolsms = new Message(api_key, api_secret);
		
		// 4 params(to, from, type, text) are mandatory. must be filled
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("to", customerTel);    // ������ȭ��ȣ
        params.put("from", "01076441110");    // �߽���ȭ��ȣ. �׽�Ʈ�ÿ��� �߽�,���� �Ѵ� ���� ��ȣ�� �ϸ� ��
        params.put("type", "SMS");
        params.put("text", "COZY HOUSE �޴������� �׽�Ʈ �޽��� : ������ȣ��" + "["+cerNum+"]" + "�Դϴ�.");
        params.put("app_version", "test app 1.2"); // application name and version
        
        try {
            JSONObject obj = (JSONObject) coolsms.send(params);
            System.out.println(obj.toString());
        } catch (CoolsmsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCode());
        }
	}

}
