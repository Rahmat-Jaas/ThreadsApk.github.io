package X;

import android.text.InputFilter;
import com.facebookpay.form.cell.text.formatter.TextFormatter;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5hR  reason: invalid class name and case insensitive filesystem */
public class C92005hR extends AnonymousClass7Ih {
    public ImmutableList A00;
    public AnonymousClass0YY A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C880756q A06;
    public final C880756q A07;
    public final C880856r A08;
    public final C880856r A09;
    public final C880856r A0A;
    public final C880856r A0B;
    public final C880856r A0C;
    public final C880856r A0D;
    public final C880856r A0E;
    public final C880856r A0F;
    public final C143158gC A0G = C86114wI.A0Q(this, 78);
    public final C143158gC A0H = C86114wI.A0Q(this, 77);
    public final TextFormatter A0I;
    public final TextFieldHandler A0J;
    public final FBPayIcon A0K;
    public final Boolean A0L;
    public final Integer A0M;
    public final String A0N;
    public final String A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final int A0S;

    public final void A0O(String str) {
        if (str == null) {
            str = "";
        }
        this.A0F.A0H(new C108846j3(str, true, false));
    }

    public static InputFilter A00(C92005hR r4) {
        int i;
        C1366783w it = r4.A00.iterator();
        int i2 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            C113646ru r1 = (C113646ru) it.next();
            if (r1 instanceof C92165hj) {
                i = ((C92165hj) r1).A00;
            } else if (r1 instanceof C92155hi) {
                i = ((C92155hi) r1).A00;
            } else {
                i = Integer.MAX_VALUE;
            }
            i2 = Math.min(i2, i);
        }
        C1366783w it2 = r4.A00.iterator();
        while (it2.hasNext()) {
            if (it2.next() instanceof C92125hf) {
                return new C86894zV(i2);
            }
        }
        return new InputFilter.LengthFilter(i2);
    }

    public final int A0L() {
        String str = (String) AnonymousClass7Ih.A0C(this);
        C1366783w it = this.A00.iterator();
        while (it.hasNext()) {
            C113646ru r1 = (C113646ru) it.next();
            if (!r1.A01(str)) {
                if (!r1.A01(str)) {
                    return r1.A00;
                }
                return 0;
            }
        }
        return 0;
    }

    public final int A0M() {
        int i;
        String str = (String) AnonymousClass7Ih.A0C(this);
        C1366783w it = this.A00.iterator();
        while (it.hasNext()) {
            C113646ru r1 = (C113646ru) it.next();
            if (!r1.A01(str)) {
                if (!r1.A01(str)) {
                    return r1.A01;
                }
                return 0;
            }
        }
        if (!this.A0L.booleanValue() || (i = this.A0S) == 0) {
            return 0;
        }
        return i;
    }

    public final String A0N() {
        String str = (String) AnonymousClass7Ih.A0C(this);
        C1366783w it = this.A00.iterator();
        while (it.hasNext()) {
            C113646ru r1 = (C113646ru) it.next();
            if (!r1.A01(str)) {
                if (!r1.A01(str)) {
                    return r1.A02;
                }
                return null;
            }
        }
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92005hR(com.facebookpay.form.cell.logging.FormCellLoggingEvents r13, com.facebookpay.form.cell.text.formatter.TextFormatter r14, com.facebookpay.form.cell.text.util.TextFieldHandler r15, com.fbpay.theme.FBPayIcon r16, com.google.common.collect.ImmutableList r17, java.lang.Boolean r18, java.lang.Integer r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, int r24, int r25, int r26, int r27, int r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r12 = this;
            r9 = r24
            r8 = r23
            r5 = r20
            r11 = r30
            r10 = r29
            r6 = r12
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r0 = 77
            com.facebook.redex.IDxObserverShape211S0100000_2_I2 r0 = X.C86114wI.A0Q(r12, r0)
            r12.A0H = r0
            r0 = 78
            com.facebook.redex.IDxObserverShape211S0100000_2_I2 r0 = X.C86114wI.A0Q(r12, r0)
            r12.A0G = r0
            X.56r r4 = X.C880856r.A03()
            r12.A0E = r4
            X.56r r0 = X.C880856r.A03()
            r12.A0B = r0
            X.56r r0 = X.C880856r.A03()
            r12.A0D = r0
            X.56r r2 = X.C880856r.A03()
            r12.A0C = r2
            X.56r r0 = X.C880856r.A03()
            r12.A0F = r0
            X.56q r0 = X.C880756q.A01()
            r12.A07 = r0
            X.56q r0 = X.C880756q.A01()
            r12.A06 = r0
            r1 = 0
            X.56r r0 = X.C880856r.A04(r1)
            r12.A08 = r0
            X.56r r0 = X.C880856r.A03()
            r12.A09 = r0
            X.56r r0 = X.C880856r.A03()
            r12.A0A = r0
            r12.A01 = r1
            r0 = r25
            r12.A05 = r0
            r0 = r21
            r12.A0O = r0
            r0 = r26
            r12.A03 = r0
            r0 = r27
            r12.A04 = r0
            r0 = r19
            r12.A0M = r0
            r0 = r17
            r12.A00 = r0
            r12.A0J = r15
            X.56q r3 = r12.A05
            r3.A0H(r5)
            android.util.SparseArray r0 = r12.A04
            if (r20 != 0) goto L_0x0083
            java.lang.String r5 = ""
        L_0x0083:
            r0.put(r9, r5)
            android.text.InputFilter r0 = A00(r12)
            r2.A0H(r0)
            X.56q r2 = r12.A07
            X.56r r1 = r12.A0B
            X.8gC r0 = r12.A0H
            r2.A0K(r1, r0)
            X.8gC r0 = r12.A0G
            r2.A0K(r3, r0)
            r0 = r16
            r12.A0K = r0
            r0 = r18
            r12.A0L = r0
            r0 = r28
            r12.A0S = r0
            r0 = r31
            r12.A0R = r0
            r12.A0I = r14
            if (r14 == 0) goto L_0x00b2
            r4.A0H(r14)
        L_0x00b2:
            r0 = r22
            r12.A0N = r0
            r0 = r32
            r12.A0P = r0
            r0 = r33
            r12.A0Q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92005hR.<init>(com.facebookpay.form.cell.logging.FormCellLoggingEvents, com.facebookpay.form.cell.text.formatter.TextFormatter, com.facebookpay.form.cell.text.util.TextFieldHandler, com.fbpay.theme.FBPayIcon, com.google.common.collect.ImmutableList, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
