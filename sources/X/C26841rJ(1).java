package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.1rJ  reason: invalid class name and case insensitive filesystem */
public final class C26841rJ extends AnonymousClass1hL {
    public final /* synthetic */ AnonymousClass1c3 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26841rJ(Fragment fragment, C10300i6 r2, AnonymousClass1c3 r3, AnonymousClass265 r4) {
        super(fragment, r2, r4);
        this.A00 = r3;
    }

    public final void A00(AnonymousClass1U5 r14) {
        int A03 = C14030oh.A03(-1506729460);
        AnonymousClass1c3 r1 = this.A00;
        AnonymousClass01V.A0p.markerPoint(725096125, "network_request_complete");
        if (!r14.A08) {
            super.A00(r14);
            AnonymousClass1c3.A03(r1, "sms");
        } else if (r1.getActivity() != null && r1.isResumed()) {
            C63463hW.A03();
            String str = r14.A05;
            String str2 = r1.A09;
            AnonymousClass3V1 r3 = r1.A06;
            Bundle A06 = C18180wK.A06();
            A06.putAll(r3.A00);
            AnonymousClass1ci r6 = (AnonymousClass1ci) C61753Vf.A00(A06, (RegFlowExtras) null, str, str2, (String) null, (String) null, "IgSessionManager.LOGGED_OUT_TOKEN", false, false);
            C18220wO.A1A(r6, C18180wK.A0Q(r1.requireActivity(), r1.A07));
            C63103bV r32 = C63103bV.A03;
            FragmentActivity requireActivity = r1.requireActivity();
            C07530bf r5 = r1.A07;
            String str3 = r14.A05;
            AnonymousClass265 r7 = AnonymousClass265.A1D;
            r32.A03(requireActivity, r5, r6, r7, str3);
            C15730rn A05 = AnonymousClass269.A0W.A0B(r1.A07).A05();
            C18250wR.A19(A05, r7.A01);
            r1.A06.A00.putString(C18240wQ.A0g("RECOVERY_CODE_TYPE"), "sms");
            r1.A06.A02(A05);
            C18180wK.A1K(A05, r1.A07);
        }
        C14030oh.A0A(613027393, A03);
    }

    public final void onFail(AnonymousClass3XX r6) {
        int A03 = C14030oh.A03(1520720942);
        super.onFail(r6);
        AnonymousClass01V.A0p.markerAnnotate(725096125, TraceFieldType.FailureReason, "network_error");
        AnonymousClass01V.A0p.markerEnd(725096125, 3);
        C14030oh.A0A(-1190174794, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(2138589656);
        AnonymousClass1c3 r2 = this.A00;
        if (r2.mView != null) {
            r2.A03.setVisibility(8);
        }
        if (r2.getActivity() != null && r2.isResumed()) {
            C18230wP.A0R(r2).setIsLoading(false);
        }
        C14030oh.A0A(666637891, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(1259090238);
        AnonymousClass1c3 r2 = this.A00;
        r2.A03.setVisibility(0);
        if (r2.getActivity() != null && r2.isResumed()) {
            C18230wP.A0R(r2).setIsLoading(true);
        }
        C14030oh.A0A(1933758392, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(908037996);
        A00((AnonymousClass1U5) obj);
        C14030oh.A0A(1347875188, A03);
    }
}
