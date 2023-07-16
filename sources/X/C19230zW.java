package X;

import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0101000_I2_6;

/* renamed from: X.0zW  reason: invalid class name and case insensitive filesystem */
public abstract class C19230zW extends AnonymousClass10X {
    public int A00;
    public int A01;
    public Boolean A02;
    public boolean A03;
    public final AnonymousClass49Y A04;
    public final AnonymousClass20y A05;
    public final UserSession A06;
    public final C86074wE A07;
    public final C86074wE A08;
    public final C86074wE A09;
    public final C86074wE A0A;
    public final C86074wE A0B = C18190wL.A0z(DIV.A01);
    public final C86074wE A0C = C18190wL.A0z(C18180wK.A0X());
    public final C86094wG A0D;
    public final C86094wG A0E;
    public final C86094wG A0F;
    public final C86094wG A0G;

    public C19230zW(Application application, AnonymousClass49Y r5, AnonymousClass20y r6, UserSession userSession, Integer num) {
        super(application);
        C312624x r1;
        this.A06 = userSession;
        this.A04 = r5;
        this.A05 = r6;
        if (r6 == AnonymousClass20y.Social && num != null && num.intValue() == 2) {
            r1 = C312624x.ONE_MONTH;
        } else {
            r1 = C312624x.INDEFINITE;
        }
        C27457Enn A0z = C18190wL.A0z(1);
        this.A07 = A0z;
        C27457Enn A0z2 = C18190wL.A0z(r1);
        this.A08 = A0z2;
        this.A0D = C18230wP.A0x((C148838sG) null, A0z);
        this.A0E = C18230wP.A0x((C148838sG) null, A0z2);
        C27457Enn A0z3 = C18190wL.A0z(AnonymousClass4BP.A00);
        this.A0A = A0z3;
        this.A0G = C18230wP.A0x((C148838sG) null, A0z3);
        C27457Enn A0z4 = C18190wL.A0z(C22885Chx.A00);
        this.A09 = A0z4;
        this.A0F = A0z4;
    }

    public final void A0C(FragmentActivity fragmentActivity) {
        if (this instanceof C25641oa) {
            C25641oa r3 = (C25641oa) this;
            C86094wG r10 = r3.A0D;
            if (AnonymousClass0wJ.A04(r10.getValue()) == 2) {
                AnonymousClass49J r8 = r3.A01;
                String str = r3.A03.A00;
                if (str == null) {
                    str = C18180wK.A0e();
                }
                r8.A00 = str;
                C319829s r7 = C319829s.DM_CREATE;
                AnonymousClass49J.A00(AnonymousClass28X.TAP, C319929t.CHAT_CREATION_SHEET_RENDERED, C320029u.CREATE_SUBSCRIBER_GROUP_CHAT_ITEM, r7, r8, (Map) null);
                Bundle A002 = C98316Fa.A00(C18180wK.A0p("channel_title", r3.A0B.getValue()), C18180wK.A0p("should_pin_to_profile", Boolean.valueOf(r3.A03)), C18180wK.A0p("channel_duration", Integer.valueOf(((C312624x) r3.A0E.getValue()).A00)), C18180wK.A0p("entrypoint", AnonymousClass24R.DM));
                C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, r3.A06);
                A0Q.A0A(A002, new C23511dy());
                A0Q.A05();
                return;
            } else if (r3.A06) {
                AnonymousClass49W r6 = r3.A03;
                USLEBaseShape0S0000000 A0D2 = USLEBaseShape0S0000000.A0D(r6.A02);
                if (AnonymousClass0wJ.A1U(A0D2)) {
                    AnonymousClass49W.A03(A0D2, r6);
                    AnonymousClass2A3.A00(AnonymousClass2AB.A09, A0D2, "event");
                    C62443a0.A01(A0D2, AnonymousClass2AH.A00(C40326Lcg.A0D, A0D2, r6));
                    A0D2.Bb4();
                }
                UserSession userSession = r3.A06;
                String str2 = (String) r3.A0B.getValue();
                if (str2 == null) {
                    str2 = "";
                }
                AnonymousClass24S r9 = r3.A02;
                boolean z = r3.A03;
                int i = ((C312624x) r3.A0E.getValue()).A00;
                int A042 = AnonymousClass0wJ.A04(r10.getValue());
                Bundle A062 = C18180wK.A06();
                A062.putBoolean("direct_is_creating_social_channel", true);
                A062.putSerializable("social_channel_creation_source", r9);
                A062.putString("direct_channel_creation_title", str2);
                A062.putBoolean("direct_channel_creation_should_pin_to_profile", z);
                A062.putInt("direct_channel_creation_duration_type", i);
                A062.putInt("direct_channel_audience_type", A042);
                A062.putBoolean("direct_channel_has_chat_photo", false);
                C63863iT A052 = C63863iT.A05(fragmentActivity, A062, userSession, ModalActivity.class, "direct_pick_recipients_redesign");
                A052.A08 = true;
                A052.A0I(fragmentActivity);
                return;
            }
        }
        C25237DiI.A00((Integer) null, C25295DjG.A01, new KtSLambdaShape9S0101000_I2_6(this, (C146958n9) null, 49), AnonymousClass3J5.A00(this), 2);
    }

    public final int A09() {
        if (this instanceof C25641oa) {
            return ((C25641oa) this).A00;
        }
        return ((C25651ob) this).A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006e, code lost:
        if (r3.A03 == false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C32165H8c A0A() {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C25641oa
            if (r0 == 0) goto L_0x0052
            com.instagram.service.session.UserSession r1 = r8.A06
            X.4wE r0 = r8.A0B
            java.lang.Object r5 = r0.getValue()
            java.lang.String r5 = (java.lang.String) r5
            boolean r4 = r8.A03
            X.4wG r0 = r8.A0E
            java.lang.Object r0 = r0.getValue()
            X.24x r0 = (X.C312624x) r0
            int r2 = r0.A00
            X.H1T r3 = X.AnonymousClass0wJ.A0N(r1)
            r3.A06()
            java.lang.String r0 = "direct_v2/create_group_thread/"
            r3.A0J(r0)
            java.lang.Class<X.FWy> r1 = X.FWy.class
            java.lang.Class<X.GNd> r0 = X.C30615GNd.class
            r3.A0B(r1, r0)
            java.lang.String r1 = "is_discoverable_chat_thread"
            r0 = 1
            r3.A0R(r1, r0)
            java.lang.String r1 = "recipient_users"
            java.lang.String r0 = "[]"
            r3.A0O(r1, r0)
            java.lang.String r0 = "duration_s"
            r3.A0K(r0, r2)
            if (r5 == 0) goto L_0x0046
            java.lang.String r0 = "thread_title"
            r3.A0O(r0, r5)
        L_0x0046:
            if (r4 == 0) goto L_0x004d
            java.lang.String r0 = "pin_to_profile"
        L_0x004a:
            r3.A0R(r0, r4)
        L_0x004d:
            X.H8c r0 = r3.A02()
            return r0
        L_0x0052:
            r3 = r8
            X.1ob r3 = (X.C25651ob) r3
            com.instagram.service.session.UserSession r1 = r3.A06
            X.4wE r0 = r3.A0B
            java.lang.Object r6 = r0.getValue()
            java.lang.String r6 = (java.lang.String) r6
            X.4wG r0 = r3.A0D
            java.lang.Object r5 = r0.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0070
            boolean r0 = r3.A03
            r7 = 1
            if (r0 != 0) goto L_0x0071
        L_0x0070:
            r7 = 0
        L_0x0071:
            java.lang.Boolean r2 = r3.A02
            X.4wG r0 = r3.A0E
            java.lang.Object r0 = r0.getValue()
            X.24x r0 = (X.C312624x) r0
            int r4 = r0.A00
            X.H1T r3 = X.AnonymousClass0wJ.A0N(r1)
            r3.A06()
            java.lang.String r0 = "direct_v2/create_group_thread/"
            r3.A0J(r0)
            java.lang.Class<X.FWy> r1 = X.FWy.class
            java.lang.Class<X.GNd> r0 = X.C30615GNd.class
            r3.A0B(r1, r0)
            java.lang.String r1 = "is_creator_broadcast_chat"
            r0 = 1
            r3.A0R(r1, r0)
            java.lang.String r0 = "pin_to_profile"
            r3.A0R(r0, r7)
            java.lang.String r1 = "recipient_users"
            java.lang.String r0 = "[]"
            r3.A0O(r1, r0)
            java.lang.String r0 = "duration_s"
            r3.A0K(r0, r4)
            if (r6 == 0) goto L_0x00ae
            java.lang.String r0 = "thread_title"
            r3.A0O(r0, r6)
        L_0x00ae:
            if (r5 == 0) goto L_0x00bd
            int r0 = r5.intValue()
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.String r0 = "audience_type"
            r3.A0O(r0, r1)
        L_0x00bd:
            if (r2 == 0) goto L_0x004d
            boolean r4 = r2.booleanValue()
            java.lang.String r0 = "is_comments_enabled"
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19230zW.A0A():X.H8c");
    }

    public final C86094wG A0B() {
        if (this instanceof C25641oa) {
            return ((C25641oa) this).A04;
        }
        return ((C25651ob) this).A04;
    }

    public final void A0D(AnonymousClass5z1 r9) {
        String str;
        String str2;
        if (this instanceof C25641oa) {
            C04220Ms.A0B(r9, 0);
            UserSession userSession = this.A06;
            AnonymousClass49W A002 = AnonymousClass2MQ.A00(userSession);
            Application application = this.A00;
            C04220Ms.A0C(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
            String A012 = AnonymousClass3PX.A01(C18230wP.A09(application), r9, userSession);
            int A003 = AnonymousClass3PX.A00(r9);
            boolean z = r9.A00 instanceof AnonymousClass1j8;
            USLEBaseShape0S0000000 A0D2 = USLEBaseShape0S0000000.A0D(A002.A02);
            if (AnonymousClass0wJ.A1U(A0D2)) {
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put("error_message", A012);
                A0y.put(TraceFieldType.ErrorCode, String.valueOf(A003));
                if (z) {
                    str2 = "True";
                } else {
                    str2 = "False";
                }
                A0y.put("is_network_error", str2);
                AnonymousClass49W.A03(A0D2, A002);
                C18220wO.A1D(AnonymousClass2AB.A0Q, A0D2);
                C18220wO.A1E(AnonymousClass2A3.VIEW, A0D2);
                C62443a0.A01(A0D2, AnonymousClass2AH.A00(C40326Lcg.A09, A0D2, A002));
                C18200wM.A1J(A0D2, A0y);
                return;
            }
            return;
        }
        C04220Ms.A0B(r9, 0);
        AnonymousClass49Y r4 = this.A04;
        int A042 = AnonymousClass0wJ.A04(this.A0D.getValue());
        boolean z2 = r9.A00 instanceof AnonymousClass1j8;
        int A004 = AnonymousClass3PX.A00(r9);
        Application application2 = this.A00;
        C04220Ms.A0C(application2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        String A013 = AnonymousClass3PX.A01(C18230wP.A09(application2), r9, this.A06);
        USLEBaseShape0S0000000 A005 = AnonymousClass49Y.A00(r4);
        if (AnonymousClass0wJ.A1U(A005)) {
            HashMap A0y2 = AnonymousClass0wJ.A0y();
            A0y2.put("error_message", A013);
            A0y2.put(TraceFieldType.ErrorCode, String.valueOf(A004));
            if (z2) {
                str = "True";
            } else {
                str = "False";
            }
            A0y2.put("is_network_error", str);
            AnonymousClass49Y.A03(A005, r4);
            C18220wO.A1D(AnonymousClass2AE.A0a, A005);
            C18220wO.A1E(AnonymousClass2A4.VIEW, A005);
            C18230wP.A1D(C40328Lci.A07, A005);
            AnonymousClass3Zh.A02(AnonymousClass2AA.A04, A005, A042);
            A005.A0T("ig_thread_id", (String) null);
            A005.A0S("consistent_thread_fbid", (Long) null);
            C62443a0.A01(A005, r4.A00);
            C18200wM.A1J(A005, A0y2);
        }
    }

    public final void A0E(FWy fWy) {
        if (this instanceof C25641oa) {
            C25641oa r7 = (C25641oa) this;
            C04220Ms.A0B(fWy, 0);
            String str = r7.A02.A00;
            boolean z = false;
            if (AnonymousClass0wJ.A04(r7.A0D.getValue()) == 2) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            Boolean valueOf2 = Boolean.valueOf(r7.A03);
            AnonymousClass49W A002 = AnonymousClass2MQ.A00(r7.A06);
            String str2 = fWy.A0t;
            C04220Ms.A06(str2);
            String str3 = fWy.A0y;
            C04220Ms.A06(str3);
            USLEBaseShape0S0000000 A0D2 = USLEBaseShape0S0000000.A0D(A002.A02);
            if (AnonymousClass0wJ.A1U(A0D2)) {
                AnonymousClass49W.A03(A0D2, A002);
                C18220wO.A1D(AnonymousClass2AB.A0R, A0D2);
                C18220wO.A1E(AnonymousClass2A3.VIEW, A0D2);
                C62443a0.A01(A0D2, AnonymousClass2AH.A00(C40326Lcg.A09, A0D2, A002));
                A0D2.A0T("ig_thread_id", str2);
                A0D2.A0S("consistent_thread_fbid", AnonymousClass4n2.A02(str3));
                C18200wM.A1J(A0D2, AnonymousClass49W.A02(false, valueOf, valueOf2, str));
                return;
            }
            return;
        }
        C04220Ms.A0B(fWy, 0);
        AnonymousClass49Y r5 = this.A04;
        int A042 = AnonymousClass0wJ.A04(this.A0D.getValue());
        String str4 = fWy.A0t;
        C04220Ms.A06(str4);
        String str5 = fWy.A0y;
        C04220Ms.A06(str5);
        USLEBaseShape0S0000000 A003 = AnonymousClass49Y.A00(r5);
        if (AnonymousClass0wJ.A1U(A003)) {
            AnonymousClass49Y.A03(A003, r5);
            C18220wO.A1D(AnonymousClass2AE.A0b, A003);
            C18220wO.A1E(AnonymousClass2A4.VIEW, A003);
            C18230wP.A1D(C40328Lci.A07, A003);
            AnonymousClass3Zh.A02(AnonymousClass2AA.A0H, A003, A042);
            A003.A0T("ig_thread_id", str4);
            A003.A0S("consistent_thread_fbid", AnonymousClass4n2.A02(str5));
            C62443a0.A01(A003, r5.A00);
            A003.Bb4();
        }
    }
}
