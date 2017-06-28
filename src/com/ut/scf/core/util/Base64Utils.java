package com.ut.scf.core.util;

//
//Source code recreated from a .class file by IntelliJ IDEA
//(powered by Fernflower decompiler)
//

import org.apache.commons.codec.binary.Base64;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Base64Utils {
 private static final int CACHE_SIZE = 1024;

 public Base64Utils() {
 }

 public static byte[] decode(String base64) throws Exception {
     return (new Base64()).decode(base64);
 }

 public static String encode(byte[] bytes) throws Exception {
     return (new Base64()).encodeToString(bytes);
 }

 public static String encodeFile(String filePath) throws Exception {
     byte[] bytes = fileToByte(filePath);
     return encode(bytes);
 }

 public static void decodeToFile(String filePath, String base64) throws Exception {
     byte[] bytes = decode(base64);
     byteArrayToFile(bytes, filePath);
 }

 public static byte[] fileToByte(File file) throws Exception {
     if(file == null) {
         throw new RuntimeException("the file is null");
     } else {
         byte[] data = new byte[0];
         FileInputStream in = new FileInputStream(file);
         ByteArrayOutputStream out = new ByteArrayOutputStream(2048);
         byte[] cache = new byte[1024];
         boolean nRead = false;

         int nRead1;
         while((nRead1 = in.read(cache)) != -1) {
             out.write(cache, 0, nRead1);
             out.flush();
         }

         out.close();
         in.close();
         data = out.toByteArray();
         return data;
     }
 }

 public static byte[] fileToByte(String filePath) throws Exception {
     byte[] data = new byte[0];
     File file = new File(filePath);
     if(file.exists()) {
         FileInputStream in = new FileInputStream(file);
         ByteArrayOutputStream out = new ByteArrayOutputStream(2048);
         byte[] cache = new byte[1024];
         boolean nRead = false;

         int nRead1;
         while((nRead1 = in.read(cache)) != -1) {
             out.write(cache, 0, nRead1);
             out.flush();
         }

         out.close();
         in.close();
         data = out.toByteArray();
     }

     return data;
 }

 public static void byteArrayToFile(byte[] bytes, String filePath) throws Exception {
     ByteArrayInputStream in = new ByteArrayInputStream(bytes);
     File destFile = new File(filePath);
     if(!destFile.getParentFile().exists()) {
         destFile.getParentFile().mkdirs();
     }

     destFile.createNewFile();
     FileOutputStream out = new FileOutputStream(destFile);
     byte[] cache = new byte[1024];
     boolean nRead = false;

     int nRead1;
     while((nRead1 = in.read(cache)) != -1) {
         out.write(cache, 0, nRead1);
         out.flush();
     }

     out.close();
     in.close();
 }
}