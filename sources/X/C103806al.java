package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.6al  reason: invalid class name and case insensitive filesystem */
public final class C103806al {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature[] A02;
    public static final Feature A03;
    public static final Feature A04;

    static {
        Feature feature = new Feature("name_ulr_private", 1);
        A03 = feature;
        Feature feature2 = new Feature("name_sleep_segment_request", 1);
        A04 = feature2;
        Feature feature3 = new Feature("support_context_feature_id", 1);
        A00 = feature3;
        Feature feature4 = new Feature("get_current_location", 1);
        A01 = feature4;
        A02 = new Feature[]{feature, feature2, feature3, feature4};
    }
}
