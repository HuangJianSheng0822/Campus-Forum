package com.unit;

import com.aliyun.oss.HttpMethod;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.GeneratePresignedUrlRequest;
import com.aliyun.oss.model.PutObjectRequest;
import org.omg.CORBA.SystemException;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.net.URL;
import java.util.Date;

/**
 * @author 黄建胜
 */
public class aliOSS {

    // yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
    static String endpoint = "xxx";
    // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
    static String accessKeyId = "xxx";
    static String accessKeySecret = "xxx";


    /**
     * 上传图片
     * @param key key
     * @param file 文件
     */
    public static void uploadFile(String key,File file){
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        // 创建PutObjectRequest对象。
        // 依次填写Bucket名称（例如examplebucket）、Object完整路径（例如exampledir/exampleobject.txt）和本地文件的完整路径。Object完整路径中不能包含Bucket名称。
        // 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件。
        PutObjectRequest putObjectRequest = new PutObjectRequest("xxx", "img/"+key,file);
        // 上传文件。
        ossClient.putObject(putObjectRequest);
        // 关闭OSSClient。
        ossClient.shutdown();
    }


    /**
     * 根据key查询对应url,有效期10分钟
     * @param key
     * @return url
     */
    public static String getImageUrl(String key){
        String bucketName = "xxx";
        String objectName="img/"+key;
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        //10分钟
        Date date = new Date(new Date().getTime() + 1000 * 60 * 10);
        GeneratePresignedUrlRequest req = new GeneratePresignedUrlRequest(bucketName, objectName, HttpMethod.GET);
        req.setExpiration(date);
        URL url = ossClient.generatePresignedUrl(req);
        ossClient.shutdown();
        return url.toString();
    }

    /**
     * 判断MultipartFile是否空
     * @param file
     * @return
     */
    public static boolean isFile(MultipartFile file){
        if (ObjectUtils.isEmpty(file) || file.getSize() <= 0) {
            return false;
        }else {
            return true;
        }


    }



}
