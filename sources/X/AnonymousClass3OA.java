package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3OA  reason: invalid class name */
public final class AnonymousClass3OA {
    /* JADX WARNING: type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r18, com.instagram.common.typedurl.ImageUrl r19, com.instagram.model.reels.Reel r20, com.instagram.service.session.UserSession r21, X.AnonymousClass0YY r22) {
        /*
            r5 = 1
            r6 = r20
            r10 = r21
            java.util.List r4 = r6.A0P(r10)
            X.C04220Ms.A06(r4)
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r4.iterator()
        L_0x0014:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r1 = r2.next()
            X.BKH r1 = (X.BKH) r1
            X.7HM r0 = X.AnonymousClass7HM.A00(r10)
            boolean r0 = r0.A06(r6, r1)
            if (r0 != 0) goto L_0x0014
            X.C04220Ms.A04(r1)
            r3.add(r1)
            goto L_0x0014
        L_0x0031:
            java.util.List r0 = A00(r4)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x003d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004f
            com.instagram.user.model.User r0 = X.C18220wO.A0c(r1)
            com.instagram.common.typedurl.ImageUrl r0 = r0.B4M()
            r2.add(r0)
            goto L_0x003d
        L_0x004f:
            java.util.List r0 = A00(r3)
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x005b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006d
            com.instagram.user.model.User r0 = X.C18220wO.A0c(r1)
            com.instagram.common.typedurl.ImageUrl r0 = r0.B4M()
            r7.add(r0)
            goto L_0x005b
        L_0x006d:
            int r0 = r7.size()
            r4 = 3
            if (r0 == r4) goto L_0x00be
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            int r0 = r7.size()
            int r1 = 3 - r0
            int r0 = r2.size()
            r3 = 0
            if (r0 <= r1) goto L_0x0089
            java.util.List r2 = r2.subList(r3, r1)
        L_0x0089:
            java.util.Iterator r1 = r7.iterator()
        L_0x008d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r1.next()
            r6.add(r0)
            goto L_0x008d
        L_0x009b:
            java.util.Iterator r2 = r2.iterator()
        L_0x009f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r1 = r2.next()
            boolean r0 = r6.contains(r1)
            if (r0 != 0) goto L_0x009f
            r6.add(r1)
            goto L_0x009f
        L_0x00b3:
            int r0 = r6.size()
            if (r0 <= r4) goto L_0x00bd
            java.util.List r6 = r6.subList(r3, r4)
        L_0x00bd:
            r7 = r6
        L_0x00be:
            android.content.res.Resources r1 = r18.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r13 = r1.getDimensionPixelSize(r0)
            float r12 = (float) r13
            r0 = 1115684864(0x42800000, float:64.0)
            float r12 = r12 / r0
            X.4gh r8 = new X.4gh
            r9 = r19
            r11 = r22
            r8.<init>(r9, r10, r11, r12, r13)
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            r3.addAll(r7)
            int r0 = r7.size()
            if (r0 != r5) goto L_0x00e7
            if (r19 == 0) goto L_0x0147
            r3.add(r9)
        L_0x00e7:
            X.0MZ r5 = new X.0MZ
            r5.<init>()
            r1 = 2
            r5.A00 = r1
            int r0 = r3.size()
            if (r0 <= r1) goto L_0x0144
            r5.A00 = r4
            java.lang.String r19 = "THREE_FACES"
        L_0x00f9:
            android.util.SparseArray r16 = new android.util.SparseArray
            r16.<init>()
            r14 = 0
            java.util.Iterator r4 = r3.iterator()
        L_0x0103:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0154
            java.lang.Object r3 = r4.next()
            int r2 = r14 + 1
            if (r14 >= 0) goto L_0x0116
            X.C06750aI.A1A()
            r0 = 0
            throw r0
        L_0x0116:
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            r15 = 11
            kotlin.jvm.internal.KtLambdaShape19S0301000_I2 r13 = new kotlin.jvm.internal.KtLambdaShape19S0301000_I2
            r17 = r5
            r18 = r8
            r13.<init>(r14, r15, r16, r17, r18)
            X.K2e r1 = X.C37744K2e.A01()
            java.lang.String r0 = "ROLL_CALL_FACEPILE"
            X.Jj7 r1 = r1.A0A(r3, r0)
            X.44w r0 = new X.44w
            r17 = r0
            r18 = r10
            r20 = r13
            r21 = r12
            r22 = r14
            r17.<init>(r18, r19, r20, r21, r22)
            r1.A02(r0)
            r1.A01()
            r14 = r2
            goto L_0x0103
        L_0x0144:
            java.lang.String r19 = "TWO_FACES"
            goto L_0x00f9
        L_0x0147:
            X.0on r2 = X.C10770iu.A00()
            r1 = 817896325(0x30c01b85, float:1.397766E-9)
            java.lang.String r0 = "Exception getting Candid cover image url"
            r2.ABJ(r0, r1)
            goto L_0x00e7
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OA.A01(android.content.Context, com.instagram.common.typedurl.ImageUrl, com.instagram.model.reels.Reel, com.instagram.service.session.UserSession, X.0YY):void");
    }

    public static final List A00(List list) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = ((BKH) it.next()).A0S;
            if (user != null) {
                A0v.add(user);
            }
        }
        return AnonymousClass00J.A0Q(AnonymousClass00J.A0N(AnonymousClass00J.A0b(A0v)), 3);
    }
}
