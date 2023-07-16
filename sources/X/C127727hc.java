package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Spanned;
import android.view.View;
import com.facebook.common.callercontext.ContextChain;
import kotlin.jvm.internal.KtLambdaShape5S0500000_I2;

/* renamed from: X.7hc  reason: invalid class name and case insensitive filesystem */
public final class C127727hc implements Mcm {
    public final AnonymousClass3HX A00;

    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        C142098do r7;
        Uri A01;
        Object obj4 = obj3;
        View view = (View) obj;
        if (obj4 instanceof C111076mk) {
            C111076mk r1 = (C111076mk) obj4;
            view.setContentDescription(r1.A05);
            CharSequence charSequence = r1.A04;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                C04220Ms.A0B(spanned, 0);
                Object[] spans = spanned.getSpans(0, spanned.length(), AnonymousClass5FZ.class);
                C04220Ms.A06(spans);
                for (Object obj5 : spans) {
                    AnonymousClass5FZ r15 = (AnonymousClass5FZ) obj5;
                    AnonymousClass3HX r10 = r15.A00;
                    C127397h3 r9 = r15.A01;
                    boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
                    String A02 = C37237Jn4.A02(r10, r9);
                    if (A02 == null || (A01 = C15430rJ.A01(A02)) == null) {
                        r7 = C126187ej.A00;
                    } else {
                        MSK msk = new MSK();
                        msk.put("uri_source", A01);
                        AnonymousClass4WK.A0P(msk);
                        r7 = new C126177ei(A01, msk);
                    }
                    IHN A012 = C37237Jn4.A01(r10, r9);
                    ContextChain contextChain = AnonymousClass5FZ.A02;
                    L1S A002 = C37237Jn4.A00(r10, r9);
                    synchronized (AnonymousClass7CI.class) {
                        AnonymousClass7CI.A01();
                    }
                    Resources resources = r15.A02;
                    C04220Ms.A0B(resources, A1Z ? 1 : 0);
                    KtLambdaShape5S0500000_I2 ktLambdaShape5S0500000_I2 = new KtLambdaShape5S0500000_I2(0, contextChain, r15, A002, new C126147ef(resources, A012, r7), "BloksRichTextImageSpan");
                    r15.A01 = ktLambdaShape5S0500000_I2;
                    ktLambdaShape5S0500000_I2.invoke();
                    r15.A00 = view;
                }
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        if (obj3 instanceof C111076mk) {
            view.setContentDescription((CharSequence) null);
            CharSequence charSequence = ((C111076mk) obj3).A04;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                C04220Ms.A0B(spanned, 0);
                Object[] spans = spanned.getSpans(0, spanned.length(), AnonymousClass5FZ.class);
                C04220Ms.A06(spans);
                for (Object obj5 : spans) {
                    C87174zx r0 = (C87174zx) obj5;
                    r0.A00 = null;
                    AnonymousClass7CI.A00();
                    C142078dm r1 = r0.A03;
                    C04220Ms.A0B(r1, 0);
                    if (!(r1 instanceof I2F)) {
                        AnonymousClass0JV.A01("KFrescoController", AnonymousClass0wJ.A0t("Drawable not supported ", r1));
                    } else {
                        I2F i2f = (I2F) r1;
                        C04220Ms.A0B(i2f, 0);
                        i2f.A01();
                    }
                }
            }
        }
    }

    public C127727hc(AnonymousClass3HX r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
