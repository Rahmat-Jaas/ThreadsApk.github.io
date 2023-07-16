package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.C10230hw;
import X.C146958n9;
import X.C149718uc;
import X.C18220wO;
import X.C21839C2o;
import X.C25364DkP;
import X.C39142Kno;
import android.content.Context;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0600000_I2;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.service.session.UserSession;
import kotlin.Unit;

public class KtSLambdaShape1S0801000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0801000_I2(Context context, KtCSuperShape0S0600000_I2 ktCSuperShape0S0600000_I2, C149718uc r4, C10230hw r5, C21839C2o c2o, UserSession userSession, C146958n9 r8, AnonymousClass0YY r9) {
        super(2, r8);
        this.A09 = 1;
        this.A07 = r4;
        this.A04 = ktCSuperShape0S0600000_I2;
        this.A02 = context;
        this.A06 = userSession;
        this.A05 = c2o;
        this.A03 = r5;
        this.A01 = r9;
    }

    public final C146958n9 create(Object obj, C146958n9 r19) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        int i;
        C146958n9 r15 = r19;
        switch (this.A09) {
            case 0:
                obj2 = this.A06;
                obj3 = this.A04;
                obj4 = this.A08;
                obj5 = this.A02;
                obj6 = this.A03;
                obj7 = this.A05;
                obj8 = this.A01;
                obj9 = this.A07;
                i = 0;
                break;
            case 1:
                KtSLambdaShape1S0801000_I2 ktSLambdaShape1S0801000_I2 = new KtSLambdaShape1S0801000_I2((Context) this.A02, (KtCSuperShape0S0600000_I2) this.A04, (C149718uc) this.A07, (C10230hw) this.A03, (C21839C2o) this.A05, (UserSession) this.A06, r15, (AnonymousClass0YY) this.A01);
                ktSLambdaShape1S0801000_I2.A08 = obj;
                return ktSLambdaShape1S0801000_I2;
            case 2:
                return new KtSLambdaShape1S0801000_I2((ContentFilterDictionaryImpl) this.A02, (ContentFilterDictionaryRegistrar) this.A08, (C25364DkP) this.A01, r15);
            default:
                obj4 = this.A08;
                obj2 = this.A06;
                obj9 = this.A07;
                obj7 = this.A05;
                obj5 = this.A02;
                obj6 = this.A03;
                obj8 = this.A01;
                obj3 = this.A04;
                i = 3;
                break;
        }
        return new KtSLambdaShape1S0801000_I2(obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, r15, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        X.AnonymousClass0OU.A00(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d3, code lost:
        if (r1 != r0) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d5, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0126, code lost:
        if (r2.contains(r14.A02) != true) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b2, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A09
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x004a;
                case 2: goto L_0x00d6;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r14.A00
            r2 = 1
            if (r1 == 0) goto L_0x009b
            if (r1 == r2) goto L_0x0058
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0013:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r14.A00
            r11 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 == r11) goto L_0x0058
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0021:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r1 = r14.A06
            X.066 r1 = (X.AnonymousClass066) r1
            X.062 r2 = r1.getLifecycle()
            java.lang.Object r1 = r14.A04
            X.061 r1 = (X.AnonymousClass061) r1
            r10 = 0
            java.lang.Object r6 = r14.A08
            java.lang.Object r4 = r14.A02
            java.lang.Object r9 = r14.A03
            java.lang.Object r8 = r14.A05
            java.lang.Object r5 = r14.A01
            java.lang.Object r7 = r14.A07
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0700000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0700000_I2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r14.A00 = r11
            java.lang.Object r1 = X.AnonymousClass3J4.A00(r1, r2, r14, r3)
            goto L_0x00d3
        L_0x004a:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r14.A00
            r4 = 1
            if (r1 == 0) goto L_0x005d
            if (r1 == r4) goto L_0x0058
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0058:
            X.AnonymousClass0OU.A00(r15)
            goto L_0x01b0
        L_0x005d:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r5 = r14.A08
            X.4qz r5 = (X.C83224qz) r5
            java.lang.Object r8 = r14.A07
            X.8uc r8 = (X.C149718uc) r8
            X.4wG r3 = r8.A0A
            java.lang.Object r7 = r14.A04
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0600000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0600000_I2) r7
            r12 = 0
            r2 = 24
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2
            r1.<init>((java.lang.Object) r8, (java.lang.Object) r7, (X.C146958n9) r12, (int) r2)
            X.C18230wP.A1T(r1, r5, r3)
            X.4wG r1 = r8.A09
            java.lang.Object r6 = r14.A02
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r11 = r14.A06
            com.instagram.service.session.UserSession r11 = (com.instagram.service.session.UserSession) r11
            java.lang.Object r10 = r14.A05
            X.C2o r10 = (X.C21839C2o) r10
            java.lang.Object r9 = r14.A03
            X.0hw r9 = (X.C10230hw) r9
            java.lang.Object r13 = r14.A01
            X.0YY r13 = (X.AnonymousClass0YY) r13
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0800000_I2 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0800000_I2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A00 = r4
            java.lang.Object r1 = X.C25817DsW.A00(r14, r5, r1)
            goto L_0x00d3
        L_0x009b:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r10 = r14.A08
            X.1c1 r10 = (X.AnonymousClass1c1) r10
            X.0Oa r1 = r10.A05
            java.lang.Object r1 = r1.getValue()
            X.10c r1 = (X.C195310c) r1
            X.4tk r1 = r1.A09
            java.lang.Object r4 = r14.A06
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r9 = r14.A07
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r9 = (com.instagram.common.ui.widget.imageview.RoundedCornerImageView) r9
            java.lang.Object r8 = r14.A05
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            java.lang.Object r5 = r14.A02
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r11 = r14.A03
            com.instagram.igds.components.textcell.IgdsListCell r11 = (com.instagram.igds.components.textcell.IgdsListCell) r11
            java.lang.Object r6 = r14.A01
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r7 = r14.A04
            android.view.View r7 = (android.view.View) r7
            X.4VB r3 = new X.4VB
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r14.A00 = r2
            java.lang.Object r1 = r1.collect(r3, r14)
        L_0x00d3:
            if (r1 != r0) goto L_0x01b0
            return r0
        L_0x00d6:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r14.A00
            r10 = 2
            r7 = 0
            r9 = 0
            r8 = 1
            if (r1 == 0) goto L_0x010a
            if (r1 == r8) goto L_0x00f2
            java.lang.Object r3 = r14.A06
            java.lang.Object r6 = r14.A05
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r6 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r6
            java.lang.Object r5 = r14.A04
            X.Dnh r5 = (X.C25549Dnh) r5
            java.lang.Object r4 = r14.A03
            java.util.Set r4 = (java.util.Set) r4
            goto L_0x018c
        L_0x00f2:
            java.lang.Object r11 = r14.A07
            X.DkP r11 = (X.C25364DkP) r11
            java.lang.Object r3 = r14.A06
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r3 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r3
            java.lang.Object r6 = r14.A05
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r6 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r6
            java.lang.Object r5 = r14.A04
            X.Dnh r5 = (X.C25549Dnh) r5
            java.lang.Object r4 = r14.A03
            java.util.Set r4 = (java.util.Set) r4
            X.AnonymousClass0OU.A00(r15)
            goto L_0x0154
        L_0x010a:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r6 = r14.A08
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r6 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r6
            java.util.concurrent.ConcurrentHashMap r1 = r6.A0C
            java.lang.Object r11 = r14.A01
            X.DkP r11 = (X.C25364DkP) r11
            java.lang.Object r2 = r1.get(r11)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x0128
            java.lang.Object r1 = r14.A02
            boolean r2 = r2.contains(r1)
            r1 = 1
            if (r2 == r8) goto L_0x0129
        L_0x0128:
            r1 = 0
        L_0x0129:
            if (r1 == 0) goto L_0x01b0
            java.util.concurrent.ConcurrentHashMap r1 = r6.A0B
            java.lang.Object r1 = r1.get(r11)
            if (r1 != 0) goto L_0x0135
            X.84Y r1 = X.AnonymousClass84Y.A00
        L_0x0135:
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r3 = r14.A02
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r3 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r3
            java.util.Set r4 = X.AnonymousClass4WL.A02(r3, r1)
            X.Dnh r5 = r6.A0G
            r14.A03 = r4
            r14.A04 = r5
            r14.A05 = r6
            r14.A06 = r3
            r14.A07 = r11
            r14.A00 = r8
            java.lang.Object r1 = r5.A00(r7, r14)
            if (r1 != r0) goto L_0x0154
            return r0
        L_0x0154:
            java.util.concurrent.ConcurrentHashMap r1 = r6.A0D     // Catch:{ all -> 0x0195 }
            java.lang.Object r2 = r1.get(r3)     // Catch:{ all -> 0x0195 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x0195 }
            if (r2 == 0) goto L_0x0161
            r2.remove(r11)     // Catch:{ all -> 0x0195 }
        L_0x0161:
            X.C04220Ms.A0B(r3, r9)     // Catch:{ all -> 0x0195 }
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r1 = r11.A03     // Catch:{ all -> 0x0195 }
            java.util.Set r1 = r1.A0D     // Catch:{ all -> 0x0195 }
            r1.remove(r3)     // Catch:{ all -> 0x0195 }
            X.C25364DkP.A00(r11)     // Catch:{ all -> 0x0195 }
            if (r2 == 0) goto L_0x0177
            boolean r1 = r2.isEmpty()     // Catch:{ all -> 0x0195 }
            if (r1 != r8) goto L_0x0177
            r9 = 1
        L_0x0177:
            if (r9 == 0) goto L_0x019c
            r14.A03 = r4     // Catch:{ all -> 0x0195 }
            r14.A04 = r5     // Catch:{ all -> 0x0195 }
            r14.A05 = r6     // Catch:{ all -> 0x0195 }
            r14.A06 = r3     // Catch:{ all -> 0x0195 }
            r14.A07 = r7     // Catch:{ all -> 0x0195 }
            r14.A00 = r10     // Catch:{ all -> 0x0195 }
            java.lang.Object r1 = r3.A01(r14)     // Catch:{ all -> 0x0195 }
            if (r1 != r0) goto L_0x018f
            return r0
        L_0x018c:
            X.AnonymousClass0OU.A00(r15)     // Catch:{ all -> 0x0197 }
        L_0x018f:
            java.util.concurrent.ConcurrentHashMap r0 = r6.A0D     // Catch:{ all -> 0x0197 }
            r0.remove(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x019c
        L_0x0195:
            r0 = move-exception
            goto L_0x0198
        L_0x0197:
            r0 = move-exception
        L_0x0198:
            r5.A02(r7)
            throw r0
        L_0x019c:
            r5.A02(r7)
            boolean r2 = r4.isEmpty()
            java.lang.Object r0 = r14.A08
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r0 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r0
            java.util.concurrent.ConcurrentHashMap r1 = r0.A0B
            java.lang.Object r0 = r14.A01
            if (r2 == 0) goto L_0x01b3
            r1.remove(r0)
        L_0x01b0:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x01b3:
            r1.put(r0, r4)
            goto L_0x01b0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape1S0801000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape1S0801000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0801000_I2(ContentFilterDictionaryImpl contentFilterDictionaryImpl, ContentFilterDictionaryRegistrar contentFilterDictionaryRegistrar, C25364DkP dkP, C146958n9 r5) {
        super(2, r5);
        this.A09 = 2;
        this.A08 = contentFilterDictionaryRegistrar;
        this.A01 = dkP;
        this.A02 = contentFilterDictionaryImpl;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0801000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, C146958n9 r10, int i) {
        super(2, r10);
        this.A09 = i;
        this.A06 = obj;
        this.A04 = obj2;
        this.A08 = obj3;
        this.A02 = obj4;
        this.A03 = obj5;
        this.A05 = obj6;
        this.A01 = obj7;
        this.A07 = obj8;
    }
}
