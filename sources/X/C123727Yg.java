package X;

import android.text.Layout;
import android.text.TextPaint;
import com.facebook.react.uimanager.BaseViewManager;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Pair;

/* renamed from: X.7Yg  reason: invalid class name and case insensitive filesystem */
public final class C123727Yg implements C145758l2 {
    public C112336pP A00;
    public final int A01;
    public final C121807If A02;
    public final C113916sN A03;
    public final C143078g4 A04;
    public final C86904zW A05;
    public final CharSequence A06;
    public final C147168nV A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final boolean A0B = C86104wH.A1X(AnonymousClass7ZC.A00.AjJ());

    public final boolean AmN() {
        C112336pP r0 = this.A00;
        if ((r0 == null || !r0.A00()) && (this.A0B || !C86104wH.A1X(AnonymousClass7ZC.A00.AjJ()))) {
            return false;
        }
        return true;
    }

    public final float Atb() {
        return this.A03.A00();
    }

    public final float Avj() {
        C113916sN r6 = this.A03;
        float f = r6.A00;
        if (Float.isNaN(f)) {
            CharSequence charSequence = r6.A05;
            TextPaint textPaint = r6.A04;
            BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
            lineInstance.setText(new AnonymousClass83V(charSequence, charSequence.length()));
            PriorityQueue priorityQueue = new PriorityQueue(10, C1366283o.A00);
            int next = lineInstance.next();
            int i = next;
            int i2 = 0;
            while (next != -1) {
                if (priorityQueue.size() >= 10) {
                    Pair pair = (Pair) priorityQueue.peek();
                    if (pair != null && AnonymousClass0wJ.A04(pair.A01) - AnonymousClass0wJ.A04(pair.A00) < next - i2) {
                        priorityQueue.poll();
                    }
                    next = lineInstance.next();
                    i2 = i;
                    i = next;
                }
                priorityQueue.add(C18180wK.A0p(Integer.valueOf(i2), Integer.valueOf(next)));
                next = lineInstance.next();
                i2 = i;
                i = next;
            }
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                Pair pair2 = (Pair) it.next();
                f = Math.max(f, Layout.getDesiredWidth(charSequence, AnonymousClass0wJ.A04(pair2.A00), AnonymousClass0wJ.A04(pair2.A01), textPaint));
            }
            r6.A00 = f;
        }
        return f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v89, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: type inference failed for: r1v35, types: [java.util.AbstractCollection] */
    /* JADX WARNING: type inference failed for: r4v65, types: [X.7QO] */
    /* JADX WARNING: type inference failed for: r1v48, types: [java.lang.CharSequence] */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0282, code lost:
        if (X.AnonymousClass7Hi.A04(r4.A03) != false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0148, code lost:
        if (r1 == 1) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0219, code lost:
        if (java.lang.Float.intBitsToFloat(X.C86104wH.A08(r4)) == com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0225, code lost:
        if (r1 == X.AnonymousClass7KE.A05) goto L_0x0227;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x061e  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x064d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x06ac  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x072c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0789  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e6 A[LOOP:0: B:41:0x00e0->B:43:0x00e6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C123727Yg(X.C121807If r45, X.C143078g4 r46, X.C147168nV r47, java.lang.String r48, java.util.List r49, java.util.List r50) {
        /*
            r44 = this;
            r20 = r49
            r8 = 1
            r6 = 4
            r0 = r44
            r0.<init>()
            r1 = r48
            r0.A08 = r1
            r4 = r45
            r0.A02 = r4
            r1 = r20
            r0.A0A = r1
            r1 = r50
            r0.A09 = r1
            r1 = r46
            r0.A04 = r1
            r11 = r47
            r0.A07 = r11
            float r1 = r11.Acr()
            X.4zW r10 = new X.4zW
            r10.<init>(r1)
            r0.A05 = r10
            r3 = 0
            X.8g7 r1 = X.AnonymousClass7ZC.A00
            X.4oM r1 = r1.AjJ()
            boolean r1 = X.C86104wH.A1X(r1)
            r0.A0B = r1
            X.7Ex r2 = r4.A00
            X.6t3 r1 = r2.A09
            X.7F0 r7 = r4.A02
            X.83Y r5 = r7.A0A
            if (r1 == 0) goto L_0x012d
            int r9 = r1.A00
            if (r9 == r6) goto L_0x014a
            r4 = 1
            r1 = 5
            if (r9 == r1) goto L_0x0152
            if (r9 != r8) goto L_0x0120
            r4 = 0
        L_0x004e:
            r0.A01 = r4
            kotlin.jvm.internal.KtLambdaShape173S0100000_I2 r9 = X.C86164wN.A0x(r0, r6)
            X.79X r13 = r2.A0B
            r4 = 0
            if (r13 != 0) goto L_0x005b
            X.79X r13 = X.AnonymousClass79X.A02
        L_0x005b:
            boolean r12 = r13.A01
            int r2 = r10.getFlags()
            r1 = r2 & -129(0xffffffffffffff7f, float:NaN)
            if (r12 == 0) goto L_0x0067
            r1 = r2 | 128(0x80, float:1.794E-43)
        L_0x0067:
            r10.setFlags(r1)
            int r1 = r13.A00
            if (r1 != r8) goto L_0x011a
            int r1 = r10.getFlags()
            r1 = r1 | 64
            r10.setFlags(r1)
        L_0x0077:
            r10.setHinting(r4)
            boolean r21 = X.C18190wL.A1a(r20)
            long r1 = r7.A01
            long r14 = X.AnonymousClass7HC.A00(r1)
            r12 = 4294967296(0x100000000, double:2.121995791E-314)
            r16 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0102
            float r4 = r11.CxK(r1)
        L_0x0096:
            r10.setTextSize(r4)
        L_0x0099:
            X.72l r13 = r7.A06
            if (r13 != 0) goto L_0x00a5
            X.6su r1 = r7.A07
            if (r1 != 0) goto L_0x00a5
            X.7yQ r1 = r7.A09
            if (r1 == 0) goto L_0x00ca
        L_0x00a5:
            X.7yQ r12 = r7.A09
            if (r12 != 0) goto L_0x00ab
            X.7yQ r12 = X.C134817yQ.A04
        L_0x00ab:
            X.6su r1 = r7.A07
            if (r1 == 0) goto L_0x0100
            int r1 = r1.A00
        L_0x00b1:
            X.6su r4 = new X.6su
            r4.<init>(r1)
            X.6sv r1 = r7.A08
            if (r1 == 0) goto L_0x00fe
            int r2 = r1.A00
        L_0x00bc:
            X.6sv r1 = new X.6sv
            r1.<init>(r2)
            java.lang.Object r1 = r9.invoke(r13, r12, r4, r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r10.setTypeface(r1)
        L_0x00ca:
            if (r5 == 0) goto L_0x016c
            X.8g6 r1 = X.C102886Wx.A00
            X.83Y r1 = r1.Ab9()
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x016c
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x00e0:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0155
            java.lang.Object r1 = r5.next()
            X.79B r1 = (X.AnonymousClass79B) r1
            X.C04220Ms.A0B(r1, r3)
            X.8dH r4 = r1.A00
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            X.C04220Ms.A0C(r4, r1)
            X.7ZA r4 = (X.AnonymousClass7ZA) r4
            java.util.Locale r1 = r4.A00
            r2.add(r1)
            goto L_0x00e0
        L_0x00fe:
            r2 = 1
            goto L_0x00bc
        L_0x0100:
            r1 = 0
            goto L_0x00b1
        L_0x0102:
            r12 = 8589934592(0x200000000, double:4.243991582E-314)
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0099
            float r4 = r10.getTextSize()
            int r1 = X.C86104wH.A08(r1)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r4 = r4 * r1
            goto L_0x0096
        L_0x011a:
            r10.getFlags()
            r4 = 1
            goto L_0x0077
        L_0x0120:
            r1 = 2
            if (r9 == r1) goto L_0x004e
            r1 = 3
            if (r9 == r1) goto L_0x012d
            java.lang.String r0 = "Invalid TextDirection."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x012d:
            if (r5 == 0) goto L_0x014d
            java.util.List r1 = r5.A01
            java.lang.Object r1 = r1.get(r3)
            X.79B r1 = (X.AnonymousClass79B) r1
            X.8dH r4 = r1.A00
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            X.C04220Ms.A0C(r4, r1)
            X.7ZA r4 = (X.AnonymousClass7ZA) r4
            java.util.Locale r1 = r4.A00
        L_0x0142:
            int r1 = android.text.TextUtils.getLayoutDirectionFromLocale(r1)
            if (r1 == 0) goto L_0x014a
            if (r1 == r8) goto L_0x0152
        L_0x014a:
            r4 = 2
            goto L_0x004e
        L_0x014d:
            java.util.Locale r1 = java.util.Locale.getDefault()
            goto L_0x0142
        L_0x0152:
            r4 = 3
            goto L_0x004e
        L_0x0155:
            java.util.Locale[] r1 = new java.util.Locale[r3]
            java.lang.Object[] r2 = r2.toArray(r1)
            java.util.Locale[] r2 = (java.util.Locale[]) r2
            int r1 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.util.Locale[] r2 = (java.util.Locale[]) r2
            android.os.LocaleList r1 = new android.os.LocaleList
            r1.<init>(r2)
            r10.setTextLocales(r1)
        L_0x016c:
            java.lang.String r2 = r7.A0F
            if (r2 == 0) goto L_0x017b
            java.lang.String r1 = ""
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x017b
            r10.setFontFeatureSettings(r2)
        L_0x017b:
            X.7Ei r4 = r7.A0E
            if (r4 == 0) goto L_0x019b
            X.7Ei r1 = X.C121147Ei.A02
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x019b
            float r2 = r10.getTextScaleX()
            float r1 = r4.A00
            float r2 = r2 * r1
            r10.setTextScaleX(r2)
            float r2 = r10.getTextSkewX()
            float r1 = r4.A01
            float r2 = r2 + r1
            r10.setTextSkewX(r2)
        L_0x019b:
            X.8nH r4 = r7.A0D
            long r1 = r4.AYH()
            long r18 = X.AnonymousClass7KE.A06
            int r5 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r5 == 0) goto L_0x01b6
            X.8mB r5 = r10.A03
            r5.CjA(r1)
            r1 = 0
            X.7X0 r5 = (X.AnonymousClass7X0) r5
            r5.A02 = r1
            android.graphics.Paint r2 = r5.A01
            r2.setShader(r1)
        L_0x01b6:
            X.6nD r5 = r4.AUS()
            long r1 = X.AnonymousClass7JK.A01
            float r4 = r4.AQV()
            r10.A00(r5, r4, r1)
            X.79b r1 = r7.A03
            r10.A01(r1)
            X.79I r1 = r7.A0C
            r10.A03(r1)
            X.6Eh r1 = r7.A04
            r10.A02(r1)
            long r4 = r7.A02
            long r12 = X.AnonymousClass7HC.A00(r4)
            int r1 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x0789
            int r1 = X.C86104wH.A08(r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12 = 0
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0789
            float r2 = r10.getTextSize()
            float r1 = r10.getTextScaleX()
            float r2 = r2 * r1
            float r11 = r11.CxK(r4)
            int r1 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x01fe
            float r11 = r11 / r2
        L_0x01fb:
            r10.setLetterSpacing(r11)
        L_0x01fe:
            long r1 = r7.A00
            X.6sx r10 = r7.A0B
            r14 = 1
            if (r21 == 0) goto L_0x021b
            long r11 = X.AnonymousClass7HC.A00(r4)
            int r7 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r7 != 0) goto L_0x021b
            int r7 = X.C86104wH.A08(r4)
            float r11 = java.lang.Float.intBitsToFloat(r7)
            r7 = 0
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            r13 = 1
            if (r7 != 0) goto L_0x021c
        L_0x021b:
            r13 = 0
        L_0x021c:
            int r7 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x0227
            long r11 = X.AnonymousClass7KE.A05
            int r7 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            r12 = 1
            if (r7 != 0) goto L_0x0228
        L_0x0227:
            r12 = 0
        L_0x0228:
            if (r10 == 0) goto L_0x0233
            float r11 = r10.A00
            r7 = 0
            int r7 = java.lang.Float.compare(r11, r7)
            if (r7 != 0) goto L_0x0234
        L_0x0233:
            r14 = 0
        L_0x0234:
            r22 = 0
            if (r13 != 0) goto L_0x0731
            if (r12 != 0) goto L_0x072f
            if (r14 != 0) goto L_0x072f
        L_0x023c:
            java.lang.String r7 = r0.A08
            X.4zW r1 = r0.A05
            float r22 = r1.getTextSize()
            X.7If r10 = r0.A02
            java.util.List r1 = r0.A09
            r43 = r1
            X.8nV r1 = r0.A07
            r42 = r1
            boolean r1 = r0.A0B
            if (r1 == 0) goto L_0x072c
            X.Jmx r1 = X.C37231Jmx.A09
            if (r1 == 0) goto L_0x072c
            X.Jmx r1 = X.C37231Jmx.A00()
            java.lang.CharSequence r1 = r1.A02(r7)
            X.C04220Ms.A0A(r1)
        L_0x0261:
            X.C04220Ms.A09(r1)
            boolean r2 = r20.isEmpty()
            if (r2 == 0) goto L_0x0292
            boolean r2 = r43.isEmpty()
            if (r2 == 0) goto L_0x0292
            X.7Ex r4 = r10.A00
            X.79W r5 = r4.A0A
            X.79W r2 = X.AnonymousClass79W.A02
            boolean r2 = X.C04220Ms.A0I(r5, r2)
            if (r2 == 0) goto L_0x0292
            long r4 = r4.A03
            boolean r2 = X.AnonymousClass7Hi.A04(r4)
            if (r2 == 0) goto L_0x0292
        L_0x0284:
            r0.A06 = r1
            X.4zW r4 = r0.A05
            int r3 = r0.A01
            X.6sN r2 = new X.6sN
            r2.<init>(r4, r1, r3)
            r0.A03 = r2
            return
        L_0x0292:
            boolean r2 = r1 instanceof android.text.Spannable
            if (r2 != 0) goto L_0x029c
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r1)
            r1 = r2
        L_0x029c:
            android.text.Spannable r1 = (android.text.Spannable) r1
            X.7F0 r2 = r10.A02
            X.79I r5 = r2.A0C
            X.79I r21 = X.AnonymousClass79I.A03
            r4 = r21
            boolean r4 = X.C04220Ms.A0I(r5, r4)
            if (r4 == 0) goto L_0x02ba
            X.4zX r5 = X.C102896Wy.A00
            int r7 = r7.length()
            X.C04220Ms.A0B(r1, r3)
            r4 = 33
            r1.setSpan(r5, r3, r7, r4)
        L_0x02ba:
            X.79N r4 = r10.A01
            if (r4 == 0) goto L_0x02c6
            X.79A r4 = r4.A00
            if (r4 == 0) goto L_0x02c6
            boolean r4 = r4.A00
            if (r4 == 0) goto L_0x03c9
        L_0x02c6:
            X.7Ex r7 = r10.A00
            X.795 r4 = r7.A07
            if (r4 != 0) goto L_0x03c9
            long r4 = r7.A03
            X.C04220Ms.A0B(r1, r3)
            long r12 = X.AnonymousClass7HC.A00(r4)
            int r6 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x03b0
            r6 = r42
            float r5 = r6.CxK(r4)
        L_0x02df:
            boolean r4 = java.lang.Float.isNaN(r5)
            if (r4 != 0) goto L_0x02f3
            X.7QO r4 = new X.7QO
            r4.<init>(r5)
        L_0x02ea:
            int r6 = r1.length()
            r5 = 33
            r1.setSpan(r4, r3, r6, r5)
        L_0x02f3:
            X.79W r10 = r7.A0A
            if (r10 == 0) goto L_0x030b
            long r6 = r10.A00
            long r11 = X.AnonymousClass7Hi.A03(r3)
            int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x0340
            long r4 = r10.A01
            long r12 = X.AnonymousClass7Hi.A03(r3)
            int r11 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x0340
        L_0x030b:
            java.util.ArrayList r6 = X.C18200wM.A0t(r20)
            int r12 = r20.size()
            r11 = 0
        L_0x0314:
            if (r11 >= r12) goto L_0x0429
            r4 = r20
            java.lang.Object r10 = r4.get(r11)
            r7 = r10
            X.7HE r7 = (X.AnonymousClass7HE) r7
            java.lang.Object r5 = r7.A02
            X.7F0 r5 = (X.AnonymousClass7F0) r5
            X.C04220Ms.A0B(r5, r3)
            X.72l r4 = r5.A06
            if (r4 != 0) goto L_0x033a
            X.6su r4 = r5.A07
            if (r4 != 0) goto L_0x033a
            X.7yQ r4 = r5.A09
            if (r4 != 0) goto L_0x033a
            java.lang.Object r4 = r7.A02
            X.7F0 r4 = (X.AnonymousClass7F0) r4
            X.6sv r4 = r4.A08
            if (r4 == 0) goto L_0x033d
        L_0x033a:
            r6.add(r10)
        L_0x033d:
            int r11 = r11 + 1
            goto L_0x0314
        L_0x0340:
            boolean r4 = X.AnonymousClass7Hi.A04(r6)
            if (r4 != 0) goto L_0x030b
            long r4 = r10.A01
            boolean r10 = X.AnonymousClass7Hi.A04(r4)
            if (r10 != 0) goto L_0x030b
            long r14 = X.AnonymousClass7HC.A00(r6)
            int r10 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            boolean r10 = X.C18180wK.A1W(r10)
            r13 = 0
            if (r10 == 0) goto L_0x039a
            r10 = r42
            float r7 = r10.CxK(r6)
        L_0x0361:
            long r14 = X.AnonymousClass7HC.A00(r4)
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x0386
            r6 = r42
            float r13 = r6.CxK(r4)
        L_0x036f:
            int r5 = X.C86124wJ.A03(r7)
            int r4 = X.C86124wJ.A03(r13)
            android.text.style.LeadingMarginSpan$Standard r6 = new android.text.style.LeadingMarginSpan$Standard
            r6.<init>(r5, r4)
            int r5 = r1.length()
            r4 = 33
            r1.setSpan(r6, r3, r5, r4)
            goto L_0x030b
        L_0x0386:
            r10 = 8589934592(0x200000000, double:4.243991582E-314)
            int r6 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x036f
            int r4 = X.C86104wH.A08(r4)
            float r13 = java.lang.Float.intBitsToFloat(r4)
            float r13 = r13 * r22
            goto L_0x036f
        L_0x039a:
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            int r10 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x03ae
            int r6 = X.C86104wH.A08(r6)
            float r7 = java.lang.Float.intBitsToFloat(r6)
            float r7 = r7 * r22
            goto L_0x0361
        L_0x03ae:
            r7 = 0
            goto L_0x0361
        L_0x03b0:
            r10 = 8589934592(0x200000000, double:4.243991582E-314)
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x03c5
            int r4 = X.C86104wH.A08(r4)
            float r5 = java.lang.Float.intBitsToFloat(r4)
            float r5 = r5 * r22
            goto L_0x02df
        L_0x03c5:
            r5 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x02df
        L_0x03c9:
            X.7Ex r7 = r10.A00
            X.795 r10 = r7.A07
            if (r10 != 0) goto L_0x03d1
            X.795 r10 = X.AnonymousClass795.A00
        L_0x03d1:
            long r4 = r7.A03
            X.C04220Ms.A0B(r1, r3)
            X.C04220Ms.A0B(r10, r6)
            long r12 = X.AnonymousClass7HC.A00(r4)
            int r6 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x0412
            r6 = r42
            float r11 = r6.CxK(r4)
        L_0x03e7:
            boolean r4 = java.lang.Float.isNaN(r11)
            if (r4 != 0) goto L_0x02f3
            int r4 = r1.length()
            if (r4 == 0) goto L_0x040b
            char r5 = X.AnonymousClass8bN.A0C(r1)
            r4 = 10
            if (r5 == r4) goto L_0x040b
            int r13 = r1.length()
        L_0x03ff:
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.7QP r4 = new X.7QP
            r10 = r4
            r14 = r8
            r15 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x02ea
        L_0x040b:
            int r4 = r1.length()
            int r13 = r4 + 1
            goto L_0x03ff
        L_0x0412:
            r10 = 8589934592(0x200000000, double:4.243991582E-314)
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0426
            int r4 = X.C86104wH.A08(r4)
            float r11 = java.lang.Float.intBitsToFloat(r4)
            float r11 = r11 * r22
            goto L_0x03e7
        L_0x0426:
            r11 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x03e7
        L_0x0429:
            X.72l r10 = r2.A06
            if (r10 != 0) goto L_0x061e
            X.6su r4 = r2.A07
            if (r4 != 0) goto L_0x061e
            X.7yQ r4 = r2.A09
            if (r4 != 0) goto L_0x061e
            X.6sv r4 = r2.A08
            if (r4 != 0) goto L_0x061e
            r7 = 0
        L_0x043a:
            r2 = 16
            kotlin.jvm.internal.KtLambdaShape50S0200000_I2 r11 = new kotlin.jvm.internal.KtLambdaShape50S0200000_I2
            r11.<init>(r2, r1, r9)
            int r2 = r6.size()
            if (r2 > r8) goto L_0x05a3
            boolean r2 = X.C18190wL.A1a(r6)
            if (r2 == 0) goto L_0x046e
            X.7HE r2 = X.C86154wM.A0H(r6, r3)
            java.lang.Object r5 = r2.A02
            X.7F0 r5 = (X.AnonymousClass7F0) r5
            if (r7 == 0) goto L_0x045b
            X.7F0 r5 = r7.A01(r5)
        L_0x045b:
            X.7HE r2 = X.C86154wM.A0H(r6, r3)
            int r2 = r2.A01
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            X.7HE r2 = X.C86154wM.A0H(r6, r3)
            int r2 = r2.A00
            X.C86104wH.A1R(r5, r4, r11, r2)
        L_0x046e:
            int r10 = r20.size()
            r9 = 0
            r8 = 0
            r14 = 0
        L_0x0475:
            if (r8 >= r10) goto L_0x064b
            r2 = r20
            X.7HE r7 = X.C86154wM.A0H(r2, r8)
            int r4 = r7.A01
            int r3 = r7.A00
            if (r4 < 0) goto L_0x058d
            int r2 = r1.length()
            if (r4 >= r2) goto L_0x058d
            if (r3 <= r4) goto L_0x058d
            int r2 = r1.length()
            if (r3 > r2) goto L_0x058d
            int r6 = r7.A01
            int r5 = r7.A00
            java.lang.Object r4 = r7.A02
            X.7F0 r4 = (X.AnonymousClass7F0) r4
            X.6sx r2 = r4.A0B
            if (r2 == 0) goto L_0x04a9
            float r2 = r2.A00
            X.4zm r3 = new X.4zm
            r3.<init>(r2)
            r2 = 33
            r1.setSpan(r3, r6, r5, r2)
        L_0x04a9:
            X.8nH r11 = r4.A0D
            long r2 = r11.AYH()
            X.AnonymousClass7As.A00(r1, r6, r5, r2)
            X.6nD r2 = r11.AUS()
            float r11 = r11.AQV()
            if (r2 == 0) goto L_0x04c7
            boolean r3 = r2 instanceof X.C876253m
            if (r3 == 0) goto L_0x0591
            X.53m r2 = (X.C876253m) r2
            long r2 = r2.A00
            X.AnonymousClass7As.A00(r1, r6, r5, r2)
        L_0x04c7:
            X.79I r3 = r4.A0C
            if (r3 == 0) goto L_0x04ed
            r2 = r21
            X.C04220Ms.A0B(r2, r9)
            int r3 = r3.A00
            r2 = r3 | 1
            boolean r11 = X.AnonymousClass0wJ.A1T(r2, r3)
            X.79I r2 = X.AnonymousClass79I.A01
            X.C04220Ms.A0B(r2, r9)
            r2 = r3 | 2
            boolean r2 = X.AnonymousClass0wJ.A1T(r2, r3)
            X.4zY r3 = new X.4zY
            r3.<init>(r11, r2)
            r2 = 33
            r1.setSpan(r3, r6, r5, r2)
        L_0x04ed:
            long r2 = r4.A01
            r22 = r1
            r23 = r42
            r24 = r6
            r25 = r5
            r26 = r2
            X.AnonymousClass7As.A02(r22, r23, r24, r25, r26)
            java.lang.String r2 = r4.A0F
            if (r2 == 0) goto L_0x050a
            X.4zn r3 = new X.4zn
            r3.<init>(r2)
            r2 = 33
            r1.setSpan(r3, r6, r5, r2)
        L_0x050a:
            X.7Ei r3 = r4.A0E
            if (r3 == 0) goto L_0x0524
            float r11 = r3.A00
            android.text.style.ScaleXSpan r2 = new android.text.style.ScaleXSpan
            r2.<init>(r11)
            r11 = 33
            r1.setSpan(r2, r6, r5, r11)
            float r3 = r3.A01
            X.4zq r2 = new X.4zq
            r2.<init>(r3)
            r1.setSpan(r2, r6, r5, r11)
        L_0x0524:
            X.83Y r2 = r4.A0A
            X.AnonymousClass7As.A01(r1, r2, r6, r5)
            long r2 = r4.A00
            int r11 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r11 == 0) goto L_0x053d
            int r2 = X.C121657He.A01(r2)
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            r3.<init>(r2)
            r2 = 33
            r1.setSpan(r3, r6, r5, r2)
        L_0x053d:
            X.79b r11 = r4.A03
            if (r11 == 0) goto L_0x0563
            long r2 = r11.A01
            int r13 = X.C121657He.A01(r2)
            long r2 = r11.A02
            float r12 = X.AnonymousClass7KC.A01(r2)
            float r3 = X.AnonymousClass7KC.A02(r2)
            float r11 = r11.A00
            r2 = 0
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0559
            r11 = 1
        L_0x0559:
            X.4zZ r2 = new X.4zZ
            r2.<init>(r12, r3, r11, r13)
            r3 = 33
            r1.setSpan(r2, r6, r5, r3)
        L_0x0563:
            X.6Eh r2 = r4.A04
            if (r2 == 0) goto L_0x0571
            X.4zb r3 = new X.4zb
            r3.<init>(r2)
            r2 = 33
            r1.setSpan(r3, r6, r5, r2)
        L_0x0571:
            java.lang.Object r2 = r7.A02
            X.7F0 r2 = (X.AnonymousClass7F0) r2
            long r2 = r2.A02
            long r5 = X.AnonymousClass7HC.A00(r2)
            int r4 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x058c
            long r5 = X.AnonymousClass7HC.A00(r2)
            r3 = 8589934592(0x200000000, double:4.243991582E-314)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x058d
        L_0x058c:
            r14 = 1
        L_0x058d:
            int r8 = r8 + 1
            goto L_0x0475
        L_0x0591:
            boolean r3 = r2 instanceof X.C876753r
            if (r3 == 0) goto L_0x04c7
            X.53r r2 = (X.C876753r) r2
            X.4zc r3 = new X.4zc
            r3.<init>(r2, r11)
            r2 = 33
            r1.setSpan(r3, r6, r5, r2)
            goto L_0x04c7
        L_0x05a3:
            int r9 = r6.size()
            int r12 = r9 << 1
            java.lang.Integer[] r10 = new java.lang.Integer[r12]
            r2 = 0
        L_0x05ac:
            if (r2 >= r12) goto L_0x05b4
            X.C86164wN.A1O(r10, r3, r2)
            int r2 = r2 + 1
            goto L_0x05ac
        L_0x05b4:
            int r5 = r6.size()
            r4 = 0
        L_0x05b9:
            if (r4 >= r5) goto L_0x05ce
            X.7HE r2 = X.C86154wM.A0H(r6, r4)
            int r3 = r2.A01
            X.C86164wN.A1O(r10, r3, r4)
            int r3 = r4 + r9
            int r2 = r2.A00
            X.C86164wN.A1O(r10, r2, r3)
            int r4 = r4 + 1
            goto L_0x05b9
        L_0x05ce:
            if (r12 <= r8) goto L_0x05d3
            java.util.Arrays.sort(r10)
        L_0x05d3:
            java.lang.Object r2 = X.AnonymousClass8AP.A05(r10)
            int r14 = X.AnonymousClass0wJ.A04(r2)
            r13 = 0
        L_0x05dc:
            if (r13 >= r12) goto L_0x046e
            r2 = r10[r13]
            int r9 = r2.intValue()
            if (r9 == r14) goto L_0x061b
            int r8 = r6.size()
            r2 = r7
            r5 = 0
        L_0x05ec:
            if (r5 >= r8) goto L_0x0611
            X.7HE r15 = X.C86154wM.A0H(r6, r5)
            int r4 = r15.A01
            int r3 = r15.A00
            if (r4 == r3) goto L_0x0609
            int r4 = r15.A01
            int r3 = r15.A00
            boolean r3 = X.AnonymousClass7G7.A02(r14, r9, r4, r3)
            if (r3 == 0) goto L_0x0609
            java.lang.Object r3 = r15.A02
            X.7F0 r3 = (X.AnonymousClass7F0) r3
            if (r2 != 0) goto L_0x060c
            r2 = r3
        L_0x0609:
            int r5 = r5 + 1
            goto L_0x05ec
        L_0x060c:
            X.7F0 r2 = r2.A01(r3)
            goto L_0x0609
        L_0x0611:
            if (r2 == 0) goto L_0x061a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            X.C86104wH.A1R(r2, r3, r11, r9)
        L_0x061a:
            r14 = r9
        L_0x061b:
            int r13 = r13 + 1
            goto L_0x05dc
        L_0x061e:
            X.7yQ r5 = r2.A09
            X.6su r4 = r2.A07
            X.6sv r2 = r2.A08
            r34 = 0
            r23 = 0
            r33 = 16323(0x3fc3, float:2.2873E-41)
            X.7F0 r7 = new X.7F0
            r22 = r7
            r24 = r10
            r25 = r4
            r26 = r2
            r27 = r5
            r28 = r23
            r29 = r23
            r30 = r23
            r31 = r23
            r32 = r23
            r36 = r34
            r38 = r34
            r40 = r34
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r40)
            goto L_0x043a
        L_0x064b:
            if (r14 == 0) goto L_0x06a5
            int r7 = r20.size()
        L_0x0651:
            if (r9 >= r7) goto L_0x06a5
            r2 = r20
            X.7HE r2 = X.C86154wM.A0H(r2, r9)
            int r6 = r2.A01
            int r5 = r2.A00
            java.lang.Object r3 = r2.A02
            X.7F0 r3 = (X.AnonymousClass7F0) r3
            if (r6 < 0) goto L_0x068b
            int r2 = r1.length()
            if (r6 >= r2) goto L_0x068b
            if (r5 <= r6) goto L_0x068b
            int r2 = r1.length()
            if (r5 > r2) goto L_0x068b
            long r3 = r3.A02
            long r12 = X.AnonymousClass7HC.A00(r3)
            int r2 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x068e
            r2 = r42
            float r3 = r2.CxK(r3)
            X.4zp r2 = new X.4zp
            r2.<init>(r3)
        L_0x0686:
            r3 = 33
            r1.setSpan(r2, r6, r5, r3)
        L_0x068b:
            int r9 = r9 + 1
            goto L_0x0651
        L_0x068e:
            r10 = 8589934592(0x200000000, double:4.243991582E-314)
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x068b
            int r2 = X.C86104wH.A08(r3)
            float r3 = java.lang.Float.intBitsToFloat(r2)
            X.4zo r2 = new X.4zo
            r2.<init>(r3)
            goto L_0x0686
        L_0x06a5:
            int r7 = r43.size()
            r6 = 0
        L_0x06aa:
            if (r6 >= r7) goto L_0x0284
            r2 = r43
            X.7HE r2 = X.C86154wM.A0H(r2, r6)
            java.lang.Object r10 = r2.A02
            X.6tV r10 = (X.C114566tV) r10
            int r5 = r2.A01
            int r4 = r2.A00
            java.lang.Class<X.I3G> r2 = X.I3G.class
            java.lang.Object[] r9 = r1.getSpans(r5, r4, r2)
            X.C04220Ms.A06(r9)
            int r8 = r9.length
            r3 = 0
        L_0x06c5:
            if (r3 >= r8) goto L_0x06cf
            r2 = r9[r3]
            r1.removeSpan(r2)
            int r3 = r3 + 1
            goto L_0x06c5
        L_0x06cf:
            long r2 = r10.A01
            int r8 = X.C86104wH.A08(r2)
            float r19 = java.lang.Float.intBitsToFloat(r8)
            long r11 = X.AnonymousClass7HC.A00(r2)
            int r2 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x071e
            r22 = 0
        L_0x06e3:
            long r2 = r10.A00
            int r8 = X.C86104wH.A08(r2)
            float r20 = java.lang.Float.intBitsToFloat(r8)
            long r10 = X.AnonymousClass7HC.A00(r2)
            int r2 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0710
            r23 = 0
        L_0x06f7:
            float r21 = r42.AjK()
            float r2 = r42.Acr()
            float r21 = r21 * r2
            X.4zv r3 = new X.4zv
            r18 = r3
            r18.<init>(r19, r20, r21, r22, r23)
            r2 = 33
            r1.setSpan(r3, r5, r4, r2)
            int r6 = r6 + 1
            goto L_0x06aa
        L_0x0710:
            r8 = 8589934592(0x200000000, double:4.243991582E-314)
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            r23 = 2
            if (r2 != 0) goto L_0x06f7
            r23 = 1
            goto L_0x06f7
        L_0x071e:
            r8 = 8589934592(0x200000000, double:4.243991582E-314)
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            r22 = 2
            if (r2 != 0) goto L_0x06e3
            r22 = 1
            goto L_0x06e3
        L_0x072c:
            r1 = r7
            goto L_0x0261
        L_0x072f:
            long r4 = X.AnonymousClass7HC.A01
        L_0x0731:
            if (r12 != 0) goto L_0x0735
            r1 = r18
        L_0x0735:
            r28 = r22
            if (r14 == 0) goto L_0x073b
            r28 = r10
        L_0x073b:
            r33 = 0
            r32 = 13951(0x367f, float:1.955E-41)
            X.7F0 r7 = new X.7F0
            r21 = r7
            r23 = r22
            r24 = r22
            r25 = r22
            r26 = r22
            r27 = r22
            r29 = r22
            r30 = r22
            r31 = r22
            r35 = r33
            r37 = r4
            r39 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37, r39)
            int r1 = r20.size()
            int r5 = r1 + 1
            java.util.ArrayList r20 = X.C18240wQ.A0k(r5)
            r4 = 0
        L_0x0767:
            if (r4 >= r5) goto L_0x023c
            if (r4 != 0) goto L_0x0780
            java.lang.String r1 = r0.A08
            int r10 = r1.length()
            java.lang.String r1 = ""
            X.7HE r2 = new X.7HE
            r2.<init>(r7, r1, r3, r10)
        L_0x0778:
            r1 = r20
            r1.add(r2)
            int r4 = r4 + 1
            goto L_0x0767
        L_0x0780:
            java.util.List r2 = r0.A0A
            int r1 = r4 + -1
            java.lang.Object r2 = r2.get(r1)
            goto L_0x0778
        L_0x0789:
            long r13 = X.AnonymousClass7HC.A00(r4)
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x01fe
            int r1 = X.C86104wH.A08(r4)
            float r11 = java.lang.Float.intBitsToFloat(r1)
            goto L_0x01fb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123727Yg.<init>(X.7If, X.8g4, X.8nV, java.lang.String, java.util.List, java.util.List):void");
    }
}
