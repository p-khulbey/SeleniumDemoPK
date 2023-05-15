//package config;
//
//import java.io.FileInputStream;
//import java.util.Map;
//import java.util.Properties;
//
//public class Config {
//
//    public Properties initializeConfig() {
//        Properties conf = new Properties();
//        try (FileInputStream fis = new FileInputStream(
//                System.getProperty("user.dir") + "/src/main/resources/config.properties")) {
//            conf.load(fis);
//
//            Map<String, String> environmentConfig = null;
//
//            String environmentProperty = System.getProperty("environment");
//
//            String environment = (environmentProperty != null) ? environmentProperty : conf.getProperty("ENV_NAME");
//
//            environmentConfig = parseYaml("src/main/resources/environments.yml", environment);
//
//            conf = initializeConstantsAndSesssions(conf);
//
//            conf = loadDeviceProperty(environmentConfig, validateDeviceProperties(conf));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            Log.warn(e.getMessage());
//        }
//        return conf;
//    }
//}
