package jrocky.netty.server.handler;

import io.netty.handler.codec.http.FullHttpRequest;

import java.io.IOException;
import java.util.Map;

import jrocky.netty.IBaseResponse;
import jrocky.netty.server.NettyFullRequestParser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 分发http请求到controller
 * @author wangzhijie
 *
 */
public class HttpDispatcherController {
	private final static Logger logger = LoggerFactory
			.getLogger(HttpDispatcherController.class);

	private static volatile HttpDispatcherController instance = new HttpDispatcherController();
	
	private HttpDispatcherController() {
	}
	
	public static HttpDispatcherController getInstance(){
		return instance;
	}
	
	public IBaseResponse route(FullHttpRequest fullReq){
		// 将GET, POST所有请求参数转换成Map对象
		Map<String, Object> params;
		try {
			params = new NettyFullRequestParser(fullReq).parse();
			logger.info("[query params : " + params + "]");
			
			// check
//			ParmFilter.fill(params);
			
			String url = fullReq.getUri();
			int separate = url.indexOf('?');
			if(separate > 0){
				url = url.substring(0, separate);
			}
			
			//route
			switch(url){
			
			}
		} catch (IOException e) {
			logger.error("",e);
		}
		
		return new EmptyResponse();
	}
	
	class EmptyResponse implements IBaseResponse {
		
	}
}
