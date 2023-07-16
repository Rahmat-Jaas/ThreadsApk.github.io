package X;

import android.app.Activity;
import com.facebook.redex.IDxCListenerShape14S1100000_1_I2;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.groupprofiles.share.model.GroupProfileStickerModel;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.77I  reason: invalid class name */
public final class AnonymousClass77I {
    public static AnonymousClass77I A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.5xV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.5xW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.5xV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.5xV} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.app.Activity r15, com.instagram.service.session.UserSession r16, java.lang.String r17, X.AnonymousClass0YY r18) {
        /*
            r14 = this;
            r2 = 1
            r9 = r16
            r1 = r18
            X.AnonymousClass0wJ.A1M(r9, r2, r1)
            X.0MJ r10 = X.C86144wL.A17()
            X.0MJ r8 = X.C86144wL.A17()
            java.lang.String r0 = ""
            r8.A00 = r0
            r0 = 31
            kotlin.jvm.internal.KtLambdaShape45S0200000_I2_6 r3 = new kotlin.jvm.internal.KtLambdaShape45S0200000_I2_6
            r3.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r10)
            r13 = 3
            kotlin.jvm.internal.KtLambdaShape1S1500000_I2 r6 = new kotlin.jvm.internal.KtLambdaShape1S1500000_I2
            r11 = r14
            r7 = r15
            r12 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r0 = 36318230571127054(0x81073d0010110e, double:3.031133482732522E-306)
            boolean r0 = X.C63803iN.A0E(r4, r9, r0)
            r5 = 0
            if (r0 == 0) goto L_0x00a5
            X.5xW r4 = new X.5xW
            r4.<init>()
            android.os.Bundle r1 = X.C18180wK.A06()
            X.AnonymousClass3W9.A01(r1, r9)
            java.lang.String r0 = "group_profile_id"
            r1.putString(r0, r5)
            java.lang.String r0 = "thread_id"
            r1.putString(r0, r5)
            java.lang.String r0 = "thread_name"
            r1.putString(r0, r5)
            java.lang.String r0 = "thread_participant_ids"
            r1.putStringArray(r0, r5)
            r4.setArguments(r1)
            X.6i6 r0 = new X.6i6
            r0.<init>(r6, r3)
            r4.A01 = r0
        L_0x005d:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r4, r4)
            java.lang.Object r5 = r0.A00
            X.IcN r5 = (X.C34640IcN) r5
            java.lang.Object r4 = r0.A01
            X.BzM r4 = (X.C21735BzM) r4
            java.lang.String r0 = r5.getModuleName()
            X.C04220Ms.A06(r0)
            r8.A00 = r0
            r3 = 0
            r0 = 2131824542(0x7f110f9e, float:1.9281915E38)
            java.lang.String r1 = r15.getString(r0)
            X.C04220Ms.A09(r1)
            X.Jj9 r0 = new X.Jj9
            r0.<init>(r9)
            r0.A0O = r1
            r0.A0i = r3
            r0.A0I = r4
            kotlin.Pair r0 = X.C18180wK.A0p(r5, r0)
            java.lang.Object r3 = r0.A00
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.Object r1 = r0.A01
            X.Jj9 r1 = (X.C37032Jj9) r1
            X.DrH r0 = X.C18220wO.A0b(r15)
            if (r0 == 0) goto L_0x00d0
            X.Jqm r0 = X.C37383Jqm.A02(r0)
            if (r0 == 0) goto L_0x00d0
            r0.A0A(r3, r1, r2)
            return
        L_0x00a5:
            X.5xV r4 = new X.5xV
            r4.<init>()
            android.os.Bundle r1 = X.C18180wK.A06()
            X.AnonymousClass3W9.A01(r1, r9)
            java.lang.String r0 = "group_profile_id"
            r1.putString(r0, r5)
            java.lang.String r0 = "thread_id"
            r1.putString(r0, r5)
            java.lang.String r0 = "thread_name"
            r1.putString(r0, r5)
            java.lang.String r0 = "thread_participant_ids"
            r1.putStringArray(r0, r5)
            r4.setArguments(r1)
            X.6i7 r0 = new X.6i7
            r0.<init>(r6, r3)
            r4.A02 = r0
            goto L_0x005d
        L_0x00d0:
            X.C18200wM.A16(r15, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass77I.A01(android.app.Activity, com.instagram.service.session.UserSession, java.lang.String, X.0YY):void");
    }

    public static final void A00(Activity activity, C11630kW r10, UserSession userSession, User user, String str, boolean z) {
        int i;
        C37032Jj9 jj9 = new C37032Jj9(userSession);
        jj9.A0i = true;
        jj9.A0O = activity.getString(2131828084);
        if (z) {
            jj9.A0G = new AnonymousClass17a(new IDxCListenerShape14S1100000_1_I2(str, (Object) activity, 8), activity.getString(2131835990), 0, 0, 3935, false).A01();
        }
        C25745DrH A0b = C18220wO.A0b(activity);
        if (A0b == null || C37383Jqm.A02(A0b) == null) {
            jj9.A00();
        }
        String id = user.getId();
        ImageUrl B4M = user.B4M();
        String BK7 = user.BK7();
        String A0v = user.A0v();
        Integer A0n = user.A0n();
        if (A0n != null) {
            i = A0n.intValue();
        } else {
            i = 0;
        }
        new GroupProfileStickerModel(B4M, id, BK7, A0v, C18230wP.A0n(r10), i);
        throw C18210wN.A0W("getFragmentFactory");
    }
}
