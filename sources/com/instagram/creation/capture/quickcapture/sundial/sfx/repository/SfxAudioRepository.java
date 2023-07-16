package com.instagram.creation.capture.quickcapture.sundial.sfx.repository;

import X.AnonymousClass0ZV;
import X.C146958n9;
import X.C18190wL;
import X.C18220wO;
import X.C24936DcW;
import X.C25817DsW;
import X.C27457Enn;
import X.C83224qz;
import X.C86074wE;
import X.C86154wM;
import X.DIV;
import com.instagram.creation.capture.quickcapture.sundial.sfx.SfxNetworkSource;
import com.instagram.service.session.UserSession;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2;

public final class SfxAudioRepository {
    public final C24936DcW A00;
    public final SfxNetworkSource A01;
    public final UserSession A02;
    public final Map A03;
    public final C83224qz A04;
    public final C86074wE A05 = C18190wL.A0z(AnonymousClass0ZV.A00);
    public final C86074wE A06;
    public final String A07;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r9, X.C146958n9 r10) {
        /*
            r8 = this;
            r3 = 29
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r3, r10)
            if (r0 == 0) goto L_0x0085
            r5 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0085
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A04
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r7 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 != r7) goto L_0x008b
            java.lang.Object r3 = r5.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r3
            java.lang.Object r9 = r5.A02
            java.lang.Object r1 = r5.A01
            com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository r1 = (com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository) r1
            X.AnonymousClass0OU.A00(r2)
        L_0x002e:
            X.3b6 r2 = (X.C62903b6) r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0054
            X.1jA r2 = (X.AnonymousClass1jA) r2
            java.lang.Object r6 = r2.A00
            java.util.List r6 = (java.util.List) r6
            java.util.Map r5 = r1.A03
            java.lang.String r4 = r3.A01
            java.lang.String r2 = r3.A02
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            X.AnonymousClass0wJ.A1M(r2, r7, r6)
            r1 = 19
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2
            r0.<init>((java.lang.String) r4, (java.lang.String) r2, (java.util.List) r6, (int) r1)
            r5.put(r9, r0)
        L_0x0051:
            kotlin.Unit r4 = kotlin.Unit.A00
        L_0x0053:
            return r4
        L_0x0054:
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0051
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x005d:
            X.AnonymousClass0OU.A00(r2)
            java.util.Map r0 = r8.A03
            java.lang.Object r3 = r0.get(r9)
            if (r3 == 0) goto L_0x0090
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r3
            java.lang.Object r0 = r3.A00
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0051
            com.instagram.creation.capture.quickcapture.sundial.sfx.SfxNetworkSource r2 = r8.A01
            java.lang.String r1 = r8.A07
            com.instagram.service.session.UserSession r0 = r8.A02
            X.C86114wI.A1J(r8, r9, r3, r5, r7)
            java.lang.Object r2 = r2.A01(r0, r9, r1, r5)
            if (r2 == r4) goto L_0x0053
            r1 = r8
            goto L_0x002e
        L_0x0085:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r5.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x008b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0090:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository.A00(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C146958n9 r9) {
        /*
            r8 = this;
            r3 = 41
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1.A00(r3, r9)
            if (r0 == 0) goto L_0x0098
            r4 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0098
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r4.A02
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 != r1) goto L_0x00a8
            java.lang.Object r7 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository r7 = (com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository) r7
            X.AnonymousClass0OU.A00(r2)
        L_0x0028:
            X.3b6 r2 = (X.C62903b6) r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x009f
            X.1jA r2 = (X.AnonymousClass1jA) r2
            java.lang.Object r0 = r2.A00
            X.5ty r0 = (X.C94235ty) r0
            java.util.List r0 = r0.A02
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x003e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r1 = r5.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r1
            java.util.Map r0 = r7.A03
            java.lang.String r4 = r1.A01
            r0.put(r4, r1)
            java.lang.String r3 = r1.A02
            X.0ZV r2 = X.AnonymousClass0ZV.A00
            r1 = 18
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2
            r0.<init>((java.lang.String) r4, (java.lang.String) r3, (java.util.List) r2, (int) r1)
            r6.add(r0)
            goto L_0x003e
        L_0x0060:
            X.AnonymousClass0OU.A00(r2)
            java.lang.String r3 = r8.A07
            com.instagram.service.session.UserSession r0 = r8.A02
            r4.A01 = r8
            r4.A00 = r1
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "music/sound_effects_browser/"
            r2.A0J(r0)
            java.lang.String r1 = "product"
            r0 = 470(0x1d6, float:6.59E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0O(r1, r0)
            java.lang.String r0 = "browse_session_id"
            r2.A0O(r0, r3)
            java.lang.Class<X.5ty> r1 = X.C94235ty.class
            java.lang.Class<X.70Z> r0 = X.AnonymousClass70Z.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 466127803(0x1bc88bbb, float:3.3177523E-22)
            r0 = 0
            java.lang.Object r2 = X.C63623hv.A00(r2, r4, r1, r0)
            if (r2 == r5) goto L_0x00c7
            r7 = r8
            goto L_0x0028
        L_0x0098:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1
            r4.<init>(r8, r9, r3)
            goto L_0x0016
        L_0x009f:
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x00c5
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00a8:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00ad:
            X.4wE r0 = r7.A05
            r0.CrC(r6)
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            X.C04220Ms.A0B(r1, r0)
            X.4wE r0 = r7.A06
            r0.CrC(r1)
        L_0x00c5:
            kotlin.Unit r5 = kotlin.Unit.A00
        L_0x00c7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository.A01(X.8n9):java.lang.Object");
    }

    public SfxAudioRepository(C24936DcW dcW, SfxNetworkSource sfxNetworkSource, UserSession userSession, String str, C83224qz r9) {
        this.A07 = str;
        this.A02 = userSession;
        this.A01 = sfxNetworkSource;
        this.A00 = dcW;
        this.A04 = r9;
        C27457Enn A0z = C18190wL.A0z(DIV.A01);
        this.A06 = A0z;
        this.A03 = C18220wO.A0y();
        C25817DsW.A06(this.A04, C86154wM.A0O(new KtSLambdaShape2S0601000_I2((Object) this, (C146958n9) null, 12), A0z));
    }
}
