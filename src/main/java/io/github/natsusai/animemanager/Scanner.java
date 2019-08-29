package io.github.natsusai.animemanager;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * 扫描器
 *
 * @author liufuhong
 * @since 2019-08-27 17:00
 */

public class Scanner {
    public List<String> find(String pathStr) {
        Path path = Paths.get(pathStr);
        System.out.println("path里包含的路径数量：" + path.getNameCount());
        System.out.println("path的根路径：" + path.getRoot());
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
        return null;
    }
}
