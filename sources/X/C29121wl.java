package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxObserverShape213S0100000_4_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0200000_I2_4;
import kotlin.jvm.internal.KtLambdaShape25S0200000_I2_9;
import kotlin.jvm.internal.KtLambdaShape61S0100000_I2_41;

/* renamed from: X.1wl  reason: invalid class name and case insensitive filesystem */
public final class C29121wl extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "EncryptedBackupsFishfoodingFragment";
    public final C63273h9 A00 = new C63273h9();
    public final C04530Oa A01;
    public final C04530Oa A02;
    public final C04530Oa A03 = C80644m9.A00(this);
    public final C04530Oa A04;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131827532);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0B(this).A00.A0C(getViewLifecycleOwner(), new IDxObserverShape213S0100000_4_I2((Object) this, 237));
    }

    public static final CBJ A0B(C29121wl r0) {
        return (CBJ) r0.A04.getValue();
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public C29121wl() {
        KtLambdaShape61S0100000_I2_41 ktLambdaShape61S0100000_I2_41 = new KtLambdaShape61S0100000_I2_41(this, 18);
        KtLambdaShape61S0100000_I2_41 ktLambdaShape61S0100000_I2_412 = new KtLambdaShape61S0100000_I2_41(this, 20);
        Integer num = AnonymousClass006.A0C;
        C04530Oa A012 = AnonymousClass0OY.A01(num, new KtLambdaShape61S0100000_I2_41(ktLambdaShape61S0100000_I2_412, 21));
        this.A01 = C18220wO.A0M(new KtLambdaShape61S0100000_I2_41(A012, 22), ktLambdaShape61S0100000_I2_41, new KtLambdaShape25S0200000_I2_9(48, (Object) null, A012), C18210wN.A0l(C8A.class));
        KtLambdaShape61S0100000_I2_41 ktLambdaShape61S0100000_I2_413 = new KtLambdaShape61S0100000_I2_41(this, 26);
        C04530Oa A013 = AnonymousClass0OY.A01(num, new KtLambdaShape61S0100000_I2_41(new KtLambdaShape61S0100000_I2_41(this, 23), 24));
        this.A04 = C18220wO.A0M(new KtLambdaShape61S0100000_I2_41(A013, 25), ktLambdaShape61S0100000_I2_413, new KtLambdaShape25S0200000_I2_9(49, (Object) null, A013), C18210wN.A0l(CBJ.class));
        this.A02 = AnonymousClass0OY.A02(new KtLambdaShape61S0100000_I2_41(this, 19));
    }

    public final void afterOnViewCreated() {
        C18180wK.A18(this, new KtSLambdaShape9S0200000_I2_4(this, (C146958n9) null, 30), A0B(this).A0A);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(864558626);
        super.onStart();
        CBJ A0B = A0B(this);
        EAB.A02(A0B.A05);
        A0B.A03();
        C14030oh.A09(-636705251, A022);
    }
}
