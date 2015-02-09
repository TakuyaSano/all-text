import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class List8_5 {
public static void main(String[] args){
	Log logger = LogFactory.getLog(List8_5.class);

	logger.debug("【DEBUG】ログの出力のサンプルです。");
	logger.info("【INFO】ログの出力のサンプルです。");
	logger.warn("【WARN】ログの出力のサンプルです。");

	if(args.length != 2){
		logger.error("起動引数の数が異常:" + args.length);
		logger.fatal("【FATAL】起動引数の数が異常 + args.length");
		}
	}
}