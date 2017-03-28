package cn.aaq112225.coloros21navbgremove;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Created by tvtwu on 2017/3/24.
 */

public class HookMain implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {
        if (!loadPackageParam.packageName.equals("com.android.systemui")) return;

        XposedHelpers.findAndHookMethod("com.android.systemui.statusbar.phone.NavigationBarView", loadPackageParam.classLoader, "updateNavBar", XC_MethodReplacement.DO_NOTHING);


    }


}
