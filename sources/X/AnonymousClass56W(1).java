package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1;
import com.instagram.groupprofiles.data.GroupProfileRepository;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.io.File;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S1101000_I2_1;

/* renamed from: X.56W  reason: invalid class name */
public final class AnonymousClass56W extends AnonymousClass10X {
    public AnonymousClass5I8 A00 = new AnonymousClass5I8("", "", "", "", false);
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public String A04 = "";
    public C148838sG A05;
    public C148838sG A06;
    public C86074wE A07;
    public boolean A08;
    public boolean A09;
    public String A0A;
    public final GroupProfileRepository A0B;
    public final C61643Ur A0C;
    public final UserSession A0D;
    public final C84714tk A0E;
    public final C86074wE A0F;
    public final C86094wG A0G;
    public final C133807wQ A0H;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass56W(android.app.Application r31, X.C07530bf r32, com.instagram.service.session.UserSession r33) {
        /*
            r30 = this;
            r10 = 1
            r3 = r33
            X.C04220Ms.A0B(r3, r10)
            r27 = 3
            r0 = r30
            r4 = r31
            r0.<init>(r4)
            r0.A0D = r3
            com.instagram.groupprofiles.data.GroupProfileRepository r2 = new com.instagram.groupprofiles.data.GroupProfileRepository
            r1 = r32
            r2.<init>(r4, r1, r3)
            r0.A0B = r2
            r6 = 0
            r12 = 0
            X.7vm r5 = X.C133487vm.A00
            java.lang.Integer r7 = X.AnonymousClass006.A00
            r9 = 2131828120(0x7f111d98, float:1.9289172E38)
            X.5IW r4 = new X.5IW
            r8 = r6
            r11 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r10
            r22 = r12
            r23 = r12
            r24 = r10
            r25 = r10
            r26 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.Enn r3 = X.C18190wL.A0z(r4)
            r0.A0F = r3
            r0.A0G = r3
            java.lang.String r14 = ""
            X.5I8 r13 = new X.5I8
            r15 = r14
            r16 = r14
            r17 = r14
            r13.<init>(r14, r15, r16, r17, r18)
            r0.A00 = r13
            r0.A03 = r14
            r0.A02 = r14
            r0.A01 = r14
            r0.A04 = r14
            r28 = 23
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r23 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1
            r24 = r6
            r25 = r6
            r26 = r6
            r23.<init>((X.C26743EUq) r24, (com.instagram.common.typedurl.ImageUrl) r25, (kotlin.jvm.internal.DefaultConstructorMarker) r26, (int) r27, (int) r28)
            X.Enn r5 = X.C18190wL.A0z(r23)
            r0.A07 = r5
            r4 = 22
            com.facebook.redex.IDxFlowShape251S0100000_2_I2 r2 = new com.facebook.redex.IDxFlowShape251S0100000_2_I2
            r2.<init>(r5, r4)
            r0.A0E = r2
            X.7wQ r4 = new X.7wQ
            r4.<init>(r0)
            r0.A0H = r4
            r2 = 32
            kotlin.jvm.internal.KtLambdaShape77S0100000_I2_57 r17 = X.C86164wN.A12(r0, r2)
            android.app.Application r2 = r0.A08()
            android.content.Context r14 = X.C18230wP.A09(r2)
            X.4k2 r18 = X.C79434k2.A00
            X.3Ur r2 = new X.3Ur
            r13 = r2
            r15 = r1
            r16 = r4
            r13.<init>((android.content.Context) r14, (X.C10300i6) r15, (X.C84364t1) r16, (X.AnonymousClass0ZU) r17, (X.AnonymousClass0YY) r18)
            r2.A00 = r10
            r0.A0C = r2
            com.instagram.service.session.UserSession r5 = r0.A0D
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r1 = 36318230571651350(0x81073d00181116, double:3.0311334830640886E-306)
            boolean r1 = X.C63803iN.A0E(r4, r5, r1)
            if (r1 != 0) goto L_0x00bb
            r1 = 36327821232122042(0x810ff6000128ba, double:3.037198655364244E-306)
            boolean r1 = X.C63803iN.A0E(r4, r5, r1)
            if (r1 == 0) goto L_0x00e9
        L_0x00bb:
            java.lang.Object r2 = r3.getValue()
            r13 = r2
            X.5IW r13 = (X.AnonymousClass5IW) r13
            r19 = 4194291(0x3ffff3, float:5.877454E-39)
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r12
            r20 = r10
            r21 = r12
            r23 = r12
            r24 = r12
            r25 = r12
            r26 = r12
            r27 = r12
            r28 = r12
            r29 = r12
            X.5IW r1 = X.AnonymousClass5IW.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r1 = r3.ADi(r2, r1)
            if (r1 == 0) goto L_0x00bb
        L_0x00e9:
            com.instagram.service.session.UserSession r3 = r0.A0D
            r1 = 36318230571716887(0x81073d00191117, double:3.0311334831055345E-306)
            boolean r1 = X.C63803iN.A0E(r4, r3, r1)
            if (r1 != 0) goto L_0x0126
            X.4wE r3 = r0.A0F
        L_0x00f8:
            java.lang.Object r2 = r3.getValue()
            r13 = r2
            X.5IW r13 = (X.AnonymousClass5IW) r13
            r19 = 4194287(0x3fffef, float:5.877448E-39)
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r12
            r20 = r12
            r21 = r12
            r23 = r12
            r24 = r12
            r25 = r12
            r26 = r12
            r27 = r12
            r28 = r12
            r29 = r12
            X.5IW r1 = X.AnonymousClass5IW.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r1 = r3.ADi(r2, r1)
            if (r1 == 0) goto L_0x00f8
        L_0x0126:
            X.4wE r1 = r0.A0F
            java.lang.Object r1 = r1.getValue()
            X.5IW r1 = (X.AnonymousClass5IW) r1
            boolean r1 = r1.A0F
            boolean r1 = A02(r0, r1)
            if (r1 == 0) goto L_0x0166
            X.4wE r2 = r0.A0F
        L_0x0138:
            java.lang.Object r1 = r2.getValue()
            r13 = r1
            X.5IW r13 = (X.AnonymousClass5IW) r13
            r19 = 4063231(0x3dffff, float:5.6938E-39)
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r12
            r20 = r12
            r21 = r12
            r23 = r12
            r24 = r12
            r25 = r12
            r26 = r12
            r27 = r12
            r28 = r10
            r29 = r12
            X.5IW r0 = X.AnonymousClass5IW.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x0138
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56W.<init>(android.app.Application, X.0bf, com.instagram.service.session.UserSession):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r9.length() == 0) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A01(X.AnonymousClass56W r20, java.lang.String r21) {
        /*
            r12 = 0
            r1 = r21
            X.C04220Ms.A0B(r1, r12)
            r3 = r20
            X.4wE r4 = r3.A0F
            java.lang.Object r0 = r4.getValue()
            X.5IW r0 = (X.AnonymousClass5IW) r0
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x008b
            r3.A03 = r1
            int r0 = r1.length()
            boolean r0 = X.C18180wK.A1X(r0)
            r3.A09 = r0
            r7 = 0
            if (r0 == 0) goto L_0x002a
            X.8sG r0 = r3.A05
            if (r0 == 0) goto L_0x002a
            r0.AC7(r7)
        L_0x002a:
            java.lang.Object r2 = r4.getValue()
            r5 = r2
            X.5IW r5 = (X.AnonymousClass5IW) r5
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x0040
            java.lang.String r9 = r5.A04
            if (r9 == 0) goto L_0x0040
            int r1 = r9.length()
            r0 = 1
            if (r1 != 0) goto L_0x0042
        L_0x0040:
            r0 = 0
            r9 = r7
        L_0x0042:
            X.7vm r6 = X.C133487vm.A00
            java.lang.Integer r8 = X.AnonymousClass006.A00
            r10 = 2131828120(0x7f111d98, float:1.9289172E38)
            if (r0 == 0) goto L_0x004e
            r10 = 2131828121(0x7f111d99, float:1.9289174E38)
        L_0x004e:
            r11 = 3604287(0x36ff3f, float:5.050682E-39)
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            X.5IW r0 = X.AnonymousClass5IW.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = r4.ADi(r2, r0)
            if (r0 == 0) goto L_0x002a
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x008c
            r9 = 1000(0x3e8, double:4.94E-321)
        L_0x0070:
            X.8sG r0 = r3.A06
            if (r0 == 0) goto L_0x0077
            r0.AC7(r7)
        L_0x0077:
            X.4qz r2 = X.AnonymousClass3J5.A00(r3)
            r8 = 11
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101100_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101100_I2
            r5 = r1
            r6 = r3
            r5.<init>(r6, r7, r8, r9)
            r0 = 3
            X.8sG r0 = X.C25237DiI.A00(r7, r7, r1, r2, r0)
            r3.A06 = r0
        L_0x008b:
            return
        L_0x008c:
            r9 = 0
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56W.A01(X.56W, java.lang.String):void");
    }

    public final void A0E(C34640IcN icN) {
        Object value;
        if (this.A0A == null) {
            C86074wE r1 = this.A0F;
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape20S0201000_I2_6(icN, this, (C146958n9) null, 30), C86154wM.A17(this, AnonymousClass5IW.A00((AnonymousClass5IW) r1.getValue(), (AnonymousClass8f5) null, (User) null, AnonymousClass006.A0C, (String) null, 0, 4194175, false, false, false, false, false, false, false, false, false, false), r1), 3);
            return;
        }
        C86074wE r2 = this.A0F;
        do {
            value = r2.getValue();
        } while (!r2.ADi(value, AnonymousClass5IW.A00((AnonymousClass5IW) value, (AnonymousClass8f5) null, (User) null, (Integer) null, (String) null, 0, 4194047, false, false, true, false, false, false, false, false, false, false)));
    }

    public final void A0G(String str) {
        C04220Ms.A0B(str, 0);
        this.A02 = str;
        if (C63803iN.A0E(AnonymousClass0TJ.A06, this.A0D, 36318230572110109L)) {
            C86074wE r1 = this.A0F;
            if (((AnonymousClass5IW) r1.getValue()).A08) {
                C148838sG r0 = this.A05;
                if (r0 != null) {
                    r0.AC7((CancellationException) null);
                }
                if (str.length() > 0) {
                    this.A05 = C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S1101000_I2_1(this, str, (C146958n9) null, 9), AnonymousClass3J5.A00(this), 3);
                } else if (((AnonymousClass5IW) r1.getValue()).A04 != null) {
                    A00(this);
                }
            }
        }
    }

    public final void A0H(String str) {
        File file = null;
        if (str != null) {
            file = C86144wL.A0Z(str);
        }
        C86074wE r4 = this.A07;
        r4.CrC(new KtCSuperShape1S0200000_I2_1(23, (Object) C26743EUq.A00(file), ((KtCSuperShape1S0200000_I2_1) r4.getValue()).A01));
    }

    public static final void A00(AnonymousClass56W r19) {
        Object value;
        C86074wE r2 = r19.A0F;
        do {
            value = r2.getValue();
        } while (!r2.ADi(value, AnonymousClass5IW.A00((AnonymousClass5IW) value, C133487vm.A00, (User) null, AnonymousClass006.A00, "", 2131828120, 3604287, false, false, false, false, false, false, false, false, false, false)));
    }

    public static final boolean A02(AnonymousClass56W r2, boolean z) {
        if (z) {
            if (!C63803iN.A0E(AnonymousClass0TJ.A05, r2.A0D, 36327821232056505L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A09() {
        Object value;
        C86074wE r2 = this.A0F;
        if (((AnonymousClass5IW) r2.getValue()).A0I) {
            do {
                value = r2.getValue();
            } while (!r2.ADi(value, AnonymousClass5IW.A00((AnonymousClass5IW) value, (AnonymousClass8f5) null, (User) null, (Integer) null, (String) null, 0, 4194047, false, false, false, false, false, false, false, false, false, false)));
            String str = this.A0A;
            if (str != null) {
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S1101000_I2_1(this, str, (C146958n9) null, 10), C86154wM.A17(this, AnonymousClass5IW.A00((AnonymousClass5IW) r2.getValue(), (AnonymousClass8f5) null, (User) null, AnonymousClass006.A0C, (String) null, 0, 4194175, false, false, false, false, false, false, false, false, false, false), r2), 3);
            }
        }
    }

    public final void A0A() {
        String str = this.A0A;
        if (str != null) {
            C86074wE r1 = this.A0F;
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S1101000_I2_1(this, str, (C146958n9) null, 8), C86154wM.A17(this, AnonymousClass5IW.A00((AnonymousClass5IW) r1.getValue(), (AnonymousClass8f5) null, (User) null, AnonymousClass006.A0C, (String) null, 0, 4194175, false, false, false, false, false, false, false, false, false, false), r1), 3);
        }
    }

    public final void A0B() {
        Object value;
        C86074wE r2 = this.A0F;
        do {
            value = r2.getValue();
        } while (!r2.ADi(value, AnonymousClass5IW.A00((AnonymousClass5IW) value, (AnonymousClass8f5) null, (User) null, (Integer) null, (String) null, 0, 4194047, false, false, false, false, false, false, false, false, false, false)));
    }

    public final void A0C() {
        Object value;
        C86074wE r2 = this.A0F;
        do {
            value = r2.getValue();
        } while (!r2.ADi(value, AnonymousClass5IW.A00((AnonymousClass5IW) value, (AnonymousClass8f5) null, (User) null, (Integer) null, (String) null, 0, 4193791, false, false, false, false, false, false, false, false, false, false)));
    }

    public final void A0D() {
        Object value;
        C86074wE r2 = this.A0F;
        do {
            value = r2.getValue();
        } while (!r2.ADi(value, AnonymousClass5IW.A00((AnonymousClass5IW) value, (AnonymousClass8f5) null, (User) null, (Integer) null, (String) null, 0, 4186111, false, false, false, false, false, false, false, false, false, false)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r4, 36318230570537221L) != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(java.lang.String r35) {
        /*
            r34 = this;
            r17 = 0
            r0 = r34
            java.lang.String r1 = r0.A0A
            r2 = r35
            boolean r1 = X.C04220Ms.A0I(r1, r2)
            if (r1 != 0) goto L_0x0041
            r0.A0A = r2
            com.instagram.service.session.UserSession r4 = r0.A0D
            com.instagram.user.model.User r10 = X.C18210wN.A0P(r4, r2)
            if (r10 != 0) goto L_0x0042
            X.4wE r2 = r0.A0F
        L_0x001a:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.5IW r0 = (X.AnonymousClass5IW) r0
            r4 = 0
            r15 = 1
            r9 = 4190207(0x3fefff, float:5.87173E-39)
            r3 = r0
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r17
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r16 = r8
            r18 = r8
            r19 = r8
            X.5IW r0 = X.AnonymousClass5IW.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x001a
        L_0x0041:
            return
        L_0x0042:
            X.4te r9 = r10.A0J()
            if (r9 == 0) goto L_0x010f
            boolean r20 = r9.BXj()
        L_0x004c:
            java.lang.Boolean r1 = r10.A0k()
            r7 = 1
            boolean r3 = X.C18190wL.A1Z(r1, r7)
            if (r3 == 0) goto L_0x0066
            X.0TJ r5 = X.AnonymousClass0TJ.A05
            r1 = 36318230570537221(0x81073d00071105, double:3.031133482359509E-306)
            boolean r1 = X.C63803iN.A0E(r5, r4, r1)
            r18 = 0
            if (r1 == 0) goto L_0x0068
        L_0x0066:
            r18 = 1
        L_0x0068:
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r1 = 36318230572503331(0x81073d00251123, double:3.031133483602885E-306)
            boolean r32 = X.C63803iN.A0E(r6, r4, r1)
            X.4wE r5 = r0.A0F
            X.0TJ r8 = X.AnonymousClass0TJ.A06
            r1 = 36318230572110109(0x81073d001f111d, double:3.0311334833542097E-306)
            boolean r29 = X.C63803iN.A0E(r8, r4, r1)
            r1 = 36318230571716887(0x81073d00191117, double:3.0311334831055345E-306)
            boolean r21 = X.C63803iN.A0E(r6, r4, r1)
            X.7vm r12 = X.C133487vm.A00
            java.lang.Integer r14 = X.AnonymousClass006.A01
            boolean r30 = A02(r0, r3)
            r13 = 0
            r16 = 2131828120(0x7f111d98, float:1.9289172E38)
            X.5IW r11 = new X.5IW
            r15 = r13
            r19 = r3
            r22 = r17
            r23 = r17
            r24 = r17
            r25 = r17
            r26 = r17
            r27 = r17
            r28 = r7
            r31 = r17
            r33 = r32
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r5.CrC(r11)
            java.lang.String r1 = r10.BK7()
            r0.A03 = r1
            java.lang.String r1 = r10.Ak1()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x00c1
            r1 = r2
        L_0x00c1:
            r0.A02 = r1
            java.lang.String r1 = r10.A0v()
            if (r1 != 0) goto L_0x00ca
            r1 = r2
        L_0x00ca:
            r0.A01 = r1
            java.lang.String r1 = r10.A10()
            if (r1 == 0) goto L_0x00d3
            r2 = r1
        L_0x00d3:
            r0.A04 = r2
            if (r9 == 0) goto L_0x010d
            boolean r1 = r9.AlB()
        L_0x00db:
            r0.A08 = r1
            X.4wE r4 = r0.A07
            java.lang.Object r2 = r4.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1) r2
            boolean r1 = r10.A34()
            if (r1 != 0) goto L_0x00ef
            com.instagram.common.typedurl.ImageUrl r13 = r10.B4M()
        L_0x00ef:
            java.lang.Object r3 = r2.A00
            r2 = 23
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1
            r1.<init>((int) r2, (java.lang.Object) r3, (java.lang.Object) r13)
            r4.CrC(r1)
            java.lang.String r2 = r0.A03
            java.lang.String r3 = r0.A02
            java.lang.String r4 = r0.A01
            java.lang.String r5 = r0.A04
            boolean r6 = r0.A08
            X.5I8 r1 = new X.5I8
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A00 = r1
            return
        L_0x010d:
            r1 = 0
            goto L_0x00db
        L_0x010f:
            r20 = 0
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56W.A0F(java.lang.String):void");
    }

    public final void A0I(String str, String str2, List list) {
        Object value;
        Object value2;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A0D, 36318230572110109L)) {
            C86074wE r3 = this.A0F;
            do {
                value2 = r3.getValue();
            } while (!r3.ADi(value2, AnonymousClass5IW.A00((AnonymousClass5IW) value2, (AnonymousClass8f5) null, (User) null, (Integer) null, (String) null, 0, 4145151, false, false, false, false, false, false, false, true, false, false)));
        }
        if (str != null) {
            String str3 = str2;
            if (str2 != null && list != null) {
                this.A00 = new AnonymousClass5I8("", str3, "", "", false);
                C86074wE r32 = this.A0F;
                do {
                    value = r32.getValue();
                } while (!r32.ADi(value, AnonymousClass5IW.A00((AnonymousClass5IW) value, (AnonymousClass8f5) null, (User) null, (Integer) null, (String) null, 0, 4194299, true, false, false, false, false, false, false, false, false, false)));
                A0G(str3);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0016: MOVE  (r11v0 boolean) = (r22v0 boolean)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void A0J(boolean r22) {
        /*
            r21 = this;
            r3 = r21
            X.4wE r2 = r3.A0F
            java.lang.Object r0 = r2.getValue()
            X.5IW r0 = (X.AnonymousClass5IW) r0
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r2.getValue()
            X.5IW r0 = (X.AnonymousClass5IW) r0
            boolean r0 = r0.A0F
            r11 = r22
            if (r0 != r11) goto L_0x001b
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r1 = r2.getValue()
            r4 = r1
            X.5IW r4 = (X.AnonymousClass5IW) r4
            r9 = 0
            r5 = 0
            if (r22 == 0) goto L_0x002b
            boolean r0 = r4.A0H
            r14 = 1
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            r14 = 0
        L_0x002c:
            boolean r19 = A02(r3, r11)
            r10 = 4062715(0x3dfdfb, float:5.693076E-39)
            r6 = r5
            r7 = r5
            r8 = r5
            r12 = r9
            r13 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r20 = r9
            X.5IW r0 = X.AnonymousClass5IW.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x001b
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56W.A0J(boolean):void");
    }

    public final void A0K(boolean z) {
        Object value;
        C86074wE r2 = this.A0F;
        do {
            value = r2.getValue();
        } while (!r2.ADi(value, AnonymousClass5IW.A00((AnonymousClass5IW) value, (AnonymousClass8f5) null, (User) null, (Integer) null, (String) null, 0, 4194295, false, z, false, false, false, false, false, false, false, false)));
    }
}
