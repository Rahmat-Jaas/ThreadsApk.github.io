package X;

import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.1hY  reason: invalid class name */
public final class AnonymousClass1hY extends C63873iU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass3In A02;
    public final /* synthetic */ BKU A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ boolean A05;

    public AnonymousClass1hY(Context context, AnonymousClass3In r2, BKU bku, UserSession userSession, int i, boolean z) {
        this.A01 = context;
        this.A02 = r2;
        this.A00 = i;
        this.A05 = z;
        this.A04 = userSession;
        this.A03 = bku;
    }

    public final void onFail(AnonymousClass3XX r6) {
        int A032 = C14030oh.A03(-1658390313);
        C04220Ms.A0B(r6, 0);
        Context context = this.A01;
        C63813iO.A03(context, (String) null, 2131836068, 0);
        this.A02.A06(C63483hZ.A03(r6, context.getString(2131834837)));
        C14030oh.A0A(983303462, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C85004uM BMZ;
        int A032 = C14030oh.A03(776986963);
        AnonymousClass5z0 r11 = (AnonymousClass5z0) obj;
        int A033 = C14030oh.A03(-500757555);
        C04220Ms.A0B(r11, 0);
        C85014uN r0 = (C85014uN) r11.A01;
        if (r0 == null || (BMZ = r0.BMZ()) == null || !BMZ.BEt()) {
            C63813iO.A03(this.A01, (String) null, 2131836068, 0);
            this.A02.A06("Reschedule GraphQL call succeeded, but had response with success=false");
        } else {
            int i = this.A00;
            long A09 = C18220wO.A09(i);
            Locale locale = Locale.US;
            String A0i = C18240wQ.A0i(new SimpleDateFormat("EEE, LLL d", locale), A09);
            String A0i2 = C18240wQ.A0i(new SimpleDateFormat("h:mm a z", locale), A09);
            int i2 = 2131824379;
            if (this.A05) {
                i2 = 2131824380;
            }
            Context context = this.A01;
            C63813iO.A02(context, C18220wO.A0h(context, A0i, A0i2, i2), (String) null, 0);
            UserSession userSession = this.A04;
            C38039KHq A002 = AnonymousClass3LY.A00(userSession);
            BKU bku = this.A03;
            A002.CWx(new AnonymousClass46T(bku, i));
            BKN bkn = bku.A0f;
            AnonymousClass18N r02 = bkn.A05;
            if (r02 != null) {
                bkn.A05 = new AnonymousClass18N(Integer.valueOf(i), r02.BKC()).CyO();
            }
            C19462Awj.A01(userSession).A03(bku);
            AnonymousClass3In r2 = this.A02;
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r2.A00, "content_scheduling_submit"), 466);
            if (AnonymousClass0wJ.A1U(A0I)) {
                C18210wN.A1B(A0I, C34482Js.A00(r2.A01));
                C18190wL.A1I(A0I, "schedule_picker");
                A0I.Bb4();
            }
        }
        C14030oh.A0A(660469061, A033);
        C14030oh.A0A(556723009, A032);
    }
}
