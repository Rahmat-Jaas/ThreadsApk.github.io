package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.security.spec.InvalidParameterSpecException;
import org.json.JSONObject;

/* renamed from: X.7d9  reason: invalid class name and case insensitive filesystem */
public final class C125427d9 implements C39425KtM {
    public C11630kW A00;
    public C13330nS A01;
    public UserSession A02;

    public final void A00(String str, JSONObject jSONObject, int i, int i2) {
        String str2;
        Throwable th;
        int length;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A01, "bd_pdc_signals"), 87);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("asid", str);
            A0I.A0S("ct", C18230wP.A0f(i));
            String obj = jSONObject.toString();
            try {
                String[] split = str.split("-");
                if (split == null || (length = split.length) == 0 || length < 5) {
                    th = C18190wL.A0a("Null App Session Id");
                } else {
                    String A0L = AnonymousClass00U.A0L(split[length - 2], split[length - 1]);
                    if (A0L.length() == 16) {
                        str2 = AnonymousClass6GO.A00(obj, A0L);
                        A0I.A0T("sjd", str2);
                        A0I.A0S("rt", C18230wP.A0f(i2));
                        A0I.Bb4();
                        return;
                    }
                    th = new InvalidParameterSpecException(I17.A00(HttpStatus.SC_METHOD_FAILURE));
                }
                throw th;
            } catch (Throwable th2) {
                J5T.A00(th2);
                str2 = "{}";
            }
        }
    }

    public final void D9x(Object obj) {
        try {
            UserSession userSession = (UserSession) obj;
            this.A02 = userSession;
            this.A01 = C13330nS.A01(this.A00, userSession);
        } catch (ClassCastException e) {
            J5T.A00(e);
        }
    }

    public C125427d9(C11630kW r2, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = r2;
        this.A01 = C13330nS.A01(r2, userSession);
    }
}
