package bugly.haegyeong.com.testbugly;

import com.tencent.tinker.loader.app.TinkerApplication;

import static com.tencent.tinker.loader.shareutil.ShareConstants.TINKER_ENABLE_ALL;

/**
 * Created by Haegyeong on 2016/12/22.
 * email：1328750511@qq.com
 * <p>
 * 描述：集成Bugly升级SDK之后，我们需要按照以下方式自定义ApplicationLike来实现Application的代码
 */

public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(TINKER_ENABLE_ALL, "bugly.haegyeong.com.testbugly.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
        //参数解析
//        参数1：tinkerFlags 表示Tinker支持的类型 dex only、library only or all suuport，default: TINKER_ENABLE_ALL
//        参数2：delegateClassName Application代理类 这里填写你自定义的ApplicationLike
//        参数3：loaderClassName Tinker的加载器，使用默认即可
//        参数4：tinkerLoadVerifyFlag 加载dex或者lib是否验证md5，默认为false
    }
}