package X;

import com.facebookpay.form.cell.logging.FormCellFocusEvents;
import com.fbpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.77d  reason: invalid class name and case insensitive filesystem */
public final class C1198277d {
    public final AnonymousClass587 A00;
    public final LoggingContext A01;

    public final void A00(FormCellFocusEvents formCellFocusEvents, Boolean bool, boolean z) {
        String str;
        String str2;
        C128957ke A012;
        AnonymousClass7DP A03;
        LinkedHashMap A0y;
        String str3;
        Map map;
        if (z) {
            str = formCellFocusEvents.A02;
            str2 = formCellFocusEvents.A03;
            A012 = AnonymousClass7JJ.A01();
            LoggingContext loggingContext = this.A01;
            A03 = this.A00.A03();
            C04220Ms.A0B(loggingContext, 0);
            A0y = C18220wO.A0y();
            C86164wN.A1K(loggingContext, A0y);
            str3 = "TARGET_NAME";
        } else {
            if (C18190wL.A1Z(bool, true)) {
                str = formCellFocusEvents.A01;
            } else {
                str = formCellFocusEvents.A00;
            }
            str2 = formCellFocusEvents.A03;
            A012 = AnonymousClass7JJ.A01();
            LoggingContext loggingContext2 = this.A01;
            A03 = this.A00.A03();
            C04220Ms.A0B(loggingContext2, 0);
            A0y = C18220wO.A0y();
            C86164wN.A1K(loggingContext2, A0y);
            str3 = "VIEW_NAME";
        }
        A0y.put(str3, str2);
        Object obj = A0y.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof C03740Kn) && !(obj instanceof AnonymousClass0WC)) || (map = (Map) obj) == null)) {
            map = C18220wO.A0y();
        }
        A012.Bb8(str, AnonymousClass7Kr.A04(A03, A0y, map));
    }

    public C1198277d(AnonymousClass587 r1, LoggingContext loggingContext) {
        this.A01 = loggingContext;
        this.A00 = r1;
    }

    public C1198277d() {
    }
}
