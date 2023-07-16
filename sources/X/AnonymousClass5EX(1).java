package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5EX  reason: invalid class name */
public abstract class AnonymousClass5EX extends AnonymousClass55x {
    public int A00;
    public long A01;
    public AutofillSharedJSBridgeProxy A02;
    public C89405Ej A03;
    public AutofillData A04;
    public AutofillData A05;
    public RequestAutofillJSBridgeCall A06;
    public String A07;
    public List A08;
    public boolean A09 = false;
    public boolean A0A = false;

    public abstract Dialog A0C(Bundle bundle);

    public static void A00(AnonymousClass5EX r1, AnonymousClass78Q r2) {
        r2.A0E = r1.A06.A02();
        r2.A04 = AnonymousClass7KI.A01(r1.A06.A04());
        r2.A0D = AnonymousClass7KI.A01(r1.A06.A04());
    }

    public static void A01(AnonymousClass5EX r2, AnonymousClass78Q r3) {
        r3.A0A = AnonymousClass7KI.A01(AnonymousClass7KI.A06(Collections.unmodifiableMap(r2.A05.A00), Collections.unmodifiableMap(r2.A04.A00)));
        r3.A07 = AnonymousClass7KI.A01(AnonymousClass7KI.A05(Collections.unmodifiableMap(r2.A05.A00), Collections.unmodifiableMap(r2.A04.A00)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r0 == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCancel(android.content.DialogInterface r12) {
        /*
            r11 = this;
            int r1 = r11.A00
            java.lang.String r8 = "DECLINED_SAVE"
            r6 = 1
            if (r1 == r6) goto L_0x0066
            r0 = 2
            if (r1 == r0) goto L_0x0063
            r0 = 3
            if (r1 != r0) goto L_0x0068
            java.lang.String r7 = "DECLINED_OVERWRITE"
        L_0x000f:
            X.5Ej r0 = r11.A03
            if (r0 == 0) goto L_0x005e
            X.78Q r5 = r0.A02(r7)
            A00(r11, r5)
            A01(r11, r5)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = r11.A05
            java.util.Map r0 = X.C86164wN.A0l(r0)
            java.util.Set r0 = r0.keySet()
            java.lang.String r0 = X.AnonymousClass7KI.A01(r0)
            r5.A05 = r0
            long r3 = r11.A01
            r9 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            long r1 = X.C18240wQ.A09(r3)
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            long r1 = X.C18240wQ.A09(r3)
            int r0 = (int) r1
        L_0x0042:
            r5.A01 = r0
            java.lang.String r0 = r11.A07
            r5.A06 = r0
            boolean r0 = r8.equals(r7)
            if (r0 == 0) goto L_0x005f
            boolean r1 = r11.A0A
            boolean r0 = r11.A09
            if (r1 == 0) goto L_0x005f
            if (r0 != 0) goto L_0x005f
        L_0x0056:
            r5.A0L = r6
            X.AnonymousClass78Q.A00(r5)
            super.onCancel(r12)
        L_0x005e:
            return
        L_0x005f:
            r6 = 0
            goto L_0x0056
        L_0x0061:
            r0 = 0
            goto L_0x0042
        L_0x0063:
            java.lang.String r7 = "DECLINED_UPDATE"
            goto L_0x000f
        L_0x0066:
            r7 = r8
            goto L_0x000f
        L_0x0068:
            java.lang.String r0 = "Invalid reason for opening save autofill bottom sheet: "
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r1)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5EX.onCancel(android.content.DialogInterface):void");
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.A01 = 0;
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-1860184779);
        this.A01 = System.currentTimeMillis();
        super.onStart();
        C14030oh.A09(1133232065, A022);
    }
}
