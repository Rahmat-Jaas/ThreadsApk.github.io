package com.instagram.urlhandlers.exploreexternal;

import X.C10300i6;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class ExploreExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015a, code lost:
        if ("explore".equals(r1) != false) goto L_0x015c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = 533932735(0x1fd32abf, float:8.9432693E-20)
            int r2 = X.C14030oh.A00(r0)
            r7 = r16
            r0 = r17
            super.onCreate(r0)
            android.os.Bundle r3 = X.AnonymousClass0wJ.A0C(r7)
            if (r3 != 0) goto L_0x001e
            r7.finish()
            r0 = 1858584555(0x6ec7bfeb, float:3.0909766E28)
        L_0x001a:
            X.C14030oh.A07(r0, r2)
            return
        L_0x001e:
            X.0RG r0 = X.AnonymousClass0RA.A0C
            X.0i6 r0 = r0.A02(r3)
            r7.A00 = r0
            java.lang.String r0 = "original_url"
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x0035
            r7.finish()
            r0 = -372547515(0xffffffffe9cb6045, float:-3.073332E25)
            goto L_0x001a
        L_0x0035:
            android.net.Uri r6 = X.C15430rJ.A01(r0)
            java.lang.String r1 = r6.getScheme()
            java.lang.String r0 = "HTTP"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x013a
            java.lang.String r0 = "HTTPS"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x013a
            java.lang.String r0 = "INSTAGRAM"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x01a7
            java.lang.String r1 = r6.getHost()
            if (r1 == 0) goto L_0x01a7
            java.lang.String r4 = "tag"
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x0154
            java.util.Set r0 = r6.getQueryParameterNames()
            java.lang.String r1 = "name"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x01a7
            java.lang.String r1 = r6.getQueryParameter(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01a7
            java.lang.String r0 = " "
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x01a7
            android.os.Bundle r6 = X.C18180wK.A06()
            java.lang.String r0 = "explore_type"
            r6.putString(r0, r4)
        L_0x008a:
            java.lang.String r0 = "explore_param"
            r6.putString(r0, r1)
        L_0x008f:
            r3.putAll(r6)
            X.0i6 r1 = r7.A00
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 != 0) goto L_0x00a2
            X.3YR r0 = X.AnonymousClass3YR.A00
            r0.A02(r7, r3, r1)
        L_0x009d:
            r0 = 1162111953(0x45446bd1, float:3142.7385)
            goto L_0x001a
        L_0x00a2:
            com.instagram.service.session.UserSession r11 = X.C05030Qo.A02(r1)
            java.lang.String r0 = "explore_type"
            java.lang.String r4 = r3.getString(r0)
            java.lang.String r0 = "explore_param"
            java.lang.String r1 = r3.getString(r0)
            r15 = 1
            if (r4 == 0) goto L_0x0113
            if (r1 == 0) goto L_0x0113
            java.lang.String r0 = "tags"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = "tag"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00f5
        L_0x00c7:
            X.Afn r0 = X.C18456Afn.A01
            if (r0 == 0) goto L_0x00f5
            X.0i6 r0 = r7.A00
            X.Drz r5 = X.C18180wK.A0Q(r7, r0)
            r0 = 0
            r5.A0C = r0
            X.Afn r0 = X.C18456Afn.A01
            X.AfW r4 = r0.A00()
            com.instagram.model.hashtag.Hashtag r3 = X.C19274Atd.A00(r1)
            java.lang.String r1 = "from_url"
            java.lang.String r0 = "DEFAULT"
            androidx.fragment.app.Fragment r4 = r4.A01(r3, r1, r0)
            java.lang.String r3 = r11.token
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r1.putString(r0, r3)
            X.C18180wK.A0x(r1, r4, r5)
            goto L_0x009d
        L_0x00f5:
            java.lang.String r0 = "locations"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x009d
            X.Ds0 r0 = X.C25787Ds0.A00
            if (r0 == 0) goto L_0x009d
            r8 = 0
            java.lang.String r13 = ""
            com.instagram.model.venue.Venue r10 = new com.instagram.model.venue.Venue
            r10.<init>()
            r10.A05(r1)
            r9 = r8
            r12 = r8
            r14 = r8
            X.C17340A6i.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x009d
        L_0x0113:
            android.content.Intent r1 = X.C62333Yi.A00(r7)
            java.lang.String r0 = "instagram://explore"
            android.net.Uri r0 = X.C15430rJ.A01(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri r0 = r0.build()
            android.content.Intent r1 = r1.setData(r0)
            r0 = 341(0x155, float:4.78E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r1.putExtra(r0, r15)
            X.C10650ih.A02(r7, r1)
            r7.finish()
            goto L_0x009d
        L_0x013a:
            java.util.List r4 = r6.getPathSegments()
            int r0 = r4.size()
            r5 = 1
            if (r0 != r5) goto L_0x0162
            java.lang.String r1 = "explore"
            java.lang.Object r0 = X.C18240wQ.A0b(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0162
            goto L_0x015c
        L_0x0154:
            java.lang.String r0 = "explore"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01a7
        L_0x015c:
            android.os.Bundle r6 = X.C18180wK.A06()
            goto L_0x008f
        L_0x0162:
            java.util.List r4 = r6.getPathSegments()
            int r1 = r4.size()
            r0 = 3
            if (r1 < r0) goto L_0x01a7
            java.lang.String r1 = "explore"
            java.lang.Object r0 = X.C18240wQ.A0b(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x01a7
            java.lang.String r0 = X.C18190wL.A0p(r4, r5)
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r0 = "tags"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0193
            java.lang.String r0 = "locations"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01a7
        L_0x0193:
            android.os.Bundle r6 = X.C18180wK.A06()
            java.lang.String r1 = X.C18190wL.A0p(r4, r5)
            java.lang.String r0 = "explore_type"
            r6.putString(r0, r1)
            r0 = 2
            java.lang.String r1 = X.C18190wL.A0p(r4, r0)
            goto L_0x008a
        L_0x01a7:
            r7.finish()
            r0 = -269057788(0xffffffffeff68104, float:-1.5257857E29)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.exploreexternal.ExploreExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
