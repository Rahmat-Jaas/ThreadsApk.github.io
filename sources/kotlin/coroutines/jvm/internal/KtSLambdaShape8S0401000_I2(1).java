package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YY;
import X.C146958n9;
import X.C39142Kno;
import X.C86164wN;
import com.instagram.barcelona.feed.data.BarcelonaFeedRepository;
import kotlin.Unit;

public class KtSLambdaShape8S0401000_I2 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape8S0401000_I2(BarcelonaFeedRepository barcelonaFeedRepository, Integer num, Integer num2, C146958n9 r5) {
        super(1, r5);
        this.A05 = 0;
        this.A04 = barcelonaFeedRepository;
        this.A02 = num;
        this.A01 = num2;
    }

    public final C146958n9 create(C146958n9 r10) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        C146958n9 r7 = r10;
        switch (this.A05) {
            case 0:
                return new KtSLambdaShape8S0401000_I2((BarcelonaFeedRepository) this.A04, (Integer) this.A02, (Integer) this.A01, r10);
            case 1:
                obj = this.A03;
                obj2 = this.A02;
                obj3 = this.A01;
                i = 1;
                break;
            default:
                obj = this.A03;
                obj3 = this.A01;
                obj2 = this.A02;
                i = 2;
                break;
        }
        return new KtSLambdaShape8S0401000_I2(obj, obj2, obj3, r7, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r4 = r18
            r6 = r19
            int r0 = r4.A05
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x01ed;
                default: goto L_0x000b;
            }
        L_0x000b:
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0018
            if (r1 != r0) goto L_0x0013
            goto L_0x0032
        L_0x0013:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0018:
            X.AnonymousClass0OU.A00(r6)
            X.7GK r2 = X.AnonymousClass7GK.A00
            java.lang.Object r0 = r4.A01
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            java.lang.Object r1 = r4.A02
            X.0gQ r1 = (X.AnonymousClass0gQ) r1
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x0038 }
            X.GDL r0 = (X.GDL) r0     // Catch:{ all -> 0x0038 }
            java.lang.Object r6 = X.C1370685y.A00(r1, r2, r0, r4)     // Catch:{ all -> 0x0038 }
            if (r6 != r3) goto L_0x0035
            return r3
        L_0x0032:
            X.AnonymousClass0OU.A00(r6)     // Catch:{ all -> 0x0038 }
        L_0x0035:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0038 }
            goto L_0x003e
        L_0x0038:
            r0 = move-exception
            X.0OW r6 = new X.0OW
            r6.<init>(r0)
        L_0x003e:
            java.lang.Object r0 = r4.A03
            X.8lo r0 = (X.C146198lo) r0
            X.AnonymousClass7GK.A01(r0, r6)
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x0048:
            int r0 = r4.A00
            r5 = 2
            r7 = 1
            r14 = 0
            if (r0 == 0) goto L_0x006c
            if (r0 == r7) goto L_0x008b
            java.lang.Object r1 = r4.A03
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            X.AnonymousClass0OU.A00(r6)
        L_0x0058:
            java.lang.Object r5 = r4.A04
            com.instagram.barcelona.feed.data.BarcelonaFeedRepository r5 = (com.instagram.barcelona.feed.data.BarcelonaFeedRepository) r5
            java.lang.Object r3 = r4.A01
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Integer r2 = X.AnonymousClass006.A00
            X.8s2 r0 = X.AnonymousClass7C0.A00(r1)
        L_0x0066:
            com.instagram.barcelona.feed.data.BarcelonaFeedRepository.A02(r5, r3, r2, r0)
        L_0x0069:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x006c:
            X.AnonymousClass0OU.A00(r6)
            java.lang.Object r6 = r4.A04
            com.instagram.barcelona.feed.data.BarcelonaFeedRepository r6 = (com.instagram.barcelona.feed.data.BarcelonaFeedRepository) r6
            java.lang.Object r2 = r4.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            X.8bW r0 = X.AnonymousClass8bW.A01
            com.instagram.barcelona.feed.data.BarcelonaFeedRepository.A02(r6, r2, r1, r0)
            java.lang.Object r0 = r4.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            r4.A00 = r7
            java.lang.Object r6 = com.instagram.barcelona.feed.data.BarcelonaFeedRepository.A01(r6, r0, r14, r14, r4)
            if (r6 != r3) goto L_0x008e
            return r3
        L_0x008b:
            X.AnonymousClass0OU.A00(r6)
        L_0x008e:
            X.3b6 r6 = (X.C62903b6) r6
            boolean r0 = r6 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r1 = r4.A02
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 != r0) goto L_0x00cd
            X.7xj r3 = X.C134457xj.A04
            if (r3 == 0) goto L_0x01e1
            X.1jB r6 = (X.AnonymousClass1jB) r6
            java.lang.Object r0 = r6.A00
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r2 = r0.getMessage()
            X.ImR r0 = r3.A02
            X.ImQ r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            r1.A00 = r0
            java.lang.Boolean r0 = X.C18180wK.A0X()
            r1.A00 = r0
            java.lang.String r0 = "FEED_REQUEST_FAILED"
            X.KJ8 r1 = r3.A03
            r1.A0J(r3, r0)
            if (r2 == 0) goto L_0x00c8
            r0 = 641(0x281, float:8.98E-43)
            java.lang.String r0 = X.I17.A00(r0)
            r1.A0M(r0, r2)
        L_0x00c8:
            X.77q r0 = X.C134457xj.A05
            r1.A0H(r0)
        L_0x00cd:
            java.lang.Object r5 = r4.A04
            com.instagram.barcelona.feed.data.BarcelonaFeedRepository r5 = (com.instagram.barcelona.feed.data.BarcelonaFeedRepository) r5
            java.lang.Object r3 = r4.A01
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Integer r2 = X.AnonymousClass006.A0N
            X.4wG r0 = r5.A0A
            java.lang.Object r0 = r0.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r0
            java.lang.Object r0 = r0.A01
            X.8s2 r0 = (X.AnonymousClass8s2) r0
            goto L_0x0066
        L_0x00e4:
            boolean r0 = r6 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0069
            java.lang.Object r1 = r4.A02
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 != r0) goto L_0x010b
            X.7xj r2 = X.C134457xj.A04
            if (r2 == 0) goto L_0x01e7
            X.ImR r0 = r2.A02
            X.ImQ r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r1.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1.A00 = r0
            r0 = 647(0x287, float:9.07E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.KJ8 r0 = r2.A03
            r0.A0J(r2, r1)
        L_0x010b:
            java.lang.Object r7 = r4.A04
            com.instagram.barcelona.feed.data.BarcelonaFeedRepository r7 = (com.instagram.barcelona.feed.data.BarcelonaFeedRepository) r7
            X.1jA r6 = (X.AnonymousClass1jA) r6
            java.lang.Object r6 = r6.A00
            r2 = r6
            X.IlY r2 = (X.C35029IlY) r2
            java.lang.Boolean r8 = r2.A09
            if (r8 == 0) goto L_0x0127
            com.instagram.service.session.UserSession r0 = r7.A05
            X.6pH r1 = X.AnonymousClass2OP.A00(r0)
            boolean r0 = r8.booleanValue()
            r1.A00(r0)
        L_0x0127:
            java.util.List r8 = r2.A01()
            java.lang.Object r13 = r4.A01
            java.lang.Integer r13 = (java.lang.Integer) r13
            X.0ZV r1 = X.AnonymousClass0ZV.A00
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r13 != r0) goto L_0x01c4
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r12 = r8.iterator()
        L_0x013d:
            boolean r0 = r12.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0194
            java.lang.Object r10 = r12.next()
            r8 = r10
            X.JrZ r8 = (X.C37415JrZ) r8
            X.BKU r0 = X.C86144wL.A0W(r8)
            if (r0 == 0) goto L_0x015b
            X.BKN r0 = r0.A0f
            com.instagram.user.model.User r0 = r0.A1i
            if (r0 == 0) goto L_0x015b
            java.lang.String r1 = r0.getId()
        L_0x015b:
            com.instagram.service.session.UserSession r0 = r7.A05
            boolean r0 = X.C18250wR.A1J(r0, r1)
            if (r0 != 0) goto L_0x013d
            X.7tu r0 = r7.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = r0.A00()
            java.lang.Object r1 = r0.A00
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0179
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0179
        L_0x0175:
            r9.add(r10)
            goto L_0x013d
        L_0x0179:
            java.util.Iterator r11 = r1.iterator()
        L_0x017d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0175
            java.lang.Object r0 = r11.next()
            X.JrZ r0 = (X.C37415JrZ) r0
            java.lang.String r1 = r0.A0j
            java.lang.String r0 = r8.A0j
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x017d
            goto L_0x013d
        L_0x0194:
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r1 = r9.iterator()
        L_0x019c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r0 = r1.next()
            X.JrZ r0 = (X.C37415JrZ) r0
            X.BKU r0 = X.C86144wL.A0W(r0)
            if (r0 == 0) goto L_0x019c
            X.BKN r0 = r0.A0f
            com.instagram.user.model.User r0 = r0.A1i
            if (r0 == 0) goto L_0x019c
            com.instagram.common.typedurl.ImageUrl r0 = r0.B4M()
            r8.add(r0)
            goto L_0x019c
        L_0x01bc:
            java.util.Set r0 = X.AnonymousClass00J.A0b(r8)
            java.util.List r1 = X.AnonymousClass00J.A0N(r0)
        L_0x01c4:
            X.7tu r12 = r7.A01
            java.util.List r16 = r2.A01()
            X.9Me r6 = (X.C156169Me) r6
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x01d2
            java.lang.String r14 = r6.A02
        L_0x01d2:
            java.lang.String r15 = r2.A0D
            r4.A03 = r1
            r4.A00 = r5
            r17 = r4
            java.lang.Object r0 = r12.A01(r13, r14, r15, r16, r17)
            if (r0 != r3) goto L_0x0058
            return r3
        L_0x01e1:
            java.lang.String r0 = "instance"
            X.C04220Ms.A0E(r0)
            throw r14
        L_0x01e7:
            java.lang.String r0 = "instance"
            X.C04220Ms.A0E(r0)
            throw r14
        L_0x01ed:
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x01fa
            if (r1 != r0) goto L_0x01f5
            goto L_0x020c
        L_0x01f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x01fa:
            X.AnonymousClass0OU.A00(r6)
            X.7GK r2 = X.AnonymousClass7GK.A00
            java.lang.Object r1 = r4.A02
            java.lang.Object r0 = r4.A01
            X.0gQ r0 = (X.AnonymousClass0gQ) r0
            java.lang.Object r6 = X.C1370685y.A00(r0, r2, r1, r4)     // Catch:{ all -> 0x0212 }
            if (r6 != r3) goto L_0x020f
            return r3
        L_0x020c:
            X.AnonymousClass0OU.A00(r6)     // Catch:{ all -> 0x0212 }
        L_0x020f:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0212 }
            goto L_0x0218
        L_0x0212:
            r0 = move-exception
            X.0OW r6 = new X.0OW
            r6.<init>(r0)
        L_0x0218:
            java.lang.Object r0 = r4.A03
            X.8lo r0 = (X.C146198lo) r0
            X.AnonymousClass7GK.A01(r0, r6)
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape8S0401000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((KtSLambdaShape8S0401000_I2) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape8S0401000_I2(Object obj, Object obj2, Object obj3, C146958n9 r5, int i) {
        super(1, r5);
        this.A05 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }
}
