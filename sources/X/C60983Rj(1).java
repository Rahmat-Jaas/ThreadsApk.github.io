package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.List;

/* renamed from: X.3Rj  reason: invalid class name and case insensitive filesystem */
public final class C60983Rj {
    public static final List A00;
    public static final List A01;
    public static final List A02;
    public static final List A03;
    public static final List A04;
    public static final AnonymousClass4n9 A05;
    public static final AnonymousClass4n9 A06;
    public static final AnonymousClass4n9 A07;
    public static final AnonymousClass4n9 A08;
    public static final AnonymousClass4n9 A09;
    public static final AnonymousClass4n9 A0A;
    public static final AnonymousClass4n9 A0B;
    public static final AnonymousClass4n9 A0C;
    public static final AnonymousClass4n9 A0D;
    public static final AnonymousClass4n9 A0E;
    public static final AnonymousClass4n9 A0F;
    public static final AnonymousClass4n9 A0G;
    public static final AnonymousClass4n9 A0H;
    public static final AnonymousClass4n9 A0I;
    public static final AnonymousClass4n9 A0J;
    public static final AnonymousClass4n9 A0K;
    public static final AnonymousClass4n9 A0L;
    public static final AnonymousClass4n9 A0M;
    public static final AnonymousClass4n9 A0N;
    public static final AnonymousClass4n9 A0O;
    public static final AnonymousClass4n9 A0P;
    public static final AnonymousClass4n9 A0Q;
    public static final AnonymousClass4n9 A0R;

    static {
        AnonymousClass3HH r1 = new AnonymousClass3HH("user_values", "name='active_session_info'", new String[]{FXPFAccessLibraryDebugFragment.NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE});
        C307822y r4 = C307822y.A01;
        C15460rM r3 = C15470rN.A0c;
        AnonymousClass4n9 A012 = AnonymousClass4n9.A01(r3, "content://com.facebook.katana.provider.FirstPartyUserValuesProvider/user_values", "com.facebook.katana", r1, r4);
        A0B = A012;
        AnonymousClass4n9 A013 = AnonymousClass4n9.A01(r3, "content://com.facebook.wakizashi.provider.FirstPartyUserValuesProvider/user_values", "com.facebook.wakizashi", A00(FXPFAccessLibraryDebugFragment.NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "user_values", "name='active_session_info'"), r4);
        A06 = A013;
        AnonymousClass4n9 A014 = AnonymousClass4n9.A01(r3, "content://com.facebook.lite.provider.UserValuesProvider/user_values", "com.facebook.lite", A00(FXPFAccessLibraryDebugFragment.NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "user_values", "name='active_session_info'"), C307822y.A03);
        A09 = A014;
        AnonymousClass3HH A002 = A00(FXPFAccessLibraryDebugFragment.NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "user_values", "name='active_session_info'");
        C307822y r14 = C307822y.A05;
        AnonymousClass4n9 A015 = AnonymousClass4n9.A01(r3, "content://com.facebook.orca.provider.FamilyAppsUserValuesProvider/user_values", "com.facebook.orca", A002, r14);
        A0K = A015;
        AnonymousClass3HH r0 = new AnonymousClass3HH((String) null, (String) null, new String[0]);
        C307822y r31 = C307822y.A04;
        C15460rM r30 = C15470rN.A0f;
        AnonymousClass4n9 A016 = AnonymousClass4n9.A01(r30, "content://com.instagram.contentprovider.FamilyAppsUserValuesProvider", "com.instagram.android", r0, r31);
        A0I = A016;
        AnonymousClass4n9 A017 = AnonymousClass4n9.A01(C15470rN.A0o, "content://com.oculus.twilight.contentprovider.FamilyAppsUserValuesProvider/user_values", "com.oculus.twilight", new AnonymousClass3HH("user_values", "name='active_session_info'", new String[0]), C307822y.A09);
        A0R = A017;
        AnonymousClass4n9 A018 = AnonymousClass4n9.A01(r30, "content://com.instagram.contentprovider.FamilyAppsUserValuesProvider", "com.instagram.android", new AnonymousClass3HH((String) null, "all_session_info", new String[0]), r31);
        A0H = A018;
        AnonymousClass4n9 A019 = AnonymousClass4n9.A01(r3, "content://com.facebook.katana.provider.UserValuesProvider/user_values", "com.facebook.katana", new AnonymousClass3HH("user_values", "name='all_session_info'", new String[]{FXPFAccessLibraryDebugFragment.NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE}), r4);
        A0A = A019;
        AnonymousClass4n9 A0110 = AnonymousClass4n9.A01(r3, "content://com.facebook.wakizashi.provider.UserValuesProvider/user_values", "com.facebook.wakizashi", A00(FXPFAccessLibraryDebugFragment.NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "user_values", "name='all_session_info'"), r4);
        A05 = A0110;
        AnonymousClass4n9 A0111 = AnonymousClass4n9.A01(r3, "content://com.facebook.orca.provider.FamilyAppsUserValuesProvider/user_values", "com.facebook.orca", A00(FXPFAccessLibraryDebugFragment.NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "user_values", "name='all_session_info'"), r14);
        A0N = A0111;
        AnonymousClass4n9 A0112 = AnonymousClass4n9.A01(r30, "content://com.instagram.contentprovider.FamilyAppsUserValuesProvider", "com.instagram.android", new AnonymousClass3HH((String) null, "name='saved_session_info'", new String[0]), r31);
        A0J = A0112;
        AnonymousClass4n9 A0113 = AnonymousClass4n9.A01(r3, "content://com.facebook.orca.provider.FamilyAppsUserValuesProvider/user_values", "com.facebook.orca", A00(FXPFAccessLibraryDebugFragment.NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "user_values", "name='saved_session_info'"), r14);
        A0O = A0113;
        AnonymousClass4n9 A0114 = AnonymousClass4n9.A01(r3, "content://com.facebook.katana.provider.FirstPartyUserValuesProvider/user_values", "com.facebook.katana", A00(FXPFAccessLibraryDebugFragment.NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "user_values", "name='saved_session_info'"), r4);
        A0E = A0114;
        AnonymousClass4n9 A0115 = AnonymousClass4n9.A01(r3, "content://com.facebook.katana.provider.FirstPartyUserValuesProvider/device_values", "com.facebook.katana", new AnonymousClass3HH("device_values", "device_id_value", new String[]{"id", "timestamp"}), r4);
        A0C = A0115;
        AnonymousClass4n9 A0116 = AnonymousClass4n9.A01(r3, "content://com.facebook.wakizashi.provider.FirstPartyUserValuesProvider/device_values", "com.facebook.wakizashi", A00("id", "timestamp", "device_values", "device_id_value"), r4);
        A07 = A0116;
        AnonymousClass4n9 A0117 = AnonymousClass4n9.A01(r3, "content://com.facebook.orca.provider.FamilyAppsUserValuesProvider/device_values", "com.facebook.orca", A00("id", "timestamp", "device_values", "device_id_value"), r14);
        A0L = A0117;
        AnonymousClass4n9 A0118 = AnonymousClass4n9.A01(r30, "content://com.instagram.contentprovider.FamilyAppsUserValuesProvider", "com.instagram.android", new AnonymousClass3HH((String) null, "device_id_value", new String[0]), r31);
        A0F = A0118;
        AnonymousClass4n9 A0119 = AnonymousClass4n9.A01(r3, "content://com.facebook.katana.provider.FirstPartyUserValuesProvider/device_values", "com.facebook.katana", new AnonymousClass3HH("device_values", "machine_id_value", new String[]{"id"}), r4);
        A0D = A0119;
        AnonymousClass4n9 A0120 = AnonymousClass4n9.A01(r3, "content://com.facebook.wakizashi.provider.FirstPartyUserValuesProvider/device_values", "com.facebook.wakizashi", new AnonymousClass3HH("device_values", "machine_id_value", new String[]{"id"}), r4);
        A08 = A0120;
        AnonymousClass4n9 A0121 = AnonymousClass4n9.A01(r3, "content://com.facebook.orca.provider.FamilyAppsUserValuesProvider/device_values", "com.facebook.orca", new AnonymousClass3HH("device_values", "machine_id_value", new String[]{"id"}), r14);
        A0M = A0121;
        AnonymousClass4n9 A0122 = AnonymousClass4n9.A01(r30, "content://com.instagram.contentprovider.FamilyAppsUserValuesProvider", "com.instagram.android", new AnonymousClass3HH((String) null, "machine_id_value", new String[0]), r31);
        A0G = A0122;
        AnonymousClass3HH r8 = new AnonymousClass3HH("user_values", "name='active_session_info'", new String[0]);
        C307822y r9 = C307822y.A07;
        C15460rM r6 = C15470rN.A1C;
        AnonymousClass4n9 A0123 = AnonymousClass4n9.A01(r6, "content://com.facebook.stella.access.contentprovider.FamilyAppsUserValuesProvider/user_values", "com.facebook.stella", r8, r9);
        A0P = A0123;
        AnonymousClass4n9 A0124 = AnonymousClass4n9.A01(r6, "content://com.facebook.stella.access.contentprovider.FamilyAppsUserValuesProvider/user_values", "com.facebook.stella_debug", new AnonymousClass3HH("user_values", "name='active_session_info'", new String[0]), C307822y.A08);
        A0Q = A0124;
        A03 = C06750aI.A17(A012, A013, A014, A015, A016, A017, A0123, A0124);
        A04 = C06750aI.A17(A0114, A0112, A0113);
        A00 = C06750aI.A17(A019, A0110, A018, A0111);
        A01 = C06750aI.A17(A0115, A0116, A0117, A0118);
        A02 = C06750aI.A17(A0119, A0120, A0121, A0122);
    }

    public static AnonymousClass3HH A00(String str, String str2, String str3, String str4) {
        return new AnonymousClass3HH(str3, str4, new String[]{str, str2});
    }
}
