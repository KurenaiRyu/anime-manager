package io.github.natsusai.animemanager;

import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ScannerTest {

    @Test
    public void find() {
        Path path = Paths.get(".");
        System.out.println("path里包含的路径数量：" + path.getNameCount());
        System.out.println("path的根路径：" + path.getRoot());
        File file = new File(".");
        System.out.println("file.list() = " + Arrays.toString(file.list()));
        System.out.println("file.listFiles() = " + Arrays.toString(file.listFiles()));
        // 获取path对应的绝对路径。
        Path absolutePath = path.toAbsolutePath();
        System.out.println(absolutePath);
        // 获取绝对路径的根路径
        System.out.println("absolutePath的根路径：" + absolutePath.getRoot());
        // 获取绝对路径所包含的路径数量
        System.out.println("absolutePath里包含的路径数量：" + absolutePath.getNameCount());
        System.out.println(absolutePath.getName(0));
        // 以多个String来构建Path对象
        Path path2 = Paths.get("g:", "publish", "codes");
        System.out.println(path2);
    }

    @Test
    public void findClassFile() {
        File file = new File(".");
        File[] files = file.listFiles();
        List<File> clazzList = new ArrayList<>();
        List<File> dirList = new ArrayList<>();
        if (files!=null && files.length > 0)
            dirList.addAll(Arrays.asList(files));

        do {
            if (file.isDirectory()) {
                for (File f : files) {
                    if (f.isFile() && f.getName().endsWith(".class")) {
                        clazzList.add(f);
                    } else if (f.isDirectory()) {
                        dirList.add(f);
                    }
                }
            } else {
                if (file.isFile() && file.getName().endsWith(".class")) {
                    clazzList.add(file);
                }
            }
        } while (dirList.size() > 0);
    }

    public void findFiles(File file) {
        File[] files = file.listFiles();
        if (files!= null || files.length>0) {
            for (File f : files) {
                if (f.isDirectory()) {

                }
            }
        }
    }
}