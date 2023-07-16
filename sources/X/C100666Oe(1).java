package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.privacy.consent.bloks.instagram.InstagramConsentOpenIABUrlActivity;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.6Oe  reason: invalid class name and case insensitive filesystem */
public final class C100666Oe {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        C109326jp r1;
        C107886hT r5;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        String A0D = C63893iY.A0D(r10, 0);
        Object A0B = C63893iY.A0B(r10, A1Z ? 1 : 0);
        if (A0B == null) {
            r1 = null;
        } else {
            r1 = ((C105916eC) A0B).A00;
        }
        AnonymousClass3HX r0 = r9.A00;
        if (r0 != null) {
            Context context = r0.A00;
            C04220Ms.A06(context);
            if (r1 != null) {
                r5 = new C107886hT(r9, r1);
            } else {
                r5 = null;
            }
            Bundle A06 = C18180wK.A06();
            AnonymousClass3W9.A01(A06, C63913ic.A0F(r9));
            String A0n = C18190wL.A0n(C03480Iw.A00());
            Intent intent = new Intent((Context) C10050he.A00(context, Activity.class), InstagramConsentOpenIABUrlActivity.class);
            intent.putExtra("redirect_url", A0D);
            intent.putExtra("callback_key", A0n);
            intent.putExtras(A06);
            if (r5 != null) {
                ReentrantLock reentrantLock = C103396Za.A01;
                reentrantLock.lock();
                try {
                    C103396Za.A00.put(A0n, r5);
                } finally {
                    reentrantLock.unlock();
                }
            }
            C18230wP.A0O().A09(context, intent);
            return null;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
