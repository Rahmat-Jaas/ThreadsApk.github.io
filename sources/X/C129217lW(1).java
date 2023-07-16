package X;

import android.content.IntentSender;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import java.util.Map;

/* renamed from: X.7lW  reason: invalid class name and case insensitive filesystem */
public final class C129217lW implements C143758hG {
    public final /* synthetic */ C95345zw A00;

    public C129217lW(C95345zw r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void CH9(C82014ow r7) {
        Integer num;
        String str;
        Status status = ((LocationSettingsResult) r7).A00;
        int i = status.A01;
        if (i == 0) {
            this.A00.A00.A06();
            num = AnonymousClass006.A0C;
        } else if (i != 6) {
            this.A00.A00.A06();
            num = AnonymousClass006.A0N;
        } else {
            try {
                C95345zw r1 = this.A00;
                r1.A00.A06();
                r1.A01 = true;
                status.A00(r1.A03, 5005);
                return;
            } catch (IntentSender.SendIntentException e) {
                AnonymousClass0LU.A0F("GooglePlayLocationSettingsControllerImpl", "Error starting google play services location dialog", e);
                num = AnonymousClass006.A0Y;
            }
        }
        C95345zw r3 = this.A00;
        Integer num2 = AnonymousClass006.A01;
        C22266CRf cRf = ((C133227vM) r3.A06).A00;
        if (num == num2) {
            C22266CRf.A0A(cRf);
        } else {
            cRf.A0N = true;
            C22266CRf.A09(cRf);
        }
        C111756oL r2 = r3.A04;
        String A002 = C95345zw.A00(r3);
        switch (num.intValue()) {
            case 2:
                str = "DIALOG_NOT_NEEDED";
                break;
            case 3:
                str = "DIALOG_NOT_POSSIBLE";
                break;
            default:
                str = "UNKNOWN_FAILURE";
                break;
        }
        r2.A00(A002, str);
        C112396pW r0 = r3.A05;
        AnonymousClass3UO r12 = r0.A01;
        Map map = r0.A02;
        r12.A00(map);
        map.clear();
        synchronized (r12.A00) {
        }
    }
}
