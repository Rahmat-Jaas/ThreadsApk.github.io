package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.barcelona.R;

/* renamed from: X.7hB  reason: invalid class name and case insensitive filesystem */
public final class C127457hB implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        Rect rect;
        IHN ihn;
        IHN ihn2;
        C58913Hz r0;
        Rect rect2;
        Object obj4 = obj3;
        ImageView imageView = (ImageView) obj;
        C90985fP r14 = (C90985fP) obj2;
        if (obj3 instanceof Rect) {
            rect = (Rect) obj4;
        } else {
            rect = null;
        }
        if (r14.A01 == null || ((rect2 = r14.A00) != rect && (rect2 == null || !rect2.equals(rect)))) {
            if (rect == null || (ihn2 = r14.A06) == null || ((!ihn2.A0U || !ihn2.A0T) && !ihn2.A0Q)) {
                ihn = r14.A06;
            } else {
                IHL ihl = new IHL(ihn2);
                int width = rect.width();
                int height = rect.height();
                if (width <= 0 || height <= 0) {
                    r0 = null;
                } else {
                    r0 = new C58913Hz(width, height);
                }
                ihl.A05 = r0;
                ihn = new IHN(ihl);
            }
            synchronized (AnonymousClass7CI.class) {
                AnonymousClass7CI.A01();
            }
            Resources resources = context.getResources();
            C142098do r1 = r14.A07;
            AnonymousClass0wJ.A1N(resources, r1);
            if (ihn == null) {
                ihn = IHN.A0W;
            }
            r14.A01 = new C126147ef(resources, ihn, r1);
            r14.A00 = rect;
        }
        Drawable drawable = imageView.getDrawable();
        drawable.getClass();
        C36399JTi A00 = AnonymousClass7CI.A00();
        C126147ef r8 = r14.A01;
        r8.getClass();
        Object obj5 = r14.A08;
        L1S l1s = r14.A05;
        A00.A00(rect, r14.A04, (C142078dm) drawable, r8, l1s, obj5);
        imageView.setTag(R.id.fresco_vito_bloks_tag, r14);
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C90985fP.A00((C90985fP) obj, (C90985fP) obj2)) {
            return true;
        }
        if (obj3 == obj4) {
            return false;
        }
        if (obj3 == null || !obj3.equals(obj4)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        Drawable drawable;
        ImageView imageView = (ImageView) obj;
        C90985fP r8 = (C90985fP) obj2;
        Drawable drawable2 = imageView.getDrawable();
        drawable2.getClass();
        C142078dm r3 = (C142078dm) drawable2;
        I2F i2f = (I2F) r3;
        JXA jxa = i2f.A0A.A04;
        if (jxa instanceof AnonymousClass921) {
            drawable = ((AnonymousClass921) jxa).A02;
        } else {
            drawable = null;
        }
        IHN ihn = r8.A06;
        if ((ihn == null || ihn.A0P) && (drawable instanceof Animatable)) {
            ((Animatable) drawable).stop();
        }
        AnonymousClass7CI.A00();
        if (!(r3 instanceof I2F)) {
            AnonymousClass0JV.A01("KFrescoController", AnonymousClass0wJ.A0t("Drawable not supported ", r3));
        } else {
            AnonymousClass78V.A00.postDelayed(i2f.A0D, 80);
        }
        imageView.setTag(R.id.fresco_vito_bloks_tag, (Object) null);
    }
}
