package com.instagram.creation.capture.quickcapture.template.v2.repository;

import androidx.paging.PagingSource;
import com.instagram.service.session.UserSession;
import java.util.Map;

public final class ClipsTemplateBrowserSectionContentPagingSource extends PagingSource {
    public final String A00;
    public final Map A01;
    public final UserSession A02;

    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.creation.capture.quickcapture.template.v2.repository.ClipsTemplateBrowserSectionContentPagingSource r5, java.lang.String r6, X.C146958n9 r7) {
        /*
            r4 = 48
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1.A00(r4, r7)
            if (r0 == 0) goto L_0x008b
            r3 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008b
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r3.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 != r1) goto L_0x00c1
            X.AnonymousClass0OU.A00(r2)
        L_0x0024:
            X.3b6 r2 = (X.C62903b6) r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r0 = X.C62903b6.A05(r2)
            X.C04220Ms.A06(r0)
            X.6h0 r0 = (X.C107596h0) r0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1210000_I2 r4 = r0.A00
            if (r4 == 0) goto L_0x0091
            java.lang.Object r0 = r4.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2) r0
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r0.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x0091
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x004b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0093
            X.C86134wK.A1V(r3, r1)
            goto L_0x004b
        L_0x0055:
            X.AnonymousClass0OU.A00(r2)
            com.instagram.service.session.UserSession r0 = r5.A02
            r3.A01 = r5
            r3.A00 = r1
            X.H1T r2 = X.C18180wK.A0P(r0)
            java.lang.String r1 = "clips/"
            java.lang.String r0 = "templates_browser_v2/"
            X.C18190wL.A1P(r2, r1, r0)
            java.lang.Class<X.5sw> r1 = X.C93955sw.class
            java.lang.Class<X.6yN> r0 = X.C117246yN.class
            r2.A0B(r1, r0)
            if (r6 == 0) goto L_0x0077
            java.lang.String r0 = "max_id"
            r2.A0O(r0, r6)
        L_0x0077:
            X.H8c r2 = r2.A02()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetClipsTemplatesBrowserResponseV2>>"
            X.C04220Ms.A0C(r2, r0)
            r1 = 397594746(0x17b2d07a, float:1.1555607E-24)
            r0 = 0
            java.lang.Object r2 = X.C63623hv.A00(r2, r3, r1, r0)
            if (r2 != r4) goto L_0x0024
            return r4
        L_0x008b:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1
            r3.<init>(r5, r7, r4)
            goto L_0x0016
        L_0x0091:
            X.0ZV r3 = X.AnonymousClass0ZV.A00
        L_0x0093:
            r2 = 0
            if (r4 == 0) goto L_0x00ae
            java.lang.Object r1 = r4.A00
            X.98l r1 = (X.C1535898l) r1
            if (r1 == 0) goto L_0x00ae
            boolean r0 = r1.AwS()
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = r1.Ata()
        L_0x00a6:
            X.59e r1 = new X.59e
            r1.<init>(r2, r0, r3)
            return r1
        L_0x00ac:
            r0 = 0
            goto L_0x00a6
        L_0x00ae:
            r0 = r2
            goto L_0x00a6
        L_0x00b0:
            r0 = 245(0xf5, float:3.43E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            X.59d r1 = new X.59d
            r1.<init>(r0)
            return r1
        L_0x00c1:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.template.v2.repository.ClipsTemplateBrowserSectionContentPagingSource.A00(com.instagram.creation.capture.quickcapture.template.v2.repository.ClipsTemplateBrowserSectionContentPagingSource, java.lang.String, X.8n9):java.lang.Object");
    }

    public ClipsTemplateBrowserSectionContentPagingSource(UserSession userSession, String str, Map map) {
        this.A02 = userSession;
        this.A00 = str;
        this.A01 = map;
    }
}
