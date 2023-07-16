package com.instagram.release.buildinfo;

import X.C04220Ms;
import X.C09810gi;
import X.C18180wK;
import android.content.SharedPreferences;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2002000_I2;
import com.instagram.service.session.UserSession;

public final class BuildInfoStore {
    public long A00;
    public KtCSuperShape0S2002000_I2 A01;
    public final SharedPreferences A02;
    public final UserSession A03;
    public final C09810gi A04;
    public final BuildInfoApi A05;

    public BuildInfoStore(SharedPreferences sharedPreferences, C09810gi r8, BuildInfoApi buildInfoApi, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = sharedPreferences;
        this.A05 = buildInfoApi;
        this.A04 = r8;
        int i = sharedPreferences.getInt("RecommendedBuildNumber", 0);
        int i2 = sharedPreferences.getInt("RecommendedPublishDate", 0);
        String str = "";
        String str2 = str;
        String string = sharedPreferences.getString("RecommendedVersionName", str);
        str = string != null ? string : str;
        String string2 = sharedPreferences.getString("RecommendedDownloadUrl", str2);
        this.A01 = new KtCSuperShape0S2002000_I2(str, i, i2, 2, string2 != null ? string2 : str2);
        this.A00 = C18180wK.A05(this.A02, "RecommendedBuildLastUpdated");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C146958n9 r6) {
        /*
            r5 = this;
            r3 = 46
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3.A00(r3, r6)
            if (r0 == 0) goto L_0x007d
            r4 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x006c
            if (r0 != r1) goto L_0x0083
            java.lang.Object r4 = r4.A01
            com.instagram.release.buildinfo.BuildInfoStore r4 = (com.instagram.release.buildinfo.BuildInfoStore) r4
            X.AnonymousClass0OU.A00(r3)
        L_0x0028:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0069
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r3 = r3.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2002000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2002000_I2) r3
            r4.A01 = r3
            long r0 = java.lang.System.currentTimeMillis()
            r4.A00 = r0
            android.content.SharedPreferences r0 = r4.A02
            android.content.SharedPreferences$Editor r2 = r0.edit()
            int r1 = r3.A00
            java.lang.String r0 = "RecommendedBuildNumber"
            android.content.SharedPreferences$Editor r2 = r2.putInt(r0, r1)
            int r1 = r3.A01
            java.lang.String r0 = "RecommendedPublishDate"
            android.content.SharedPreferences$Editor r2 = r2.putInt(r0, r1)
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "RecommendedVersionName"
            android.content.SharedPreferences$Editor r2 = r2.putString(r0, r1)
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "RecommendedDownloadUrl"
            android.content.SharedPreferences$Editor r3 = r2.putString(r0, r1)
            long r1 = r4.A00
            java.lang.String r0 = "RecommendedBuildLastUpdated"
            X.AnonymousClass0wJ.A12(r3, r0, r1)
        L_0x0069:
            kotlin.Unit r2 = kotlin.Unit.A00
        L_0x006b:
            return r2
        L_0x006c:
            X.AnonymousClass0OU.A00(r3)
            com.instagram.release.buildinfo.BuildInfoApi r0 = r5.A05
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r3 = r0.A00(r4)
            if (r3 == r2) goto L_0x006b
            r4 = r5
            goto L_0x0028
        L_0x007d:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3
            r4.<init>(r5, r6, r3)
            goto L_0x0016
        L_0x0083:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.release.buildinfo.BuildInfoStore.A00(X.8n9):java.lang.Object");
    }
}
