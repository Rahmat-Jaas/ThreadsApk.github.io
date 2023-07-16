package X;

import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3VX  reason: invalid class name */
public final class AnonymousClass3VX {
    public BusinessConversionFlowStatus A00;
    public Set A01 = C18200wM.A0u();
    public Set A02 = C18200wM.A0u();
    public final Map A03 = C18220wO.A0y();

    public static int A00(AnonymousClass3VX r4, int i) {
        C1366783w it = r4.A00.A01.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            ConversionStep conversionStep = ((BusinessConversionStep) it.next()).A01;
            if (i2 >= i) {
                break;
            }
            if (!(conversionStep == ConversionStep.INTRO || conversionStep == ConversionStep.CREATE_PAGE)) {
                i3++;
            }
            i2++;
        }
        return i3;
    }

    public final void A01() {
        for (AnonymousClass33Z r0 : this.A02) {
            BusinessConversionActivity businessConversionActivity = r0.A00;
            C67223zB A012 = C67223zB.A01(AnonymousClass0wJ.A0U(businessConversionActivity.A0A));
            if (C67223zB.A02 != null) {
                C81194nK r02 = A012.A00;
                synchronized (r02) {
                }
                synchronized (r02) {
                }
                C67223zB.A03 = new AnonymousClass32J();
            }
            businessConversionActivity.setResult(-1);
        }
        this.A02 = C18200wM.A0u();
        this.A01 = C18200wM.A0u();
    }

    public final void A02() {
        BusinessConversionFlowStatus A012 = AnonymousClass3WC.A01(this.A00, C313525q.NEXT);
        if (A012 != null) {
            this.A00 = A012;
            if (A012.A00 != A012.A01.size()) {
                return;
            }
        }
        A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r0.A00 == r0.A01.size()) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.util.List r5) {
        /*
            r4 = this;
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r3 = r4.A00
            X.25q r0 = X.C313525q.SKIP
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r0 = X.AnonymousClass3WC.A01(r3, r0)
            if (r0 == 0) goto L_0x0016
            r4.A00 = r0
            int r1 = r0.A00
            com.google.common.collect.ImmutableList r0 = r0.A01
            int r0 = r0.size()
            if (r1 != r0) goto L_0x0019
        L_0x0016:
            r4.A01()
        L_0x0019:
            java.util.Map r2 = r4.A03
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r1 = r4.A00
            int r0 = r1.A00
            if (r0 <= 0) goto L_0x0037
            com.google.common.collect.ImmutableList r1 = r1.A01
            int r0 = r0 + -1
            java.lang.Object r0 = r1.get(r0)
        L_0x0029:
            r2.put(r0, r3)
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r1 = r4.A00
            int r0 = r1.A00
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r0 = X.AnonymousClass3WC.A02(r1, r5, r0, r0)
            r4.A00 = r0
            return
        L_0x0037:
            r0 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VX.A03(java.util.List):void");
    }

    public AnonymousClass3VX(BusinessConversionFlowStatus businessConversionFlowStatus) {
        this.A00 = businessConversionFlowStatus;
    }
}
