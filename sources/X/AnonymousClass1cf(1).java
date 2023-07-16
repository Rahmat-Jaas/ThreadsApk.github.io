package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.1cf  reason: invalid class name */
public abstract class AnonymousClass1cf extends C34640IcN implements C82424pb, AnonymousClass4tS, C82824qK {
    public static final String __redex_internal_original_name = "SimplePasswordCreationFragment";
    public C24721jv A00;
    public InlineErrorMessageView A01;
    public ProgressButton A02;
    public SearchEditText A03;
    public boolean A04 = false;
    public boolean A05;
    public final TextWatcher A06 = new IDxWAdapterShape193S0100000_1_I2(this, 0);

    public final void CDH(boolean z) {
    }

    public abstract String getModuleName();

    public abstract C10300i6 getSession();

    public final void AHz() {
        this.A03.setEnabled(false);
    }

    public final void AJV() {
        this.A03.setEnabled(true);
    }

    public final C313625r Aiy() {
        if (this instanceof C21261Qa) {
            return C313625r.SAC;
        }
        if (this instanceof C21271Qb) {
            return ((C21271Qb) this).A00.A01();
        }
        return null;
    }

    public final AnonymousClass265 BDt() {
        AnonymousClass2AT r0;
        if (this instanceof C21261Qa) {
            r0 = AnonymousClass2AT.A0C;
        } else if (this instanceof C21271Qb) {
            r0 = AnonymousClass2AT.A0A;
        } else if (this instanceof AnonymousClass1QZ) {
            return AnonymousClass265.A0Y;
        } else {
            return null;
        }
        return r0.A00;
    }

    public final boolean BXY() {
        String A0f = C18180wK.A0f(this.A03);
        if (TextUtils.isEmpty(A0f) || A0f.length() < 6 || !this.A05) {
            return false;
        }
        return true;
    }

    public final void C9G() {
        C25786Drz A0Q;
        Bundle A062;
        Fragment r0;
        if (this instanceof C21261Qa) {
            C21261Qa r4 = (C21261Qa) this;
            if (r4.A05) {
                r4.A02.setShowProgressBar(true);
                RegFlowExtras regFlowExtras = r4.A00;
                regFlowExtras.A0P = AnonymousClass0wJ.A0n(r4.A03);
                regFlowExtras.A0v = r4.A04;
                FragmentActivity activity = r4.getActivity();
                if (activity != null) {
                    RegFlowExtras regFlowExtras2 = r4.A00;
                    if (regFlowExtras2.A0g && regFlowExtras2.A03 == null) {
                        A0Q = C63463hW.A00(activity, r4.A01);
                        RegFlowExtras regFlowExtras3 = r4.A00;
                        A062 = C18180wK.A06();
                        A062.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras3);
                        C18190wL.A13(A062, "IgSessionManager.LOGGED_OUT_TOKEN");
                        r0 = new C27541sg();
                    } else if (!regFlowExtras2.A0s) {
                        A0Q = C18180wK.A0Q(activity, r4.A01);
                        RegFlowExtras regFlowExtras4 = r4.A00;
                        A062 = C18180wK.A06();
                        A062.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras4);
                        r0 = new AnonymousClass1dA();
                    } else if (activity != null) {
                        A0Q = C18180wK.A0Q(activity, r4.A01);
                        C63463hW.A01();
                        RegFlowExtras regFlowExtras5 = r4.A00;
                        Bundle A063 = C18180wK.A06();
                        A063.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras5);
                        C18190wL.A13(A063, "IgSessionManager.LOGGED_OUT_TOKEN");
                        r0 = new AnonymousClass1cj();
                        r0.setArguments(A063);
                        A0Q.A03 = r0;
                        A0Q.A05();
                    } else {
                        return;
                    }
                    r0.setArguments(A062);
                    A0Q.A03 = r0;
                    A0Q.A05();
                }
            }
        } else if (this instanceof C21271Qb) {
            C21271Qb r2 = (C21271Qb) this;
            if (r2.A05) {
                r2.A02.setShowProgressBar(true);
                r2.A00.A0P = AnonymousClass0wJ.A0n(r2.A03);
                C07530bf r7 = r2.A01;
                RegFlowExtras regFlowExtras6 = r2.A00;
                C67283zI.A03(r2.A02, r2, r2, r2, r2, regFlowExtras6, r7, C67283zI.A01(regFlowExtras6), false);
            }
        } else if (this instanceof AnonymousClass1QZ) {
            AnonymousClass1QZ r42 = (AnonymousClass1QZ) this;
            C62713aZ.A00.A03(r42.A00, "nux_create_password");
            if (r42.A05) {
                UserSession userSession = r42.A00;
                String A0f = C18180wK.A0f(r42.A03);
                H1T A0N = AnonymousClass0wJ.A0N(userSession);
                A0N.A0O("enc_new_password", C62663aU.A00(A0N, userSession, A0f));
                A0N.A0R("is_in_nux", true);
                C63873iU.A0C(r42, AnonymousClass0wJ.A0S(A0N), 109);
            }
        } else {
            AnonymousClass1QY r5 = (AnonymousClass1QY) this;
            AnonymousClass4KR r43 = new AnonymousClass4KR(r5.getContext(), AnonymousClass06E.A00(r5), C63873iU.A06(r5, 1), AnonymousClass0wJ.A0n(r5.A03));
            String str = r5.A03;
            AnonymousClass0RA.A0C.A09(new AnonymousClass4KF(), (C04850Pk) null, r43, str);
        }
    }

    public final void Cth(String str, Integer num) {
        this.A01.A05(str);
        this.A02.setShowProgressBar(false);
    }

    public final boolean onBackPressed() {
        C07530bf r3;
        String str;
        C313625r A012;
        if (this instanceof C21261Qa) {
            r3 = ((C21261Qa) this).A01;
            str = AnonymousClass2AT.A0C.A00.A01;
            A012 = C313625r.SAC;
        } else if (this instanceof C21271Qb) {
            C21271Qb r1 = (C21271Qb) this;
            r3 = r1.A01;
            str = AnonymousClass2AT.A0A.A00.A01;
            A012 = r1.A00.A01();
        } else if (!(this instanceof AnonymousClass1QZ)) {
            return false;
        } else {
            C62223Xv.A00.A01(((AnonymousClass1QZ) this).A00, "nux_create_password");
            return true;
        }
        AnonymousClass0wJ.A1N(r3, str);
        C62223Xv.A00(r3, A012, (Boolean) null, (Integer) null, str);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b3, code lost:
        if (X.C63173fJ.A05(X.AnonymousClass0TJ.A06, 18299382474475195L) != false) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            r0 = -850252178(0xffffffffcd522e6e, float:-2.20391136E8)
            int r5 = X.C14030oh.A02(r0)
            r0 = 2131496674(0x7f0c0ee2, float:1.861692E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0H(r10, r11, r0)
            android.view.ViewGroup r1 = X.C18190wL.A0E(r4)
            r0 = 2131496683(0x7f0c0eeb, float:1.8616938E38)
            r3 = 1
            r10.inflate(r0, r1, r3)
            r0 = 2131308216(0x7f092eb8, float:1.8234681E38)
            android.widget.TextView r7 = X.AnonymousClass0wJ.A0L(r4, r0)
            r6 = r9
            boolean r8 = r9 instanceof X.C21261Qa
            if (r8 != 0) goto L_0x010b
            boolean r0 = r9 instanceof X.C21271Qb
            if (r0 != 0) goto L_0x010b
            boolean r0 = r9 instanceof X.AnonymousClass1QZ
            if (r0 != 0) goto L_0x010b
            r0 = r6
            X.1QY r0 = (X.AnonymousClass1QY) r0
            android.content.Context r2 = r0.requireContext()
            r1 = 2131820870(0x7f110146, float:1.9274467E38)
            com.instagram.user.model.User r0 = r0.A01
            java.lang.String r0 = r0.BK7()
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r2, r0, r1)
        L_0x0041:
            r7.setText(r0)
            r0 = 2131297541(0x7f090505, float:1.821303E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r4, r0)
            if (r8 != 0) goto L_0x00fe
            boolean r0 = r9 instanceof X.C21271Qb
            if (r0 != 0) goto L_0x00fe
            boolean r0 = r9 instanceof X.AnonymousClass1QZ
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = ""
        L_0x0057:
            r2.setText(r0)
            r0 = 2131304049(0x7f091e71, float:1.822623E38)
            android.view.View r1 = r4.requireViewById(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = (com.instagram.ui.widget.searchedittext.SearchEditText) r1
            r9.A03 = r1
            r0 = 129(0x81, float:1.81E-43)
            r1.setInputType(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r9.A03
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r1.setTypeface(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r9.A03
            android.text.TextWatcher r0 = r9.A06
            r1.addTextChangedListener(r0)
            r0 = 2131304052(0x7f091e74, float:1.8226236E38)
            android.view.View r0 = r4.findViewById(r0)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = (com.instagram.ui.widget.inlineerror.InlineErrorMessageView) r0
            r9.A01 = r0
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r9.A03
            r0.setAllowTextSelection(r3)
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r9.A03
            r7 = 0
            X.C18210wN.A10(r0, r7, r9)
            if (r8 != 0) goto L_0x00d2
            boolean r0 = r9 instanceof X.C21271Qb
            if (r0 != 0) goto L_0x00b5
            boolean r0 = r9 instanceof X.AnonymousClass1QZ
            if (r0 != 0) goto L_0x00d2
            X.1QY r6 = (X.AnonymousClass1QY) r6
            com.instagram.service.session.UserSession r0 = r6.A00
            X.3hk r1 = X.C63533hk.A02(r0)
            java.lang.String r0 = r6.A03
            boolean r0 = r1.A0I(r0)
            if (r0 != 0) goto L_0x00b5
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 18299382474475195(0x410331000006bb, double:1.892699716180777E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 != 0) goto L_0x00d2
        L_0x00b5:
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = X.C18230wP.A0c(r4)
            r9.A02 = r3
            X.0i6 r2 = r9.getSession()
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r9.A03
            X.1jv r0 = new X.1jv
            r0.<init>(r1, r2, r9, r3)
            r9.A00 = r0
            r9.registerLifecycleListener(r0)
            r0 = 589764706(0x23271862, float:9.058251E-18)
            X.C14030oh.A09(r0, r5)
            return r4
        L_0x00d2:
            r0 = 2131306538(0x7f09282a, float:1.8231278E38)
            android.view.View r1 = r4.requireViewById(r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r9 instanceof X.AnonymousClass1QZ
            if (r0 == 0) goto L_0x00fa
            r0 = 2131835182(0x7f11392e, float:1.9303495E38)
        L_0x00e2:
            java.lang.String r0 = r9.getString(r0)
            r1.setText(r0)
            r1.setVisibility(r7)
            r1.setChecked(r3)
            r9.A04 = r3
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r0.<init>((java.lang.Object) r9, (int) r7)
            r1.setOnCheckedChangeListener(r0)
            goto L_0x00b5
        L_0x00fa:
            r0 = 2131834567(0x7f1136c7, float:1.9302248E38)
            goto L_0x00e2
        L_0x00fe:
            android.content.Context r1 = r9.requireContext()
            r0 = 2131824560(0x7f110fb0, float:1.9281951E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0057
        L_0x010b:
            android.content.Context r1 = r9.requireContext()
            r0 = 2131824561(0x7f110fb1, float:1.9281953E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cf.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1418512526);
        super.onDestroyView();
        this.A03.removeTextChangedListener(this.A06);
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        unregisterLifecycleListener(this.A00);
        C14030oh.A09(-528660448, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-2001062649);
        super.onResume();
        this.A03.requestFocus();
        C09860go.A0K(this.A03);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.getWindow().setSoftInputMode(16);
        }
        C14030oh.A09(973628855, A022);
    }
}
