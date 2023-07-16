package X;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.TextView;
import com.instagram.service.session.UserSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.0xH  reason: invalid class name and case insensitive filesystem */
public final class C18490xH extends CountDownTimer {
    public AnonymousClass1aA A00;
    public final DateFormat A01;

    public C18490xH(AnonymousClass1aA r4, long j) {
        super(j, 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("m:ss", Locale.US);
        this.A01 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.A00 = r4;
    }

    public final void onFinish() {
        AnonymousClass1aA r5 = this.A00;
        TextView textView = r5.A03;
        if (textView != null) {
            C18180wK.A10(textView, r5, 2131834977);
            if (r5.mArguments != null) {
                AnonymousClass0KW.A00(r5.A0E, "createRobocallRequest() additionally includes a checkNotNull in IgApi.Builder to assert that the user session is not null");
                Context requireContext = r5.requireContext();
                UserSession userSession = r5.A0E;
                String string = r5.mArguments.getString("PHONE_NUMBER");
                H1T A0N = AnonymousClass0wJ.A0N(userSession);
                A0N.A0J("accounts/robocall_user/");
                C18180wK.A0t(requireContext, A0N, C62983bG.A03(0, 9, 122), C18220wO.A0g(requireContext, A0N, C62983bG.A03(9, 12, 69), string));
                A0N.A06();
                C32165H8c A0T = AnonymousClass0wJ.A0T(A0N, AnonymousClass1U2.class, AnonymousClass3N4.class);
                A0T.A00 = new C24251hl(r5.requireContext(), C18330wh.A01(r5), r5.A0E.token);
                r5.schedule(A0T);
            }
        }
    }

    public final void onTick(long j) {
        Date date = new Date(j);
        AnonymousClass1aA r3 = this.A00;
        String format = this.A01.format(date);
        TextView textView = r3.A03;
        if (textView != null) {
            textView.setText(AnonymousClass0wJ.A0o(r3, format, 2131834978));
        }
    }
}
