package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.redex.IDxCListenerShape512S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1xS  reason: invalid class name and case insensitive filesystem */
public final class C29181xS extends C23411dm implements C82034oy, CallerContextable {
    public static final CallerContext A0B = CallerContext.A00(C29181xS.class);
    public static final String __redex_internal_original_name = "FacebookAdvancedOptionsFragment";
    public Dialog A00;
    public AnonymousClass3z4 A01;
    public C67263zF A02;
    public AnonymousClass4MC A03;
    public AnonymousClass4MC A04;
    public List A05;
    public C67233zC A06;
    public List A07 = AnonymousClass0wJ.A0v();
    public boolean A08;
    public final ArrayList A09 = AnonymousClass0wJ.A0v();
    public final C04530Oa A0A = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r5) {
        C04220Ms.A0B(r5, 0);
        r5.setTitle(AnonymousClass0wJ.A0o(this, "Facebook", 2131838121));
        r5.CtT(true);
        r5.CtQ((View.OnClickListener) null, false);
        r5.setIsLoading(false);
    }

    public final String getModuleName() {
        return "facebook_advanced_options";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            A0B();
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("Key_Auth_Once", this.A08);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0B();
    }

    private final void A0B() {
        List list;
        Object obj;
        boolean z;
        String str;
        C04620Ok r7 = C06810aP.A01;
        C04530Oa r3 = this.A0A;
        String A0e = C18240wQ.A0e(AnonymousClass0wJ.A0X(r3), r7);
        boolean A1W = AnonymousClass0wJ.A1W(A0e);
        this.A05 = AnonymousClass0wJ.A0v();
        C29681z6 A002 = C35692Ol.A00(AnonymousClass0wJ.A0X(r3));
        CallerContext callerContext = A0B;
        if (!A002.A05(callerContext, "ig_android_linking_cache_ig_to_fb_share_advanced_options")) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(Html.fromHtml(AnonymousClass0wJ.A0B(this).getString(2131830110)));
            StyleSpan[] styleSpanArr = (StyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), StyleSpan.class);
            C04220Ms.A04(styleSpanArr);
            for (StyleSpan styleSpan : styleSpanArr) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(requireContext().getColor(R.color.blue_5)), spannableStringBuilder.getSpanStart(styleSpan), spannableStringBuilder.getSpanEnd(styleSpan), 18);
            }
            list = this.A05;
            if (list != null) {
                obj = new C63293hC(spannableStringBuilder);
            }
            C04220Ms.A0E(DialogModule.KEY_ITEMS);
            throw null;
        }
        List list2 = this.A05;
        if (list2 != null) {
            C63613hu.A04(list2, 2131835644);
            ArrayList A0v = AnonymousClass0wJ.A0v();
            boolean A1X = C18200wM.A1X(AnonymousClass0wJ.A0X(r3), r7);
            if (!A1X) {
                C62563aI.A01("", AnonymousClass0wJ.A0B(this).getString(2131835643), A0v);
            }
            for (AnonymousClass1j1 r14 : this.A07) {
                if ((!A1W || !A1X || (A0e != null && A0e.equals(r14.A01))) && C18200wM.A0s(r14.A03).contains("CREATE_CONTENT")) {
                    String str2 = r14.A01;
                    String str3 = r14.A02;
                    C62563aI.A01(str2, str3, A0v);
                    this.A09.add(new AnonymousClass1j1(str2, str3, r14.A00));
                }
            }
            boolean A0H = C67363zQ.A0H(AnonymousClass0wJ.A0X(r3));
            C28161tl A012 = AnonymousClass3WS.A01(AnonymousClass0wJ.A0X(r3));
            if (A0H) {
                String str4 = C67363zQ.A01(AnonymousClass0wJ.A0X(r3)).A01;
                C04220Ms.A0B(str4, 0);
                SharedPreferences.Editor A022 = C28161tl.A02(A012);
                str = "linked_fb_page_id";
                C18180wK.A0v(A022, str, str4);
            } else {
                C04220Ms.A0B("", 0);
                SharedPreferences.Editor A023 = C28161tl.A02(A012);
                str = "linked_fb_page_id";
                C18180wK.A0v(A023, str, "");
            }
            list = this.A05;
            if (list != null) {
                obj = new C61353Sw(new IDxCListenerShape512S0100000_1_I2(this, 8), C28161tl.A06(AnonymousClass3WS.A01(AnonymousClass0wJ.A0X(r3)), str, ""), A0v);
            }
        }
        C04220Ms.A0E(DialogModule.KEY_ITEMS);
        throw null;
        list.add(obj);
        boolean z2 = false;
        if (C67373zR.A06(AnonymousClass0wJ.A0X(r3))) {
            if (C67373zR.A08(AnonymousClass0wJ.A0X(r3)) && C61453Tm.A00(AnonymousClass0wJ.A0X(r3))) {
                z2 = true;
            }
            AnonymousClass4MC A052 = AnonymousClass4MC.A05(this, 52, 2131836198, z2);
            this.A04 = A052;
            List list3 = this.A05;
            if (list3 != null) {
                C63613hu.A02(getString(2131832747), list3);
                List list4 = this.A05;
                if (list4 != null) {
                    list4.add(A052);
                    List list5 = this.A05;
                    if (list5 != null) {
                        C63293hC.A01(this, list5, 2131836197);
                        z = true;
                    }
                }
            }
            C04220Ms.A0E(DialogModule.KEY_ITEMS);
            throw null;
        }
        z = false;
        UserSession A0X = AnonymousClass0wJ.A0X(r3);
        boolean z3 = false;
        C04220Ms.A0B(A0X, 0);
        if (!C18200wM.A1X(A0X, r7)) {
            if (C67373zR.A08(AnonymousClass0wJ.A0X(r3)) && C62183Xq.A00(AnonymousClass0wJ.A0X(r3))) {
                z3 = true;
            }
            AnonymousClass4MC A053 = AnonymousClass4MC.A05(this, 51, 2131827380, z3);
            if (!z) {
                List list6 = this.A05;
                if (list6 != null) {
                    C63613hu.A02(getString(2131832747), list6);
                }
                C04220Ms.A0E(DialogModule.KEY_ITEMS);
                throw null;
            }
            this.A03 = A053;
            List list7 = this.A05;
            if (list7 != null) {
                list7.add(A053);
                List list8 = this.A05;
                if (list8 != null) {
                    C63293hC.A01(this, list8, 2131827379);
                }
            }
            C04220Ms.A0E(DialogModule.KEY_ITEMS);
            throw null;
        }
        if (!r7.A01(AnonymousClass0wJ.A0X(r3)).A3Z() && (C35692Ol.A00(AnonymousClass0wJ.A0X(r3)).A05(callerContext, "ig_android_linking_cache_ig_to_fb_share_advanced_options") || AnonymousClass2AI.A04.A0A(AnonymousClass0wJ.A0X(r3)))) {
            List list9 = this.A05;
            if (list9 != null) {
                list9.add(new C63063bP(C18210wN.A0H(this, 286), 2131837308));
            }
            C04220Ms.A0E(DialogModule.KEY_ITEMS);
            throw null;
        }
        List list10 = this.A05;
        if (list10 != null) {
            setItems(list10);
            return;
        }
        C04220Ms.A0E(DialogModule.KEY_ITEMS);
        throw null;
    }

    public static final void A0C(C29181xS r4, boolean z) {
        String str;
        AnonymousClass4MC r0 = r4.A03;
        if (r0 != null) {
            r0.A0C = z;
        }
        C67263zF r3 = r4.A02;
        if (r3 == null) {
            r3 = C60303Om.A00(AnonymousClass0wJ.A0X(r4.A0A));
            r4.A02 = r3;
        }
        C04530Oa r2 = r4.A0A;
        r3.A04(AnonymousClass0wJ.A0X(r2), "account_linking_setting", z);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r4, AnonymousClass0wJ.A0U(r2)), "settings_ig_fb_post_sharing"), 2691);
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        A0I.A0T("to_value", str);
        A0I.Bb4();
    }

    public static final void A0D(C29181xS r3, boolean z) {
        AnonymousClass4MC r0 = r3.A04;
        if (r0 != null) {
            r0.A0C = z;
        }
        C67233zC r2 = r3.A06;
        if (r2 == null) {
            C04220Ms.A0E("storyShareToFBController");
            throw null;
        }
        r2.A04(AnonymousClass006.A00, "ig_settings", z);
        C67373zR.A03(r3, AnonymousClass0wJ.A0X(r3.A0A), z);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0A);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        boolean z;
        int A022 = C14030oh.A02(-2144269889);
        super.onCreate(bundle);
        if (bundle != null) {
            this.A08 = bundle.getBoolean("Key_Auth_Once");
        }
        C04530Oa r6 = this.A0A;
        this.A01 = new AnonymousClass3z4(AnonymousClass0wJ.A0X(r6));
        this.A06 = C60303Om.A01(AnonymousClass0wJ.A0X(r6), (C83824s3) null);
        if (C67363zQ.A0H(AnonymousClass0wJ.A0X(r6))) {
            this.A07.add(C67363zQ.A01(AnonymousClass0wJ.A0X(r6)));
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("location");
            z = bundle2.getBoolean("is_cal");
        } else {
            str = null;
            z = false;
        }
        C35772Ot.A00(AnonymousClass0wJ.A0U(r6), "facebook_cross_posting_settings_legacy_screen_opened", str, (HashMap) null, z);
        C14030oh.A09(-1020953356, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1115597083);
        super.onDestroyView();
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        C14030oh.A09(-1326473791, A022);
    }
}
