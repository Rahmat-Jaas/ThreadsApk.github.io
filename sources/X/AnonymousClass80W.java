package X;

import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import java.io.IOException;

/* renamed from: X.80W  reason: invalid class name */
public final class AnonymousClass80W implements Runnable {
    public final /* synthetic */ C111716oC A00;
    public final /* synthetic */ AnonymousClass7Ep A01;

    public AnonymousClass80W(C111716oC r1, AnonymousClass7Ep r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        String str;
        Object[] objArr;
        String str2;
        AnonymousClass7Ep r3 = this.A01;
        int i = 300;
        while (r3.A06 == null) {
            try {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                Thread.sleep(10);
                i = i2;
            } catch (InterruptedException unused) {
            }
        }
        BrowserLiteCallback browserLiteCallback = r3.A06;
        if (browserLiteCallback != null) {
            try {
                this.A00.A00(browserLiteCallback);
            } catch (Exception e) {
                C111716oC r1 = this.A00;
                if (r1 instanceof AnonymousClass5EN) {
                    try {
                        C86154wM.A0U(((AnonymousClass5EN) r1).A0F.getFilesDir(), "browser_ipc_failed").createNewFile();
                    } catch (IOException unused2) {
                    }
                } else {
                    str = "BrowserLiteCallbacker";
                    objArr = new Object[]{e.getMessage()};
                    str2 = "Callbacker exception %s";
                }
            }
        } else {
            str = "BrowserLiteCallbacker";
            objArr = C86164wN.A1T();
            str2 = "Callback service is not available.";
            C37252JnL.A01(str, str2, objArr);
        }
    }
}
