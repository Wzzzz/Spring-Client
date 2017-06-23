package com.qq.qd.server.callhiserver;

import com.qq.cloud.taf.client.Communicator;
import com.qq.cloud.taf.client.CommunicatorConfig;
import com.qq.cloud.taf.client.CommunicatorFactory;
import com.qq.qd.server.hiserver.TestClientPrx;

/**
 * Created by wangzhi.a on 2017/6/23.
 */
public class CallTestClientServantImpl implements CallTestClientServant{
    public static Communicator communicatorwang;
    public static String SERVANT = "QD.WangService.WangObj";
    public static String LOCATOR = "taf.tafregistry.QueryObj@tcp -h 10.219.140.217 -p 17890:tcp -h 10.224.137.102 -p 17890";

    public static TestClientPrx createTestClientPrx()
      {
        Communicator communicator = getCommunicator(LOCATOR,communicatorwang);
        TestClientPrx proxy = communicator.stringToProxy(TestClientPrx.class, SERVANT);
        return proxy;
      }

    private static Communicator getCommunicator(String locator, Communicator communicator){
            if(communicator == null) {
                CommunicatorConfig config = new CommunicatorConfig();
                config.setLocator(locator);
                config.setCharsetName("UTF-8");
                communicator = CommunicatorFactory.getInstance().getCommunicator(config);
            }
            return communicator;
    }

    @Override
    public String Calltest1(String app_id, long freetype) {
        TestClientPrx proxy = createTestClientPrx();
        String resultStr = proxy.test1(app_id, freetype);
        return resultStr;
    }
}

