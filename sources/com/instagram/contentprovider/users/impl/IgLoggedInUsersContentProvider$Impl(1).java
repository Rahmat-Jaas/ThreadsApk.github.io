package com.instagram.contentprovider.users.impl;

import X.AnonymousClass3QH;
import X.C04220Ms;
import X.C18240wQ;
import X.L6I;
import android.content.ContentValues;
import android.net.Uri;
import com.facebook.secure.content.PublicContentDelegate;

public final class IgLoggedInUsersContentProvider$Impl extends PublicContentDelegate {
    public static final String[] A00 = {"user_id", "authorization_token", AnonymousClass3QH.A00(84, 8, 5), "profile_pic_url", "is_active_user"};

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLoggedInUsersContentProvider$Impl(L6I l6i) {
        super(l6i);
        C04220Ms.A0B(l6i, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r3.getPackageManager().checkSignatures(r1, r2) == 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor A0Q(android.net.Uri r13, java.lang.String[] r14, java.lang.String r15, java.lang.String[] r16, java.lang.String r17) {
        /*
            r12 = this;
            X.L6I r0 = r12.A00
            android.content.Context r3 = r0.getContext()
            int r2 = android.os.Binder.getCallingUid()
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo()
            int r1 = r0.uid
            if (r2 == r1) goto L_0x001d
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            int r1 = r0.checkSignatures(r1, r2)
            r0 = 0
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            r7 = 0
            if (r0 != 0) goto L_0x0022
            return r7
        L_0x0022:
            X.3YX r0 = X.AnonymousClass3YX.A01
            r0.A02()
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            X.0i6 r9 = X.C18200wM.A0W(r12)
            boolean r0 = r9 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x0043
            com.instagram.service.session.UserSession r1 = X.C05030Qo.A02(r9)
            X.0BO r0 = r1.multipleAccountHelper
            X.0RL r0 = r0.A00
            java.util.List r8 = r0.A04(r7)
            java.lang.String r7 = r1.getUserId()
        L_0x0043:
            java.lang.String[] r0 = A00
            android.database.MatrixCursor r6 = new android.database.MatrixCursor
            r6.<init>(r0)
            int r5 = r8.size()
            r4 = 0
        L_0x004f:
            if (r4 >= r5) goto L_0x008b
            java.lang.Object r11 = r8.get(r4)
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            java.lang.String r10 = r11.getId()
            X.C18200wM.A1S(r9, r10)
            X.3Vp r0 = X.C61793Vp.A00(r9)
            android.content.SharedPreferences r0 = r0.A00
            java.lang.String r3 = X.C18250wR.A0W(r0, r10)
            if (r7 == 0) goto L_0x0071
            boolean r1 = r7.equals(r10)
            r0 = 1
            if (r1 != 0) goto L_0x0072
        L_0x0071:
            r0 = 0
        L_0x0072:
            java.lang.String r2 = r11.BK7()
            java.lang.String r1 = X.C18250wR.A0a(r11)
            X.C04220Ms.A06(r1)
            java.lang.String r0 = java.lang.Boolean.toString(r0)
            java.lang.String[] r0 = new java.lang.String[]{r10, r3, r2, r1, r0}
            r6.addRow(r0)
            int r4 = r4 + 1
            goto L_0x004f
        L_0x008b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.contentprovider.users.impl.IgLoggedInUsersContentProvider$Impl.A0Q(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw C18240wQ.A0j();
    }

    public final int A0N(Uri uri, String str, String[] strArr) {
        throw C18240wQ.A0j();
    }

    public final Uri A0R(Uri uri, ContentValues contentValues) {
        throw C18240wQ.A0j();
    }

    public final String A0T(Uri uri) {
        throw C18240wQ.A0j();
    }
}
