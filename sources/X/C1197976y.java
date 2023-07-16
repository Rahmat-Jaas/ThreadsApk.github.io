package X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.76y  reason: invalid class name and case insensitive filesystem */
public final class C1197976y {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public String A07;
    public List A08;
    public List A09;

    public C1197976y() {
        this((String) null, (List) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1023);
    }

    public /* synthetic */ C1197976y(String str, List list, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        ArrayList arrayList = null;
        str = (i & 1) != 0 ? "" : str;
        int i2 = i & 2;
        float f8 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        f = i2 != 0 ? BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER : f;
        f2 = (i & 4) != 0 ? BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER : f2;
        f3 = (i & 8) != 0 ? BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER : f3;
        float f9 = 1.0f;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f9 = (i & 32) == 0 ? f5 : f9;
        f6 = (i & 64) != 0 ? BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER : f6;
        f8 = (i & 128) == 0 ? f7 : f8;
        list = (i & 256) != 0 ? C102766Wl.A00 : list;
        arrayList = (i & 512) != 0 ? AnonymousClass0wJ.A0v() : arrayList;
        C86114wI.A1I(str, 1, list);
        C04220Ms.A0B(arrayList, 10);
        this.A07 = str;
        this.A02 = f;
        this.A00 = f2;
        this.A01 = f3;
        this.A03 = f4;
        this.A04 = f9;
        this.A05 = f6;
        this.A06 = f8;
        this.A09 = list;
        this.A08 = arrayList;
    }
}
