package com.qfedu.controller;

import com.qfedu.vo.ResultVo;

import com.qfedu.pojo.Picture;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/1 15:52
 */
public class UploadController {
    
    private ResultVo rv;
    private String pictureurl;

    @RequestMapping("/upload.do")
    @ResponseBody
    protected ResultVo doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub


        DiskFileItemFactory factory = new DiskFileItemFactory();

        // 对上传的数据进行处理
        ServletFileUpload fileUpload = new ServletFileUpload(factory);


        // 判断表单enctype="multipart/form-data"
        if(ServletFileUpload.isMultipartContent(request)){
            // 对提交的数据进行解析
            try {
                //Goods g = new Goods();
                Picture picture = new Picture();
                @SuppressWarnings("unchecked")
                List<FileItem> list = fileUpload.parseRequest(request);
                for (FileItem fileItem : list) {
                    // 判断是否不同控件对应的数据
                    if(fileItem.isFormField()){
                        // 获取提交的数据
                        // 指定编码方式，解决中文乱码问题
                        //System.out.println(fileItem.getString("utf-8"));
                        //System.out.println(fileItem.getString());
                        //System.out.println(fileItem.getFieldName());

                        //注册日期转换操作
                        ConvertUtils.register(new Converter() {


                            public Object convert(@SuppressWarnings("rawtypes") Class type, Object value) {


                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                try {
                                    return simpleDateFormat.parse(value.toString());
                                } catch (ParseException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                                }
                                return null;
                            }
                        }, Date.class);


                        BeanUtils.setProperty(picture, fileItem.getFieldName(), fileItem.getString("utf-8"));

                    }else if(fileItem.getName() != ""){
                        // 获取文件名
                        String name = fileItem.getName();
                        // 将文件上传到服务器的D:/upload文件夹下
                        String path = "D:/upload";

                        // 如果路径不存在，创建
                        File file = new File(path);
                        if(!file.exists()){
                            file.mkdirs();
                        }
                        // 全球唯一id
                        String uuid = UUID.randomUUID().toString();
                        name = uuid + "_" + name;
                        // 根据路径和文件名创建对象
                        File newFile = new File(path, name);

                        // 保存文件
                        fileItem.write(newFile);
                        // 删除缓存中数据
                        fileItem.delete();

                        //g.setImgpath(name);
                        picture.setPictureurl(pictureurl);
                        //g.setId(Integer.parseInt(request.getParameter("id")));

                    }
                }
                //goodsService.updateGoods(g);
                rv = ResultVo.setOK(picture);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                rv = ResultVo.setERROR();
            }
        }
        return rv;

    }
}
