package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.redex.IDxCListenerShape20S1100000_1_I2;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.1ih  reason: invalid class name and case insensitive filesystem */
public final class C24411ih extends C63873iU {
    public final Handler A00 = C18250wR.A08();
    public final C34640IcN A01;
    public final C10300i6 A02;
    public final C82824qK A03;
    public final RegFlowExtras A04;
    public final C24721jv A05;
    public final String A06;
    public final /* synthetic */ AnonymousClass1cj A07;
    public final /* synthetic */ String A08;

    public C24411ih(C34640IcN icN, C10300i6 r3, AnonymousClass1cj r4, C82824qK r5, RegFlowExtras regFlowExtras, C24721jv r7, String str, String str2) {
        this.A07 = r4;
        this.A08 = str2;
        this.A02 = r3;
        this.A06 = str;
        this.A01 = icN;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = regFlowExtras;
    }

    private void A00(String str) {
        C61763Vg A022 = C63313hF.A02(this.A02, C313625r.EMAIL, AnonymousClass265.A0d, "next_blocked");
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        A022.A03("reason", str);
        A022.A01();
    }

    public final void onFail(AnonymousClass3XX r5) {
        String str;
        int A032 = C14030oh.A03(284247234);
        this.A03.Cth(C18230wP.A0l(this.A01), AnonymousClass006.A00);
        Object obj = r5.A00;
        if (obj != null) {
            str = ((AnonymousClass1j3) obj).mErrorType;
        } else {
            str = "network_error";
        }
        A00(str);
        C14030oh.A0A(-2106913696, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(-1613360542);
        super.onFinish();
        this.A05.A00();
        C14030oh.A0A(-842995130, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(679603632);
        super.onStart();
        this.A05.A01();
        C14030oh.A0A(2093865782, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        C82824qK r5;
        Resources A0B;
        int i;
        int A032 = C14030oh.A03(-268504843);
        C22181Tr r12 = (C22181Tr) obj;
        int A033 = C14030oh.A03(1396813970);
        AnonymousClass1cj r52 = this.A07;
        String A0f = C18180wK.A0f(r52.A00);
        String str2 = r12.A01;
        if (str2 != null) {
            A0f = str2;
        }
        RegFlowExtras regFlowExtras = r52.A0I;
        if (!regFlowExtras.A0s || !C32572Cj.A00(regFlowExtras.A0I, A0f)) {
            if (r12.A05) {
                IDxCListenerShape20S1100000_1_I2 iDxCListenerShape20S1100000_1_I2 = new IDxCListenerShape20S1100000_1_I2(this.A08, (Object) r52, 0);
                C25828Dsm A0W = C18190wL.A0W(r52.getContext());
                A0W.A0L(2131835711);
                A0W.A0K(2131835708);
                C18200wM.A1O(A0W);
                A0W.A0P(iDxCListenerShape20S1100000_1_I2, 2131835710);
                C18180wK.A1N(A0W, r52, 123, 2131835709);
                AnonymousClass0wJ.A1K(A0W);
                C18180wK.A1K(C63313hF.A01(r52, AnonymousClass269.A0e), r52.A0M);
            } else if (!r12.A08 || !r12.A06) {
                int A034 = C14030oh.A03(665935505);
                if (!r12.A08) {
                    r5 = this.A03;
                    A0B = AnonymousClass0wJ.A0B(this.A01);
                    i = 2131826741;
                } else if (!r12.A06) {
                    if (r12.A03 == null) {
                        r5 = this.A03;
                        A0B = AnonymousClass0wJ.A0B(this.A01);
                        i = 2131826740;
                    }
                    A00(r12.mErrorType);
                    C14030oh.A0A(1018993330, A034);
                } else {
                    if (TextUtils.isEmpty(r12.A01)) {
                        str = this.A06;
                    } else {
                        str = r12.A01;
                    }
                    C10300i6 r7 = this.A02;
                    Context requireContext = this.A01.requireContext();
                    AnonymousClass0wJ.A1M(r7, 0, str);
                    C63633hx.A03(requireContext, (C11630kW) null, r7, str, "email", false);
                    this.A00.post(new AnonymousClass4SU(r12, this, str));
                    C14030oh.A0A(1018993330, A034);
                }
                r5.Cth(A0B.getString(i), AnonymousClass006.A0N);
                A00(r12.mErrorType);
                C14030oh.A0A(1018993330, A034);
            }
            C14030oh.A0A(1834351006, A033);
            C14030oh.A0A(555304901, A032);
        }
        AnonymousClass1cj.A06(r52, A0f);
        C14030oh.A0A(1834351006, A033);
        C14030oh.A0A(555304901, A032);
    }
}
