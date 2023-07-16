package X;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import com.facebook.redex.IDxAListenerShape128S0300000_2_I2;
import kotlin.jvm.internal.KtLambdaShape0S0300001_I2;
import kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11;

/* renamed from: X.83I  reason: invalid class name */
public final class AnonymousClass83I implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Resources A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ C113036qb A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ C06070Xn A08;

    public AnonymousClass83I(Resources resources, Bitmap bitmap, View view, C113036qb r4, AnonymousClass0ZU r5, AnonymousClass0ZU r6, AnonymousClass0ZU r7, C06070Xn r8, float f) {
        this.A06 = r5;
        this.A05 = r6;
        this.A04 = r4;
        this.A08 = r8;
        this.A03 = view;
        this.A02 = bitmap;
        this.A01 = resources;
        this.A00 = f;
        this.A07 = r7;
    }

    public final void run() {
        Object invoke = this.A06.invoke();
        Object invoke2 = this.A05.invoke();
        C113036qb r10 = this.A04;
        C04530Oa r3 = r10.A03;
        View A0I = C86144wL.A0I(r3);
        A0I.setScaleX(1.0f);
        A0I.setScaleY(1.0f);
        C06070Xn r2 = this.A08;
        Object value = r3.getValue();
        View view = this.A03;
        AnimatorSet animatorSet = (AnimatorSet) r2.invoke(value, view, invoke2, invoke, new KtLambdaShape156S0100000_I2_11(r10, 37), new KtLambdaShape156S0100000_I2_11(r10, 38), new KtLambdaShape0S0300001_I2((Object) r10, (Object) this.A02, (Object) this.A01, this.A00, 5));
        r10.A00 = animatorSet;
        if (animatorSet != null) {
            animatorSet.addListener(new IDxAListenerShape128S0300000_2_I2(0, r10, view, this.A07));
        }
        AnimatorSet animatorSet2 = r10.A00;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = r10.A00;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }
}
