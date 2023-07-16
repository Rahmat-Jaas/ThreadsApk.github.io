package X;

import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: X.6nD  reason: invalid class name and case insensitive filesystem */
public abstract class C111366nD {
    public final void A00(C146398mB r9, float f, long j) {
        long A04;
        if (this instanceof C876253m) {
            C876253m r1 = (C876253m) this;
            C04220Ms.A0B(r9, 1);
            r9.Chk(1.0f);
            if (f == 1.0f) {
                A04 = r1.A00;
            } else {
                long j2 = r1.A00;
                A04 = C121657He.A04(C86154wM.A0G(j2), AnonymousClass7KE.A03(j2), AnonymousClass7KE.A02(j2), AnonymousClass7KE.A01(j2), AnonymousClass7KE.A00(j2) * f);
            }
            r9.CjA(A04);
            AnonymousClass7X0 r92 = (AnonymousClass7X0) r9;
            if (r92.A02 != null) {
                r92.A02 = null;
                r92.A01.setShader((Shader) null);
                return;
            }
            return;
        }
        C876753r r3 = (C876753r) this;
        C04220Ms.A0B(r9, 1);
        Shader shader = r3.A01;
        if (shader == null || r3.A00 != j) {
            shader = r3.A01(j);
            r3.A01 = shader;
            r3.A00 = j;
        }
        AnonymousClass7X0 r7 = (AnonymousClass7X0) r9;
        Paint paint = r7.A01;
        long j3 = AnonymousClass7KE.A01;
        if ((((long) paint.getColor()) << 32) != j3) {
            r9.CjA(j3);
        }
        if (!C04220Ms.A0I(r7.A02, shader)) {
            r7.A02 = shader;
            paint.setShader(shader);
        }
        if (((float) paint.getAlpha()) / 255.0f != f) {
            r9.Chk(f);
        }
    }
}
