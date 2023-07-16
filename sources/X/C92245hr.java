package X;

import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.view.FormLayout;
import com.fbpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.KtLambdaShape1S2200000_I2;
import kotlin.jvm.internal.KtLambdaShape23S0101000_I2;

/* renamed from: X.5hr  reason: invalid class name and case insensitive filesystem */
public abstract class C92245hr extends C104876cW {
    public List A00 = AnonymousClass0ZV.A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.5hq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: X.5ho} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.5ho} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.5hn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: X.5ho} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: X.5ho} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: X.5ho} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: X.5ho} */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r1 != null) goto L_0x0023;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.view.View r5, java.util.List r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.AnonymousClass5i0
            if (r0 == 0) goto L_0x0043
            r2 = r5
            X.5i0 r2 = (X.AnonymousClass5i0) r2
            X.5hW r1 = r2.A00
            boolean r0 = r1 instanceof X.C92045hV
            if (r0 == 0) goto L_0x002d
            boolean r0 = r4 instanceof X.C92225hp
            if (r0 == 0) goto L_0x0041
            X.5hn r1 = new X.5hn
            r1.<init>()
            java.util.Map r0 = X.C92225hp.A02
            r1.A00 = r2
            r1.A01 = r0
        L_0x001c:
            r1.A03(r2)
        L_0x001f:
            X.5hW r0 = r2.A00
            if (r1 == 0) goto L_0x00b5
        L_0x0023:
            if (r0 == 0) goto L_0x00b5
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            r6.add(r0)
        L_0x002c:
            return
        L_0x002d:
            boolean r0 = r1 instanceof X.C92035hU
            if (r0 == 0) goto L_0x0043
            boolean r0 = r4 instanceof X.C92225hp
            if (r0 == 0) goto L_0x0041
            X.5ho r1 = new X.5ho
            r1.<init>()
            java.util.List r0 = X.C92225hp.A01
            r1.A00 = r2
            r1.A01 = r0
            goto L_0x001c
        L_0x0041:
            r1 = 0
            goto L_0x001f
        L_0x0043:
            boolean r0 = r5 instanceof X.C92325hz
            if (r0 == 0) goto L_0x00b5
            r2 = r5
            X.5hz r2 = (X.C92325hz) r2
            r3 = r4
            boolean r0 = r4 instanceof X.C92225hp
            if (r0 == 0) goto L_0x0063
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
        L_0x0053:
            X.5hq r1 = new X.5hq
            r1.<init>()
            r1.A00 = r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            X.5hR r0 = r2.A04
            goto L_0x0023
        L_0x0063:
            boolean r0 = r4 instanceof X.C92215ho
            if (r0 == 0) goto L_0x0078
            X.5ho r3 = (X.C92215ho) r3
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            java.util.List r1 = r3.A01
            if (r1 != 0) goto L_0x0099
            java.lang.String r0 = "autoFocusFields"
        L_0x0073:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0078:
            X.5hn r3 = (X.C92205hn) r3
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            X.5i0 r0 = r3.A00
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "view"
            goto L_0x0073
        L_0x0085:
            X.5hW r1 = r0.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.form.cell.address.AddressCellViewModel"
            X.C04220Ms.A0C(r1, r0)
            X.5hV r1 = (X.C92045hV) r1
            com.facebook.common.locale.Country r1 = r1.A0O()
            java.util.Map r0 = r3.A01
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "autoFocusFieldsByCountry"
            goto L_0x0073
        L_0x0099:
            X.5hR r0 = r2.A04
            int r0 = r0.A02
            boolean r0 = X.C86144wL.A1W(r0, r1)
            goto L_0x0053
        L_0x00a2:
            java.lang.Object r1 = r0.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x00b3
            X.5hR r0 = r2.A04
            int r0 = r0.A02
            boolean r0 = X.C86144wL.A1W(r0, r1)
            goto L_0x0053
        L_0x00b3:
            r0 = 0
            goto L_0x0053
        L_0x00b5:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x002c
            r2 = 0
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r1 = r5.getChildCount()
        L_0x00c0:
            if (r2 >= r1) goto L_0x002c
            android.view.View r0 = r5.getChildAt(r2)
            r4.A00(r0, r6)
            int r2 = r2 + 1
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92245hr.A00(android.view.View, java.util.List):void");
    }

    public static final void A01(C92245hr r6, FormLayout formLayout) {
        C92325hz r0;
        C92005hR r02;
        for (Pair pair : r6.A00) {
            C104876cW r2 = (C104876cW) pair.A00;
            if (r2 instanceof C92235hq) {
                C92235hq r22 = (C92235hq) r2;
                r22.A02 = null;
                C18190wL.A1Z(r22.A01, true);
            } else {
                r2.A00 = null;
            }
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        r6.A00(formLayout, A0v);
        List A0N = AnonymousClass00J.A0N(A0v);
        r6.A00 = A0N;
        int size = A0N.size();
        for (int i = 0; i < size; i++) {
            C104876cW r3 = (C104876cW) ((Pair) r6.A00.get(i)).A00;
            KtLambdaShape23S0101000_I2 ktLambdaShape23S0101000_I2 = new KtLambdaShape23S0101000_I2(i, 3, r6);
            if (r3 instanceof C92235hq) {
                C92235hq r32 = (C92235hq) r3;
                r32.A02 = ktLambdaShape23S0101000_I2;
                if (!(!C18190wL.A1Z(r32.A01, true) || (r0 = r32.A00) == null || (r02 = r0.A04) == null)) {
                    r02.A01 = ktLambdaShape23S0101000_I2;
                }
            } else {
                r3.A00 = ktLambdaShape23S0101000_I2;
            }
        }
    }

    public static final void A02(C92245hr r6, String str, int i) {
        C92005hR r2;
        C1198277d r22;
        if (i < r6.A00.size()) {
            Pair pair = (Pair) r6.A00.get(i);
            C104876cW r1 = (C104876cW) pair.A00;
            if (!((AnonymousClass7Ih) pair.A01).A0J()) {
                return;
            }
            if (r1 instanceof C92235hq) {
                C92325hz r0 = ((C92235hq) r1).A00;
                if (r0 != null && (r2 = r0.A04) != null) {
                    r2.A0D.A0H(C18180wK.A0Y());
                    FormCellLoggingEvents formCellLoggingEvents = r2.A01;
                    if (formCellLoggingEvents != null && (r22 = r2.A00) != null) {
                        String str2 = formCellLoggingEvents.A00.A03;
                        C128957ke A002 = AnonymousClass7JJ.A00();
                        LoggingContext loggingContext = r22.A01;
                        LinkedHashMap A07 = AnonymousClass7Kr.A07(r22.A00);
                        C04220Ms.A0B(loggingContext, 0);
                        C128957ke.A04(C18180wK.A0I(C86104wH.A0K(A002.A00, "client_focus_autoadvance_atomic"), 244), loggingContext, new KtLambdaShape1S2200000_I2(loggingContext, A07, str2, str, 2));
                        return;
                    }
                    return;
                }
                return;
            }
            A02((C92245hr) r1, str, 0);
            return;
        }
        AnonymousClass0YY r02 = r6.A00;
        if (r02 != null) {
            r02.invoke(str);
        }
    }

    public final void A03(FormLayout formLayout) {
        formLayout.A02 = C86154wM.A11(formLayout, this, 22);
        A01(this, formLayout);
    }
}
