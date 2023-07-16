package X;

import android.os.Bundle;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;

/* renamed from: X.2KZ  reason: invalid class name */
public final class AnonymousClass2KZ {
    public static final Bundle A00(KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2, C304921n r4, String str) {
        C04220Ms.A0B(r4, 0);
        Bundle A06 = C18180wK.A06();
        A06.putInt("ux_flow_linking_code", r4.ordinal());
        A06.putString("ux_flow_entrypoint", str);
        AnonymousClass22J r0 = (AnonymousClass22J) ktCSuperShape0S3100000_I2.A00;
        if (r0 != null) {
            A06.putInt("ux_flow_flow", r0.ordinal());
        }
        String str2 = ktCSuperShape0S3100000_I2.A03;
        if (str2 != null) {
            A06.putString("ux_flow_page_id", str2);
        }
        String str3 = ktCSuperShape0S3100000_I2.A01;
        if (str3 != null) {
            A06.putString("back_stack_tag", str3);
        }
        return A06;
    }
}
