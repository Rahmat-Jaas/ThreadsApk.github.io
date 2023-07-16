package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import kotlin.jvm.internal.KtLambdaShape44S0100000_I2_24;

/* renamed from: X.1YX  reason: invalid class name */
public final class AnonymousClass1YX extends C34640IcN {
    public static final String __redex_internal_original_name = "IGUXFlowLifecycleFragment";
    public KtCSuperShape0S3100000_I2 A00;
    public C304921n A01;
    public String A02;
    public boolean A03;
    public final C04530Oa A04 = AnonymousClass0OY.A02(new KtLambdaShape44S0100000_I2_24(this, 27));
    public final C04530Oa A05 = C80644m9.A00(this);

    public final String getModuleName() {
        return "ig_ux_flow_lifecycle";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("started", this.A03);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C83424rM) this.A04.getValue()).CH8(i, i2, intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 1971425462(0x758190b6, float:3.28487E32)
            int r4 = X.C14030oh.A02(r0)
            super.onCreate(r10)
            android.os.Bundle r7 = r9.requireArguments()
            java.lang.String r0 = "ux_flow_linking_code"
            int r2 = r7.getInt(r0)
            X.21n[] r1 = X.C304921n.values()
            if (r2 < 0) goto L_0x0090
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            int r0 = r1.length
            int r0 = r0 + -1
            if (r2 > r0) goto L_0x0090
            r6 = r1[r2]
        L_0x0025:
            java.lang.String r0 = "ux_flow_entrypoint"
            java.lang.String r5 = r7.getString(r0)
            java.lang.String r8 = ""
            if (r5 != 0) goto L_0x0030
            r5 = r8
        L_0x0030:
            java.lang.String r0 = "ux_flow_flow"
            int r2 = r7.getInt(r0)
            X.22J[] r1 = X.AnonymousClass22J.values()
            if (r2 < 0) goto L_0x008d
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            int r0 = r1.length
            int r0 = r0 + -1
            if (r2 > r0) goto L_0x008d
            r3 = r1[r2]
        L_0x0047:
            java.lang.String r0 = "ux_flow_page_id"
            java.lang.String r2 = r7.getString(r0)
            if (r2 != 0) goto L_0x0050
            r2 = r8
        L_0x0050:
            java.lang.String r0 = "back_stack_tag"
            java.lang.String r1 = r7.getString(r0)
            if (r1 != 0) goto L_0x0059
            r1 = r8
        L_0x0059:
            X.AnonymousClass0wJ.A1P(r6, r3)
            r9.A01 = r6
            r9.A02 = r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2
            r0.<init>((X.AnonymousClass22J) r3, (java.lang.String) r2, (java.lang.String) r1)
            r9.A00 = r0
            r1 = 0
            if (r10 == 0) goto L_0x0070
            java.lang.String r0 = "started"
            boolean r1 = r10.getBoolean(r0, r1)
        L_0x0070:
            r9.A03 = r1
            if (r1 == 0) goto L_0x007b
            r0 = 72115629(0x44c65ad, float:2.4026772E-36)
        L_0x0077:
            X.C14030oh.A09(r0, r4)
            return
        L_0x007b:
            r0 = 1
            r9.A03 = r0
            X.0Oa r0 = r9.A04
            java.lang.Object r0 = r0.getValue()
            X.4rM r0 = (X.C83424rM) r0
            r0.Bht()
            r0 = 268161338(0xffbd13a, float:2.4831102E-29)
            goto L_0x0077
        L_0x008d:
            X.22J r3 = X.AnonymousClass22J.UNKNOWN
            goto L_0x0047
        L_0x0090:
            X.21n r6 = X.C304921n.IG_PAGE_LINK
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YX.onCreate(android.os.Bundle):void");
    }
}
