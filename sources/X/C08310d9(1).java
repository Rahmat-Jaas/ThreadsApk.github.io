package X;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0d9  reason: invalid class name and case insensitive filesystem */
public final class C08310d9 extends C63873iU {
    public final /* synthetic */ C08300d8 A00;
    public final /* synthetic */ boolean A01;

    public C08310d9(C08300d8 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void A00() {
        String str;
        int A03 = C14030oh.A03(-1518662758);
        AnonymousClass0Vt.A00().A04("IgProfiloConfigStore", "syncConfig: success");
        if (this.A01) {
            try {
                GY3.A01(this.A00.A01, C08300d8.A00());
            } catch (IOException e) {
                C08600dr A002 = AnonymousClass0Vt.A00();
                if (e.getMessage() != null) {
                    str = e.getMessage();
                } else {
                    str = "n/a";
                }
                A002.A03(str, "IgProfiloConfigStore", "Failed to store config in Cask cache. Exception: %s");
            }
        }
        C08300d8 r0 = this.A00;
        Context context = r0.A00;
        File file = r0.A01;
        C07880cL r1 = new C07880cL(context);
        r1.A00 = file;
        r1.A02 = AnonymousClass006.A01;
        C08000cZ.A00().A06(r1);
        C08350dD A003 = C08360dF.A00();
        A003.A00.edit().putLong("loom_config_last_sync_timestamp", System.currentTimeMillis()).apply();
        C14030oh.A0A(-855503535, A03);
    }

    public final void onFailInBackground(C26743EUq eUq) {
        String str;
        int A03 = C14030oh.A03(-1765984591);
        C08600dr A002 = AnonymousClass0Vt.A00();
        if (eUq.A06()) {
            str = ((C85814vo) eUq.A03()).getErrorMessage();
        } else {
            str = "unknown";
        }
        A002.A03(str, "IgProfiloConfigStore", "Config fetch failed. Reason: %s");
        C14030oh.A0A(1933869517, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C14030oh.A03(-993915952);
        A00();
        C14030oh.A0A(1131587339, A03);
    }
}
