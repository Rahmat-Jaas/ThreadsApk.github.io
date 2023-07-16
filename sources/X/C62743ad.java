package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.bloks.hosting.intf.IgBloksScreenExitCallback;
import com.instagram.service.session.UserSession;
import com.instagram.ui.bottomsheet.intf.IDxCListenerShape179S0100000_1_I2;
import com.instagram.wellbeing.ixttriggers.controller.IxtTriggerController$createCallback$1;
import java.util.AbstractMap;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape143S0100000_I2_123;

/* renamed from: X.3ad  reason: invalid class name and case insensitive filesystem */
public final class C62743ad {
    public C37383Jqm A00;
    public boolean A01;
    public boolean A02;
    public final FragmentActivity A03;
    public final IgBloksScreenExitCallback A04;
    public final C11630kW A05;
    public final UserSession A06;
    public final C25745DrH A07;
    public final AnonymousClass3If A08;
    public final Boolean A09;
    public final String A0A;
    public final String A0B;
    public final Map A0C;
    public final C04530Oa A0D = AnonymousClass0OY.A02(new KtLambdaShape143S0100000_I2_123(this, 18));
    public final C04530Oa A0E = AnonymousClass0OY.A02(new KtLambdaShape143S0100000_I2_123(this, 19));
    public final C04530Oa A0F = AnonymousClass0OY.A02(new KtLambdaShape143S0100000_I2_123(this, 20));
    public final C04530Oa A0G = AnonymousClass0OY.A02(new KtLambdaShape143S0100000_I2_123(this, 21));
    public final C04530Oa A0H = AnonymousClass0OY.A02(new KtLambdaShape143S0100000_I2_123(this, 22));
    public final C13330nS A0I;
    public final Integer A0J;

    public C62743ad(FragmentActivity fragmentActivity, IgBloksScreenExitCallback igBloksScreenExitCallback, C11630kW r5, C37383Jqm jqm, UserSession userSession, AnonymousClass3If r8, Boolean bool, Integer num, String str, String str2, Map map) {
        C04220Ms.A0B(fragmentActivity, 2);
        this.A06 = userSession;
        this.A03 = fragmentActivity;
        this.A0C = map;
        this.A0A = str;
        this.A0J = num;
        this.A05 = r5;
        this.A08 = r8;
        this.A0B = str2;
        this.A00 = jqm;
        this.A09 = bool;
        this.A04 = igBloksScreenExitCallback;
        this.A0I = C13330nS.A01(r5, userSession);
        this.A07 = C18220wO.A0b(fragmentActivity);
    }

    public static final void A00(C40322Lcc lcc, C62743ad r6) {
        USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(r6.A0I, "ufix_ig_ixt_trigger"), 2777);
        if (AnonymousClass0wJ.A1U(A0I2)) {
            AnonymousClass14R r4 = new AnonymousClass14R();
            Map map = r6.A0C;
            Object obj = map.get("trigger_session_id");
            if (obj != null) {
                r4.A0A(C61953Wm.A00(), (String) obj);
                r4.A04(lcc, "event_step");
                r4.A04(AnonymousClass29P.IXT, "event_source");
                r4.A0A("entity_id", C18220wO.A0r(I17.A00(680), map));
                A0I2.A0P(r4, "core");
                A0I2.A0P((AnonymousClass0V3) C18190wL.A0f(r6.A0G), "ig");
                A0I2.A0P((AnonymousClass0V3) C18190wL.A0f(r6.A0H), "ixt_trigger");
                A0I2.Bb4();
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
    }

    public static final void A01(AnonymousClass3XX r4, C62743ad r5) {
        C85814vo r0;
        USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(r5.A0I, "ufix_ig_ixt_trigger_fetching_failed"), 2776);
        if (AnonymousClass0wJ.A1U(A0I2)) {
            Throwable th = r4.A01;
            String str = null;
            if (!AnonymousClass0wJ.A1W(th)) {
                Object obj = r4.A00;
                if (!(obj == null || (r0 = (C85814vo) obj) == null)) {
                    str = r0.getErrorMessage();
                }
            } else if (th != null) {
                str = th.getMessage();
            }
            A0I2.A0P((AnonymousClass0V3) C18190wL.A0f(r5.A0D), "core");
            A0I2.A0P((AnonymousClass0V3) C18190wL.A0f(r5.A0E), "ig");
            A0I2.A0P((AnonymousClass0V3) C18190wL.A0f(r5.A0F), "ixt_trigger");
            if (str == null) {
                str = "";
            }
            A0I2.A0T("error_message", str);
            A0I2.Bb4();
        }
    }

    public static final void A02(C62743ad r5) {
        C37032Jj9 A0L = C18210wN.A0L(r5.A06);
        C18250wR.A1B(A0L, true);
        A0L.A0Z = true;
        A0L.A00 = 0.7f;
        String str = r5.A0B;
        if (str != null) {
            A0L.A0O = str;
        }
        C23281ct r3 = new C23281ct();
        C25745DrH drH = r5.A07;
        if (drH != null) {
            drH.A0A(new IDxCListenerShape179S0100000_1_I2(r5, 3));
        }
        C63643hy.A04(new C73434Sk(A0L, r5, r3));
    }

    public final Fragment A03() {
        IgBloksScreenConfig A0N = C18190wL.A0N(this.A06);
        A0N.A06 = new IxtTriggerController$createCallback$1(this);
        A0N.A0P = this.A05.getModuleName();
        IgBloksScreenExitCallback igBloksScreenExitCallback = this.A04;
        if (igBloksScreenExitCallback != null) {
            A0N.A04 = igBloksScreenExitCallback;
        }
        return C62853b1.A02(A0N, C63743iE.A02(this.A0A, this.A0C));
    }

    public final void A04() {
        if (this.A0J.intValue() != 0) {
            UserSession userSession = this.A06;
            IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
            A0N.A06 = new IxtTriggerController$createCallback$1(this);
            A0N.A0P = this.A05.getModuleName();
            String str = this.A0B;
            if (str != null) {
                A0N.A0S = str;
            }
            IgBloksScreenExitCallback igBloksScreenExitCallback = this.A04;
            if (igBloksScreenExitCallback != null) {
                A0N.A04 = igBloksScreenExitCallback;
            }
            C25786Drz A0Q = AnonymousClass0wJ.A0Q(this.A03, userSession);
            String str2 = this.A0A;
            AbstractMap abstractMap = (AbstractMap) this.A0C;
            A0Q.A03 = C62853b1.A02(A0N, C63743iE.A02(str2, abstractMap));
            String A0f = C18240wQ.A0f("ixt_initial_screen_id", abstractMap);
            if (A0f != null) {
                A0Q.A07 = A0f;
            }
            A0Q.A05();
        } else if (C04220Ms.A0I(this.A09, C18180wK.A0Y())) {
            new AnonymousClass1jH(this).A02(new Void[0]);
        } else {
            AnonymousClass4A9 A002 = C63263h8.A00(this.A06, this.A0A, this.A0C);
            AnonymousClass4A9.A00(A002, this, 18);
            C31155GhB.A03(A002);
        }
    }
}
