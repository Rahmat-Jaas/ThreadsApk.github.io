package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;
import java.util.List;

/* renamed from: X.4TC  reason: invalid class name */
public final class AnonymousClass4TC implements Runnable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ C24751jz A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public AnonymousClass4TC(C24751jz r1, String str, String str2, List list, List list2, boolean z, boolean z2) {
        this.A04 = r1;
        this.A06 = list;
        this.A01 = list2;
        this.A05 = str;
        this.A00 = str2;
        this.A03 = z;
        this.A02 = z2;
    }

    public final void run() {
        Bundle A062;
        C07530bf r2;
        Fragment r1;
        RegFlowExtras regFlowExtras = new RegFlowExtras();
        List list = this.A06;
        regFlowExtras.A0e = list;
        regFlowExtras.A0f = this.A01;
        String str = this.A05;
        regFlowExtras.A0X = str;
        regFlowExtras.A0h = true;
        C24751jz r4 = this.A04;
        regFlowExtras.A04 = r4.A02;
        regFlowExtras.A09 = this.A00;
        regFlowExtras.A0q = this.A03;
        regFlowExtras.A0l = this.A02;
        if (str.equals("kr")) {
            C63463hW.A03();
            A062 = C18180wK.A06();
            A062.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
            r2 = r4.A08;
            C18190wL.A13(A062, "IgSessionManager.LOGGED_OUT_TOKEN");
            r1 = new AnonymousClass1b1();
        } else if (list == null || list.isEmpty()) {
            C63463hW.A03();
            A062 = C18180wK.A06();
            A062.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
            r2 = r4.A08;
            C18190wL.A13(A062, "IgSessionManager.LOGGED_OUT_TOKEN");
            r1 = new AnonymousClass1cl();
        } else {
            C63463hW.A03();
            A062 = C18180wK.A06();
            A062.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
            r2 = r4.A08;
            C18190wL.A13(A062, "IgSessionManager.LOGGED_OUT_TOKEN");
            r1 = new AnonymousClass1ch();
        }
        r1.setArguments(A062);
        AnonymousClass0wJ.A19(r1, r4.A06.getActivity(), r2);
    }
}
