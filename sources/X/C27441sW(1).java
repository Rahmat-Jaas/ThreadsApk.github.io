package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1sW  reason: invalid class name and case insensitive filesystem */
public final class C27441sW extends AnonymousClass1iV {
    public final /* synthetic */ AnonymousClass1c3 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27441sW(AnonymousClass1c3 r2) {
        super(r2.requireContext());
        this.A00 = r2;
    }

    public final void A00(C22131Tm r7) {
        int A03 = C14030oh.A03(90913056);
        super.A00(r7);
        if (r7.A05) {
            Bundle A06 = C18180wK.A06();
            AnonymousClass1c3 r2 = this.A00;
            A06.putString("lookup_user_input", r2.A09);
            A06.putString("lookup_email", r7.A01);
            C25786Drz A002 = C63463hW.A00(r2.requireActivity(), r2.A07);
            C18190wL.A13(A06, "IgSessionManager.LOGGED_OUT_TOKEN");
            C18180wK.A0x(A06, new C26861rM(), A002);
        } else {
            AnonymousClass1c3 r4 = this.A00;
            if (r4.mView != null) {
                TextView textView = r4.A05;
                if (textView != null) {
                    textView.setText(r4.A00);
                }
                C18200wM.A1D(r4.mView, R.id.fragment_user_password_recovery_dont_have_access);
                String string = r4.getString(2131829092);
                Uri A01 = C15430rJ.A01(AnonymousClass3W8.A01(r4.requireActivity(), "http://help.instagram.com/374546259294234/?ref=learn_more"));
                String str = r4.A0A;
                str.getClass();
                SpannableStringBuilder A0E = C18200wM.A0E(str);
                AnonymousClass3Zw.A01(A0E, new C18670xb(A01), string);
                TextView A0L = AnonymousClass0wJ.A0L(r4.mView, R.id.fragment_user_password_recovery_textview_request_sent);
                A0L.setMovementMethod(new LinkMovementMethod());
                A0L.setVisibility(0);
                A0L.setText(A0E);
                AnonymousClass1c3.A03(r4, "email");
            }
        }
        C14030oh.A0A(-411039545, A03);
    }

    public final void onFail(AnonymousClass3XX r4) {
        View view;
        int A03 = C14030oh.A03(1825030751);
        super.onFail(r4);
        AnonymousClass1c3 r1 = this.A00;
        if (!(r1.mView == null || (view = r1.A02) == null)) {
            view.setEnabled(true);
        }
        C14030oh.A0A(-1634600601, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(21258344);
        AnonymousClass1c3 r1 = this.A00;
        if (r1.mView != null) {
            C18210wN.A0z(r1.A04);
        }
        C14030oh.A0A(2113192307, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(1195258352);
        AnonymousClass1c3 r4 = this.A00;
        r4.A00 = 2131826744;
        r4.A04 = r4.requireView().findViewById(R.id.email_spinner);
        r4.A0A = C18180wK.A0j(AnonymousClass0wJ.A0B(r4).getString(2131826743), new Object[]{r4.getString(2131829092)});
        r4.A05 = C18180wK.A0G(r4.requireView(), R.id.fragment_user_password_recovery_button_email_reset);
        View findViewById = r4.requireView().findViewById(R.id.fragment_user_password_recovery_button_email_reset_container);
        r4.A02 = findViewById;
        if (findViewById != null) {
            findViewById.setEnabled(false);
        }
        View view = r4.A04;
        if (view != null) {
            view.setVisibility(0);
        }
        super.onStart();
        C14030oh.A0A(-261932279, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-1120319958);
        A00((C22131Tm) obj);
        C14030oh.A0A(1730331283, A03);
    }
}
