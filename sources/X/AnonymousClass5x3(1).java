package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.Set;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3;
import kotlin.jvm.internal.KtLambdaShape26S0200000_I2_10;
import kotlin.jvm.internal.KtLambdaShape61S0100000_I2_41;

/* renamed from: X.5x3  reason: invalid class name */
public abstract class AnonymousClass5x3 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "EncryptedBackupsGDriveBaseFragment";
    public final C04530Oa A00 = AnonymousClass3W9.A00(this);
    public final C04530Oa A01;

    public abstract void A02();

    public abstract void A03();

    public abstract void A04(GoogleSignInAccount googleSignInAccount);

    public abstract void A05(boolean z);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        r2.CtT(true);
    }

    public abstract String getModuleName();

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass061 r4 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0301000_I2_3((Object) viewLifecycleOwner, (Object) r4, (Object) this, (C146958n9) null, 23), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final void A00() {
        Intent A002;
        String str;
        C103616Zw.A00.getValue();
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass78K r4 = new AnonymousClass78K(GoogleSignInOptions.A0D);
        Set set = r4.A01;
        set.add(GoogleSignInOptions.A0F);
        set.add(new Scope(1, "https://www.googleapis.com/auth/drive.appdata"));
        set.addAll(Arrays.asList(new Scope[0]));
        GoogleSignInOptions A003 = r4.A00();
        C13320nQ.A01(A003);
        C93235lE r2 = new C93235lE((Activity) requireActivity, A003);
        Context context = r2.A01;
        int A004 = C93235lE.A00(r2) - 1;
        if (A004 != 2) {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) r2.A03;
            if (A004 != 3) {
                AnonymousClass7CO.A00.A00("getNoImplementationSignInIntent()", new Object[0]);
                A002 = AnonymousClass7CO.A00(context, googleSignInOptions);
                str = "com.google.android.gms.auth.NO_IMPL";
            } else {
                A002 = AnonymousClass7CO.A00(context, googleSignInOptions);
                C10650ih.A0E(A002, this, 1122);
            }
        } else {
            AnonymousClass7CO.A00.A00("getFallbackSignInIntent()", new Object[0]);
            A002 = AnonymousClass7CO.A00(context, (GoogleSignInOptions) r2.A03);
            str = "com.google.android.gms.auth.APPAUTH_SIGN_IN";
        }
        A002.setAction(str);
        C10650ih.A0E(A002, this, 1122);
    }

    public final void A01() {
        C04530Oa r1 = this.A00;
        EAB.A02(AnonymousClass2MX.A00(AnonymousClass0wJ.A0X(r1)));
        AnonymousClass3X1.A00(AnonymousClass0wJ.A0X(r1)).AIB(this);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public AnonymousClass5x3() {
        KtLambdaShape61S0100000_I2_41 ktLambdaShape61S0100000_I2_41 = new KtLambdaShape61S0100000_I2_41(this, 32);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape61S0100000_I2_41(new KtLambdaShape61S0100000_I2_41(this, 29), 30));
        this.A01 = C18220wO.A0M(new KtLambdaShape61S0100000_I2_41(A012, 31), ktLambdaShape61S0100000_I2_41, new KtLambdaShape26S0200000_I2_10(1, A012, (Object) null), C18210wN.A0l(C8C.class));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r2 == null) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 1122(0x462, float:1.572E-42)
            if (r6 != r0) goto L_0x006f
            r0 = -1
            if (r7 != r0) goto L_0x006f
            r4 = 0
            if (r8 == 0) goto L_0x0021
            java.lang.String r0 = "googleSignInStatus"
            android.os.Parcelable r2 = r8.getParcelableExtra(r0)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            java.lang.String r0 = "googleSignInAccount"
            android.os.Parcelable r1 = r8.getParcelableExtra(r0)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r1
            if (r1 != 0) goto L_0x003b
            if (r2 != 0) goto L_0x0023
        L_0x0021:
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.A07
        L_0x0023:
            X.7lU r3 = new X.7lU
            r3.<init>(r4, r2)
        L_0x0028:
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r3.A00
            com.google.android.gms.common.api.Status r1 = r3.A01
            int r0 = r1.A01
            if (r0 > 0) goto L_0x0043
            if (r2 == 0) goto L_0x0043
            X.7HU r1 = new X.7HU
            r1.<init>()
            r1.A0B(r2)
            goto L_0x005b
        L_0x003b:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.A09
            X.7lU r3 = new X.7lU
            r3.<init>(r1, r0)
            goto L_0x0028
        L_0x0043:
            android.app.PendingIntent r0 = r1.A02
            if (r0 == 0) goto L_0x0055
            X.5l9 r0 = new X.5l9
            r0.<init>(r1)
        L_0x004c:
            X.7HU r1 = new X.7HU
            r1.<init>()
            r1.A0A(r0)
            goto L_0x005b
        L_0x0055:
            X.2Af r0 = new X.2Af
            r0.<init>(r1)
            goto L_0x004c
        L_0x005b:
            java.lang.Class<X.2Af> r0 = X.C32102Af.class
            java.lang.Object r0 = r1.A05(r0)     // Catch:{ 2Af -> 0x006a }
            X.C04220Ms.A06(r0)     // Catch:{ 2Af -> 0x006a }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r0     // Catch:{ 2Af -> 0x006a }
            r5.A04(r0)     // Catch:{ 2Af -> 0x006a }
            return
        L_0x006a:
            X.0Oa r0 = r5.A01
            r0.getValue()
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5x3.onActivityResult(int, int, android.content.Intent):void");
    }
}
