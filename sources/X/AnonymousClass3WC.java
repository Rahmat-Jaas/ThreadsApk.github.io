package X;

import com.google.common.collect.ImmutableList;
import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;

/* renamed from: X.3WC  reason: invalid class name */
public final class AnonymousClass3WC {
    public static BusinessConversionFlowStatus A00(BusinessConversionFlowStatus businessConversionFlowStatus, int i, int i2) {
        if (i < 0) {
            return businessConversionFlowStatus;
        }
        ImmutableList immutableList = businessConversionFlowStatus.A01;
        if (i >= immutableList.size()) {
            return businessConversionFlowStatus;
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i3 = 0; i3 < immutableList.size(); i3++) {
            if (i3 != i) {
                builder.add(immutableList.get(i3));
            }
        }
        return new BusinessConversionFlowStatus(builder.build(), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r5 > r3.A01.size()) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.business.controller.datamodel.BusinessConversionFlowStatus A02(com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r3, java.util.List r4, int r5, int r6) {
        /*
            r2 = 0
            if (r5 < 0) goto L_0x000c
            com.google.common.collect.ImmutableList r0 = r3.A01
            int r1 = r0.size()
            r0 = 1
            if (r5 <= r1) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            X.AnonymousClass7Ko.A0C(r0)
            com.google.common.collect.ImmutableList$Builder r1 = new com.google.common.collect.ImmutableList$Builder
            r1.<init>()
        L_0x0015:
            if (r2 >= r5) goto L_0x0023
            com.google.common.collect.ImmutableList r0 = r3.A01
            java.lang.Object r0 = r0.get(r2)
            r1.add((java.lang.Object) r0)
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0023:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x002c
            r1.addAll((java.lang.Iterable) r4)
        L_0x002c:
            com.google.common.collect.ImmutableList r1 = r1.build()
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r0 = new com.instagram.business.controller.datamodel.BusinessConversionFlowStatus
            r0.<init>(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WC.A02(com.instagram.business.controller.datamodel.BusinessConversionFlowStatus, java.util.List, int, int):com.instagram.business.controller.datamodel.BusinessConversionFlowStatus");
    }

    public static BusinessConversionFlowStatus A01(BusinessConversionFlowStatus businessConversionFlowStatus, C313525q r7) {
        int i = businessConversionFlowStatus.A00;
        if (i <= -1) {
            return new BusinessConversionFlowStatus(businessConversionFlowStatus.A01, 0);
        }
        ImmutableList immutableList = businessConversionFlowStatus.A01;
        if (i == immutableList.size() || businessConversionFlowStatus.A00() == null) {
            return null;
        }
        if (businessConversionFlowStatus.A00().A00 != r7) {
            BusinessConversionStep businessConversionStep = new BusinessConversionStep(r7, businessConversionFlowStatus.A00().A01);
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (int i2 = 0; i2 < immutableList.size(); i2++) {
                if (i2 == i) {
                    builder.add((Object) businessConversionStep);
                }
                if (i2 != i) {
                    builder.add(immutableList.get(i2));
                }
            }
            immutableList = builder.build();
        }
        return new BusinessConversionFlowStatus(immutableList, i + 1);
    }
}
