package baway.com.mvp_test.net;

/**
 * Created by peng on 2017/9/27.
 */

public interface Api {
    public static final String devIp = "http://169.254.194.60";
    //public static final String devIp = "http://192.168.137.247";
    public static final String FEILEI = devIp + "/mobile/index.php?act=goods_class";
    public static final String REGISTER = devIp + "/mobile/index.php?act=login&op=register";
    public static final String LOGIN = devIp + "/mobile/index.php?act=login";
    public static final String CLASS = devIp + "/mobile/index.php?act=goods_class";
    public static final String RIGHT = devIp + "/mobile/index.php?act=goods_class&gc_id=%s";
    public static final String GOODS_LIST = devIp + "/mobile/index.php?act=goods&op=goods_list&page=100";
    public static final String GOODS_DETAILS = devIp + "/mobile/index.php?act=goods&op=goods_detail&goods_id=%s";
}
