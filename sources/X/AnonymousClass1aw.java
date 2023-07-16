package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.facebook.redex.IDxCSpanShape14S0100000_1_I2;
import com.facebook.redex.IDxObjectShape282S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.request.IDxDCallbackShape173S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.1aw  reason: invalid class name */
public final class AnonymousClass1aw extends C34640IcN implements C11630kW, C82424pb, C82034oy, CallerContextable, AnonymousClass0RJ {
    public static final CallerContext A0G = CallerContext.A00(AnonymousClass1aw.class);
    public static final String __redex_internal_original_name = "ChangePasswordV2Fragment";
    public TextView A00;
    public IgFormField A01;
    public IgFormField A02;
    public IgFormField A03;
    public C58463Fs A04;
    public UserSession A05;
    public AnonymousClass3F8 A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public int A0B;
    public View A0C;
    public TextView A0D;
    public boolean A0E;
    public final Handler A0F = C18250wR.A08();

    public final String getModuleName() {
        return "change_password";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            AnonymousClass2CD.A00(intent, new C66893yV(this), i2);
        }
        super.onActivityResult(i, i2, intent);
    }

    public static void A00(AnonymousClass1aw r6) {
        Intent intent;
        String str;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r6.A05), "instagram_change_password_success"), 1721);
        if (AnonymousClass0wJ.A1U(A0I)) {
            if (r6.A07 == AnonymousClass006.A01) {
                str = "inauthentic_engagement";
            } else {
                str = null;
            }
            A0I.A0T("type", str);
            A0I.Bb4();
        }
        r6.A0A = false;
        if (r6.getTargetFragment() != null) {
            Fragment targetFragment = r6.getTargetFragment();
            int targetRequestCode = r6.getTargetRequestCode();
            Bundle bundle = r6.mArguments;
            if (bundle != null) {
                intent = C18230wP.A0B();
                intent.putExtra("change_password_login_id", bundle.getString("change_password_login_id"));
            } else {
                intent = null;
            }
            targetFragment.onActivityResult(targetRequestCode, -1, intent);
        }
        r6.A0F.post(new AnonymousClass4PC(r6));
        C63813iO.A0D(r6.getContext(), r6.getString(2131823214), 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r3.A08 != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass1aw r3) {
        /*
            android.view.View r0 = r3.A0C
            if (r0 == 0) goto L_0x0039
            com.instagram.igds.components.form.IgFormField r0 = r3.A01
            if (r0 == 0) goto L_0x0039
            X.3Fs r1 = r3.A04
            com.instagram.igds.components.form.IgFormField r0 = r1.A04
            java.lang.String r2 = X.C18200wM.A0i(r0)
            com.instagram.igds.components.form.IgFormField r0 = r1.A03
            java.lang.String r1 = X.C18200wM.A0i(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0033
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0033
            com.instagram.igds.components.form.IgFormField r0 = r3.A01
            java.lang.String r0 = X.C18200wM.A0i(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.A08
            r1 = 1
            if (r0 == 0) goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            android.view.View r0 = r3.A0C
            r0.setEnabled(r1)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1aw.A01(X.1aw):void");
    }

    public static void A02(AnonymousClass1aw r3, String str) {
        String str2;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r3.A05), "instagram_change_password_failure"), 1720);
        if (AnonymousClass0wJ.A1U(A0I)) {
            if (str == null) {
                str = "";
            }
            A0I.A0T("reason", str);
            if (r3.A07 == AnonymousClass006.A01) {
                str2 = "inauthentic_engagement";
            } else {
                str2 = null;
            }
            A0I.A0T("type", str2);
            A0I.Bb4();
        }
    }

    public final C10300i6 getSession() {
        return this.A05;
    }

    public final boolean onBackPressed() {
        if (!this.A0A) {
            return false;
        }
        C63813iO.A0D(getContext(), getString(2131832180), 1);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2 == X.AnonymousClass006.A0C) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.AnonymousClass4u2 r5) {
        /*
            r4 = this;
            android.content.res.Resources r3 = X.AnonymousClass0wJ.A0B(r4)
            java.lang.Integer r2 = r4.A07
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r2 == r0) goto L_0x0015
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r2 == r0) goto L_0x0015
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            r0 = 2131832176(0x7f112d70, float:1.9297398E38)
            if (r2 != r1) goto L_0x0018
        L_0x0015:
            r0 = 2131823210(0x7f110a6a, float:1.9279213E38)
        L_0x0018:
            java.lang.String r2 = r3.getString(r0)
            r1 = 496(0x1f0, float:6.95E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape201S0100000_1_I2
            r0.<init>((X.AnonymousClass1aw) r4, (int) r1)
            com.instagram.actionbar.ActionButton r0 = X.AnonymousClass4u2.A00(r0, r5, r2)
            r4.A0C = r0
            boolean r0 = r4.A09
            r5.setIsLoading(r0)
            A01(r4)
            java.lang.Integer r1 = r4.A07
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r1 != r0) goto L_0x0047
            X.Drc r2 = X.C18190wL.A0K()
            r1 = 497(0x1f1, float:6.96E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape201S0100000_1_I2
            r0.<init>((X.AnonymousClass1aw) r4, (int) r1)
            r2.A0C = r0
            X.AnonymousClass4u2.A03(r2, r5)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1aw.configureActionBar(X.4u2):void");
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        int A022 = C14030oh.A02(20520812);
        super.onCreate(bundle);
        UserSession A0W = AnonymousClass0wJ.A0W(this);
        this.A05 = A0W;
        this.A06 = new AnonymousClass3F8(A0W);
        String string = requireArguments().getString("change_password_entrypoint");
        Integer[] A002 = AnonymousClass006.A00(5);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = AnonymousClass006.A0Y;
                break;
            }
            num = A002[i];
            if (C36152Qf.A00(num).equals(string)) {
                break;
            }
            i++;
        }
        this.A07 = num;
        C14030oh.A09(-545924551, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A022 = C14030oh.A02(1315054174);
        View inflate = layoutInflater.inflate(R.layout.fragment_change_password_v2, viewGroup, false);
        TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.change_password_inauthenticate_title);
        TextView A0L2 = AnonymousClass0wJ.A0L(inflate, R.id.change_password_inauthenticate_content);
        View requireViewById = inflate.requireViewById(R.id.change_password_requirement);
        int intValue = this.A07.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                A0L.setVisibility(0);
                A0L.setText(2131823212);
                A0L2.setVisibility(0);
                i = 2131823215;
            } else if (intValue != 2) {
                requireViewById.setVisibility(0);
            } else {
                A0L.setVisibility(0);
                A0L.setText(2131823212);
                A0L2.setVisibility(0);
                i = 2131823216;
            }
            A0L2.setText(i);
        } else {
            A0L.setVisibility(0);
            A0L.setText(2131823212);
            A0L2.setVisibility(0);
            i = 2131823211;
            A0L2.setText(i);
        }
        this.A01 = (IgFormField) inflate.requireViewById(R.id.current_password);
        this.A03 = (IgFormField) inflate.requireViewById(R.id.new_password);
        this.A02 = (IgFormField) inflate.requireViewById(R.id.confirm_new_password);
        this.A01.setInputType(129);
        this.A03.setInputType(129);
        this.A02.setInputType(129);
        this.A00 = AnonymousClass0wJ.A0L(inflate, R.id.reset_using_facebook_link);
        this.A0D = AnonymousClass0wJ.A0L(inflate, R.id.reset_password);
        if (!C35692Ol.A00(this.A05).A05(A0G, "ig_android_linking_cache_password_reset")) {
            this.A0D.setOnClickListener(new IDxCListenerShape201S0100000_1_I2(this, 498));
            this.A00.setVisibility(8);
            this.A0D.setVisibility(0);
        } else {
            String string = getString(2131834859);
            IDxCSpanShape14S0100000_1_I2 iDxCSpanShape14S0100000_1_I2 = new IDxCSpanShape14S0100000_1_I2(this, 10);
            SpannableStringBuilder A0E2 = C18200wM.A0E(AnonymousClass0wJ.A0o(this, string, 2131827681));
            AnonymousClass3Zw.A01(A0E2, iDxCSpanShape14S0100000_1_I2, string);
            C18180wK.A0z(this.A00);
            this.A00.setText(A0E2);
            this.A00.setVisibility(0);
            this.A0D.setVisibility(8);
        }
        C58463Fs r1 = new C58463Fs(requireContext(), this.A03, this.A02);
        this.A04 = r1;
        r1.A01 = new AnonymousClass353(this);
        IgFormField igFormField = this.A01;
        igFormField.A00.addTextChangedListener(new IDxObjectShape282S0100000_1_I2(this, 11));
        C64543mW A002 = C64543mW.A00(this.A05);
        this.A01.A00.addTextChangedListener(A002);
        this.A03.A00.addTextChangedListener(A002);
        this.A02.A00.addTextChangedListener(A002);
        this.A06.A00.markerEnd(857808781, 2);
        C14030oh.A09(-1378706872, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1329229455);
        super.onDestroyView();
        C64543mW A002 = C64543mW.A00(this.A05);
        this.A01.A00.removeTextChangedListener(A002);
        this.A03.A00.removeTextChangedListener(A002);
        this.A02.A00.removeTextChangedListener(A002);
        C58463Fs r2 = this.A04;
        r2.A01 = null;
        r2.A04.setRuleChecker((C27686Erc) null);
        r2.A03.setRuleChecker((C27686Erc) null);
        this.A04 = null;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
        this.A0C = null;
        this.A00 = null;
        this.A0D = null;
        C14030oh.A09(-1684310981, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(87142180);
        super.onPause();
        AnonymousClass2C5.A00(requireActivity(), this.A0B);
        Window A0F2 = C18190wL.A0F(this);
        if (A0F2 != null) {
            A0F2.setSoftInputMode(48);
        }
        C18240wQ.A10(this);
        C14030oh.A09(2012067815, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1578526936);
        super.onResume();
        this.A0B = requireActivity().getRequestedOrientation();
        AnonymousClass2C5.A00(requireActivity(), -1);
        Window A0F2 = C18190wL.A0F(this);
        if (A0F2 != null) {
            A0F2.setSoftInputMode(16);
        }
        if (!this.A0E) {
            this.A01.requestFocus();
            C09860go.A0K(this.A01);
            this.A0E = true;
        }
        C14030oh.A09(-1614652809, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-2002635071);
        super.onStart();
        getRootActivity();
        UserSession userSession = this.A05;
        C04220Ms.A0B(userSession, 0);
        H1T A0P = C18180wK.A0P(userSession);
        AnonymousClass0wJ.A1J(A0P, "accounts/", "last_password_change_timestamp/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, AnonymousClass1R5.class, AnonymousClass3KH.class);
        C04220Ms.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.LastPasswordChangeTimestampResponse>>");
        A0T.A00 = new IDxDCallbackShape173S0100000_1_I2(getParentFragmentManager(), this, 0);
        schedule(A0T);
        C14030oh.A09(1054738976, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-1638807173);
        super.onStop();
        getRootActivity();
        C14030oh.A09(-2043463736, A022);
    }
}
