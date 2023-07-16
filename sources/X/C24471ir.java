package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment;
import java.io.IOException;

/* renamed from: X.1ir  reason: invalid class name and case insensitive filesystem */
public final class C24471ir extends C63873iU implements C83774ry {
    public DirectMessagesInteropOptionsViewModel A00;
    public String A01;
    public boolean A02 = true;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final AnonymousClass3US A06;
    public final C28161tl A07;
    public final UserSession A08;
    public final C63083bT A09;
    public final AnonymousClass36C A0A = new AnonymousClass36C(this);
    public final C61203Sh A0B;
    public final AnonymousClass49K A0C;
    public final DirectMessagesOptionsFragment A0D;
    public final AnonymousClass266 A0E;
    public final boolean A0F;
    public final AnonymousClass282 A0G;
    public final C60213Od A0H;
    public final C83784rz A0I;
    public final C49162qw A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static final void A00(C24471ir r14) {
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2;
        try {
            r14.A00 = null;
            SharedPreferences sharedPreferences = r14.A07.A00;
            String string = sharedPreferences.getString("interop_reachability_setting_PENDING", (String) null);
            if (!(string == null || string.length() == 0)) {
                r14.A00 = C60223Oe.parseFromJson(C18180wK.A0L(string));
            }
            if (r14.A00 == null) {
                String A0W = C18250wR.A0W(sharedPreferences, "interop_reachability_setting");
                C04220Ms.A06(A0W);
                DirectMessagesInteropOptionsViewModel parseFromJson = C60223Oe.parseFromJson(C18180wK.A0L(A0W));
                if (parseFromJson == null) {
                    AnonymousClass266 r0 = r14.A0E;
                    if (r0 != null) {
                        int ordinal = r0.ordinal();
                        if (ordinal == 2) {
                            DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3 = DirectMessageInteropReachabilityOptions.A0F;
                            parseFromJson = new DirectMessagesInteropOptionsViewModel(directMessageInteropReachabilityOptions3, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, directMessageInteropReachabilityOptions3, directMessageInteropReachabilityOptions3, DirectMessageInteropReachabilityOptions.A0E, directMessageInteropReachabilityOptions3, DirectMessageInteropReachabilityOptions.A0A, directMessageInteropReachabilityOptions3);
                        } else if (ordinal == 3) {
                            directMessageInteropReachabilityOptions2 = DirectMessageInteropReachabilityOptions.A0F;
                            directMessageInteropReachabilityOptions = DirectMessageInteropReachabilityOptions.A0E;
                            parseFromJson = new DirectMessagesInteropOptionsViewModel(directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, DirectMessageInteropReachabilityOptions.A0A, directMessageInteropReachabilityOptions2);
                        }
                    }
                    directMessageInteropReachabilityOptions2 = DirectMessageInteropReachabilityOptions.A0F;
                    directMessageInteropReachabilityOptions = DirectMessageInteropReachabilityOptions.A0C;
                    parseFromJson = new DirectMessagesInteropOptionsViewModel(directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, DirectMessageInteropReachabilityOptions.A0A, directMessageInteropReachabilityOptions2);
                }
                r14.A00 = parseFromJson;
            }
        } catch (IOException e) {
            C10450iM.A06("DirectMessagesInteropOptionsControllerImpl", "Error while parsing DirectMessagesInteropOptionsViewModel", e);
        }
    }

    public final void A02(String str) {
        C04220Ms.A0B(str, 0);
        UserSession userSession = this.A08;
        AnonymousClass266 r3 = this.A0E;
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = this.A00;
        boolean z = this.A0K;
        boolean z2 = this.A0L;
        boolean z3 = this.A03;
        C60233Of.A01(userSession, directMessagesInteropOptionsViewModel, this.A0I, r3, str, z, z2, z3);
    }

    public final void D9n(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, String str) {
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel3 = directMessagesInteropOptionsViewModel;
        String str2 = str;
        if (str != null) {
            DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel4 = directMessagesInteropOptionsViewModel2;
            if (directMessagesInteropOptionsViewModel2 != null) {
                this.A09.A04(directMessagesInteropOptionsViewModel4, directMessagesInteropOptionsViewModel3, this.A0E, str2, this.A03, this.A0F, true);
            }
        }
        this.A01 = str;
        this.A00 = directMessagesInteropOptionsViewModel;
        this.A02 = true;
        this.A0D.A0C();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r2.A02 != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r3 = this;
            X.49K r2 = r3.A0C
            monitor-enter(r2)
            X.H8c r0 = r2.A03     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x000c
            X.H8c r1 = r2.A02     // Catch:{ all -> 0x005b }
            r0 = 0
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x004f
            com.instagram.service.session.UserSession r0 = r3.A08
            X.H1T r2 = X.AnonymousClass0wJ.A0P(r0)
            java.lang.String r0 = "users/get_message_settings_v2/"
            r2.A0J(r0)
            java.lang.Class<X.1U6> r1 = X.AnonymousClass1U6.class
            java.lang.Class<X.3Oi> r0 = X.C60263Oi.class
            X.H8c r1 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1.A00 = r3
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment r0 = r3.A0D
            r0.schedule(r1)
        L_0x002a:
            X.282 r2 = r3.A0G
            if (r2 == 0) goto L_0x004e
            X.3bT r0 = r3.A09
            X.0nS r1 = r0.A00
            java.lang.String r0 = "direct_reachability_settings_view"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 544(0x220, float:7.62E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = r2.name()
            X.C18210wN.A1B(r1, r0)
            r1.Bb4()
        L_0x004e:
            return
        L_0x004f:
            A00(r3)
            r0 = 0
            r3.A02 = r0
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment r0 = r3.A0D
            r0.A0C()
            goto L_0x002a
        L_0x005b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24471ir.A01():void");
    }

    public final void D9A(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, AnonymousClass1TE r24, String str) {
        C57543Bm r2;
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel3 = directMessagesInteropOptionsViewModel;
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel4 = directMessagesInteropOptionsViewModel2;
        String str2 = str;
        if (!(str == null || directMessagesInteropOptionsViewModel == null)) {
            this.A09.A04(directMessagesInteropOptionsViewModel3, directMessagesInteropOptionsViewModel4, this.A0E, str2, this.A03, this.A0F, false);
        }
        this.A01 = str2;
        if (directMessagesInteropOptionsViewModel != null) {
            AnonymousClass1TE r8 = r24;
            if (!(r24 == null || (r2 = r8.A01) == null || r2.A03 == null || r2.A02 == null || r2.A01 == null || r2.A00 == null || r8.A00 == null)) {
                if (str != null) {
                    C63083bT.A03(this.A09, directMessagesInteropOptionsViewModel3, directMessagesInteropOptionsViewModel4, this.A0E, str2, this.A03, this.A0F, false);
                }
                C57543Bm r4 = r8.A01;
                if (r4 != null) {
                    Context context = this.A05;
                    String str3 = r4.A03;
                    if (str3 != null) {
                        String str4 = r4.A02;
                        if (str4 != null) {
                            String str5 = r4.A01;
                            if (str5 != null) {
                                String str6 = r4.A00;
                                if (str6 != null) {
                                    AnonymousClass1U6 r42 = r8.A00;
                                    if (r42 != null) {
                                        C71754Kc r3 = new C71754Kc(this, directMessagesInteropOptionsViewModel3);
                                        AnonymousClass0wJ.A1O(str3, str4);
                                        AnonymousClass0wJ.A1R(str5, str6);
                                        C25828Dsm A0W = C18190wL.A0W(context);
                                        A0W.A02 = str3;
                                        A0W.A0p(str4);
                                        A0W.A0c(new IDxCListenerShape77S0200000_1_I2(56, (Object) r3, (Object) r42), str5);
                                        A0W.A0b(C18220wO.A0O(r3, 155), str6);
                                        C18240wQ.A1C(A0W, r3, 12);
                                        AnonymousClass0wJ.A1K(A0W);
                                        return;
                                    }
                                    throw C18180wK.A0a("Required value was null.");
                                }
                                throw C18180wK.A0a("Required value was null.");
                            }
                            throw C18180wK.A0a("Required value was null.");
                        }
                        throw C18180wK.A0a("Required value was null.");
                    }
                    throw C18180wK.A0a("Required value was null.");
                }
                throw C18180wK.A0a("Required value was null.");
            }
        }
        C60213Od.A00(this.A05);
        if (directMessagesInteropOptionsViewModel != null) {
            this.A00 = directMessagesInteropOptionsViewModel3;
        } else {
            A00(this);
        }
        C23411dm.A08(this);
    }

    public final void onFail(AnonymousClass3XX r6) {
        int A032 = C14030oh.A03(1905869323);
        C04220Ms.A0B(r6, 0);
        super.onFail(r6);
        A00(this);
        this.A04 = false;
        AnonymousClass3US r3 = this.A06;
        USLEBaseShape0S0000000 A0K2 = USLEBaseShape0S0000000.A0K(r3.A00);
        AnonymousClass3US.A00(A0K2, r3, "fetch_data_error");
        C18190wL.A1I(A0K2, "ig_message_settings");
        A0K2.A0T("message_controls_settings_version", "v2");
        A0K2.A1J(C63483hZ.A02(r6));
        A0K2.A0T("error_identifier", C63483hZ.A01(r6));
        A0K2.Bb4();
        C23411dm.A08(this);
        C14030oh.A0A(-1396766970, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(1994811149);
        AnonymousClass1U6 r10 = (AnonymousClass1U6) obj;
        int A033 = C14030oh.A03(1370537357);
        C04220Ms.A0B(r10, 0);
        super.onSuccess(r10);
        DirectMessagesInteropOptionsViewModel A012 = AnonymousClass1j3.A01(r10);
        this.A00 = A012;
        try {
            C28161tl r0 = this.A07;
            String A002 = C60223Oe.A00(A012);
            C04220Ms.A06(A002);
            C18180wK.A0v(C28161tl.A02(r0), "interop_reachability_setting", A002);
        } catch (IOException e) {
            C10450iM.A06("DirectMessagesInteropOptionsControllerImpl", "Error while serializing DirectMessagesInteropOptionsViewModel", e);
        }
        if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A08, 36312896220693720L)) {
            boolean z = r10.A0B;
            this.A04 = z;
            if (!z || r10.A00 != null) {
                AnonymousClass3US r1 = this.A06;
                Boolean bool = r10.A00;
                USLEBaseShape0S0000000 A0K2 = USLEBaseShape0S0000000.A0K(r1.A00);
                AnonymousClass3US.A00(A0K2, r1, "fetch_data");
                C18190wL.A1I(A0K2, "ig_message_settings");
                A0K2.A0Q("eligible_ig_dm_toggle", Boolean.valueOf(z));
                A0K2.A0Q("source_of_truth_toggle_value", bool);
                C18230wP.A1E(A0K2);
                if (this.A04) {
                    C28161tl r12 = this.A07;
                    Boolean bool2 = r10.A00;
                    if (bool2 != null) {
                        AnonymousClass0wJ.A13(C28161tl.A02(r12), "direct_linked_page_ig_dm_access", bool2.booleanValue());
                    } else {
                        IllegalStateException A0b = AnonymousClass0wJ.A0b();
                        C14030oh.A0A(-404044280, A033);
                        throw A0b;
                    }
                }
            } else {
                this.A06.A01("fetch_data_error", (Boolean) null);
                this.A04 = false;
            }
        }
        C23411dm.A08(this);
        C14030oh.A0A(511228452, A033);
        C14030oh.A0A(1550469156, A032);
    }

    public C24471ir(Context context, AnonymousClass282 r4, AnonymousClass3US r5, C28161tl r6, UserSession userSession, C63083bT r8, C60213Od r9, C61203Sh r10, AnonymousClass49K r11, DirectMessagesOptionsFragment directMessagesOptionsFragment, C83784rz r13, C49162qw r14, AnonymousClass266 r15, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass0wJ.A1Q(userSession, r6);
        C04220Ms.A0B(r11, 5);
        this.A05 = context;
        this.A08 = userSession;
        this.A07 = r6;
        this.A0J = r14;
        this.A0C = r11;
        this.A0H = r9;
        this.A09 = r8;
        this.A06 = r5;
        this.A0B = r10;
        this.A03 = z;
        this.A0F = z2;
        this.A0E = r15;
        this.A0K = z3;
        this.A0L = z4;
        this.A0G = r4;
        this.A0D = directMessagesOptionsFragment;
        this.A0I = r13;
    }
}
