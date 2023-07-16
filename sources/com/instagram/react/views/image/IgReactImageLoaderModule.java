package com.instagram.react.views.image;

import X.C130927r8;
import X.C145858lE;
import X.C18250wR;
import X.C37030Jj7;
import X.C37744K2e;
import X.IPD;
import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "ImageLoader")
public class IgReactImageLoaderModule extends NativeImageLoaderAndroidSpec {
    public static final String ERROR_INVALID_URI = "E_INVALID_URI";
    public static final String MODULE_NAME = "ImageLoader";

    public void abortRequest(double d) {
    }

    public String getName() {
        return "ImageLoader";
    }

    public void getSizeWithHeaders(String str, ReadableMap readableMap, C145858lE r3) {
    }

    public void prefetchImage(String str, double d, C145858lE r4) {
    }

    public void queryCache(ReadableArray readableArray, C145858lE r2) {
    }

    public void getSize(String str, C145858lE r5) {
        if (TextUtils.isEmpty(str)) {
            r5.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        C37030Jj7 A0A = C37744K2e.A01().A0A(C18250wR.A0K(str), (String) null);
        A0A.A0F = false;
        A0A.A02(new C130927r8(r5, this));
        A0A.A00().CYj();
    }

    public IgReactImageLoaderModule(IPD ipd) {
        super(ipd);
    }
}
