package X;

import android.content.Context;

/* renamed from: X.61R  reason: invalid class name */
public final class AnonymousClass61R extends AnonymousClass0gG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass01V A01;
    public final /* synthetic */ AnonymousClass7EN A02;
    public final /* synthetic */ AnonymousClass8jO A03;
    public final /* synthetic */ AnonymousClass5HJ A04;
    public final /* synthetic */ AnonymousClass945 A05;
    public final /* synthetic */ D1C A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61R(Context context, AnonymousClass01V r3, AnonymousClass7EN r4, AnonymousClass8jO r5, AnonymousClass5HJ r6, AnonymousClass945 r7, D1C d1c, String str, String str2, String str3) {
        super(169758665);
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r6;
        this.A09 = str;
        this.A00 = context;
        this.A07 = str2;
        this.A08 = str3;
        this.A03 = r5;
        this.A06 = d1c;
        this.A05 = r7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r7 = r21
            X.01V r10 = r7.A01
            r2 = 424097382(0x19473666, float:1.02990445E-23)
            java.lang.String r0 = "runnable_begin"
            r10.markerPoint(r2, r0)
            X.7EN r13 = r7.A02
            X.0Oa r11 = r13.A04
            java.lang.Object r0 = r11.getValue()
            double r0 = X.C86124wJ.A00(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "threshold"
            r10.markerAnnotate((int) r2, (java.lang.String) r0, (java.lang.String) r1)
            X.0Oa r0 = r13.A08
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            r8 = 0
            if (r0 == 0) goto L_0x00f4
            X.5HJ r0 = r7.A04
            X.7dw r6 = new X.7dw
            r6.<init>(r0)
        L_0x0035:
            java.lang.String r3 = r7.A09
            r1 = 30
            com.facebook.dcp.model.DcpContext r0 = new com.facebook.dcp.model.DcpContext
            r0.<init>(r3, r8, r8, r1)
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r8)
            java.util.List r5 = X.C18180wK.A0n(r0)
            com.instagram.service.session.UserSession r4 = r13.A01
            android.content.Context r3 = r7.A00
            java.lang.Class<X.7td> r1 = X.C132277td.class
            r0 = 41
            java.lang.Object r0 = X.C86124wJ.A0o(r4, r1, r3, r0)
            X.7td r0 = (X.C132277td) r0
            X.8n4 r1 = r0.A00
            java.lang.String r0 = "ml_engine_initialization_end"
            r10.markerPoint(r2, r0)
            X.5Id r9 = r1.CX7(r6, r8, r5)
            boolean r12 = r9.A02
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "prediction_end"
            r10.markerPoint((int) r2, (java.lang.String) r0, (java.lang.String) r1)
            if (r12 == 0) goto L_0x00d3
            java.lang.Object r1 = r9.A00
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x00d3
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = X.C18240wQ.A0b(r1)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.A01
            double r8 = X.C86124wJ.A00(r0)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "score"
            r10.markerAnnotate((int) r2, (java.lang.String) r0, (java.lang.String) r1)
            java.lang.Object r0 = r11.getValue()
            double r1 = X.C86124wJ.A00(r0)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            boolean r20 = X.C86114wI.A1S(r0)
            java.lang.String r2 = r7.A07
            java.lang.String r1 = r7.A08
            java.lang.Double r17 = java.lang.Double.valueOf(r8)
            X.8jO r14 = r7.A03
            X.D1C r0 = r7.A06
            X.945 r15 = r7.A05
            X.83H r12 = new X.83H
            r18 = r2
            r19 = r1
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x00b5:
            X.C63643hy.A04(r12)
            X.0Oa r0 = r13.A02
            java.lang.Object r0 = r0.getValue()
            long r7 = X.C18190wL.A08(r0)
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d2
            X.4rS r1 = X.GQH.A03
            X.61e r0 = new X.61e
            r0.<init>(r3, r6, r4, r5)
            r1.CwT(r0)
        L_0x00d2:
            return
        L_0x00d3:
            java.lang.String r1 = r9.A01
            java.lang.String r0 = "failure_reason"
            r10.markerAnnotate((int) r2, (java.lang.String) r0, (java.lang.String) r1)
            java.lang.String r2 = r7.A07
            java.lang.String r1 = r7.A08
            X.8jO r14 = r7.A03
            X.D1C r0 = r7.A06
            X.945 r15 = r7.A05
            r20 = 1
            X.83H r12 = new X.83H
            r18 = r2
            r19 = r1
            r17 = r8
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x00b5
        L_0x00f4:
            r6 = r8
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass61R.run():void");
    }
}
