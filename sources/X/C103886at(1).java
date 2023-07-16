package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.6at  reason: invalid class name and case insensitive filesystem */
public final class C103886at {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature A02;
    public static final Feature A03;
    public static final Feature A04;
    public static final Feature A05;
    public static final Feature A06;
    public static final Feature A07;
    public static final Feature[] A08;

    static {
        Feature feature = new Feature("account_data_service", 6);
        A03 = feature;
        Feature feature2 = new Feature("account_data_service_legacy", 1);
        A04 = feature2;
        Feature feature3 = new Feature("account_data_service_token", 2);
        A05 = feature3;
        Feature feature4 = new Feature("account_data_service_visibility", 1);
        A06 = feature4;
        Feature feature5 = new Feature("google_auth_service_token", 3);
        A00 = feature5;
        Feature feature6 = new Feature("google_auth_service_accounts", 2);
        A01 = feature6;
        Feature feature7 = new Feature("work_account_client_is_whitelisted", 1);
        A02 = feature7;
        Feature feature8 = new Feature("config_sync", 1);
        A07 = feature8;
        A08 = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}
