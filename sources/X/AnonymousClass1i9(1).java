package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1i9  reason: invalid class name */
public class AnonymousClass1i9 extends C63873iU {
    public final C23161cb A00;
    public final C24651jm A01;

    public final void A00(C22041Td r8) {
        if (this instanceof C26181qB) {
            int A03 = C14030oh.A03(-1133134741);
            AnonymousClass3VH.A00().A01(r8.A00, r8.A01, r8.A04, r8.A03);
            C26211qE r5 = ((C26181qB) this).A00;
            if (r5.isResumed()) {
                C63093bU A002 = C63093bU.A00();
                C10300i6 r6 = r5.A00;
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r5, r6), "instagram_gdpr_consent_flow_entry"), 1828);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    String str = A002.A02;
                    str.getClass();
                    A0I.A0T(C63833iQ.A03(), str);
                    Integer num = A002.A00;
                    num.getClass();
                    A0I.A0T("user_state", AnonymousClass2PB.A00(num));
                    C18250wR.A0y(A0I, C63093bU.A02(A0I, r5, "entry_point", A002.A01));
                    A0I.Bb4();
                }
                C126197ek A0C = C18250wR.A0C(r6);
                A002.A00.getClass();
                synchronized (A0C) {
                }
                Integer num2 = AnonymousClass3VH.A00().A02;
                Integer num3 = AnonymousClass006.A00;
                if (num2 == num3) {
                    AnonymousClass3HL r4 = AnonymousClass3VH.A00().A00.A02;
                    if (r4 != null) {
                        C63093bU.A03(r5, r5.A00, C63093bU.A00(), num3, (Integer) null);
                        C24651jm r2 = r5.A04;
                        String str2 = AnonymousClass3VH.A00().A08;
                        if (str2 != null && !str2.isEmpty()) {
                            r2.A01.setText((CharSequence) str2);
                        }
                        r5.A00.setVisibility(0);
                        r5.A03.setText(r4.A01);
                        AnonymousClass2PC.A00(r5.getContext(), r5.A02, r4.A03);
                    }
                } else if (!r5.A05()) {
                    r5.A04();
                }
            }
            C14030oh.A0A(-562213158, A03);
            return;
        }
        int A003 = AnonymousClass0wJ.A00(-136432631, r8);
        super.onSuccess(r8);
        AnonymousClass3VH.A00().A01(r8.A00, r8.A01, r8.A04, r8.A03);
        AnonymousClass3VH A004 = AnonymousClass3VH.A00();
        Integer num4 = r8.A02;
        synchronized (A004) {
            AnonymousClass3VH.A0B.A03 = num4;
        }
        C23161cb r1 = this.A00;
        if (!r1.A05()) {
            r1.A04();
        }
        C14030oh.A0A(-1024848519, A003);
    }

    public AnonymousClass1i9(C23161cb r1, C24651jm r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onFail(AnonymousClass3XX r4) {
        int A002 = AnonymousClass0wJ.A00(-1030840157, r4);
        Throwable th = r4.A01;
        if (th != null) {
            C04220Ms.A0A(th);
            C10450iM.A07("Failed to request Consent Flow Data", th);
        }
        Object obj = r4.A00;
        if (obj != null) {
            C04220Ms.A0A(obj);
            String errorMessage = ((AnonymousClass1j3) obj).getErrorMessage();
            C04220Ms.A0A(errorMessage);
            C10450iM.A03("GDPR Consent Flow error message", errorMessage);
        }
        C14030oh.A0A(1200794285, A002);
    }

    public void onFinish() {
        int A03 = C14030oh.A03(740347954);
        C24651jm r2 = this.A01;
        if (r2 != null) {
            r2.A02 = false;
            ProgressButton progressButton = r2.A01;
            progressButton.setShowProgressBar(false);
            progressButton.setEnabled(C18180wK.A1W(r2.A02 ? 1 : 0));
        }
        C14030oh.A0A(490852434, A03);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-841934259);
        A00((C22041Td) obj);
        C14030oh.A0A(-1299679022, A03);
    }
}
