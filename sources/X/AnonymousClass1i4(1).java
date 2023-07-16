package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.1i4  reason: invalid class name */
public final class AnonymousClass1i4 extends C63873iU {
    public final /* synthetic */ C23211cm A00;

    public AnonymousClass1i4(C23211cm r1) {
        this.A00 = r1;
    }

    public final void onFail(AnonymousClass3XX r4) {
        int A03 = C14030oh.A03(-1375815976);
        super.onFail(r4);
        C23211cm r1 = this.A00;
        r1.A0D = true;
        r1.A02 = null;
        C23211cm.A03(r1);
        C14030oh.A0A(-1742128425, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(562536679);
        super.onFinish();
        this.A00.A0E = false;
        C14030oh.A0A(1289497317, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-1551456905);
        super.onStart();
        this.A00.A0E = true;
        C14030oh.A0A(-1385974922, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = C14030oh.A03(1985533374);
        ConnectContent connectContent = (ConnectContent) obj;
        int A032 = C14030oh.A03(1712231303);
        super.onSuccess(connectContent);
        C23211cm r5 = this.A00;
        r5.A0D = true;
        r5.A02 = connectContent;
        if (!C23211cm.A05(connectContent)) {
            UserSession A002 = C23211cm.A00(r5);
            A002.getClass();
            String obj2 = C306222g.IG_SAC_SIGN_UP.toString();
            ConnectContent connectContent2 = r5.A02;
            HashMap A0y = AnonymousClass0wJ.A0y();
            if (connectContent2 == null) {
                str = "content";
            } else {
                if (connectContent2.A09 == null) {
                    A0y.put(DialogModule.KEY_TITLE, "null");
                }
                if (connectContent2.A05 == null) {
                    A0y.put("primary_button", "null");
                }
                if (connectContent2.A06 == null) {
                    A0y.put("secondary_button", "null");
                }
                if (connectContent2.A03 == null) {
                    str = "target_accounts";
                }
                C63003bJ.A02(A002, obj2, A0y.toString());
            }
            A0y.put(str, "null");
            C63003bJ.A02(A002, obj2, A0y.toString());
        }
        C23211cm.A03(r5);
        C14030oh.A0A(1537463763, A032);
        C14030oh.A0A(-440996921, A03);
    }
}
