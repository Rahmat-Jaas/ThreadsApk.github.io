package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.instagram.service.session.UserSession;

/* renamed from: X.1lh  reason: invalid class name and case insensitive filesystem */
public final class C25061lh extends FR1 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass32R A01;
    public final /* synthetic */ C11630kW A02;
    public final /* synthetic */ C24311hs A03;
    public final /* synthetic */ AnonymousClass3Xi A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        String str = (String) obj;
        if (str != null) {
            C62323Yh r0 = C62323Yh.A00;
            UserSession userSession = this.A05;
            String str2 = this.A08;
            String str3 = this.A07;
            r0.A03(userSession, str2, "client_reg_request_register_feo2_service", "register query called to feo2 client", "registration_flow", str3);
            C32165H8c A082 = C63883iV.A08(this.A04.A00, userSession, str, this.A06, str3, true);
            A082.A00 = this.A03;
            C31155GhB.A03(A082);
            return;
        }
        C67323zM.A06(this.A00, (Uri) null, this.A02, this.A05);
    }

    public final int getRunnableId() {
        return 1654495535;
    }

    public C25061lh(Activity activity, AnonymousClass32R r2, C11630kW r3, C24311hs r4, AnonymousClass3Xi r5, UserSession userSession, String str, String str2, String str3) {
        this.A04 = r5;
        this.A05 = userSession;
        this.A08 = str;
        this.A07 = str2;
        this.A01 = r2;
        this.A06 = str3;
        this.A03 = r4;
        this.A00 = activity;
        this.A02 = r3;
    }

    public final void A02(Exception exc) {
        UserSession userSession = this.A05;
        String str = this.A08;
        C62323Yh.A00(userSession, Boolean.valueOf(AnonymousClass0wJ.A1Y(userSession, str)), str, "client_reg_query_verifier_failed", "failure when getting enc verifier from feo2 client", "registration_flow", "ar_code_sms", exc.getMessage(), TextUtils.join("\n", exc.getStackTrace()), (String) null, (String) null);
        C67323zM.A06(this.A00, (Uri) null, this.A02, userSession);
    }

    public final /* bridge */ /* synthetic */ Object call() {
        AnonymousClass32S r1;
        C62323Yh r16 = C62323Yh.A00;
        UserSession userSession = this.A05;
        String str = this.A08;
        String str2 = this.A07;
        UserSession userSession2 = userSession;
        String str3 = str;
        String str4 = "registration_flow";
        String str5 = str2;
        r16.A03(userSession2, str3, "client_reg_request_create_and_acquire_verifier", (String) null, str4, str5);
        try {
            AnonymousClass3HT r5 = this.A04.A02;
            AnonymousClass32R r2 = this.A01;
            Bundle bundle = r2.A00;
            AnonymousClass3W4.A01(bundle, "requestMessage");
            AnonymousClass3W4.A00(bundle, Bundle.class, "auxAttributes");
            AnonymousClass3W4.A00(bundle, Boolean.class, "useDebugKey");
            r2.A00 = C18180wK.A06();
            Bundle A002 = AnonymousClass3JF.A00(r5.A00, r5.A01, bundle.deepCopy(), r5.A02, "register");
            AnonymousClass3JF.A01(A002, r5.A03, "register");
            if (A002 == null) {
                r1 = null;
            } else {
                r1 = new AnonymousClass32S(A002.deepCopy());
            }
            if (r1 == null) {
                C62323Yh.A00(userSession, Boolean.valueOf(AnonymousClass0wJ.A1Y(userSession, str)), str, "client_reg_query_verifier_failed", "empty enc verifier from feo2 client", "registration_flow", str2, (String) null, (String) null, "null enc verifier from feo2 client", (String) null);
                return null;
            }
            r16.A03(userSession2, str3, "client_reg_query_verifier_success", (String) null, str4, str5);
            Lzj lzj = AnonymousClass3Xi.A07;
            Bundle bundle2 = r1.A00;
            if (bundle2.containsKey("verifier")) {
                return lzj.A02(bundle2.getByteArray("verifier"));
            }
            throw new IllegalStateException();
        } catch (Exception e) {
            throw e;
        } catch (AnonymousClass2AX | RemoteException | SecurityException e2) {
            UserSession userSession3 = userSession;
            C62323Yh.A00(userSession3, Boolean.valueOf(AnonymousClass0wJ.A1Y(userSession, str)), str, "client_reg_query_verifier_failed", "exception when getting enc verifier from feo2 client", str4, str5, e2.getMessage(), TextUtils.join("\n", e2.getStackTrace()), (String) null, (String) null);
            C10450iM.A06("FeO2IntegrateHelper", "auto_conf_client_register_failed", e2);
            return null;
        }
    }
}
