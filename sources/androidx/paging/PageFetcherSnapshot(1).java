package androidx.paging;

import X.AnonymousClass006;
import X.AnonymousClass00J;
import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass4VZ;
import X.AnonymousClass59I;
import X.AnonymousClass59J;
import X.AnonymousClass59L;
import X.AnonymousClass59Z;
import X.AnonymousClass67E;
import X.AnonymousClass743;
import X.C04220Ms;
import X.C104236bS;
import X.C110276lP;
import X.C111696oA;
import X.C112056ou;
import X.C115116uX;
import X.C115416v1;
import X.C115476vB;
import X.C1201779c;
import X.C1202279h;
import X.C1372486y;
import X.C146958n9;
import X.C148838sG;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18230wP;
import X.C25237DiI;
import X.C25240DiL;
import X.C27437EnT;
import X.C27444Ena;
import X.C27952Ew2;
import X.C83224qz;
import X.C84714tk;
import X.C86064wD;
import X.C86164wN;
import X.C885259a;
import X.C885359b;
import X.C885659e;
import X.C98486Fs;
import X.D0E;
import X.D4V;
import com.facebook.redex.IDxFCollectorShape84S0200000_2_I2;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape3S0300000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape48S0200000_I2;

public final class PageFetcherSnapshot {
    public final C111696oA A00;
    public final PageFetcherSnapshotState$Holder A01;
    public final PagingConfig A02;
    public final PagingSource A03;
    public final C115116uX A04;
    public final AtomicBoolean A05;
    public final AnonymousClass0ZU A06;
    public final C27437EnT A07;
    public final C86064wD A08;
    public final C84714tk A09;
    public final C84714tk A0A;
    public final Object A0B;

    public static final Object A04(AnonymousClass67E r5, PageFetcherSnapshot pageFetcherSnapshot, C146958n9 r7, C84714tk r8) {
        C84714tk A002 = D4V.A00(new KtSLambdaShape8S0301000_I2((C146958n9) null, (AnonymousClass0YM) new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(r5, pageFetcherSnapshot, (C146958n9) null), r8, 32));
        KtSLambdaShape3S0300000_I2 ktSLambdaShape3S0300000_I2 = new KtSLambdaShape3S0300000_I2((Object) r5, (C146958n9) null, 0);
        C04220Ms.A0B(A002, 0);
        return C84714tk.A00(r7, C25240DiL.A01(new C1372486y(new KtSLambdaShape8S0301000_I2((C146958n9) null, (AnonymousClass0YM) ktSLambdaShape3S0300000_I2, A002, 30))), new IDxFCollectorShape84S0200000_2_I2(5, (Object) pageFetcherSnapshot, (Object) r5));
    }

    private final Object A05(AnonymousClass67E r3, C115416v1 r4, int i, int i2) {
        int i3;
        int A042 = C18230wP.A04(r3, 0);
        if (A042 != 0) {
            if (A042 == 1) {
                i3 = r4.A04;
            } else if (A042 == 2) {
                i3 = r4.A02;
            } else {
                throw AnonymousClass4VZ.A00();
            }
            if (i != i3 || (r4.A05.A00(r3) instanceof AnonymousClass59I) || i2 >= this.A02.A04) {
                return null;
            }
            AnonymousClass67E r1 = AnonymousClass67E.PREPEND;
            List list = r4.A08;
            if (r3 == r1) {
                return ((C885659e) AnonymousClass00J.A0C(list)).A03;
            }
            return ((C885659e) AnonymousClass00J.A0E(list)).A02;
        }
        throw C18190wL.A0a("Cannot get loadId for loadType: REFRESH");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.59e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.59e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.59e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: X.59e} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ff, code lost:
        if (r1 == false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0201, code lost:
        X.C04220Ms.A0B(A07(X.AnonymousClass67E.REFRESH, r4, r15.A0B), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020c, code lost:
        r1 = r15.A01;
        r5 = r1.A01;
        X.C86154wM.A1S(r15, r4, r1, r5, r7);
        r7.A00 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x021b, code lost:
        if (r5.A00((java.lang.Object) null, r7) == r6) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x021d, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r1 = r1.A00;
        r4 = new X.AnonymousClass59I(((X.C885559d) r0).A00);
        r2 = X.AnonymousClass67E.REFRESH;
        r7.A01 = r5;
        r7.A02 = null;
        r7.A03 = null;
        r7.A04 = null;
        r7.A00 = 9;
        r1 = r1.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0241, code lost:
        if (X.C04220Ms.A0I(r1.A00(r2), r4) != false) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0243, code lost:
        r1.A02(r4, r2);
        r0 = r15.A08.Cgt(new X.AnonymousClass59L(r1.A01(), (X.C1201779c) null), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0255, code lost:
        if (r0 != r6) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0258, code lost:
        r0 = kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x025a, code lost:
        if (r0 != r6) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x025c, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0260, code lost:
        r6 = kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0262, code lost:
        r5.A02((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0265, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0268, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x026f, code lost:
        if ((r4 instanceof X.C885459c) == false) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0273, code lost:
        if (X.AnonymousClass6D2.A00 == null) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0279, code lost:
        if (X.C86164wN.A1P(2) != true) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x027b, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x027c, code lost:
        if (r1 == false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x027e, code lost:
        X.C04220Ms.A0B(A07(X.AnonymousClass67E.REFRESH, r4, r15.A0B), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0289, code lost:
        r15.A07.AC7((java.util.concurrent.CancellationException) null);
        r15.A03.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r4 = r0.A00;
        r0 = X.AnonymousClass67E.REFRESH;
        r7.A01 = r15;
        r7.A02 = r5;
        r7.A03 = null;
        r7.A00 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fd, code lost:
        if (A02(r0, r15, r4, r7) != r6) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ff, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0100, code lost:
        r5.A02((java.lang.Object) null);
        r0 = X.AnonymousClass67E.REFRESH;
        r9 = r15.A0B;
        r5 = r15.A00(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010d, code lost:
        if (X.AnonymousClass6D2.A00 == null) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0114, code lost:
        if (X.C86164wN.A1P(3) == true) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0116, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0117, code lost:
        if (r0 == false) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0119, code lost:
        r4 = X.C18190wL.A0s("Start REFRESH with loadKey ");
        r4.append(r9);
        r4.append(" on ");
        X.C04220Ms.A0B(X.C18200wM.A0m(r15.A03, r4), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0130, code lost:
        r0 = r15.A03;
        r7.A01 = r15;
        r7.A02 = null;
        r7.A00 = 3;
        r4 = r0.A01(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013c, code lost:
        if (r4 != r6) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013e, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0146, code lost:
        r4 = (X.C98486Fs) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014a, code lost:
        if ((r4 instanceof X.C885659e) == false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014c, code lost:
        r9 = r15.A01;
        r11 = r9.A01;
        X.C86154wM.A1S(r15, r4, r9, r11, r7);
        r7.A00 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015a, code lost:
        if (r11.A00((java.lang.Object) null, r7) == r6) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015c, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r0 = r9.A00;
        r9 = X.AnonymousClass67E.REFRESH;
        r13 = (X.C885659e) r5;
        r14 = r0.A02(r9, r13, 0);
        r12 = r0.A05;
        r12.A02(X.AnonymousClass59K.A01, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0171, code lost:
        if (r13.A03 != null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0173, code lost:
        r12.A02(X.AnonymousClass59K.A00, X.AnonymousClass67E.PREPEND);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017c, code lost:
        if (r13.A02 != null) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017e, code lost:
        r12.A02(X.AnonymousClass59K.A00, X.AnonymousClass67E.APPEND);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0185, code lost:
        r11.A02((java.lang.Object) null);
        r0 = X.AnonymousClass6D2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018a, code lost:
        if (r14 == false) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018c, code lost:
        if (r0 == null) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0192, code lost:
        if (X.C86164wN.A1P(3) != true) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0194, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0195, code lost:
        if (r1 == false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0197, code lost:
        X.C04220Ms.A0B(A07(r9, r5, r15.A0B), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a0, code lost:
        r1 = r15.A01;
        r8 = r1.A01;
        X.C86154wM.A1S(r15, r5, r1, r8, r7);
        r7.A00 = 5;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ae, code lost:
        if (r8.A00((java.lang.Object) null, r7) != r6) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b0, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r4 = r1.A00;
        r2 = r15.A08;
        r1 = r4.A00(X.AnonymousClass67E.REFRESH, (X.C885659e) r5);
        X.C86154wM.A1S(r15, r5, r8, (java.lang.Object) null, r7);
        r7.A00 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c8, code lost:
        if (r2.Cgt(r1, r7) != r6) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ca, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01cb, code lost:
        r8.A02((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d5, code lost:
        if (r0 == null) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01db, code lost:
        if (X.C86164wN.A1P(2) != true) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01dd, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01de, code lost:
        if (r1 == false) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01e0, code lost:
        X.C04220Ms.A0B(A07(r9, (X.C98486Fs) null, r15.A0B), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ec, code lost:
        r11.A02((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ef, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f2, code lost:
        if ((r4 instanceof X.C885559d) == false) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f6, code lost:
        if (X.AnonymousClass6D2.A00 == null) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01fc, code lost:
        if (X.C86164wN.A1P(2) != true) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01fe, code lost:
        r1 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(androidx.paging.PageFetcherSnapshot r15, X.C146958n9 r16) {
        /*
            r10 = 3
            r3 = r16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2.A00(r10, r3)
            if (r0 == 0) goto L_0x0029
            r7 = r3
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0029
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0017:
            java.lang.Object r4 = r7.A05
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r8 = 2
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L_0x00d7;
                case 1: goto L_0x0089;
                case 2: goto L_0x007d;
                case 3: goto L_0x013f;
                case 4: goto L_0x0068;
                case 5: goto L_0x0053;
                case 6: goto L_0x004a;
                case 7: goto L_0x0099;
                case 8: goto L_0x0035;
                case 9: goto L_0x002f;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0029:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2
            r7.<init>(r15, r3, r10)
            goto L_0x0017
        L_0x002f:
            java.lang.Object r5 = r7.A01
            X.Dnh r5 = (X.C25549Dnh) r5
            goto L_0x025d
        L_0x0035:
            java.lang.Object r5 = r7.A04
            X.Dnh r5 = (X.C25549Dnh) r5
            java.lang.Object r1 = r7.A03
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState$Holder) r1
            java.lang.Object r0 = r7.A02
            X.6Fs r0 = (X.C98486Fs) r0
            java.lang.Object r15 = r7.A01
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            X.AnonymousClass0OU.A00(r4)
            goto L_0x021e
        L_0x004a:
            java.lang.Object r8 = r7.A03
            X.Dnh r8 = (X.C25549Dnh) r8
            X.AnonymousClass0OU.A00(r4)     // Catch:{ all -> 0x01d0 }
            goto L_0x01cb
        L_0x0053:
            java.lang.Object r8 = r7.A04
            X.Dnh r8 = (X.C25549Dnh) r8
            java.lang.Object r1 = r7.A03
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState$Holder) r1
            java.lang.Object r5 = r7.A02
            X.6Fs r5 = (X.C98486Fs) r5
            java.lang.Object r15 = r7.A01
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            X.AnonymousClass0OU.A00(r4)
            goto L_0x01b1
        L_0x0068:
            java.lang.Object r11 = r7.A04
            X.Dnh r11 = (X.C25549Dnh) r11
            java.lang.Object r9 = r7.A03
            androidx.paging.PageFetcherSnapshotState$Holder r9 = (androidx.paging.PageFetcherSnapshotState$Holder) r9
            java.lang.Object r5 = r7.A02
            X.6Fs r5 = (X.C98486Fs) r5
            java.lang.Object r15 = r7.A01
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            X.AnonymousClass0OU.A00(r4)
            goto L_0x015d
        L_0x007d:
            java.lang.Object r5 = r7.A02
            X.Dnh r5 = (X.C25549Dnh) r5
            java.lang.Object r15 = r7.A01
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            X.AnonymousClass0OU.A00(r4)     // Catch:{ all -> 0x0296 }
            goto L_0x0100
        L_0x0089:
            java.lang.Object r5 = r7.A03
            X.Dnh r5 = (X.C25549Dnh) r5
            java.lang.Object r0 = r7.A02
            androidx.paging.PageFetcherSnapshotState$Holder r0 = (androidx.paging.PageFetcherSnapshotState$Holder) r0
            java.lang.Object r15 = r7.A01
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            X.AnonymousClass0OU.A00(r4)
            goto L_0x00ed
        L_0x0099:
            java.lang.Object r5 = r7.A04
            X.Dnh r5 = (X.C25549Dnh) r5
            java.lang.Object r1 = r7.A03
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState$Holder) r1
            java.lang.Object r2 = r7.A02
            X.6Fs r2 = (X.C98486Fs) r2
            java.lang.Object r0 = r7.A01
            androidx.paging.PageFetcherSnapshot r0 = (androidx.paging.PageFetcherSnapshot) r0
            X.AnonymousClass0OU.A00(r4)
            X.6v1 r1 = r1.A00     // Catch:{ all -> 0x00d2 }
            X.6oA r0 = r0.A00     // Catch:{ all -> 0x00d2 }
            X.6lP r0 = r0.A00     // Catch:{ all -> 0x00d2 }
            X.59j r0 = r0.A00     // Catch:{ all -> 0x00d2 }
            r1.A01(r0)     // Catch:{ all -> 0x00d2 }
            r5.A02(r3)
            X.59e r2 = (X.C885659e) r2
            java.lang.Object r0 = r2.A03
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = "requestLoad"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x00c7:
            java.lang.Object r0 = r2.A02
            if (r0 != 0) goto L_0x0293
            java.lang.String r0 = "requestLoad"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x00d2:
            r0 = move-exception
            r5.A02(r3)
            throw r0
        L_0x00d7:
            X.AnonymousClass0OU.A00(r4)
            androidx.paging.PageFetcherSnapshotState$Holder r0 = r15.A01
            X.Dnh r5 = r0.A01
            r7.A01 = r15
            r7.A02 = r0
            r7.A03 = r5
            r7.A00 = r2
            java.lang.Object r4 = r5.A00(r3, r7)
            if (r4 != r6) goto L_0x00ed
            return r6
        L_0x00ed:
            X.6v1 r4 = r0.A00     // Catch:{ all -> 0x0296 }
            X.67E r0 = X.AnonymousClass67E.REFRESH     // Catch:{ all -> 0x0296 }
            r7.A01 = r15     // Catch:{ all -> 0x0296 }
            r7.A02 = r5     // Catch:{ all -> 0x0296 }
            r7.A03 = r3     // Catch:{ all -> 0x0296 }
            r7.A00 = r8     // Catch:{ all -> 0x0296 }
            java.lang.Object r0 = A02(r0, r15, r4, r7)     // Catch:{ all -> 0x0296 }
            if (r0 != r6) goto L_0x0100
            return r6
        L_0x0100:
            r5.A02(r3)
            X.67E r0 = X.AnonymousClass67E.REFRESH
            java.lang.Object r9 = r15.A0B
            X.6ou r5 = r15.A00(r0, r9)
            X.8dV r0 = X.AnonymousClass6D2.A00
            if (r0 == 0) goto L_0x0116
            boolean r4 = X.C86164wN.A1P(r10)
            r0 = 1
            if (r4 == r2) goto L_0x0117
        L_0x0116:
            r0 = 0
        L_0x0117:
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = "Start REFRESH with loadKey "
            java.lang.StringBuilder r4 = X.C18190wL.A0s(r0)
            r4.append(r9)
            java.lang.String r0 = " on "
            r4.append(r0)
            androidx.paging.PagingSource r0 = r15.A03
            java.lang.String r0 = X.C18200wM.A0m(r0, r4)
            X.C04220Ms.A0B(r0, r2)
        L_0x0130:
            androidx.paging.PagingSource r0 = r15.A03
            r7.A01 = r15
            r7.A02 = r3
            r7.A00 = r10
            java.lang.Object r4 = r0.A01(r5, r7)
            if (r4 != r6) goto L_0x0146
            return r6
        L_0x013f:
            java.lang.Object r15 = r7.A01
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            X.AnonymousClass0OU.A00(r4)
        L_0x0146:
            X.6Fs r4 = (X.C98486Fs) r4
            boolean r0 = r4 instanceof X.C885659e
            if (r0 == 0) goto L_0x01f0
            androidx.paging.PageFetcherSnapshotState$Holder r9 = r15.A01
            X.Dnh r11 = r9.A01
            X.C86154wM.A1S(r15, r4, r9, r11, r7)
            r0 = 4
            r7.A00 = r0
            java.lang.Object r0 = r11.A00(r3, r7)
            if (r0 == r6) goto L_0x0295
            r5 = r4
        L_0x015d:
            X.6v1 r0 = r9.A00     // Catch:{ all -> 0x01eb }
            X.67E r9 = X.AnonymousClass67E.REFRESH     // Catch:{ all -> 0x01eb }
            r13 = r5
            X.59e r13 = (X.C885659e) r13     // Catch:{ all -> 0x01eb }
            boolean r14 = r0.A02(r9, r13, r1)     // Catch:{ all -> 0x01eb }
            X.6vB r12 = r0.A05     // Catch:{ all -> 0x01eb }
            X.59K r0 = X.AnonymousClass59K.A01     // Catch:{ all -> 0x01eb }
            r12.A02(r0, r9)     // Catch:{ all -> 0x01eb }
            java.lang.Object r0 = r13.A03     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x017a
            X.67E r4 = X.AnonymousClass67E.PREPEND     // Catch:{ all -> 0x01eb }
            X.59K r0 = X.AnonymousClass59K.A00     // Catch:{ all -> 0x01eb }
            r12.A02(r0, r4)     // Catch:{ all -> 0x01eb }
        L_0x017a:
            java.lang.Object r0 = r13.A02     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x0185
            X.67E r4 = X.AnonymousClass67E.APPEND     // Catch:{ all -> 0x01eb }
            X.59K r0 = X.AnonymousClass59K.A00     // Catch:{ all -> 0x01eb }
            r12.A02(r0, r4)     // Catch:{ all -> 0x01eb }
        L_0x0185:
            r11.A02(r3)
            X.8dV r0 = X.AnonymousClass6D2.A00
            if (r14 == 0) goto L_0x01d5
            if (r0 == 0) goto L_0x0195
            boolean r0 = X.C86164wN.A1P(r10)
            if (r0 != r2) goto L_0x0195
            r1 = 1
        L_0x0195:
            if (r1 == 0) goto L_0x01a0
            java.lang.Object r0 = r15.A0B
            java.lang.String r0 = A07(r9, r5, r0)
            X.C04220Ms.A0B(r0, r2)
        L_0x01a0:
            androidx.paging.PageFetcherSnapshotState$Holder r1 = r15.A01
            X.Dnh r8 = r1.A01
            X.C86154wM.A1S(r15, r5, r1, r8, r7)
            r0 = 5
            r7.A00 = r0
            java.lang.Object r0 = r8.A00(r3, r7)
            if (r0 != r6) goto L_0x01b1
            return r6
        L_0x01b1:
            X.6v1 r4 = r1.A00     // Catch:{ all -> 0x01d0 }
            X.4wD r2 = r15.A08     // Catch:{ all -> 0x01d0 }
            r1 = r5
            X.59e r1 = (X.C885659e) r1     // Catch:{ all -> 0x01d0 }
            X.67E r0 = X.AnonymousClass67E.REFRESH     // Catch:{ all -> 0x01d0 }
            X.6qx r1 = r4.A00(r0, r1)     // Catch:{ all -> 0x01d0 }
            X.C86154wM.A1S(r15, r5, r8, r3, r7)     // Catch:{ all -> 0x01d0 }
            r0 = 6
            r7.A00 = r0     // Catch:{ all -> 0x01d0 }
            java.lang.Object r0 = r2.Cgt(r1, r7)     // Catch:{ all -> 0x01d0 }
            if (r0 != r6) goto L_0x01cb
            return r6
        L_0x01cb:
            r8.A02(r3)
            goto L_0x0293
        L_0x01d0:
            r0 = move-exception
            r8.A02(r3)
            throw r0
        L_0x01d5:
            if (r0 == 0) goto L_0x01de
            boolean r0 = X.C86164wN.A1P(r8)
            if (r0 != r2) goto L_0x01de
            r1 = 1
        L_0x01de:
            if (r1 == 0) goto L_0x0293
            java.lang.Object r0 = r15.A0B
            java.lang.String r0 = A07(r9, r3, r0)
            X.C04220Ms.A0B(r0, r2)
            goto L_0x0293
        L_0x01eb:
            r0 = move-exception
            r11.A02(r3)
            throw r0
        L_0x01f0:
            boolean r0 = r4 instanceof X.C885559d
            if (r0 == 0) goto L_0x026d
            X.8dV r0 = X.AnonymousClass6D2.A00
            if (r0 == 0) goto L_0x01ff
            boolean r0 = X.C86164wN.A1P(r8)
            if (r0 != r2) goto L_0x01ff
            r1 = 1
        L_0x01ff:
            if (r1 == 0) goto L_0x020c
            X.67E r1 = X.AnonymousClass67E.REFRESH
            java.lang.Object r0 = r15.A0B
            java.lang.String r0 = A07(r1, r4, r0)
            X.C04220Ms.A0B(r0, r2)
        L_0x020c:
            androidx.paging.PageFetcherSnapshotState$Holder r1 = r15.A01
            X.Dnh r5 = r1.A01
            X.C86154wM.A1S(r15, r4, r1, r5, r7)
            r0 = 8
            r7.A00 = r0
            java.lang.Object r0 = r5.A00(r3, r7)
            if (r0 == r6) goto L_0x0295
            r0 = r4
        L_0x021e:
            X.6v1 r1 = r1.A00     // Catch:{ all -> 0x0268 }
            X.59d r0 = (X.C885559d) r0     // Catch:{ all -> 0x0268 }
            java.lang.Throwable r0 = r0.A00     // Catch:{ all -> 0x0268 }
            X.59I r4 = new X.59I     // Catch:{ all -> 0x0268 }
            r4.<init>(r0)     // Catch:{ all -> 0x0268 }
            X.67E r2 = X.AnonymousClass67E.REFRESH     // Catch:{ all -> 0x0268 }
            r7.A01 = r5     // Catch:{ all -> 0x0268 }
            r7.A02 = r3     // Catch:{ all -> 0x0268 }
            r7.A03 = r3     // Catch:{ all -> 0x0268 }
            r7.A04 = r3     // Catch:{ all -> 0x0268 }
            r0 = 9
            r7.A00 = r0     // Catch:{ all -> 0x0268 }
            X.6vB r1 = r1.A05     // Catch:{ all -> 0x0268 }
            X.6bS r0 = r1.A00(r2)     // Catch:{ all -> 0x0268 }
            boolean r0 = X.C04220Ms.A0I(r0, r4)     // Catch:{ all -> 0x0268 }
            if (r0 != 0) goto L_0x0258
            r1.A02(r4, r2)     // Catch:{ all -> 0x0268 }
            X.4wD r2 = r15.A08     // Catch:{ all -> 0x0268 }
            X.79c r1 = r1.A01()     // Catch:{ all -> 0x0268 }
            X.59L r0 = new X.59L     // Catch:{ all -> 0x0268 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0268 }
            java.lang.Object r0 = r2.Cgt(r0, r7)     // Catch:{ all -> 0x0268 }
            if (r0 != r6) goto L_0x0258
            goto L_0x025a
        L_0x0258:
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ all -> 0x0268 }
        L_0x025a:
            if (r0 != r6) goto L_0x0260
            return r6
        L_0x025d:
            X.AnonymousClass0OU.A00(r4)     // Catch:{ all -> 0x0266 }
        L_0x0260:
            kotlin.Unit r6 = kotlin.Unit.A00     // Catch:{ all -> 0x0266 }
            r5.A02(r3)
            return r6
        L_0x0266:
            r0 = move-exception
            goto L_0x0269
        L_0x0268:
            r0 = move-exception
        L_0x0269:
            r5.A02(r3)
            throw r0
        L_0x026d:
            boolean r0 = r4 instanceof X.C885459c
            if (r0 == 0) goto L_0x0293
            X.8dV r0 = X.AnonymousClass6D2.A00
            if (r0 == 0) goto L_0x027c
            boolean r0 = X.C86164wN.A1P(r8)
            if (r0 != r2) goto L_0x027c
            r1 = 1
        L_0x027c:
            if (r1 == 0) goto L_0x0289
            X.67E r1 = X.AnonymousClass67E.REFRESH
            java.lang.Object r0 = r15.A0B
            java.lang.String r0 = A07(r1, r4, r0)
            X.C04220Ms.A0B(r0, r2)
        L_0x0289:
            X.EnT r0 = r15.A07
            r0.AC7(r3)
            androidx.paging.PagingSource r0 = r15.A03
            r0.A03()
        L_0x0293:
            kotlin.Unit r6 = kotlin.Unit.A00
        L_0x0295:
            return r6
        L_0x0296:
            r0 = move-exception
            r5.A02(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.A06(androidx.paging.PageFetcherSnapshot, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(X.C146958n9 r8) {
        /*
            r7 = this;
            r3 = 7
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r3, r8)
            if (r0 == 0) goto L_0x0031
            r6 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r5 = r6.A04
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r6.A00
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 != r0) goto L_0x0037
            java.lang.Object r2 = r6.A03
            X.Dnh r2 = (X.C25549Dnh) r2
            java.lang.Object r1 = r6.A02
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState$Holder) r1
            java.lang.Object r0 = r6.A01
            androidx.paging.PageFetcherSnapshot r0 = (androidx.paging.PageFetcherSnapshot) r0
            X.AnonymousClass0OU.A00(r5)
            goto L_0x004d
        L_0x0031:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r6.<init>(r7, r8, r3)
            goto L_0x0015
        L_0x0037:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x003c:
            X.AnonymousClass0OU.A00(r5)
            androidx.paging.PageFetcherSnapshotState$Holder r1 = r7.A01
            X.Dnh r2 = r1.A01
            X.C86114wI.A1J(r7, r1, r2, r6, r0)
            java.lang.Object r0 = r2.A00(r3, r6)
            if (r0 == r4) goto L_0x0062
            r0 = r7
        L_0x004d:
            X.6v1 r1 = r1.A00     // Catch:{ all -> 0x005d }
            X.6oA r0 = r0.A00     // Catch:{ all -> 0x005d }
            X.6lP r0 = r0.A00     // Catch:{ all -> 0x005d }
            X.59j r0 = r0.A00     // Catch:{ all -> 0x005d }
            X.6uX r4 = r1.A01(r0)     // Catch:{ all -> 0x005d }
            r2.A02(r3)
            return r4
        L_0x005d:
            r0 = move-exception
            r2.A02(r3)
            throw r0
        L_0x0062:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.A09(X.8n9):java.lang.Object");
    }

    private final C112056ou A00(AnonymousClass67E r5, Object obj) {
        int i;
        AnonymousClass67E r1 = AnonymousClass67E.REFRESH;
        PagingConfig pagingConfig = this.A02;
        if (r5 == r1) {
            i = pagingConfig.A00;
        } else {
            i = pagingConfig.A03;
        }
        boolean z = pagingConfig.A05;
        int A042 = C18230wP.A04(r5, 0);
        if (A042 == 0) {
            return new C885359b(i, obj, z);
        }
        if (A042 != 1) {
            if (A042 != 2) {
                throw AnonymousClass4VZ.A00();
            } else if (obj != null) {
                return new AnonymousClass59Z(i, obj, z);
            } else {
                throw C18190wL.A0a("key cannot be null for append");
            }
        } else if (obj != null) {
            return new C885259a(i, obj, z);
        } else {
            throw C18190wL.A0a("key cannot be null for prepend");
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v228, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: X.67E} */
    /* JADX WARNING: type inference failed for: r0v184, types: [X.6ou] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0362, code lost:
        if (X.C18180wK.A1W(X.C04220Ms.A0I(r10, r7.A00)) != false) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0366, code lost:
        if (r1 != X.AnonymousClass67E.PREPEND) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0368, code lost:
        r2 = "prevKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x036a, code lost:
        r1 = X.C18190wL.A0s("The same value, ");
        r1.append(r7.A00);
        r1.append(", was passed as the ");
        r1.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x038d, code lost:
        throw X.C18180wK.A0a(X.AnonymousClass4n8.A09(X.C18180wK.A0i(" in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            ", r1), "|"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x038e, code lost:
        r2 = "nextKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0391, code lost:
        r10 = ((X.C885659e) r9).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0397, code lost:
        r13 = r4.A01;
        r10 = r13.A01;
        r5.A03 = r4;
        r5.A04 = r1;
        X.C86144wL.A1O(r3, r2, r7, r8, r5);
        r5.A0D = r20;
        r5.A0E = r9;
        r5.A0F = r13;
        r5.A05 = r10;
        r5.A02 = 5;
        r1 = r1;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03b6, code lost:
        if (r10.A00((java.lang.Object) null, r5) != r22) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03b8, code lost:
        return r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r11 = (X.C885659e) r9;
        r13 = r13.A00.A02(r1, r11, r3.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03c3, code lost:
        r10.A02((java.lang.Object) null);
        r0 = X.AnonymousClass6D2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03ca, code lost:
        if (r13 != false) goto L_0x0430;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03d0, code lost:
        if ((r9 instanceof X.C885559d) == false) goto L_0x0406;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03d4, code lost:
        if (X.AnonymousClass6D2.A00 == null) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03d6, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03dc, code lost:
        if (X.C86164wN.A1P(2) == true) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03de, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03df, code lost:
        if (r0 == false) goto L_0x0404;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03e1, code lost:
        r2 = null;
        X.C04220Ms.A0B(A07(r1, r9, r7.A00), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03eb, code lost:
        r7 = r4.A01;
        r6 = r7.A01;
        r5.A03 = r4;
        r5.A04 = r1;
        X.C86144wL.A1O(r3, r9, r7, r6, r5);
        r5.A0D = r2;
        r5.A02 = 6;
        r1 = r1;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0401, code lost:
        if (r6.A00(r2, r5) != r22) goto L_0x06a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0403, code lost:
        return r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0404, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0406, code lost:
        r0 = r9 instanceof X.C885459c;
        r1 = r1;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0408, code lost:
        if (r0 == false) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x040c, code lost:
        if (X.AnonymousClass6D2.A00 == null) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x040e, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0414, code lost:
        if (X.C86164wN.A1P(2) != true) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0416, code lost:
        if (r0 == false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0418, code lost:
        X.C04220Ms.A0B(A07(r1, r9, r7.A00), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0421, code lost:
        r4.A07.AC7((java.util.concurrent.CancellationException) null);
        r4.A03.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x042e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0430, code lost:
        if (r0 == null) goto L_0x043a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0432, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0438, code lost:
        if (X.C86164wN.A1P(3) == true) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x043a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x043b, code lost:
        if (r0 == false) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x043d, code lost:
        X.C04220Ms.A0B(A07(r1, r9, r7.A00), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0446, code lost:
        r2.A00 = X.C86164wN.A06(r11.A04, r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0452, code lost:
        if (r1 != X.AnonymousClass67E.PREPEND) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0456, code lost:
        if (r11.A03 == null) goto L_0x0460;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0458, code lost:
        r9 = r9;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x045a, code lost:
        if (r1 != X.AnonymousClass67E.APPEND) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x045c, code lost:
        r9 = r9;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x045e, code lost:
        if (r11.A02 != null) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0460, code lost:
        r8.A00 = true;
        r9 = r9;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0466, code lost:
        if (r1.ordinal() != 1) goto L_0x0491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0468, code lost:
        r21 = X.AnonymousClass67E.APPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x046a, code lost:
        r11 = r4.A01;
        r10 = r11.A01;
        r5.A03 = r4;
        r5.A04 = r1;
        X.C86144wL.A1O(r3, r2, r7, r8, r5);
        r5.A0D = r20;
        r5.A0E = r9;
        r5.A0F = r21;
        r5.A05 = r11;
        r5.A08 = r10;
        r5.A02 = 8;
        r9 = r9;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x048e, code lost:
        if (r10.A00((java.lang.Object) null, r5) != r22) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0490, code lost:
        return r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0491, code lost:
        r21 = X.AnonymousClass67E.PREPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r11 = r11.A00;
        r27 = r3.A01;
        X.C04220Ms.A0B(r21, 0);
        r0 = r11.A06;
        r26 = r0;
        r0 = r0.A02;
        r25 = r0;
        r18 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04b0, code lost:
        if (r0 == Integer.MAX_VALUE) goto L_0x0589;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04b2, code lost:
        r24 = r11.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04bb, code lost:
        if (r24.size() <= 2) goto L_0x0589;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04bd, code lost:
        r13 = r24.iterator();
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04c6, code lost:
        if (r13.hasNext() == false) goto L_0x04d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04c8, code lost:
        r12 = X.C86164wN.A06(((X.C885659e) r13.next()).A04, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04d7, code lost:
        if (r12 <= r25) goto L_0x0589;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04d9, code lost:
        r13 = 0;
        r0 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04de, code lost:
        if (r0 == X.AnonymousClass67E.REFRESH) goto L_0x071c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04e0, code lost:
        r17 = 0;
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04ea, code lost:
        if (r17 >= r24.size()) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04ec, code lost:
        r15 = r24.iterator();
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04f5, code lost:
        if (r15.hasNext() == false) goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04f7, code lost:
        r14 = X.C86164wN.A06(((X.C885659e) r15.next()).A04, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0508, code lost:
        if ((r14 - r16) <= r25) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x050a, code lost:
        r14 = r21.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x050e, code lost:
        if (r14 != 1) goto L_0x0535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0510, code lost:
        r0 = r24.get(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0518, code lost:
        r15 = ((X.C885659e) r0).A04.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0520, code lost:
        if (r14 != 1) goto L_0x0530;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0522, code lost:
        r0 = r27.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x052d, code lost:
        if (((r0 - r16) - r15) < r26.A04) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0530, code lost:
        r0 = r27.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0535, code lost:
        r0 = r24.get(X.C86104wH.A0B(r24) - r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0542, code lost:
        r16 = r16 + r15;
        r17 = r17 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0547, code lost:
        if (r17 == 0) goto L_0x0589;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0549, code lost:
        r15 = r21.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x054d, code lost:
        if (r15 != 1) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x054f, code lost:
        r12 = r11.A03;
        r14 = -r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0554, code lost:
        r14 = X.C86104wH.A0B(r24);
        r12 = r11.A03;
        r14 = (r14 - r12) - (r17 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x055e, code lost:
        if (r15 != 1) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0560, code lost:
        r17 = r17 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0563, code lost:
        r17 = X.C86104wH.A0B(r24);
        r12 = r11.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0569, code lost:
        r17 = r17 - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x056f, code lost:
        if (r26.A05 == false) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0575, code lost:
        if (r21 != X.AnonymousClass67E.PREPEND) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0577, code lost:
        r0 = r11.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x057a, code lost:
        r0 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x057c, code lost:
        r13 = r0 + r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x057e, code lost:
        r15 = new X.AnonymousClass59N(r21, r14, r17, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0589, code lost:
        if (r18 == null) goto L_0x0635;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x058b, code lost:
        r0 = r18;
        r12 = (r0.A00 - r0.A01) + 1;
        r16 = r11.A08;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x059d, code lost:
        if (r12 > r16.size()) goto L_0x070b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x059f, code lost:
        r13 = r11.A09;
        r14 = r18.A03;
        r13.remove(r14);
        r11.A05.A02(X.AnonymousClass59K.A01, r14);
        r13 = r14.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05b5, code lost:
        if (r13 == 1) goto L_0x05d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05b8, code lost:
        if (r13 == 2) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05bc, code lost:
        if (r15 >= r12) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        if (r11 == 0) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05be, code lost:
        r11.A07.remove(X.C86144wL.A0C(r16, 1));
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05cd, code lost:
        r12 = r18.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05d3, code lost:
        if (r12 != Integer.MIN_VALUE) goto L_0x05fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05d5, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05d7, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05d8, code lost:
        if (r14 >= r12) goto L_0x05e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05da, code lost:
        r11.A07.remove(0);
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05e2, code lost:
        r11.A03 -= r12;
        r12 = r18.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05ed, code lost:
        if (r12 != Integer.MIN_VALUE) goto L_0x05f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05ef, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05f0, code lost:
        r11.A01 = r12;
        r0 = r11.A04 + 1;
        r11.A04 = r0;
        r12 = r11.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05fb, code lost:
        r11.A00 = r12;
        r0 = r11.A02 + 1;
        r11.A02 = r0;
        r12 = r11.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0605, code lost:
        r12.D7w(java.lang.Integer.valueOf(r0));
        r12 = r4.A08;
        r5.A03 = r4;
        r5.A04 = r1;
        X.C86144wL.A1O(r3, r2, r7, r8, r5);
        r5.A0D = r20;
        r5.A0E = r9;
        r5.A0F = r10;
        r5.A05 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        r5.A08 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        r5.A02 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x062e, code lost:
        if (r12.Cgt(r18, r5) != r22) goto L_0x0635;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        throw X.C18210wN.A0W("requestLoad");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0635, code lost:
        r0 = r4.A05(r1, r11, r3.A00, r3.A01.A01(r1) + r2.A00);
        r7.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0646, code lost:
        if (r0 != null) goto L_0x065b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0648, code lost:
        r12 = r11.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0650, code lost:
        if ((r12.A00(r1) instanceof X.AnonymousClass59I) != false) goto L_0x065b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0654, code lost:
        if (r8.A00 == false) goto L_0x0674;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0656, code lost:
        r0 = X.AnonymousClass59K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0658, code lost:
        r12.A02(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x065b, code lost:
        r12 = r11.A00(r1, (X.C885659e) r9);
        r11 = r4.A08;
        r5.A03 = r4;
        r5.A04 = r1;
        X.C86144wL.A1O(r3, r2, r7, r8, r5);
        r5.A0D = r20;
        r5.A0E = r9;
        r5.A0F = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0674, code lost:
        r0 = X.AnonymousClass59K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        r5.A05 = null;
        r5.A08 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:?, code lost:
        r5.A02 = 10;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0686, code lost:
        if (r11.Cgt(r12, r5) != r22) goto L_0x068a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x068a, code lost:
        r10.A02((java.lang.Object) null);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0690, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0693, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0696, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0697, code lost:
        r10.A02((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x069b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x06a0, code lost:
        throw X.C18190wL.A0a("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        r7 = r7.A00;
        r9 = new X.AnonymousClass59I(((X.C885559d) r9).A00);
        r5.A03 = r1;
        r5.A04 = r3;
        r5.A09 = r6;
        r5.A0A = r7;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:?, code lost:
        r5.A0B = null;
        r5.A0C = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:?, code lost:
        r5.A02 = 7;
        r2 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06c6, code lost:
        if (X.C04220Ms.A0I(r2.A00(r1), r9) != false) goto L_0x06df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x06c8, code lost:
        r2.A02(r9, r1);
        r2 = r4.A08.Cgt(new X.AnonymousClass59L(r2.A01(), (X.C1201779c) null), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x06dc, code lost:
        if (r2 != r22) goto L_0x06df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x06df, code lost:
        r2 = kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x06e1, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x06e3, code lost:
        if (r2 != r22) goto L_0x06e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x06e5, code lost:
        return r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06e9, code lost:
        r7.A09.put(r1, r3.A01);
        r22 = kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06f2, code lost:
        r6.A02((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x06f6, code lost:
        return r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06f7, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06f8, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06fa, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x06fb, code lost:
        r6.A02(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06fe, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:?, code lost:
        r0 = X.C18190wL.A0a(X.AnonymousClass0wJ.A0t("cannot drop ", r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x070a, code lost:
        return r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x070b, code lost:
        r0 = X.C18180wK.A0a(X.AnonymousClass00U.A01(r16.size(), r12, "invalid drop count. have ", " but wanted to drop "));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x071c, code lost:
        r0 = X.C18190wL.A0a(X.AnonymousClass0wJ.A0t("Drop LoadType must be PREPEND or APPEND, but got ", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0726, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0727, code lost:
        return r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0728, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x072d, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x072e, code lost:
        r10.A02((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0731, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0732, code lost:
        if (r0 == null) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0734, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x073a, code lost:
        if (X.C86164wN.A1P(2) == true) goto L_0x073d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x073c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x073d, code lost:
        if (r0 == false) goto L_0x0748;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x073f, code lost:
        X.C04220Ms.A0B(A07(r1, (X.C98486Fs) null, r7.A00), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x074a, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x074f, code lost:
        throw X.C18180wK.A0a("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0750, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0751, code lost:
        r8.A02((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0755, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (((kotlin.coroutines.jvm.internal.KtCImplShape0S01303000_I2) r8).A0G != 1) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r9 = r7.A00;
        r7 = r1.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01f8, code lost:
        if (r7 == 0) goto L_0x074b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01fa, code lost:
        if (r7 == 1) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01fd, code lost:
        if (r7 != 2) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01ff, code lost:
        r11 = (r9.A03 + r3.A01.A01) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0208, code lost:
        if (r11 >= 0) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x020a, code lost:
        r2.A00 += r4.A02.A03 * (-r11);
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0216, code lost:
        r10 = r9.A08;
        r9 = X.C86104wH.A0B(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x021c, code lost:
        if (r11 > r9) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x021e, code lost:
        r2.A00 = X.C86164wN.A06(((X.C885659e) r10.get(r11)).A04, r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x022e, code lost:
        if (r11 == r9) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0230, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0233, code lost:
        r11 = (r9.A03 + r3.A01.A00) - 1;
        r10 = r9.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0241, code lost:
        if (r11 <= X.C86104wH.A0B(r10)) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0243, code lost:
        r2.A00 += r4.A02.A03 * (r11 - X.C86104wH.A0B(r10));
        r11 = X.C86104wH.A0B(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0256, code lost:
        if (r11 < 0) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0258, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0259, code lost:
        r2.A00 = X.C86164wN.A06(((X.C885659e) r10.get(r9)).A04, r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0269, code lost:
        if (r9 == r11) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x026b, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x026e, code lost:
        r8.A02((java.lang.Object) null);
        r11 = X.C86144wL.A17();
        r8 = r4.A01;
        r10 = r8.A01;
        r5.A03 = r4;
        r5.A04 = r1;
        X.C86144wL.A1O(r3, r2, r11, r8, r5);
        r5.A0D = r10;
        r5.A0E = r11;
        r5.A02 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x028e, code lost:
        if (r10.A00((java.lang.Object) null, r5) == r22) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0290, code lost:
        r7 = r11;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r12 = r8.A00;
        r9 = r4.A05(r1, r12, r3.A00, r3.A01.A01(r1) + r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02a2, code lost:
        if (r9 == null) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02a4, code lost:
        r5.A03 = r4;
        r5.A04 = r1;
        X.C86144wL.A1O(r3, r2, r7, r10, r5);
        r5.A0D = r9;
        r5.A0E = r11;
        r5.A02 = 3;
        r8 = A02(r1, r4, r12, r5);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02b8, code lost:
        if (r8 != r22) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02ba, code lost:
        return r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02c1, code lost:
        r9 = null;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02c2, code lost:
        r10.A02((java.lang.Object) null);
        r11.A00 = r9;
        r8 = new X.C04180Mo();
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02cd, code lost:
        r0 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02cf, code lost:
        if (r0 == null) goto L_0x0748;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02d1, code lost:
        r20 = r4.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02d7, code lost:
        if (X.AnonymousClass6D2.A00 == null) goto L_0x0693;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02d9, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02df, code lost:
        if (X.C86164wN.A1P(3) != true) goto L_0x0693;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02e1, code lost:
        if (r0 == false) goto L_0x0690;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02e3, code lost:
        r9 = X.C18190wL.A0s("Start ");
        r9.append(r1);
        r9.append(" with loadKey ");
        r9.append(r7.A00);
        r9.append(" on ");
        r10 = null;
        X.C04220Ms.A0B(X.C18200wM.A0m(r4.A03, r9), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0305, code lost:
        r9 = r4.A03;
        r5.A03 = r4;
        r5.A04 = r1;
        X.C86144wL.A1O(r3, r2, r7, r8, r5);
        r5.A0D = r20;
        r5.A0E = r10;
        r5.A0F = r10;
        r5.A02 = 4;
        r12 = r9.A01(r20, r5);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0321, code lost:
        if (r12 != r22) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0323, code lost:
        return r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0343, code lost:
        r9 = (X.C98486Fs) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0348, code lost:
        if ((r9 instanceof X.C885659e) == false) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x034a, code lost:
        r10 = r1.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x034e, code lost:
        if (r10 == 1) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0351, code lost:
        if (r10 != 2) goto L_0x069c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0353, code lost:
        r10 = ((X.C885659e) r9).A02;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0324  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C114596tY r24, X.AnonymousClass67E r25, androidx.paging.PageFetcherSnapshot r26, X.C146958n9 r27) {
        /*
            r4 = r26
            r1 = r25
            r3 = r24
            r6 = 1
            r8 = r27
            boolean r0 = r8 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S01303000_I2
            if (r0 == 0) goto L_0x0015
            r0 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S01303000_I2 r0 = (kotlin.coroutines.jvm.internal.KtCImplShape0S01303000_I2) r0
            int r2 = r0.A0G
            r0 = 1
            if (r2 == r6) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0036
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S01303000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S01303000_I2) r5
            int r7 = r5.A02
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r7 & r2
            if (r0 == 0) goto L_0x0036
            int r7 = r7 - r2
            r5.A02 = r7
        L_0x0026:
            java.lang.Object r12 = r5.A06
            X.D0E r22 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A02
            java.lang.String r23 = "Use doInitialLoad for LoadType == REFRESH"
            switch(r0) {
                case 0: goto L_0x01ca;
                case 1: goto L_0x01ae;
                case 2: goto L_0x0189;
                case 3: goto L_0x0166;
                case 4: goto L_0x0324;
                case 5: goto L_0x0139;
                case 6: goto L_0x011c;
                case 7: goto L_0x010c;
                case 8: goto L_0x00d5;
                case 9: goto L_0x00ab;
                case 10: goto L_0x008a;
                case 11: goto L_0x003c;
                default: goto L_0x0031;
            }
        L_0x0031:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0a()
            throw r1
        L_0x0036:
            kotlin.coroutines.jvm.internal.KtCImplShape0S01303000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S01303000_I2
            r5.<init>(r4, r8, r6)
            goto L_0x0026
        L_0x003c:
            int r11 = r5.A01
            int r10 = r5.A00
            java.lang.Object r9 = r5.A0E
            X.Dnh r9 = (X.C25549Dnh) r9
            java.lang.Object r0 = r5.A0D
            androidx.paging.PageFetcherSnapshotState$Holder r0 = (androidx.paging.PageFetcherSnapshotState$Holder) r0
            java.lang.Object r8 = r5.A0C
            X.0Mo r8 = (X.C04180Mo) r8
            java.lang.Object r7 = r5.A0B
            X.0MJ r7 = (X.AnonymousClass0MJ) r7
            java.lang.Object r2 = r5.A0A
            X.0MZ r2 = (X.AnonymousClass0MZ) r2
            java.lang.Object r3 = r5.A09
            X.6tY r3 = (X.C114596tY) r3
            java.lang.Object r1 = r5.A04
            X.67E r1 = (X.AnonymousClass67E) r1
            java.lang.Object r4 = r5.A03
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.AnonymousClass0OU.A00(r12)
            X.6v1 r12 = r0.A00     // Catch:{ all -> 0x0084 }
            X.6oA r0 = r4.A00     // Catch:{ all -> 0x0084 }
            X.6lP r0 = r0.A00     // Catch:{ all -> 0x0084 }
            X.59j r0 = r0.A00     // Catch:{ all -> 0x0084 }
            r12.A01(r0)     // Catch:{ all -> 0x0084 }
            r0 = 0
            r9.A02(r0)
            if (r10 == 0) goto L_0x007b
            java.lang.String r0 = "requestLoad"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x007b:
            if (r11 == 0) goto L_0x02cd
            java.lang.String r0 = "requestLoad"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0084:
            r1 = move-exception
            r0 = 0
            r9.A02(r0)
            throw r1
        L_0x008a:
            java.lang.Object r10 = r5.A0F
            X.Dnh r10 = (X.C25549Dnh) r10
            java.lang.Object r8 = r5.A0C
            X.0Mo r8 = (X.C04180Mo) r8
            java.lang.Object r7 = r5.A0B
            X.0MJ r7 = (X.AnonymousClass0MJ) r7
            java.lang.Object r2 = r5.A0A
            X.0MZ r2 = (X.AnonymousClass0MZ) r2
            java.lang.Object r3 = r5.A09
            X.6tY r3 = (X.C114596tY) r3
            java.lang.Object r1 = r5.A04
            X.67E r1 = (X.AnonymousClass67E) r1
            java.lang.Object r4 = r5.A03
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.AnonymousClass0OU.A00(r12)     // Catch:{ all -> 0x072a }
            goto L_0x068a
        L_0x00ab:
            java.lang.Object r11 = r5.A05
            X.6v1 r11 = (X.C115416v1) r11
            java.lang.Object r10 = r5.A0F
            X.Dnh r10 = (X.C25549Dnh) r10
            java.lang.Object r9 = r5.A0E
            X.6Fs r9 = (X.C98486Fs) r9
            java.lang.Object r0 = r5.A0D
            r20 = r0
            java.lang.Object r8 = r5.A0C
            X.0Mo r8 = (X.C04180Mo) r8
            java.lang.Object r7 = r5.A0B
            X.0MJ r7 = (X.AnonymousClass0MJ) r7
            java.lang.Object r2 = r5.A0A
            X.0MZ r2 = (X.AnonymousClass0MZ) r2
            java.lang.Object r3 = r5.A09
            X.6tY r3 = (X.C114596tY) r3
            java.lang.Object r1 = r5.A04
            X.67E r1 = (X.AnonymousClass67E) r1
            java.lang.Object r4 = r5.A03
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            goto L_0x0632
        L_0x00d5:
            java.lang.Object r10 = r5.A08
            X.Dnh r10 = (X.C25549Dnh) r10
            java.lang.Object r11 = r5.A05
            androidx.paging.PageFetcherSnapshotState$Holder r11 = (androidx.paging.PageFetcherSnapshotState$Holder) r11
            java.lang.Object r0 = r5.A0F
            r21 = r0
            r0 = r21
            X.67E r0 = (X.AnonymousClass67E) r0
            r21 = r0
            java.lang.Object r9 = r5.A0E
            X.6Fs r9 = (X.C98486Fs) r9
            java.lang.Object r0 = r5.A0D
            r20 = r0
            java.lang.Object r8 = r5.A0C
            X.0Mo r8 = (X.C04180Mo) r8
            java.lang.Object r7 = r5.A0B
            X.0MJ r7 = (X.AnonymousClass0MJ) r7
            java.lang.Object r2 = r5.A0A
            X.0MZ r2 = (X.AnonymousClass0MZ) r2
            java.lang.Object r3 = r5.A09
            X.6tY r3 = (X.C114596tY) r3
            java.lang.Object r1 = r5.A04
            X.67E r1 = (X.AnonymousClass67E) r1
            java.lang.Object r4 = r5.A03
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.AnonymousClass0OU.A00(r12)
            goto L_0x0494
        L_0x010c:
            java.lang.Object r7 = r5.A0A
            X.6v1 r7 = (X.C115416v1) r7
            java.lang.Object r6 = r5.A09
            X.Dnh r6 = (X.C25549Dnh) r6
            java.lang.Object r3 = r5.A04
            X.6tY r3 = (X.C114596tY) r3
            java.lang.Object r1 = r5.A03
            goto L_0x06e6
        L_0x011c:
            java.lang.Object r6 = r5.A0C
            X.Dnh r6 = (X.C25549Dnh) r6
            java.lang.Object r7 = r5.A0B
            androidx.paging.PageFetcherSnapshotState$Holder r7 = (androidx.paging.PageFetcherSnapshotState$Holder) r7
            java.lang.Object r9 = r5.A0A
            X.6Fs r9 = (X.C98486Fs) r9
            java.lang.Object r3 = r5.A09
            X.6tY r3 = (X.C114596tY) r3
            java.lang.Object r1 = r5.A04
            X.67E r1 = (X.AnonymousClass67E) r1
            java.lang.Object r4 = r5.A03
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.AnonymousClass0OU.A00(r12)
            goto L_0x06a1
        L_0x0139:
            java.lang.Object r10 = r5.A05
            X.Dnh r10 = (X.C25549Dnh) r10
            java.lang.Object r13 = r5.A0F
            androidx.paging.PageFetcherSnapshotState$Holder r13 = (androidx.paging.PageFetcherSnapshotState$Holder) r13
            java.lang.Object r9 = r5.A0E
            X.6Fs r9 = (X.C98486Fs) r9
            java.lang.Object r0 = r5.A0D
            r20 = r0
            java.lang.Object r8 = r5.A0C
            X.0Mo r8 = (X.C04180Mo) r8
            java.lang.Object r7 = r5.A0B
            X.0MJ r7 = (X.AnonymousClass0MJ) r7
            java.lang.Object r2 = r5.A0A
            X.0MZ r2 = (X.AnonymousClass0MZ) r2
            java.lang.Object r3 = r5.A09
            X.6tY r3 = (X.C114596tY) r3
            java.lang.Object r1 = r5.A04
            X.67E r1 = (X.AnonymousClass67E) r1
            java.lang.Object r4 = r5.A03
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.AnonymousClass0OU.A00(r12)
            goto L_0x03b9
        L_0x0166:
            java.lang.Object r11 = r5.A0E
            X.0MJ r11 = (X.AnonymousClass0MJ) r11
            java.lang.Object r9 = r5.A0D
            java.lang.Object r10 = r5.A0C
            X.Dnh r10 = (X.C25549Dnh) r10
            java.lang.Object r7 = r5.A0B
            X.0MJ r7 = (X.AnonymousClass0MJ) r7
            java.lang.Object r2 = r5.A0A
            X.0MZ r2 = (X.AnonymousClass0MZ) r2
            java.lang.Object r3 = r5.A09
            X.6tY r3 = (X.C114596tY) r3
            java.lang.Object r1 = r5.A04
            X.67E r1 = (X.AnonymousClass67E) r1
            java.lang.Object r4 = r5.A03
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.AnonymousClass0OU.A00(r12)     // Catch:{ all -> 0x02bb }
            goto L_0x02c2
        L_0x0189:
            java.lang.Object r11 = r5.A0E
            X.0MJ r11 = (X.AnonymousClass0MJ) r11
            java.lang.Object r10 = r5.A0D
            X.Dnh r10 = (X.C25549Dnh) r10
            java.lang.Object r8 = r5.A0C
            androidx.paging.PageFetcherSnapshotState$Holder r8 = (androidx.paging.PageFetcherSnapshotState$Holder) r8
            java.lang.Object r7 = r5.A0B
            X.0MJ r7 = (X.AnonymousClass0MJ) r7
            java.lang.Object r2 = r5.A0A
            X.0MZ r2 = (X.AnonymousClass0MZ) r2
            java.lang.Object r3 = r5.A09
            X.6tY r3 = (X.C114596tY) r3
            java.lang.Object r1 = r5.A04
            X.67E r1 = (X.AnonymousClass67E) r1
            java.lang.Object r4 = r5.A03
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.AnonymousClass0OU.A00(r12)
            goto L_0x0291
        L_0x01ae:
            java.lang.Object r8 = r5.A0C
            X.Dnh r8 = (X.C25549Dnh) r8
            java.lang.Object r7 = r5.A0B
            androidx.paging.PageFetcherSnapshotState$Holder r7 = (androidx.paging.PageFetcherSnapshotState$Holder) r7
            java.lang.Object r2 = r5.A0A
            X.0MZ r2 = (X.AnonymousClass0MZ) r2
            java.lang.Object r3 = r5.A09
            X.6tY r3 = (X.C114596tY) r3
            java.lang.Object r1 = r5.A04
            X.67E r1 = (X.AnonymousClass67E) r1
            java.lang.Object r4 = r5.A03
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.AnonymousClass0OU.A00(r12)
            goto L_0x01f1
        L_0x01ca:
            X.AnonymousClass0OU.A00(r12)
            X.67E r0 = X.AnonymousClass67E.REFRESH
            boolean r0 = X.C18240wQ.A1Y(r1, r0)
            if (r0 == 0) goto L_0x0756
            X.0MZ r2 = new X.0MZ
            r2.<init>()
            androidx.paging.PageFetcherSnapshotState$Holder r7 = r4.A01
            X.Dnh r8 = r7.A01
            r5.A03 = r4
            r5.A04 = r1
            X.C86144wL.A1O(r3, r2, r7, r8, r5)
            r5.A02 = r6
            r0 = 0
            java.lang.Object r9 = r8.A00(r0, r5)
            r0 = r22
            if (r9 != r0) goto L_0x01f1
            return r22
        L_0x01f1:
            X.6v1 r9 = r7.A00     // Catch:{ all -> 0x0750 }
            int r7 = r1.ordinal()     // Catch:{ all -> 0x0750 }
            r0 = 0
            if (r7 == r0) goto L_0x074b
            if (r7 == r6) goto L_0x0233
            r0 = 2
            if (r7 != r0) goto L_0x026e
            int r7 = r9.A03     // Catch:{ all -> 0x0750 }
            X.79h r0 = r3.A01     // Catch:{ all -> 0x0750 }
            int r0 = r0.A01     // Catch:{ all -> 0x0750 }
            int r7 = r7 + r0
            int r11 = r7 + 1
            if (r11 >= 0) goto L_0x0216
            int r10 = r2.A00     // Catch:{ all -> 0x0750 }
            androidx.paging.PagingConfig r0 = r4.A02     // Catch:{ all -> 0x0750 }
            int r7 = r0.A03     // Catch:{ all -> 0x0750 }
            int r0 = -r11
            int r7 = r7 * r0
            int r10 = r10 + r7
            r2.A00 = r10     // Catch:{ all -> 0x0750 }
            r11 = 0
        L_0x0216:
            java.util.List r10 = r9.A08     // Catch:{ all -> 0x0750 }
            int r9 = X.C86104wH.A0B(r10)     // Catch:{ all -> 0x0750 }
            if (r11 > r9) goto L_0x026e
        L_0x021e:
            int r7 = r2.A00     // Catch:{ all -> 0x0750 }
            java.lang.Object r0 = r10.get(r11)     // Catch:{ all -> 0x0750 }
            X.59e r0 = (X.C885659e) r0     // Catch:{ all -> 0x0750 }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x0750 }
            int r0 = X.C86164wN.A06(r0, r7)     // Catch:{ all -> 0x0750 }
            r2.A00 = r0     // Catch:{ all -> 0x0750 }
            if (r11 == r9) goto L_0x026e
            int r11 = r11 + 1
            goto L_0x021e
        L_0x0233:
            int r11 = r9.A03     // Catch:{ all -> 0x0750 }
            X.79h r0 = r3.A01     // Catch:{ all -> 0x0750 }
            int r0 = r0.A00     // Catch:{ all -> 0x0750 }
            int r11 = r11 + r0
            int r11 = r11 - r6
            java.util.List r10 = r9.A08     // Catch:{ all -> 0x0750 }
            int r0 = X.C86104wH.A0B(r10)     // Catch:{ all -> 0x0750 }
            if (r11 <= r0) goto L_0x0256
            int r9 = r2.A00     // Catch:{ all -> 0x0750 }
            androidx.paging.PagingConfig r0 = r4.A02     // Catch:{ all -> 0x0750 }
            int r7 = r0.A03     // Catch:{ all -> 0x0750 }
            int r0 = X.C86104wH.A0B(r10)     // Catch:{ all -> 0x0750 }
            int r11 = r11 - r0
            int r7 = r7 * r11
            int r9 = r9 + r7
            r2.A00 = r9     // Catch:{ all -> 0x0750 }
            int r11 = X.C86104wH.A0B(r10)     // Catch:{ all -> 0x0750 }
        L_0x0256:
            if (r11 < 0) goto L_0x026e
            r9 = 0
        L_0x0259:
            int r7 = r2.A00     // Catch:{ all -> 0x0750 }
            java.lang.Object r0 = r10.get(r9)     // Catch:{ all -> 0x0750 }
            X.59e r0 = (X.C885659e) r0     // Catch:{ all -> 0x0750 }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x0750 }
            int r0 = X.C86164wN.A06(r0, r7)     // Catch:{ all -> 0x0750 }
            r2.A00 = r0     // Catch:{ all -> 0x0750 }
            if (r9 == r11) goto L_0x026e
            int r9 = r9 + 1
            goto L_0x0259
        L_0x026e:
            r7 = 0
            r8.A02(r7)
            X.0MJ r11 = X.C86144wL.A17()
            androidx.paging.PageFetcherSnapshotState$Holder r8 = r4.A01
            X.Dnh r10 = r8.A01
            r5.A03 = r4
            r5.A04 = r1
            X.C86144wL.A1O(r3, r2, r11, r8, r5)
            r5.A0D = r10
            r5.A0E = r11
            r0 = 2
            r5.A02 = r0
            java.lang.Object r7 = r10.A00(r7, r5)
            r0 = r22
            if (r7 == r0) goto L_0x0323
            r7 = r11
        L_0x0291:
            X.6v1 r12 = r8.A00     // Catch:{ all -> 0x02bb }
            int r9 = r3.A00     // Catch:{ all -> 0x02bb }
            X.79h r0 = r3.A01     // Catch:{ all -> 0x02bb }
            int r8 = r0.A01(r1)     // Catch:{ all -> 0x02bb }
            int r0 = r2.A00     // Catch:{ all -> 0x02bb }
            int r8 = r8 + r0
            java.lang.Object r9 = r4.A05(r1, r12, r9, r8)     // Catch:{ all -> 0x02bb }
            if (r9 == 0) goto L_0x02c1
            r5.A03 = r4     // Catch:{ all -> 0x02bb }
            r5.A04 = r1     // Catch:{ all -> 0x02bb }
            X.C86144wL.A1O(r3, r2, r7, r10, r5)     // Catch:{ all -> 0x02bb }
            r5.A0D = r9     // Catch:{ all -> 0x02bb }
            r5.A0E = r11     // Catch:{ all -> 0x02bb }
            r0 = 3
            r5.A02 = r0     // Catch:{ all -> 0x02bb }
            java.lang.Object r8 = A02(r1, r4, r12, r5)     // Catch:{ all -> 0x02bb }
            r0 = r22
            if (r8 != r0) goto L_0x02c2
            return r22
        L_0x02bb:
            r1 = move-exception
            r0 = 0
            r10.A02(r0)
            throw r1
        L_0x02c1:
            r9 = 0
        L_0x02c2:
            r0 = 0
            r10.A02(r0)
            r11.A00 = r9
            X.0Mo r8 = new X.0Mo
            r8.<init>()
        L_0x02cd:
            java.lang.Object r0 = r7.A00
            if (r0 == 0) goto L_0x0748
            X.6ou r20 = r4.A00(r1, r0)
            X.8dV r0 = X.AnonymousClass6D2.A00
            if (r0 == 0) goto L_0x0693
            r0 = 3
            boolean r9 = X.C86164wN.A1P(r0)
            r0 = 1
            if (r9 != r6) goto L_0x0693
        L_0x02e1:
            if (r0 == 0) goto L_0x0690
            java.lang.String r0 = "Start "
            java.lang.StringBuilder r9 = X.C18190wL.A0s(r0)
            r9.append(r1)
            java.lang.String r0 = " with loadKey "
            r9.append(r0)
            java.lang.Object r0 = r7.A00
            r9.append(r0)
            java.lang.String r0 = " on "
            r9.append(r0)
            androidx.paging.PagingSource r0 = r4.A03
            java.lang.String r0 = X.C18200wM.A0m(r0, r9)
            r10 = 0
            X.C04220Ms.A0B(r0, r6)
        L_0x0305:
            androidx.paging.PagingSource r9 = r4.A03
            r5.A03 = r4
            r5.A04 = r1
            X.C86144wL.A1O(r3, r2, r7, r8, r5)
            r0 = r20
            r5.A0D = r0
            r5.A0E = r10
            r5.A0F = r10
            r0 = 4
            r5.A02 = r0
            r0 = r20
            java.lang.Object r12 = r9.A01(r0, r5)
            r0 = r22
            if (r12 != r0) goto L_0x0343
        L_0x0323:
            return r22
        L_0x0324:
            java.lang.Object r0 = r5.A0D
            r20 = r0
            java.lang.Object r8 = r5.A0C
            X.0Mo r8 = (X.C04180Mo) r8
            java.lang.Object r7 = r5.A0B
            X.0MJ r7 = (X.AnonymousClass0MJ) r7
            java.lang.Object r2 = r5.A0A
            X.0MZ r2 = (X.AnonymousClass0MZ) r2
            java.lang.Object r3 = r5.A09
            X.6tY r3 = (X.C114596tY) r3
            java.lang.Object r1 = r5.A04
            X.67E r1 = (X.AnonymousClass67E) r1
            java.lang.Object r4 = r5.A03
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.AnonymousClass0OU.A00(r12)
        L_0x0343:
            r9 = r12
            X.6Fs r9 = (X.C98486Fs) r9
            boolean r0 = r9 instanceof X.C885659e
            if (r0 == 0) goto L_0x03ce
            int r10 = r1.ordinal()
            if (r10 == r6) goto L_0x0391
            r0 = 2
            if (r10 != r0) goto L_0x069c
            r0 = r9
            X.59e r0 = (X.C885659e) r0
            java.lang.Object r10 = r0.A02
        L_0x0358:
            java.lang.Object r0 = r7.A00
            boolean r0 = X.C04220Ms.A0I(r10, r0)
            boolean r0 = X.C18180wK.A1W(r0)
            if (r0 != 0) goto L_0x0397
            X.67E r0 = X.AnonymousClass67E.PREPEND
            if (r1 != r0) goto L_0x038e
            java.lang.String r2 = "prevKey"
        L_0x036a:
            java.lang.String r0 = "The same value, "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            java.lang.Object r0 = r7.A00
            r1.append(r0)
            java.lang.String r0 = ", was passed as the "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "
            java.lang.String r1 = X.C18180wK.A0i(r0, r1)
            java.lang.String r0 = "|"
            java.lang.String r0 = X.AnonymousClass4n8.A09(r1, r0)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x038e:
            java.lang.String r2 = "nextKey"
            goto L_0x036a
        L_0x0391:
            r0 = r9
            X.59e r0 = (X.C885659e) r0
            java.lang.Object r10 = r0.A03
            goto L_0x0358
        L_0x0397:
            androidx.paging.PageFetcherSnapshotState$Holder r13 = r4.A01
            X.Dnh r10 = r13.A01
            r5.A03 = r4
            r5.A04 = r1
            X.C86144wL.A1O(r3, r2, r7, r8, r5)
            r0 = r20
            r5.A0D = r0
            r5.A0E = r9
            r5.A0F = r13
            r5.A05 = r10
            r0 = 5
            r5.A02 = r0
            r0 = 0
            java.lang.Object r11 = r10.A00(r0, r5)
            r0 = r22
            if (r11 != r0) goto L_0x03b9
            return r22
        L_0x03b9:
            X.6v1 r12 = r13.A00     // Catch:{ all -> 0x0696 }
            int r0 = r3.A00     // Catch:{ all -> 0x0696 }
            r11 = r9
            X.59e r11 = (X.C885659e) r11     // Catch:{ all -> 0x0696 }
            boolean r13 = r12.A02(r1, r11, r0)     // Catch:{ all -> 0x0696 }
            r12 = 0
            r10.A02(r12)
            X.8dV r0 = X.AnonymousClass6D2.A00
            if (r13 != 0) goto L_0x0430
            goto L_0x0732
        L_0x03ce:
            boolean r0 = r9 instanceof X.C885559d
            if (r0 == 0) goto L_0x0406
            X.8dV r0 = X.AnonymousClass6D2.A00
            if (r0 == 0) goto L_0x03de
            r0 = 2
            boolean r2 = X.C86164wN.A1P(r0)
            r0 = 1
            if (r2 == r6) goto L_0x03df
        L_0x03de:
            r0 = 0
        L_0x03df:
            if (r0 == 0) goto L_0x0404
            java.lang.Object r0 = r7.A00
            java.lang.String r0 = A07(r1, r9, r0)
            r2 = 0
            X.C04220Ms.A0B(r0, r6)
        L_0x03eb:
            androidx.paging.PageFetcherSnapshotState$Holder r7 = r4.A01
            X.Dnh r6 = r7.A01
            r5.A03 = r4
            r5.A04 = r1
            X.C86144wL.A1O(r3, r9, r7, r6, r5)
            r5.A0D = r2
            r0 = 6
            r5.A02 = r0
            java.lang.Object r2 = r6.A00(r2, r5)
            r0 = r22
            if (r2 != r0) goto L_0x06a1
            return r22
        L_0x0404:
            r2 = 0
            goto L_0x03eb
        L_0x0406:
            boolean r0 = r9 instanceof X.C885459c
            if (r0 == 0) goto L_0x0462
            X.8dV r0 = X.AnonymousClass6D2.A00
            if (r0 == 0) goto L_0x042e
            r0 = 2
            boolean r2 = X.C86164wN.A1P(r0)
            r0 = 1
            if (r2 != r6) goto L_0x042e
        L_0x0416:
            if (r0 == 0) goto L_0x0421
            java.lang.Object r0 = r7.A00
            java.lang.String r0 = A07(r1, r9, r0)
            X.C04220Ms.A0B(r0, r6)
        L_0x0421:
            X.EnT r1 = r4.A07
            r0 = 0
            r1.AC7(r0)
            androidx.paging.PagingSource r0 = r4.A03
            r0.A03()
            goto L_0x0748
        L_0x042e:
            r0 = 0
            goto L_0x0416
        L_0x0430:
            if (r0 == 0) goto L_0x043a
            r0 = 3
            boolean r10 = X.C86164wN.A1P(r0)
            r0 = 1
            if (r10 == r6) goto L_0x043b
        L_0x043a:
            r0 = 0
        L_0x043b:
            if (r0 == 0) goto L_0x0446
            java.lang.Object r0 = r7.A00
            java.lang.String r0 = A07(r1, r9, r0)
            X.C04220Ms.A0B(r0, r6)
        L_0x0446:
            int r10 = r2.A00
            java.util.List r0 = r11.A04
            int r0 = X.C86164wN.A06(r0, r10)
            r2.A00 = r0
            X.67E r0 = X.AnonymousClass67E.PREPEND
            if (r1 != r0) goto L_0x0458
            java.lang.Object r0 = r11.A03
            if (r0 == 0) goto L_0x0460
        L_0x0458:
            X.67E r0 = X.AnonymousClass67E.APPEND
            if (r1 != r0) goto L_0x0462
            java.lang.Object r0 = r11.A02
            if (r0 != 0) goto L_0x0462
        L_0x0460:
            r8.A00 = r6
        L_0x0462:
            int r0 = r1.ordinal()
            if (r0 != r6) goto L_0x0491
            X.67E r21 = X.AnonymousClass67E.APPEND
        L_0x046a:
            androidx.paging.PageFetcherSnapshotState$Holder r11 = r4.A01
            X.Dnh r10 = r11.A01
            r5.A03 = r4
            r5.A04 = r1
            X.C86144wL.A1O(r3, r2, r7, r8, r5)
            r0 = r20
            r5.A0D = r0
            r5.A0E = r9
            r0 = r21
            r5.A0F = r0
            r5.A05 = r11
            r5.A08 = r10
            r0 = 8
            r5.A02 = r0
            r0 = 0
            java.lang.Object r12 = r10.A00(r0, r5)
            r0 = r22
            if (r12 != r0) goto L_0x0494
            return r22
        L_0x0491:
            X.67E r21 = X.AnonymousClass67E.PREPEND
            goto L_0x046a
        L_0x0494:
            X.6v1 r11 = r11.A00     // Catch:{ all -> 0x072a }
            X.79h r0 = r3.A01     // Catch:{ all -> 0x072a }
            r27 = r0
            r19 = 0
            r12 = r19
            r0 = r21
            X.C04220Ms.A0B(r0, r12)     // Catch:{ all -> 0x072a }
            androidx.paging.PagingConfig r0 = r11.A06     // Catch:{ all -> 0x072a }
            r26 = r0
            int r0 = r0.A02     // Catch:{ all -> 0x072a }
            r25 = r0
            r18 = 0
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r12) goto L_0x0589
            java.util.List r0 = r11.A08     // Catch:{ all -> 0x072a }
            r24 = r0
            int r12 = r24.size()     // Catch:{ all -> 0x072a }
            r0 = 2
            if (r12 <= r0) goto L_0x0589
            java.util.Iterator r13 = r24.iterator()     // Catch:{ all -> 0x072a }
            r12 = 0
        L_0x04c2:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x072a }
            if (r0 == 0) goto L_0x04d5
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x072a }
            X.59e r0 = (X.C885659e) r0     // Catch:{ all -> 0x072a }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x072a }
            int r12 = X.C86164wN.A06(r0, r12)     // Catch:{ all -> 0x072a }
            goto L_0x04c2
        L_0x04d5:
            r0 = r25
            if (r12 <= r0) goto L_0x0589
            X.67E r12 = X.AnonymousClass67E.REFRESH     // Catch:{ all -> 0x072a }
            r13 = 0
            r0 = r21
            if (r0 == r12) goto L_0x071c
            r17 = 0
            r16 = 0
        L_0x04e4:
            int r12 = r24.size()     // Catch:{ all -> 0x072a }
            r0 = r17
            if (r0 >= r12) goto L_0x0547
            java.util.Iterator r15 = r24.iterator()     // Catch:{ all -> 0x072a }
            r14 = 0
        L_0x04f1:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x072a }
            if (r0 == 0) goto L_0x0504
            java.lang.Object r0 = r15.next()     // Catch:{ all -> 0x072a }
            X.59e r0 = (X.C885659e) r0     // Catch:{ all -> 0x072a }
            java.util.List r12 = r0.A04     // Catch:{ all -> 0x072a }
            int r14 = X.C86164wN.A06(r12, r14)     // Catch:{ all -> 0x072a }
            goto L_0x04f1
        L_0x0504:
            int r14 = r14 - r16
            r12 = r25
            if (r14 <= r12) goto L_0x0547
            int r14 = r21.ordinal()     // Catch:{ all -> 0x072a }
            if (r14 != r6) goto L_0x0535
            r12 = r24
            r0 = r17
            java.lang.Object r0 = r12.get(r0)     // Catch:{ all -> 0x072a }
        L_0x0518:
            X.59e r0 = (X.C885659e) r0     // Catch:{ all -> 0x072a }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x072a }
            int r15 = r0.size()     // Catch:{ all -> 0x072a }
            if (r14 != r6) goto L_0x0530
            r0 = r27
            int r0 = r0.A03     // Catch:{ all -> 0x072a }
        L_0x0526:
            int r14 = r0 - r16
            int r14 = r14 - r15
            r0 = r26
            int r12 = r0.A04     // Catch:{ all -> 0x072a }
            if (r14 < r12) goto L_0x0547
            goto L_0x0542
        L_0x0530:
            r0 = r27
            int r0 = r0.A02     // Catch:{ all -> 0x072a }
            goto L_0x0526
        L_0x0535:
            int r0 = X.C86104wH.A0B(r24)     // Catch:{ all -> 0x072a }
            int r0 = r0 - r17
            r12 = r24
            java.lang.Object r0 = r12.get(r0)     // Catch:{ all -> 0x072a }
            goto L_0x0518
        L_0x0542:
            int r16 = r16 + r15
            int r17 = r17 + 1
            goto L_0x04e4
        L_0x0547:
            if (r17 == 0) goto L_0x0589
            int r15 = r21.ordinal()     // Catch:{ all -> 0x072a }
            if (r15 != r6) goto L_0x0554
            int r12 = r11.A03     // Catch:{ all -> 0x072a }
            int r0 = -r12
            r14 = r0
            goto L_0x055e
        L_0x0554:
            int r14 = X.C86104wH.A0B(r24)     // Catch:{ all -> 0x072a }
            int r12 = r11.A03     // Catch:{ all -> 0x072a }
            int r14 = r14 - r12
            int r0 = r17 + -1
            int r14 = r14 - r0
        L_0x055e:
            if (r15 != r6) goto L_0x0563
            int r17 = r17 - r6
            goto L_0x0569
        L_0x0563:
            int r17 = X.C86104wH.A0B(r24)     // Catch:{ all -> 0x072a }
            int r12 = r11.A03     // Catch:{ all -> 0x072a }
        L_0x0569:
            int r17 = r17 - r12
            r0 = r26
            boolean r0 = r0.A05     // Catch:{ all -> 0x072a }
            if (r0 == 0) goto L_0x057e
            X.67E r12 = X.AnonymousClass67E.PREPEND     // Catch:{ all -> 0x072a }
            r0 = r21
            if (r0 != r12) goto L_0x057a
            int r0 = r11.A01     // Catch:{ all -> 0x072a }
            goto L_0x057c
        L_0x057a:
            int r0 = r11.A00     // Catch:{ all -> 0x072a }
        L_0x057c:
            int r13 = r0 + r16
        L_0x057e:
            X.59N r18 = new X.59N     // Catch:{ all -> 0x072a }
            r15 = r18
            r12 = r21
            r0 = r17
            r15.<init>(r12, r14, r0, r13)     // Catch:{ all -> 0x072a }
        L_0x0589:
            if (r18 == 0) goto L_0x0635
            r0 = r18
            int r12 = r0.A00     // Catch:{ all -> 0x072a }
            int r0 = r0.A01     // Catch:{ all -> 0x072a }
            int r12 = r12 - r0
            int r12 = r12 + 1
            java.util.List r0 = r11.A08     // Catch:{ all -> 0x072a }
            r16 = r0
            int r0 = r16.size()     // Catch:{ all -> 0x072a }
            r15 = 0
            if (r12 > r0) goto L_0x070b
            java.util.Map r0 = r11.A09     // Catch:{ all -> 0x072a }
            r13 = r0
            r0 = r18
            X.67E r14 = r0.A03     // Catch:{ all -> 0x072a }
            r13.remove(r14)     // Catch:{ all -> 0x072a }
            X.6vB r0 = r11.A05     // Catch:{ all -> 0x072a }
            r13 = r0
            X.59K r0 = X.AnonymousClass59K.A01     // Catch:{ all -> 0x072a }
            r13.A02(r0, r14)     // Catch:{ all -> 0x072a }
            int r13 = r14.ordinal()     // Catch:{ all -> 0x072a }
            if (r13 == r6) goto L_0x05d7
            r0 = 2
            if (r13 == r0) goto L_0x05bc
            goto L_0x06ff
        L_0x05bc:
            if (r15 >= r12) goto L_0x05cd
            java.util.List r0 = r11.A07     // Catch:{ all -> 0x072a }
            r14 = r0
            r0 = r16
            int r13 = X.C86144wL.A0C(r0, r6)     // Catch:{ all -> 0x072a }
            r14.remove(r13)     // Catch:{ all -> 0x072a }
            int r15 = r15 + 1
            goto L_0x05bc
        L_0x05cd:
            r0 = r18
            int r12 = r0.A02     // Catch:{ all -> 0x072a }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 != r0) goto L_0x05fb
            r12 = 0
            goto L_0x05fb
        L_0x05d7:
            r14 = 0
        L_0x05d8:
            if (r14 >= r12) goto L_0x05e2
            java.util.List r0 = r11.A07     // Catch:{ all -> 0x072a }
            r0.remove(r15)     // Catch:{ all -> 0x072a }
            int r14 = r14 + 1
            goto L_0x05d8
        L_0x05e2:
            int r0 = r11.A03     // Catch:{ all -> 0x072a }
            int r0 = r0 - r12
            r11.A03 = r0     // Catch:{ all -> 0x072a }
            r0 = r18
            int r12 = r0.A02     // Catch:{ all -> 0x072a }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 != r0) goto L_0x05f0
            r12 = 0
        L_0x05f0:
            r11.A01 = r12     // Catch:{ all -> 0x072a }
            int r0 = r11.A04     // Catch:{ all -> 0x072a }
            int r0 = r0 + 1
            r11.A04 = r0     // Catch:{ all -> 0x072a }
            X.4wD r12 = r11.A0B     // Catch:{ all -> 0x072a }
            goto L_0x0605
        L_0x05fb:
            r11.A00 = r12     // Catch:{ all -> 0x072a }
            int r0 = r11.A02     // Catch:{ all -> 0x072a }
            int r0 = r0 + 1
            r11.A02 = r0     // Catch:{ all -> 0x072a }
            X.4wD r12 = r11.A0A     // Catch:{ all -> 0x072a }
        L_0x0605:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x072a }
            r12.D7w(r0)     // Catch:{ all -> 0x072a }
            X.4wD r12 = r4.A08     // Catch:{ all -> 0x072a }
            r5.A03 = r4     // Catch:{ all -> 0x072a }
            r5.A04 = r1     // Catch:{ all -> 0x072a }
            X.C86144wL.A1O(r3, r2, r7, r8, r5)     // Catch:{ all -> 0x072a }
            r0 = r20
            r5.A0D = r0     // Catch:{ all -> 0x072a }
            r5.A0E = r9     // Catch:{ all -> 0x072a }
            r5.A0F = r10     // Catch:{ all -> 0x072a }
            r5.A05 = r11     // Catch:{ all -> 0x072a }
            r0 = 0
            r5.A08 = r0     // Catch:{ all -> 0x072d }
            r0 = 9
            r5.A02 = r0     // Catch:{ all -> 0x072a }
            r0 = r18
            java.lang.Object r12 = r12.Cgt(r0, r5)     // Catch:{ all -> 0x072a }
            r0 = r22
            if (r12 != r0) goto L_0x0635
            goto L_0x070a
        L_0x0632:
            X.AnonymousClass0OU.A00(r12)     // Catch:{ all -> 0x072a }
        L_0x0635:
            int r13 = r3.A00     // Catch:{ all -> 0x072a }
            X.79h r0 = r3.A01     // Catch:{ all -> 0x072a }
            int r12 = r0.A01(r1)     // Catch:{ all -> 0x072a }
            int r0 = r2.A00     // Catch:{ all -> 0x072a }
            int r12 = r12 + r0
            java.lang.Object r0 = r4.A05(r1, r11, r13, r12)     // Catch:{ all -> 0x072a }
            r7.A00 = r0     // Catch:{ all -> 0x072a }
            if (r0 != 0) goto L_0x065b
            X.6vB r12 = r11.A05     // Catch:{ all -> 0x072a }
            X.6bS r0 = r12.A00(r1)     // Catch:{ all -> 0x072a }
            boolean r0 = r0 instanceof X.AnonymousClass59I     // Catch:{ all -> 0x072a }
            if (r0 != 0) goto L_0x065b
            boolean r0 = r8.A00     // Catch:{ all -> 0x072a }
            if (r0 == 0) goto L_0x0674
            X.59K r0 = X.AnonymousClass59K.A00     // Catch:{ all -> 0x072a }
        L_0x0658:
            r12.A02(r0, r1)     // Catch:{ all -> 0x072a }
        L_0x065b:
            r0 = r9
            X.59e r0 = (X.C885659e) r0     // Catch:{ all -> 0x072a }
            X.6qx r12 = r11.A00(r1, r0)     // Catch:{ all -> 0x072a }
            X.4wD r11 = r4.A08     // Catch:{ all -> 0x072a }
            r5.A03 = r4     // Catch:{ all -> 0x072a }
            r5.A04 = r1     // Catch:{ all -> 0x072a }
            X.C86144wL.A1O(r3, r2, r7, r8, r5)     // Catch:{ all -> 0x072a }
            r0 = r20
            r5.A0D = r0     // Catch:{ all -> 0x072a }
            r5.A0E = r9     // Catch:{ all -> 0x072a }
            r5.A0F = r10     // Catch:{ all -> 0x072a }
            goto L_0x0677
        L_0x0674:
            X.59K r0 = X.AnonymousClass59K.A01     // Catch:{ all -> 0x072a }
            goto L_0x0658
        L_0x0677:
            r0 = 0
            r5.A05 = r0     // Catch:{ all -> 0x0728 }
            r5.A08 = r0     // Catch:{ all -> 0x0728 }
            r0 = 10
            r5.A02 = r0     // Catch:{ all -> 0x072a }
            java.lang.Object r9 = r11.Cgt(r12, r5)     // Catch:{ all -> 0x072a }
            r0 = r22
            if (r9 != r0) goto L_0x068a
            goto L_0x0727
        L_0x068a:
            r0 = 0
            r10.A02(r0)
            goto L_0x02cd
        L_0x0690:
            r10 = 0
            goto L_0x0305
        L_0x0693:
            r0 = 0
            goto L_0x02e1
        L_0x0696:
            r1 = move-exception
            r0 = 0
            r10.A02(r0)
            throw r1
        L_0x069c:
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r23)
            throw r1
        L_0x06a1:
            X.6v1 r7 = r7.A00     // Catch:{ all -> 0x06f7 }
            X.59d r9 = (X.C885559d) r9     // Catch:{ all -> 0x06f7 }
            java.lang.Throwable r0 = r9.A00     // Catch:{ all -> 0x06f7 }
            X.59I r9 = new X.59I     // Catch:{ all -> 0x06f7 }
            r9.<init>(r0)     // Catch:{ all -> 0x06f7 }
            r5.A03 = r1     // Catch:{ all -> 0x06f7 }
            r5.A04 = r3     // Catch:{ all -> 0x06f7 }
            r5.A09 = r6     // Catch:{ all -> 0x06f7 }
            r5.A0A = r7     // Catch:{ all -> 0x06f7 }
            r8 = 0
            r5.A0B = r8     // Catch:{ all -> 0x06fa }
            r5.A0C = r8     // Catch:{ all -> 0x06fa }
            r0 = 7
            r5.A02 = r0     // Catch:{ all -> 0x06f7 }
            X.6vB r2 = r7.A05     // Catch:{ all -> 0x06f7 }
            X.6bS r0 = r2.A00(r1)     // Catch:{ all -> 0x06f7 }
            boolean r0 = X.C04220Ms.A0I(r0, r9)     // Catch:{ all -> 0x06f7 }
            if (r0 != 0) goto L_0x06df
            r2.A02(r9, r1)     // Catch:{ all -> 0x06f7 }
            X.4wD r4 = r4.A08     // Catch:{ all -> 0x06f7 }
            X.79c r2 = r2.A01()     // Catch:{ all -> 0x06f7 }
            X.59L r0 = new X.59L     // Catch:{ all -> 0x06f7 }
            r0.<init>(r2, r8)     // Catch:{ all -> 0x06f7 }
            java.lang.Object r2 = r4.Cgt(r0, r5)     // Catch:{ all -> 0x06f7 }
            r0 = r22
            if (r2 != r0) goto L_0x06df
            goto L_0x06e1
        L_0x06df:
            kotlin.Unit r2 = kotlin.Unit.A00     // Catch:{ all -> 0x06f7 }
        L_0x06e1:
            r0 = r22
            if (r2 != r0) goto L_0x06e9
            return r22
        L_0x06e6:
            X.AnonymousClass0OU.A00(r12)     // Catch:{ all -> 0x06f7 }
        L_0x06e9:
            java.util.Map r2 = r7.A09     // Catch:{ all -> 0x06f7 }
            X.79h r0 = r3.A01     // Catch:{ all -> 0x06f7 }
            r2.put(r1, r0)     // Catch:{ all -> 0x06f7 }
            kotlin.Unit r22 = kotlin.Unit.A00     // Catch:{ all -> 0x06f7 }
            r0 = 0
            r6.A02(r0)
            return r22
        L_0x06f7:
            r1 = move-exception
            r8 = 0
            goto L_0x06fb
        L_0x06fa:
            r1 = move-exception
        L_0x06fb:
            r6.A02(r8)
            throw r1
        L_0x06ff:
            java.lang.String r0 = "cannot drop "
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r14)     // Catch:{ all -> 0x072a }
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ all -> 0x072a }
            goto L_0x0726
        L_0x070a:
            return r22
        L_0x070b:
            java.lang.String r2 = "invalid drop count. have "
            int r1 = r16.size()     // Catch:{ all -> 0x072a }
            java.lang.String r0 = " but wanted to drop "
            java.lang.String r0 = X.AnonymousClass00U.A01(r1, r12, r2, r0)     // Catch:{ all -> 0x072a }
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x072a }
            goto L_0x0726
        L_0x071c:
            java.lang.String r1 = "Drop LoadType must be PREPEND or APPEND, but got "
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r1, r0)     // Catch:{ all -> 0x072a }
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ all -> 0x072a }
        L_0x0726:
            throw r0     // Catch:{ all -> 0x072a }
        L_0x0727:
            return r22
        L_0x0728:
            r1 = move-exception
            goto L_0x072e
        L_0x072a:
            r1 = move-exception
            r0 = 0
            goto L_0x072e
        L_0x072d:
            r1 = move-exception
        L_0x072e:
            r10.A02(r0)
            throw r1
        L_0x0732:
            if (r0 == 0) goto L_0x073c
            r0 = 2
            boolean r2 = X.C86164wN.A1P(r0)
            r0 = 1
            if (r2 == r6) goto L_0x073d
        L_0x073c:
            r0 = 0
        L_0x073d:
            if (r0 == 0) goto L_0x0748
            java.lang.Object r0 = r7.A00
            java.lang.String r0 = A07(r1, r12, r0)
            X.C04220Ms.A0B(r0, r6)
        L_0x0748:
            kotlin.Unit r22 = kotlin.Unit.A00
            return r22
        L_0x074b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r23)     // Catch:{ all -> 0x0750 }
            throw r0     // Catch:{ all -> 0x0750 }
        L_0x0750:
            r1 = move-exception
            r0 = 0
            r8.A02(r0)
            throw r1
        L_0x0756:
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r23)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.A01(X.6tY, X.67E, androidx.paging.PageFetcherSnapshot, X.8n9):java.lang.Object");
    }

    public static final Object A02(AnonymousClass67E r3, PageFetcherSnapshot pageFetcherSnapshot, C115416v1 r5, C146958n9 r6) {
        C115476vB r2 = r5.A05;
        C104236bS A002 = r2.A00(r3);
        AnonymousClass59J r1 = AnonymousClass59J.A00;
        if (!C04220Ms.A0I(A002, r1)) {
            r2.A02(r1, r3);
            Object Cgt = pageFetcherSnapshot.A08.Cgt(new AnonymousClass59L(r2.A01(), (C1201779c) null), r6);
            if (Cgt == D0E.COROUTINE_SUSPENDED) {
                return Cgt;
            }
        }
        return Unit.A00;
    }

    public static final String A07(AnonymousClass67E r2, C98486Fs r3, Object obj) {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append("End ");
        if (r3 == null) {
            A0r.append(r2);
            A0r.append(" with loadkey ");
            A0r.append(obj);
            A0r.append(". Load CANCELLED.");
        } else {
            A0r.append(r2);
            A0r.append(" with loadKey ");
            A0r.append(obj);
            A0r.append(". Returned ");
            A0r.append(r3);
        }
        return A0r.toString();
    }

    public static final void A08(PageFetcherSnapshot pageFetcherSnapshot, C83224qz r5) {
        if (pageFetcherSnapshot.A02.A01 != Integer.MIN_VALUE) {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, C86164wN.A0o(pageFetcherSnapshot, (C146958n9) null, 21), r5, 3);
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0401000_I2((Object) pageFetcherSnapshot, (C146958n9) null, 13), r5, 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0401000_I2((Object) pageFetcherSnapshot, (C146958n9) null, 14), r5, 3);
    }

    public PageFetcherSnapshot(PagingConfig pagingConfig, PagingSource pagingSource, C115116uX r8, Object obj, AnonymousClass0ZU r10, C84714tk r11) {
        AnonymousClass0wJ.A1Q(pagingSource, pagingConfig);
        this.A0B = obj;
        this.A03 = pagingSource;
        this.A02 = pagingConfig;
        this.A0A = r11;
        this.A04 = r8;
        this.A06 = r10;
        if (pagingConfig.A01 != Integer.MIN_VALUE) {
            throw C18190wL.A0a("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
        }
        this.A00 = new C111696oA();
        this.A05 = new AtomicBoolean(false);
        this.A08 = new C27444Ena(AnonymousClass006.A00, AnonymousClass743.A00);
        this.A01 = new PageFetcherSnapshotState$Holder(pagingConfig);
        C27437EnT enT = new C27437EnT((C148838sG) null);
        this.A07 = enT;
        this.A09 = new IDxFlowShape94S0200000_2_I2((AnonymousClass0YP) new KtSLambdaShape4S0401000_I2((Object) this, (C146958n9) null, 12), D4V.A00(new KtSLambdaShape8S0301000_I2((Object) new KtSLambdaShape4S0501000_I2((Object) this, (C146958n9) null, 6), (Object) enT, (C146958n9) null, 29)), 29);
    }

    public static final Object A03(AnonymousClass67E r5, PageFetcherSnapshot pageFetcherSnapshot, C1202279h r7, C146958n9 r8) {
        if (r5.ordinal() == 0) {
            Object A062 = A06(pageFetcherSnapshot, r8);
            if (A062 == D0E.COROUTINE_SUSPENDED) {
                return A062;
            }
        } else if (r7 != null) {
            C111696oA r1 = pageFetcherSnapshot.A00;
            if (r5 == AnonymousClass67E.PREPEND || r5 == AnonymousClass67E.APPEND) {
                C110276lP r4 = r1.A00;
                KtLambdaShape48S0200000_I2 ktLambdaShape48S0200000_I2 = new KtLambdaShape48S0200000_I2(15, r5, r7);
                ReentrantLock reentrantLock = r4.A03;
                reentrantLock.lock();
                try {
                    ktLambdaShape48S0200000_I2.invoke(r4.A02, r4.A01);
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                throw C18190wL.A0a(AnonymousClass0wJ.A0t("invalid load type for reset: ", r5));
            }
        } else {
            throw C18180wK.A0a("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        return Unit.A00;
    }
}
