package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.login.callback.IDxLCallbacksShape165S0100000_1_I2;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.1iT  reason: invalid class name */
public final class AnonymousClass1iT extends C63873iU {
    public Uri A00;
    public FragmentActivity A01;
    public AnonymousClass05O A02;
    public C11630kW A03;
    public AnonymousClass1c9 A04;
    public C07530bf A05;
    public AnonymousClass265 A06;
    public String A07;
    public final C24431ij A08;
    public final /* synthetic */ AnonymousClass1c9 A09;

    public AnonymousClass1iT(AnonymousClass1c9 r10, String str) {
        AnonymousClass01J r0;
        AnonymousClass1c9 r4 = r10;
        this.A09 = r10;
        FragmentActivity requireActivity = r10.requireActivity();
        C07530bf r6 = r10.A0C;
        AnonymousClass265 r7 = AnonymousClass265.A1c;
        Uri A012 = C67323zM.A01(r10);
        C12560m7 r1 = r10.mFragmentManager;
        if (r1 != null) {
            r0 = new AnonymousClass01J(r1);
        } else {
            r0 = null;
        }
        this.A07 = str;
        this.A01 = requireActivity;
        this.A05 = r6;
        this.A06 = r7;
        this.A03 = r10;
        this.A00 = A012;
        this.A04 = r10;
        this.A02 = r0;
        this.A08 = new IDxLCallbacksShape165S0100000_1_I2(requireActivity, A012, r4, this, r6, r7, AnonymousClass006.A00);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C25786Drz drz;
        String str;
        int i;
        String str2;
        int A032 = C14030oh.A03(1478049307);
        C26621qw r7 = (C26621qw) obj;
        int A033 = C14030oh.A03(925889387);
        AnonymousClass1c9 r8 = this.A04;
        if (!r8.A08()) {
            i = -1624483291;
        } else {
            AnonymousClass3V1 r9 = new AnonymousClass3V1();
            AnonymousClass1c9 r6 = this.A09;
            Integer A012 = AnonymousClass1c9.A01(C18180wK.A0f(r6.A0E));
            Bundle bundle = r9.A00;
            AnonymousClass267.A01(bundle, AnonymousClass267.A05, A012);
            Integer num = r6.A0H;
            if (num != null) {
                AnonymousClass267.A01(bundle, AnonymousClass267.A03, num);
            }
            AnonymousClass267.A02(bundle, r6);
            r9.A01();
            Bundle A062 = C18180wK.A06();
            A062.putAll(bundle);
            AnonymousClass01V.A0p.markerPoint(725096220, "network_complete");
            AnonymousClass01V.A0p.markerPoint(725096125, "network_complete");
            boolean z = r7.A0B;
            if (z && r7.A0C) {
                AnonymousClass01V.A0p.markerEnd(725096220, 4);
                if (TextUtils.isEmpty(r7.A03)) {
                    str2 = this.A07;
                } else {
                    str2 = r7.A03;
                }
                if ("link".equals(r7.A05)) {
                    FragmentActivity fragmentActivity = this.A01;
                    String formatNumber = PhoneNumberUtils.formatNumber(str2.replace("+", ""));
                    if (formatNumber == null) {
                        formatNumber = "";
                    }
                    String obj2 = C18180wK.A0m(fragmentActivity, formatNumber).toString();
                    FragmentActivity activity = r8.getActivity();
                    if (activity != null && r8.A02 == null) {
                        C25828Dsm A0W = C18190wL.A0W(activity);
                        A0W.A0L(2131830197);
                        A0W.A0p(AnonymousClass0wJ.A0o(r8, obj2, 2131830196));
                        A0W.A0I(R.drawable.confirmation_icon);
                        A0W.A0P((DialogInterface.OnClickListener) null, 2131831976);
                        Dialog A0G = A0W.A0G();
                        r8.A02 = A0G;
                        C13950oZ.A00(A0G);
                        C63313hF A0B = AnonymousClass269.A0Y.A0B(r8.A0C);
                        AnonymousClass265 r0 = AnonymousClass265.A1c;
                        C15730rn A052 = A0B.A05();
                        C18250wR.A19(A052, r0.A01);
                        r8.A08.A00.putString(C18240wQ.A0g("RECOVERY_LINK_TYPE"), "sms");
                        r8.A08.A02(A052);
                        C18180wK.A1K(A052, r8.A0C);
                    }
                } else {
                    C63463hW.A03();
                    String str3 = this.A07;
                    C07530bf r82 = this.A05;
                    Fragment A002 = C61753Vf.A00(A062, (RegFlowExtras) null, str2, str3, (String) null, (String) null, "IgSessionManager.LOGGED_OUT_TOKEN", false, true);
                    C63103bV r14 = C63103bV.A03;
                    FragmentActivity fragmentActivity2 = this.A01;
                    r14.A03(fragmentActivity2, r82, (C82814qJ) A002, this.A06, str3);
                    drz = C18180wK.A0Q(fragmentActivity2, r82);
                    drz.A03 = A002;
                    drz.A0B = true;
                    drz.A05();
                }
            } else if (z && r7.A09) {
                AnonymousClass01V.A0p.markerEnd(725096220, 4);
                if (TextUtils.isEmpty(r7.A03)) {
                    str = this.A07;
                } else {
                    str = r7.A03;
                }
                Bundle A063 = C18180wK.A06();
                A063.putString("lookup_user_input", this.A07);
                A063.putString("lookup_email", str);
                A063.putBoolean("arg_is_multiple_account_recovery", true);
                if (!r8.A0K && !C18240wQ.A1U(r8)) {
                    drz = C63463hW.A00(this.A01, this.A05);
                    C18190wL.A13(A063, "IgSessionManager.LOGGED_OUT_TOKEN");
                    C26861rM r02 = new C26861rM();
                    r02.setArguments(A063);
                    drz.A03 = r02;
                    drz.A05();
                }
            } else if (r7.A00 != null) {
                this.A08.A02(r7);
            } else {
                AnonymousClass0wJ.A0F().post(new AnonymousClass4RW(this, new AnonymousClass4SN(A062, r7, this)));
            }
            i = 482263565;
        }
        C14030oh.A0A(i, A033);
        C14030oh.A0A(-222269902, A032);
    }

    public final void onFail(AnonymousClass3XX r8) {
        int i;
        C26621qw r6;
        String string;
        int A032 = C14030oh.A03(576668203);
        AnonymousClass1c9 r3 = this.A09;
        if (!r3.A08()) {
            i = -229022374;
        } else {
            r3.A0G.setShowProgressBar(false);
            AnonymousClass01V.A0p.markerEnd(725096220, 3);
            Object obj = r8.A00;
            if (!(obj == null || (r6 = (C26621qw) obj) == null)) {
                int i2 = r6.mStatusCode;
                if (i2 == 404) {
                    if (r6.A0D) {
                        if (r6.getErrorMessage() != null) {
                            string = r6.getErrorMessage();
                        } else {
                            string = r3.getString(2131837305);
                        }
                        String str = r6.mErrorTitle;
                        if (str == null) {
                            str = r3.getString(2131826851);
                        }
                        String str2 = r6.A02;
                        if (str2 == null) {
                            str2 = r3.getString(2131827962);
                        }
                        C25828Dsm A002 = C62973bE.A00(r3.requireContext());
                        A002.A0p(string);
                        A002.A02 = str;
                        A002.A0c(C18220wO.A0O(this, 87), str2);
                        A002.A0N((DialogInterface.OnClickListener) null, 2131836953);
                        AnonymousClass0wJ.A1K(A002);
                        i = 334991168;
                    } else {
                        r3.A0F.A05(r3.getString(2131831836));
                        i = 557693299;
                    }
                } else if (i2 == 429) {
                    C25828Dsm A003 = C62973bE.A00(r3.requireContext());
                    A003.A0K(2131838003);
                    AnonymousClass0wJ.A1K(A003);
                    i = 2011083401;
                }
            }
            if (r3.getContext() != null) {
                C62973bE.A01(r3.getContext());
            }
            i = 217188078;
        }
        C14030oh.A0A(i, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(1263133345);
        this.A09.A0M.post(new AnonymousClass4PH(this));
        C14030oh.A0A(-316766941, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(-209660229);
        this.A09.A0M.post(new AnonymousClass4PG(this));
        C14030oh.A0A(2124996522, A032);
    }
}
