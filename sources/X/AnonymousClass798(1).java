package X;

import java.util.List;

/* renamed from: X.798  reason: invalid class name */
public abstract class AnonymousClass798 {
    public AnonymousClass0ZU A00;

    public final void A02() {
        AnonymousClass0ZU r0;
        if (this instanceof AnonymousClass548) {
            r0 = ((AnonymousClass548) this).A0B;
        } else {
            r0 = this.A00;
        }
        if (r0 != null) {
            r0.invoke();
        }
    }

    public static void A01(float[] fArr, float f, int i) {
        fArr[i] = fArr[i] * f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0106, code lost:
        if (r4.A0F != false) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C147848q1 r26) {
        /*
            r25 = this;
            r1 = r25
            boolean r0 = r1 instanceof X.AnonymousClass547
            r24 = r26
            if (r0 == 0) goto L_0x0014
            r3 = r1
            X.547 r3 = (X.AnonymousClass547) r3
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r0 = r24
            r3.A05(r1, r0, r2)
        L_0x0013:
            return
        L_0x0014:
            boolean r0 = r1 instanceof X.AnonymousClass546
            if (r0 == 0) goto L_0x0118
            r4 = r1
            X.546 r4 = (X.AnonymousClass546) r4
            r3 = 0
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x0104
            X.M2h r5 = r4.A0I
            java.util.List r2 = r5.A04
            r2.clear()
            X.8nF r1 = r4.A0G
            r0 = r1
            X.7X1 r0 = (X.AnonymousClass7X1) r0
            android.graphics.Path r0 = r0.A01
            r0.reset()
            java.util.List r0 = r4.A0C
            r2.addAll(r0)
            r5.A03(r1)
        L_0x0039:
            X.8nF r9 = r4.A0H
            r0 = r9
            X.7X1 r0 = (X.AnonymousClass7X1) r0
            android.graphics.Path r10 = r0.A01
            r10.reset()
            float r0 = r4.A06
            r8 = 0
            r7 = 1
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            boolean r0 = X.C18180wK.A1W(r0)
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x00b4
            float r0 = r4.A04
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00b4
            X.8nF r1 = r4.A0G
            long r5 = X.AnonymousClass7KC.A03
            boolean r0 = r1 instanceof X.AnonymousClass7X1
            if (r0 == 0) goto L_0x010a
            X.7X1 r1 = (X.AnonymousClass7X1) r1
            android.graphics.Path r2 = r1.A01
            float r1 = X.AnonymousClass7KC.A01(r5)
            float r0 = X.AnonymousClass7KC.A02(r5)
            r10.addPath(r2, r1, r0)
        L_0x006e:
            r4.A0D = r3
            r4.A0F = r3
            X.6nD r2 = r4.A09
            if (r2 == 0) goto L_0x0086
            X.8nF r1 = r4.A0H
            float r0 = r4.A00
            r7 = 0
            X.53x r9 = X.C877353x.A00
            r11 = 3
            r5 = r24
            r6 = r2
            r8 = r1
            r10 = r0
            r5.AJ6(r6, r7, r8, r9, r10, r11)
        L_0x0086:
            X.6nD r2 = r4.A0A
            if (r2 == 0) goto L_0x0013
            X.53w r7 = r4.A0B
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x0092
            if (r7 != 0) goto L_0x00a5
        L_0x0092:
            float r8 = r4.A03
            float r9 = r4.A02
            int r10 = r4.A07
            int r11 = r4.A08
            r12 = 16
            X.53w r7 = new X.53w
            r7.<init>(r8, r9, r10, r11, r12)
            r4.A0B = r7
            r4.A0E = r3
        L_0x00a5:
            X.8nF r1 = r4.A0H
            float r0 = r4.A01
            r5 = 0
            r9 = 3
            r3 = r24
            r4 = r2
            r6 = r1
            r8 = r0
            r3.AJ6(r4, r5, r6, r7, r8, r9)
            return
        L_0x00b4:
            X.0Oa r10 = r4.A0J
            java.lang.Object r0 = r10.getValue()
            X.8fn r0 = (X.C142908fn) r0
            X.8nF r2 = r4.A0G
            X.7X2 r0 = (X.AnonymousClass7X2) r0
            android.graphics.PathMeasure r1 = r0.A00
            boolean r0 = r2 instanceof X.AnonymousClass7X1
            if (r0 == 0) goto L_0x0111
            X.7X1 r2 = (X.AnonymousClass7X1) r2
            android.graphics.Path r0 = r2.A01
            r1.setPath(r0, r3)
            java.lang.Object r0 = r10.getValue()
            X.8fn r0 = (X.C142908fn) r0
            X.7X2 r0 = (X.AnonymousClass7X2) r0
            android.graphics.PathMeasure r0 = r0.A00
            float r6 = r0.getLength()
            float r5 = r4.A06
            float r0 = r4.A05
            float r5 = r5 + r0
            float r5 = r5 % r11
            float r5 = r5 * r6
            float r2 = r4.A04
            float r2 = r2 + r0
            float r2 = r2 % r11
            float r2 = r2 * r6
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            java.lang.Object r0 = r10.getValue()
            X.8fn r0 = (X.C142908fn) r0
            if (r1 <= 0) goto L_0x00ff
            r0.B9f(r9, r5, r6, r7)
            java.lang.Object r0 = r10.getValue()
            X.8fn r0 = (X.C142908fn) r0
            r0.B9f(r9, r8, r2, r7)
            goto L_0x006e
        L_0x00ff:
            r0.B9f(r9, r5, r2, r7)
            goto L_0x006e
        L_0x0104:
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x006e
            goto L_0x0039
        L_0x010a:
            java.lang.String r0 = "Unable to obtain android.graphics.Path"
            java.lang.UnsupportedOperationException r0 = X.C86134wK.A0s(r0)
            throw r0
        L_0x0111:
            java.lang.String r0 = "Unable to obtain android.graphics.Path"
            java.lang.UnsupportedOperationException r0 = X.C86134wK.A0s(r0)
            throw r0
        L_0x0118:
            r2 = r1
            X.548 r2 = (X.AnonymousClass548) r2
            r5 = 0
            boolean r0 = r2.A0D
            r6 = 0
            if (r0 == 0) goto L_0x01db
            float[] r3 = r2.A0E
            if (r3 != 0) goto L_0x0273
            float[] r3 = X.AnonymousClass7Hf.A04()
            r2.A0E = r3
        L_0x012b:
            float r1 = r2.A05
            float r0 = r2.A00
            r23 = r0
            float r4 = r0 + r1
            float r1 = r2.A06
            float r0 = r2.A01
            r22 = r0
            float r0 = r0 + r1
            r10 = 4
            X.AnonymousClass7Hf.A03(r3, r4, r0)
            float r0 = r2.A02
            double r7 = (double) r0
            r0 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r7 = r7 * r0
            r0 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r7 = r7 / r0
            double r0 = java.lang.Math.cos(r7)
            float r4 = (float) r0
            double r0 = java.lang.Math.sin(r7)
            float r14 = (float) r0
            r1 = r3[r5]
            r0 = r3[r10]
            float r21 = X.C86144wL.A00(r4, r1, r14, r0)
            float r15 = -r14
            float r20 = X.C86144wL.A00(r1, r15, r0, r4)
            r13 = 1
            r1 = r3[r13]
            r12 = 5
            r0 = r3[r12]
            float r19 = X.C86144wL.A00(r4, r1, r14, r0)
            float r18 = X.C86144wL.A00(r1, r15, r0, r4)
            r11 = 2
            r1 = r3[r11]
            r9 = 6
            r0 = r3[r9]
            float r17 = X.C86144wL.A00(r4, r1, r14, r0)
            float r16 = X.C86144wL.A00(r1, r15, r0, r4)
            r8 = 3
            r1 = r3[r8]
            r7 = 7
            r0 = r3[r7]
            float r14 = X.C86144wL.A00(r4, r1, r14, r0)
            float r0 = X.C86144wL.A00(r15, r1, r4, r0)
            r3[r5] = r21
            r3[r13] = r19
            r3[r11] = r17
            r3[r8] = r14
            r3[r10] = r20
            r3[r12] = r18
            r3[r9] = r16
            r3[r7] = r0
            float r4 = r2.A03
            float r0 = r2.A04
            r1 = 1065353216(0x3f800000, float:1.0)
            A01(r3, r4, r5)
            A01(r3, r4, r13)
            A01(r3, r4, r11)
            A01(r3, r4, r8)
            A01(r3, r0, r10)
            A01(r3, r0, r12)
            A01(r3, r0, r9)
            A01(r3, r0, r7)
            r0 = 8
            A01(r3, r1, r0)
            r0 = 9
            A01(r3, r1, r0)
            r0 = 10
            A01(r3, r1, r0)
            r0 = 11
            A01(r3, r1, r0)
            r0 = r23
            float r1 = -r0
            r0 = r22
            float r0 = -r0
            X.AnonymousClass7Hf.A03(r3, r1, r0)
            r2.A0D = r5
        L_0x01db:
            boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x020d
            java.util.List r0 = r2.A0A
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x020b
            X.M2h r4 = r2.A08
            if (r4 != 0) goto L_0x026d
            X.M2h r4 = new X.M2h
            r4.<init>()
            r2.A08 = r4
        L_0x01f2:
            X.8nF r3 = r2.A07
            if (r3 != 0) goto L_0x0264
            android.graphics.Path r0 = X.C86144wL.A0G()
            X.7X1 r3 = new X.7X1
            r3.<init>(r0)
            r2.A07 = r3
        L_0x0201:
            java.util.List r1 = r2.A0A
            java.util.List r0 = r4.A04
            r0.addAll(r1)
            r4.A03(r3)
        L_0x020b:
            r2.A0C = r5
        L_0x020d:
            X.8mj r8 = r24.Ae6()
            r1 = r8
            X.7X9 r1 = (X.AnonymousClass7X9) r1
            X.7XA r0 = r1.A01
            X.7El r7 = r0.A02
            long r4 = X.C121167El.A00(r7)
            X.8lx r9 = r1.A00
            float[] r1 = r2.A0E
            if (r1 == 0) goto L_0x0232
            r0 = r9
            X.7XC r0 = (X.AnonymousClass7XC) r0
            X.8mj r0 = r0.A00
            X.7X9 r0 = (X.AnonymousClass7X9) r0
            X.7XA r0 = r0.A01
            X.7El r0 = r0.A02
            X.8mg r0 = r0.A01
            r0.ADu(r1)
        L_0x0232:
            X.8nF r3 = r2.A07
            java.util.List r0 = r2.A0A
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x024e
            if (r3 == 0) goto L_0x024e
            r1 = 1
            X.7XC r9 = (X.AnonymousClass7XC) r9
            X.8mj r0 = r9.A00
            X.7X9 r0 = (X.AnonymousClass7X9) r0
            X.7XA r0 = r0.A01
            X.7El r0 = r0.A02
            X.8mg r0 = r0.A01
            r0.ADN(r3, r1)
        L_0x024e:
            java.util.List r3 = r2.A0F
            int r2 = r3.size()
        L_0x0254:
            if (r6 >= r2) goto L_0x0278
            java.lang.Object r1 = r3.get(r6)
            X.798 r1 = (X.AnonymousClass798) r1
            r0 = r24
            r1.A03(r0)
            int r6 = r6 + 1
            goto L_0x0254
        L_0x0264:
            r0 = r3
            X.7X1 r0 = (X.AnonymousClass7X1) r0
            android.graphics.Path r0 = r0.A01
            r0.reset()
            goto L_0x0201
        L_0x026d:
            java.util.List r0 = r4.A04
            r0.clear()
            goto L_0x01f2
        L_0x0273:
            X.AnonymousClass7Hf.A02(r3)
            goto L_0x012b
        L_0x0278:
            X.C146708mj.A00(r7, r8, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass798.A03(X.8q1):void");
    }

    public final void A04(AnonymousClass0ZU r5) {
        if (this instanceof AnonymousClass548) {
            AnonymousClass548 r0 = (AnonymousClass548) this;
            r0.A0B = r5;
            List list = r0.A0F;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass798) list.get(i)).A04(r5);
            }
            return;
        }
        this.A00 = r5;
    }
}
