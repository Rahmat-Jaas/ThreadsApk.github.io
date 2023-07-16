package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import com.facebook.redex.IDxAListenerShape459S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1x1  reason: invalid class name */
public final class AnonymousClass1x1 extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "LinkedAccountsFragment";
    public int A00;
    public C26141q7 A01;
    public AnonymousClass3zG A02;
    public boolean A03;
    public final C04530Oa A04 = C80644m9.A00(this);
    public final C82394pY A05 = C18220wO.A0P(this, 74);
    public final C82394pY A06 = C18220wO.A0P(this, 75);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131827805);
    }

    public final String getModuleName() {
        return "sharing_settings";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public static final AnonymousClass264 A0B(AnonymousClass1x1 r2) {
        if (C06810aP.A01.A01(AnonymousClass0wJ.A0X(r2.A04)).A3Z()) {
            return AnonymousClass264.PROFESSIONAL_OPTION_LINKED_ACCOUNTS;
        }
        return AnonymousClass264.A0O;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public static final List A0C(AnonymousClass1x1 r16) {
        Object r11;
        String A042;
        User A002;
        User A003;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass1x1 r4 = r16;
        if (r4.getContext() != null) {
            if (r4.getContext() != null) {
                C04530Oa r2 = r4.A04;
                C10300i6 A0U = AnonymousClass0wJ.A0U(r2);
                C04220Ms.A0B(A0U, 1);
                ImmutableList.Builder builder = ImmutableList.builder();
                for (AnonymousClass2AI r5 : AnonymousClass2AI.values()) {
                    if (!C04220Ms.A0I(r5.A02, "whatsapp") || ((A002 = C04660Oo.A00(A0U)) != null && A002.A3a() && (A003 = C04660Oo.A00(A0U)) != null && A003.A2s())) {
                        builder.add((Object) r5);
                    }
                }
                C1366783w it = C18250wR.A0F(builder).iterator();
                while (it.hasNext()) {
                    AnonymousClass2AI r6 = (AnonymousClass2AI) it.next();
                    if (r6 != null) {
                        int i = AnonymousClass31O.A00[r6.ordinal()];
                        if (i == 1) {
                            AnonymousClass2AI r7 = AnonymousClass2AI.A04;
                            if (r6 != r7 || !r6.A0A(AnonymousClass0wJ.A0X(r2))) {
                                if (C67253zE.A02(AnonymousClass0wJ.A0U(r2))) {
                                }
                                r11 = new C57573Bp(new IDxCListenerShape70S0200000_1_I2(r6, r4, (int) HttpStatus.SC_RESET_CONTENT), r6.A01, r6.A00, r6.A0A(AnonymousClass0wJ.A0X(r2)));
                            } else {
                                int i2 = r6.A01;
                                boolean A0F = C63803iN.A0F(AnonymousClass0wJ.A0U(r2));
                                UserSession A0X = AnonymousClass0wJ.A0X(r2);
                                if (A0F) {
                                    A042 = C67373zR.A01(A0X);
                                } else {
                                    A042 = C67363zQ.A04(A0X);
                                    C04220Ms.A06(A042);
                                }
                                r11 = new C57683Cb(C18210wN.A0H(r4, 281), A042, i2, r6.A00, r7.A0A(AnonymousClass0wJ.A0X(r2)));
                            }
                        } else if (i == 2) {
                            r11 = new C57673Ca(new IDxCListenerShape70S0200000_1_I2(r6, r4, (int) HttpStatus.SC_PARTIAL_CONTENT), r6.A01(AnonymousClass0wJ.A0X(r2)), r6.A01, r6.A00, r6.A09(AnonymousClass0wJ.A0X(r2)));
                        }
                        A0v.add(r11);
                    }
                    C04220Ms.A04(r6);
                    r11 = new C57573Bp(new IDxCListenerShape70S0200000_1_I2(r6, r4, (int) HttpStatus.SC_RESET_CONTENT), r6.A01, r6.A00, r6.A0A(AnonymousClass0wJ.A0X(r2)));
                    A0v.add(r11);
                }
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        }
        return A0v;
    }

    public static final void A0D(AnonymousClass1x1 r13, boolean z) {
        AbstractMap A0y;
        String str;
        FragmentActivity requireActivity = r13.requireActivity();
        C04530Oa r3 = r13.A04;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass0wJ.A0U(r3), 36325304381219881L)) {
            K9R k9r = K9R.A00;
            IVw iVw = new IVw(k9r);
            iVw.A04("entrypoint", "ig_cross_posting_settings");
            iVw.A04("account_id", AnonymousClass0wJ.A0X(r3).getUserId());
            iVw.A04("newly_linked", String.valueOf(z));
            iVw.A03("platform", 1);
            IVw iVw2 = new IVw(k9r);
            iVw2.A04("entrypoint", "ig_cross_posting_settings");
            iVw2.A04("deeplink_destination", "cross_posting_skip_profiles_screen");
            iVw2.A00.put("deeplink_params", iVw);
            A0y = new MV5(C18180wK.A0M(k9r, iVw2));
            str = "com.bloks.www.fxcal.settings.async";
        } else if (C67373zR.A07(AnonymousClass0wJ.A0X(r3))) {
            A0y = AnonymousClass0wJ.A0y();
            String A0M = AnonymousClass00U.A0M("\"account_id\":\"", AnonymousClass0wJ.A0X(r3).getUserId(), '\"');
            String A0H = AnonymousClass00U.A0H("\"newly_linked\":\"", '\"', z);
            StringBuilder A0s = C18190wL.A0s("{server_params: {");
            A0s.append(A0M);
            A0s.append(BasicHeaderValueParser.ELEM_DELIMITER);
            A0s.append(A0H);
            A0s.append(BasicHeaderValueParser.ELEM_DELIMITER);
            A0s.append("\"entrypoint\":\"1\"");
            A0y.put("params", C18180wK.A0i("}}", A0s));
            str = "com.bloks.www.fxcal.settings.post.account.async";
        } else {
            C25786Drz A0Q = C18180wK.A0Q(requireActivity, AnonymousClass0wJ.A0U(r3));
            String A002 = A0B(r13).A00();
            C04220Ms.A0B(A002, 0);
            C29181xS r2 = new C29181xS();
            Bundle A062 = C18180wK.A06();
            A062.putString("location", A002);
            A062.putBoolean("is_cal", true);
            C18180wK.A0x(A062, r2, A0Q);
            return;
        }
        if (!r13.A03) {
            r13.A03 = true;
            Window window = requireActivity.getWindow();
            C35682Ok.A00().A00(requireActivity, window, true, true, false);
            C130667qT A0S = C18230wP.A0S(r13, AnonymousClass0wJ.A0U(r3));
            AnonymousClass4A9 A003 = C63263h8.A00(AnonymousClass0wJ.A0U(r3), str, A0y);
            AnonymousClass4A9.A02(A003, A0S, window, r13, 9);
            r13.A00 = r13.scheduleAndGetLoaderId(A003);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(596110038);
        super.onCreate(bundle);
        C58173Ej A002 = C35762Os.A00();
        C04530Oa r5 = this.A04;
        this.A01 = A002.A00(this, AnonymousClass0wJ.A0U(r5), new IDxAListenerShape459S0100000_1_I2(this, 14));
        AnonymousClass2AI.A04.A0A(AnonymousClass0wJ.A0X(r5));
        AnonymousClass3zG r1 = this.A02;
        if (r1 == null) {
            r1 = new AnonymousClass3zG(AnonymousClass0wJ.A0X(r5));
            this.A02 = r1;
        }
        r1.A04(true, "account_linking_setting", true, false);
        C10300i6 A0U = AnonymousClass0wJ.A0U(r5);
        AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r4, A0U, 36325317266121774L)) {
            C49222r2.A00(AnonymousClass0wJ.A0X(r5)).A04((C83804s1) null, "account_linking_setting", (String) null);
        } else {
            C67303zK.A05(AnonymousClass0wJ.A0X(r5), (AnonymousClass3D3) null, AnonymousClass006.A01);
        }
        C49222r2.A00(AnonymousClass0wJ.A0X(r5)).A03();
        C10300i6 A0U2 = AnonymousClass0wJ.A0U(r5);
        C04220Ms.A0B(A0U2, 0);
        if (C63803iN.A0E(r4, A0U2, 36322894904630807L)) {
            AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(r5)).A01(this.A06, C689546c.class);
        }
        C14030oh.A09(842797425, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(838916126);
        super.onDestroyView();
        if (this.A03) {
            stopLoader(this.A00);
            this.A03 = false;
            Window A0F = C18180wK.A0F(this);
            if (A0F != null) {
                C35682Ok.A00().A01(A0F);
            }
        }
        C14030oh.A09(687276639, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-1136559703);
        super.onPause();
        C04530Oa r5 = this.A04;
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(r5)).A02(this.A05, C686845b.class);
        C10300i6 A0U = AnonymousClass0wJ.A0U(r5);
        if (C63803iN.A0E(C18180wK.A0J(A0U), A0U, 36322894904630807L)) {
            AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(r5)).A02(this.A06, C689546c.class);
        }
        C14030oh.A09(2048461626, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-403492148);
        super.onResume();
        C04530Oa r5 = this.A04;
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(r5)).A01(this.A05, C686845b.class);
        C10300i6 A0U = AnonymousClass0wJ.A0U(r5);
        if (C63803iN.A0E(C18180wK.A0J(A0U), A0U, 36322894904630807L)) {
            AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(r5)).A01(this.A06, C689546c.class);
        }
        setItems(A0C(this));
        C14030oh.A09(-473017433, A022);
    }
}
