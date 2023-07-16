package X;

import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: X.1zP  reason: invalid class name and case insensitive filesystem */
public enum C29851zP {
    AA_TEST_EXPERIMENT(A00(2021, 9, 12), A00(2021, 11, 1), new String[]{"control", "test", "test2"}, 3, 500, 3),
    NDX_FDID_HOLDOUT(A00(2022, 1, 7), A00(2022, 5, 1), new String[]{"control", "holdout"}, 4, 250, 2),
    IG4A_MULTIPLE_AR_FDID_BACKTEST(A00(2022, 1, 16), A00(2022, 3, 10), new String[]{"control", "test"}, 7, 5000, 2),
    CAA_V1_FULL_TEST_TRIAGE_ANDROID(A00(2022, 8, 12), A00(2024, 1, 28), new String[]{"caa_oe_group_1", "caa_oe_group_2", "caa_oe_group_3", "caa_oe_group_4", "caa_oe_group_5", "caa_oe_group_6", "caa_oe_group_7", "caa_oe_group_8", "caa_oe_group_9", "caa_oe_group_10", "caa_switcher_universe_1", "caa_switcher_universe_2", "caa_switcher_universe_3", "caa_switcher_universe_4", "caa_switcher_universe_5", "caa_switcher_universe_6", "caa_switcher_universe_7"}, 8, 400, 17);
    
    public final int A00;
    public final int A01;
    public final String A02;
    public final Date A03;
    public final Date A04;
    public final String[] A05;

    /* access modifiers changed from: public */
    static {
        new C29851zP("PLACE_HOLDER_EXPERIMENT", "placeholder_spec", A00(2021, 8, 17), A00(2021, 8, 27), new String[]{"control", "test"}, 0, 500, 2);
        new C29851zP("TEST_EXPERIMENT", "test_experiment", A00(2021, 8, 17), A00(2021, 11, 27), new String[]{"control", "test", "test2"}, 1, 800, 3);
        new C29851zP("INTERNAL_SETTING_EXPERIMENT", "internal_setting_experiment", A00(2020, 8, 17), A00(2050, 11, 27), new String[]{"control", "test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8", "test9"}, 2, 500, 10);
        AA_TEST_EXPERIMENT = new C29851zP("AA_TEST_EXPERIMENT", "fdid_oe_aa_test", A00(2021, 9, 12), A00(2021, 11, 1), new String[]{"control", "test", "test2"}, 3, 500, 3);
        NDX_FDID_HOLDOUT = new C29851zP("NDX_FDID_HOLDOUT", "ndx_fdid_holdout", A00(2022, 1, 7), A00(2022, 5, 1), new String[]{"control", "holdout"}, 4, 250, 2);
        new C29851zP("FB4A_FDID_OE_INTEGRATION_TEST_FDID", "fb4a_fdid_oe_integration_test_fdid", A00(2022, 1, 14), A00(2022, 3, 10), new String[]{"control", "backtest"}, 5, 5000, 2);
        new C29851zP("M4A_SMARTLOCK_FDID_BACKTEST", "m4a_smartlock_fdid_backtest", A00(2022, 1, 16), A00(2022, 3, 10), new String[]{"control", "test"}, 6, 5000, 2);
        IG4A_MULTIPLE_AR_FDID_BACKTEST = new C29851zP("IG4A_MULTIPLE_AR_FDID_BACKTEST", "ig4a_multiple_ar_fdid_backtest", A00(2022, 1, 16), A00(2022, 3, 10), new String[]{"control", "test"}, 7, 5000, 2);
        CAA_V1_FULL_TEST_TRIAGE_ANDROID = new C29851zP("CAA_V1_FULL_TEST_TRIAGE_ANDROID", "caa_v1_full_test_triage_android", A00(2022, 8, 12), A00(2024, 1, 28), new String[]{"caa_oe_group_1", "caa_oe_group_2", "caa_oe_group_3", "caa_oe_group_4", "caa_oe_group_5", "caa_oe_group_6", "caa_oe_group_7", "caa_oe_group_8", "caa_oe_group_9", "caa_oe_group_10", "caa_switcher_universe_1", "caa_switcher_universe_2", "caa_switcher_universe_3", "caa_switcher_universe_4", "caa_switcher_universe_5", "caa_switcher_universe_6", "caa_switcher_universe_7"}, 8, 400, 17);
        new C29851zP("CAA_LOGGED_OUT_PUSH_NOTIF_HOLDOUT", "caa_logged_out_push_notif_holdout", A00(2023, 4, 2), A00(2023, 7, 30), new String[]{"control", "holdout"}, 9, 500, 2);
    }

    public static Date A00(int i, int i2, int i3) {
        return new GregorianCalendar(i, i2, i3).getTime();
    }

    /* access modifiers changed from: public */
    C29851zP(Date date, Date date2, String[] strArr, int i, int i2, int i3) {
        this.A02 = r2;
        this.A01 = i2;
        this.A00 = i3;
        this.A05 = strArr;
        this.A04 = date;
        this.A03 = date2;
    }
}
