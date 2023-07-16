package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.List;

/* renamed from: X.329  reason: invalid class name */
public final class AnonymousClass329 {
    public static final List A00;
    public static final List A01;
    public static final List A02;
    public static final AnonymousClass3HH A03;
    public static final AnonymousClass3HH A04;
    public static final AnonymousClass3HH A05;
    public static final AnonymousClass4n9 A06;
    public static final AnonymousClass4n9 A07;
    public static final AnonymousClass4n9 A08;
    public static final AnonymousClass4n9 A09;
    public static final AnonymousClass4n9 A0A;
    public static final AnonymousClass4n9 A0B;
    public static final AnonymousClass4n9 A0C;
    public static final AnonymousClass4n9 A0D;
    public static final AnonymousClass4n9 A0E;

    static {
        AnonymousClass3HH r14 = new AnonymousClass3HH("user_values", "name='active_session_info'", new String[]{FXPFAccessLibraryDebugFragment.NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE});
        A03 = r14;
        AnonymousClass3HH r13 = new AnonymousClass3HH("user_values", "name='saved_session_info'", new String[]{FXPFAccessLibraryDebugFragment.NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE});
        A05 = r13;
        AnonymousClass3HH r12 = new AnonymousClass3HH("user_values", "name='all_session_info'", new String[]{FXPFAccessLibraryDebugFragment.NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE});
        A04 = r12;
        C307822y r4 = C307822y.A01;
        C15460rM r11 = C15470rN.A0c;
        AnonymousClass4n9 A012 = AnonymousClass4n9.A01(r11, "content://com.facebook.katana.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.katana", r14, r4);
        A09 = A012;
        AnonymousClass4n9 A013 = AnonymousClass4n9.A01(r11, "content://com.facebook.wakizashi.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.wakizashi", r14, r4);
        A06 = A013;
        AnonymousClass4n9 A014 = AnonymousClass4n9.A01(r11, "content://com.facebook.katana.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.katana", r13, r4);
        A0B = A014;
        AnonymousClass4n9 A015 = AnonymousClass4n9.A01(r11, "content://com.facebook.wakizashi.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.wakizashi", r13, r4);
        A08 = A015;
        AnonymousClass4n9 A016 = AnonymousClass4n9.A01(r11, "content://com.facebook.katana.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.katana", r12, r4);
        A0A = A016;
        AnonymousClass4n9 A017 = AnonymousClass4n9.A01(r11, "content://com.facebook.wakizashi.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.wakizashi", r12, r4);
        A07 = A017;
        C307822y r42 = C307822y.A05;
        AnonymousClass4n9 A018 = AnonymousClass4n9.A01(r11, "content://com.facebook.orca.liteprovider.FamilyAppsUserValuesLiteProvider/user_values", "com.facebook.orca", r14, r42);
        A0C = A018;
        AnonymousClass4n9 A019 = AnonymousClass4n9.A01(r11, "content://com.facebook.orca.liteprovider.FamilyAppsUserValuesLiteProvider/user_values", "com.facebook.orca", r13, r42);
        A0E = A019;
        AnonymousClass4n9 A0110 = AnonymousClass4n9.A01(r11, "content://com.facebook.orca.liteprovider.FamilyAppsUserValuesLiteProvider/user_values", "com.facebook.orca", r12, r42);
        A0D = A0110;
        A00 = C06750aI.A17(A012, A013, A018);
        A02 = C06750aI.A17(A014, A015, A019);
        A01 = C06750aI.A17(A016, A017, A0110);
    }
}
