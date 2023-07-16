package androidx.paging;

import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass6D2;
import X.C04220Ms;
import X.C115116uX;
import X.C115236uj;
import X.C78114hu;
import X.C86164wN;
import com.instagram.creation.capture.quickcapture.template.repository.ClipsTemplateBrowserPagingSource;
import com.instagram.creation.capture.quickcapture.template.v2.repository.ClipsTemplateBrowserSectionContentPagingSource;

public abstract class PagingSource {
    public final C115236uj A00 = new C115236uj((AnonymousClass0ZU) null, C78114hu.A00);

    /* JADX WARNING: Removed duplicated region for block: B:112:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(X.C112056ou r19, X.C146958n9 r20) {
        /*
            r18 = this;
            r2 = r18
            boolean r0 = r2 instanceof com.instagram.creation.capture.quickcapture.template.v2.repository.ClipsTemplateBrowserSectionContentPagingSource
            r11 = r19
            r1 = r20
            if (r0 == 0) goto L_0x00d5
            com.instagram.creation.capture.quickcapture.template.v2.repository.ClipsTemplateBrowserSectionContentPagingSource r2 = (com.instagram.creation.capture.quickcapture.template.v2.repository.ClipsTemplateBrowserSectionContentPagingSource) r2
            java.lang.Object r0 = r11.A00()
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r5 = com.instagram.creation.capture.quickcapture.template.v2.repository.ClipsTemplateBrowserSectionContentPagingSource.A00(r2, r0, r1)
            return r5
        L_0x001b:
            java.util.Map r1 = r2.A01
            java.lang.String r2 = r2.A00
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r4 = r1.get(r2)
            if (r4 == 0) goto L_0x00bb
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r4
            java.lang.Object r0 = r4.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1210000_I2) r0
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2) r0
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r0.A00
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x004e
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 != r1) goto L_0x004e
            r3 = 1
        L_0x004e:
            r7 = 0
            if (r3 == 0) goto L_0x0093
            java.lang.Object r3 = r4.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1210000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1210000_I2) r3
            if (r3 == 0) goto L_0x008e
            java.lang.Object r0 = r3.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2) r0
            java.lang.Object r0 = r0.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x0089
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0069:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0073
            X.C86134wK.A1V(r2, r1)
            goto L_0x0069
        L_0x0073:
            java.lang.Object r1 = r3.A00
            X.98l r1 = (X.C1535898l) r1
            boolean r0 = r1.AwS()
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = r1.Ata()
        L_0x0081:
            X.59e r5 = new X.59e
            r5.<init>(r7, r0, r2)
            return r5
        L_0x0087:
            r0 = 0
            goto L_0x0081
        L_0x0089:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r5)
            throw r0
        L_0x008e:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r5)
            throw r0
        L_0x0093:
            X.59e r5 = new X.59e
            X.0ZV r8 = X.AnonymousClass0ZV.A00
            r6 = 0
            java.lang.Object r0 = r4.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2) r0
            java.lang.Object r1 = r0.A00
            X.98l r1 = (X.C1535898l) r1
            if (r1 == 0) goto L_0x00ac
            boolean r0 = r1.AwS()
            if (r0 == 0) goto L_0x00ac
            java.lang.String r7 = r1.Ata()
        L_0x00ac:
            r9 = 0
            java.lang.String r0 = "saved"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            r10 = 3
            if (r0 == 0) goto L_0x00b7
            r10 = 0
        L_0x00b7:
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x00bb:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r5)
            throw r0
        L_0x00c0:
            X.59e r5 = new X.59e
            X.0ZV r8 = X.AnonymousClass0ZV.A00
            r6 = 0
            r9 = 0
            java.lang.String r0 = "saved"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            r10 = 3
            if (r0 == 0) goto L_0x00d0
            r10 = 0
        L_0x00d0:
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x00d5:
            boolean r0 = r2 instanceof com.instagram.creation.capture.quickcapture.template.repository.ClipsTemplateBrowserPagingSource
            if (r0 == 0) goto L_0x0260
            r3 = r2
            com.instagram.creation.capture.quickcapture.template.repository.ClipsTemplateBrowserPagingSource r3 = (com.instagram.creation.capture.quickcapture.template.repository.ClipsTemplateBrowserPagingSource) r3
            r5 = 47
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1.A00(r5, r1)
            if (r0 == 0) goto L_0x0233
            r10 = r1
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r10 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1) r10
            int r4 = r10.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x0233
            int r4 = r4 - r2
            r10.A00 = r4
        L_0x00f2:
            java.lang.Object r2 = r10.A02
            X.D0E r9 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x0127
            if (r0 != r1) goto L_0x025b
            java.lang.Object r8 = r10.A01
            java.util.List r8 = (java.util.List) r8
            X.AnonymousClass0OU.A00(r2)
        L_0x0104:
            X.3b6 r2 = (X.C62903b6) r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x024a
            java.lang.Object r3 = X.C62903b6.A05(r2)
            X.C04220Ms.A06(r3)
            X.6gz r3 = (X.C107586gz) r3
            java.util.List r0 = r3.A01
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x011d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x023a
            X.C86134wK.A1V(r2, r1)
            goto L_0x011d
        L_0x0127:
            X.AnonymousClass0OU.A00(r2)
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            com.instagram.service.session.UserSession r12 = r3.A02
            java.lang.Object r13 = r11.A00()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r11 = r3.A03
            boolean r14 = r3.A05
            com.instagram.api.schemas.ClipsTemplateBrowserCategory r7 = r3.A00
            com.instagram.api.schemas.ClipsTemplateBrowserType r6 = r3.A01
            java.util.List r0 = r3.A04
            r17 = r0
            r10.A01 = r8
            r10.A00 = r1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            X.0TJ r5 = X.AnonymousClass0TJ.A05
            r0 = 36600603196001838(0x82080e00100e2e, double:3.2097070677266314E-306)
            long r3 = X.C86164wN.A09(r5, r12, r2, r0)
            r15 = 0
            r16 = 0
            X.H1T r2 = X.C18180wK.A0P(r12)
            r0 = 36325312971154476(0x810dae0000242c, double:3.035612421028399E-306)
            boolean r0 = X.C63803iN.A0E(r5, r12, r0)
            if (r0 != 0) goto L_0x018a
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r2.A0E(r0)
            r2.A07(r3)
            r4 = r13
            r3 = r11
            java.lang.String r0 = "clips/templates_browser"
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            java.lang.String r0 = ""
            if (r11 != 0) goto L_0x017a
            r3 = r0
        L_0x017a:
            r1.append(r3)
            r1.append(r14)
            if (r13 != 0) goto L_0x0183
            r4 = r0
        L_0x0183:
            java.lang.String r0 = X.C18180wK.A0i(r4, r1)
            r2.A0I(r0)
        L_0x018a:
            if (r11 == 0) goto L_0x0190
            java.lang.Long r16 = X.AnonymousClass4n2.A02(r11)
        L_0x0190:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r14)
            java.lang.String r1 = "clips/"
            java.lang.String r0 = "templates_browser/"
            X.C18190wL.A1P(r2, r1, r0)
            java.lang.Class<X.9KL> r1 = X.AnonymousClass9KL.class
            java.lang.Class<X.6yO> r0 = X.C117256yO.class
            r2.A0B(r1, r0)
            if (r13 == 0) goto L_0x01a9
            java.lang.String r0 = "max_id"
            r2.A0O(r0, r13)
        L_0x01a9:
            if (r16 == 0) goto L_0x01b4
            long r0 = r16.longValue()
            java.lang.String r3 = "audio_id"
            r2.A0L(r3, r0)
        L_0x01b4:
            if (r4 == 0) goto L_0x01bb
            java.lang.String r0 = "is_audio_selected"
            r2.A0R(r0, r14)
        L_0x01bb:
            if (r7 == 0) goto L_0x01c4
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "category"
            r2.A0O(r0, r1)
        L_0x01c4:
            if (r6 == 0) goto L_0x01d1
            java.lang.String r1 = r6.A00
            r0 = 482(0x1e2, float:6.75E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0O(r0, r1)
        L_0x01d1:
            if (r17 == 0) goto L_0x0220
            java.io.StringWriter r6 = X.C18230wP.A0d()
            X.MIS r0 = X.C18987Aon.A00
            X.MMp r5 = r0.A04(r6)
            r5.A0I()
            java.util.Iterator r4 = r17.iterator()
        L_0x01e4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x020d
            java.lang.Object r3 = r4.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2) r3
            r5.A0J()
            java.lang.Object r0 = r3.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0202
            float r1 = r0.floatValue()
            java.lang.String r0 = "duration_ms"
            r5.A0a(r0, r1)
        L_0x0202:
            int r1 = r3.A00
            java.lang.String r0 = "media_type"
            r5.A0b(r0, r1)
            r5.A0G()
            goto L_0x01e4
        L_0x020d:
            r5.A0F()
            r5.close()
            java.lang.String r1 = r6.toString()
            r0 = 318(0x13e, float:4.46E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0O(r0, r1)
        L_0x0220:
            X.H8c r1 = r2.A02()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetClipsTemplatesBrowserResponse>>"
            X.C04220Ms.A0C(r1, r0)
            r0 = 397594746(0x17b2d07a, float:1.1555607E-24)
            java.lang.Object r2 = X.C63623hv.A00(r1, r10, r0, r15)
            if (r2 != r9) goto L_0x0104
            return r9
        L_0x0233:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r10 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1
            r10.<init>(r3, r1, r5)
            goto L_0x00f2
        L_0x023a:
            r8.addAll(r2)
            r1 = 0
            X.98l r0 = r3.A00
            java.lang.String r0 = r0.Ata()
            X.59e r9 = new X.59e
            r9.<init>(r1, r0, r8)
            return r9
        L_0x024a:
            r0 = 245(0xf5, float:3.43E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            X.59d r9 = new X.59d
            r9.<init>(r0)
            return r9
        L_0x025b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0260:
            r10 = r2
            X.59f r10 = (X.C885759f) r10
            boolean r3 = r11 instanceof X.C885359b
            if (r3 == 0) goto L_0x02a2
            X.67E r4 = X.AnonymousClass67E.REFRESH
        L_0x0269:
            int r7 = r10.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r0) goto L_0x0282
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r0 = "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106"
            r2.println(r0)
            if (r3 == 0) goto L_0x029f
            int r2 = r11.A00
            int r0 = r2 % 3
            if (r0 != 0) goto L_0x029f
            int r7 = r2 / 3
        L_0x0280:
            r10.A00 = r7
        L_0x0282:
            java.lang.Object r5 = r11.A00()
            int r6 = r11.A00
            boolean r8 = r11.A01
            X.6lO r3 = new X.6lO
            r3.<init>(r4, r5, r6, r7, r8)
            X.EgD r0 = r10.A02
            r13 = 0
            r14 = 33
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r9 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r12 = r3
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (X.C146958n9) r13, (int) r14)
            java.lang.Object r0 = X.C25599DoZ.A00(r1, r0, r9)
            return r0
        L_0x029f:
            int r7 = r11.A00
            goto L_0x0280
        L_0x02a2:
            boolean r0 = r11 instanceof X.AnonymousClass59Z
            if (r0 == 0) goto L_0x02a9
            X.67E r4 = X.AnonymousClass67E.APPEND
            goto L_0x0269
        L_0x02a9:
            boolean r0 = r11 instanceof X.C885259a
            if (r0 == 0) goto L_0x02b0
            X.67E r4 = X.AnonymousClass67E.PREPEND
            goto L_0x0269
        L_0x02b0:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingSource.A01(X.6ou, X.8n9):java.lang.Object");
    }

    public Object A02(C115116uX r2) {
        if ((this instanceof ClipsTemplateBrowserSectionContentPagingSource) || (this instanceof ClipsTemplateBrowserPagingSource)) {
            return null;
        }
        C04220Ms.A0B(r2, 0);
        return null;
    }

    public final void A03() {
        if (this.A00.A02() && AnonymousClass6D2.A00 != null && C86164wN.A1P(3)) {
            C04220Ms.A0B(AnonymousClass0wJ.A0t("Invalidated PagingSource ", this), 1);
        }
    }
}
