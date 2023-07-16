package com.facebook.flexlayout;

import X.C15020qa;
import com.facebook.flexlayout.layoutoutput.LayoutOutput;
import com.facebook.flexlayout.styles.FlexItemCallback;

public class FlexLayoutNative {
    public static native void jni_calculateLayout(float[] fArr, float[][] fArr2, float f, float f2, float f3, float f4, float f5, float f6, LayoutOutput layoutOutput, FlexItemCallback[] flexItemCallbackArr);

    static {
        C15020qa.A0A("flexlayout");
    }
}
