package X;

import android.os.Bundle;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxObjectShape133S0200000_2_I2;
import com.fbpay.logging.FBPayLoggerData;

/* renamed from: X.56l  reason: invalid class name */
public final class AnonymousClass56l extends C880756q {
    public C111096mm A00;
    public Throwable A01;

    public static void A00(AnonymousClass56l r4) {
        C111096mm r1 = r4.A00;
        if (r1 != null) {
            r1.A02 = null;
            if (r4.A01 != null) {
                int i = 0;
                if (r1.A08.isEmpty()) {
                    i = Integer.MAX_VALUE;
                }
                Throwable th = r4.A01;
                if (th instanceof AnonymousClass88W) {
                    int A0B = C86104wH.A0B(r4.A00.A08);
                    int i2 = ((AnonymousClass88W) th).A00;
                    if (A0B > i2) {
                        i = i2;
                    } else if (!r4.A00.A08.isEmpty()) {
                        i = C86104wH.A0B(r4.A00.A08);
                    }
                }
                if (r4.A00.A08.size() > i) {
                    C111096mm r12 = r4.A00;
                    r12.A02 = C18190wL.A0p(r12.A08, i);
                }
            }
            r4.A0G(r4.A00);
        }
    }

    public AnonymousClass56l(Bundle bundle, AnonymousClass7IU r6, AnonymousClass58D r7) {
        M5J A02;
        int i;
        A0K(r7.A07, C86114wI.A0Q(this, HttpStatus.SC_CREATED));
        if (r7.A04()) {
            AnonymousClass572 r3 = (AnonymousClass572) r6.A01(AnonymousClass5FH.class);
            r3.A00 = (FBPayLoggerData) C18240wQ.A0D(bundle, "logger_data");
            A02 = C30821GXg.A02(r7.A08, new IDxObjectShape133S0200000_2_I2(2, r3, this));
            i = HttpStatus.SC_ACCEPTED;
        } else {
            AnonymousClass572 r32 = (AnonymousClass572) r6.A01(AnonymousClass5FI.class);
            r32.A00 = (FBPayLoggerData) C18240wQ.A0D(bundle, "logger_data");
            A02 = C30821GXg.A02(r7.A08, new IDxObjectShape133S0200000_2_I2(3, r32, this));
            i = HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION;
        }
        A0K(A02, C86114wI.A0Q(this, i));
    }
}
