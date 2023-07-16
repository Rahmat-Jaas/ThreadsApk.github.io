package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.6ak  reason: invalid class name and case insensitive filesystem */
public final class C103796ak {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature A02;
    public static final Feature A03;
    public static final Feature[] A04;

    static {
        Feature feature = new Feature("sms_code_autofill", 2);
        A00 = feature;
        Feature feature2 = new Feature("sms_code_browser", 2);
        A01 = feature2;
        Feature feature3 = new Feature("sms_retrieve", 1);
        A02 = feature3;
        Feature feature4 = new Feature("user_consent", 3);
        A03 = feature4;
        A04 = new Feature[]{feature, feature2, feature3, feature4};
    }
}
