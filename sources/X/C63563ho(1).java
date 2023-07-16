package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.3ho  reason: invalid class name and case insensitive filesystem */
public final class C63563ho {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.content.Context r6, android.text.SpannableStringBuilder r7, java.lang.Integer r8, boolean r9, boolean r10) {
        /*
            if (r10 == 0) goto L_0x007d
            r4 = 0
        L_0x0003:
            r0 = 2131234308(0x7f080e04, float:1.8084778E38)
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            android.graphics.drawable.Drawable r3 = r0.mutate()
            if (r8 == 0) goto L_0x0077
            int r0 = r8.intValue()
        L_0x0014:
            X.C63393hP.A03(r6, r3, r0)
        L_0x0017:
            int r1 = r3.getIntrinsicWidth()
            int r0 = r3.getIntrinsicHeight()
            r5 = 0
            r3.setBounds(r5, r5, r1, r0)
            X.F32 r2 = new X.F32
            r2.<init>(r3)
            int r0 = r7.length()
            java.lang.String r1 = " "
            if (r4 != r0) goto L_0x0073
            r7.append(r1)
        L_0x0033:
            int r0 = r4 + 1
            r3 = 33
            r7.setSpan(r2, r4, r0, r3)
            boolean r0 = X.AnonymousClass3JA.A01(r6)
            if (r0 == 0) goto L_0x006a
            r2 = 0
            if (r10 == 0) goto L_0x006b
            r7.insert(r5, r1)
        L_0x0046:
            r0 = 2131837718(0x7f114316, float:1.9308639E38)
            java.lang.String r0 = r6.getString(r0)
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            if (r10 != 0) goto L_0x0057
            int r2 = r1.length()
        L_0x0057:
            java.lang.String r0 = " , "
            r1.insert(r2, r0)
            java.lang.String r0 = r1.toString()
            X.0xZ r1 = new X.0xZ
            r1.<init>(r0)
            int r0 = r4 + 1
            r7.setSpan(r1, r4, r0, r3)
        L_0x006a:
            return
        L_0x006b:
            int r4 = r7.length()
            r7.append(r1)
            goto L_0x0046
        L_0x0073:
            r7.insert(r4, r1)
            goto L_0x0033
        L_0x0077:
            if (r9 == 0) goto L_0x0017
            r0 = 2131099707(0x7f06003b, float:1.7811775E38)
            goto L_0x0014
        L_0x007d:
            int r4 = r7.length()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63563ho.A02(android.content.Context, android.text.SpannableStringBuilder, java.lang.Integer, boolean, boolean):void");
    }

    public static Drawable A00(Context context) {
        Drawable mutate = context.getDrawable(R.drawable.verified_profile).mutate();
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        C63393hP.A03(context, mutate, R.color.blue_5);
        return mutate;
    }

    public static SpannableStringBuilder A01(TextView textView, CharSequence charSequence, boolean z) {
        Context context = textView.getContext();
        Drawable mutate = context.getDrawable(R.drawable.verified_profile).mutate();
        int i = 0;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        if (z) {
            C63393hP.A03(context, mutate, R.color.blue_5);
        }
        float applyDimension = TypedValue.applyDimension(1, (float) 2, C18230wP.A0E(context));
        CharSequence charSequence2 = charSequence;
        CharSequence ellipsize = TextUtils.ellipsize(charSequence2, textView.getPaint(), (((float) textView.getWidth()) - applyDimension) - ((float) mutate.getIntrinsicWidth()), TextUtils.TruncateAt.END, false, (TextUtils.EllipsizeCallback) null);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(ellipsize);
        valueOf.append(" ");
        F32 f32 = new F32(mutate);
        if (ellipsize.length() >= charSequence.length()) {
            i = (int) applyDimension;
        }
        f32.A00 = i;
        valueOf.setSpan(f32, valueOf.length() - 1, valueOf.length(), 33);
        return valueOf;
    }

    public static void A03(Context context, SpannableStringBuilder spannableStringBuilder, boolean z) {
        A02(context, spannableStringBuilder, (Integer) null, z, AnonymousClass0hB.A02(context));
    }

    public static void A04(Context context, SpannableStringBuilder spannableStringBuilder, boolean z) {
        boolean A02 = AnonymousClass0hB.A02(context);
        if (A02) {
            spannableStringBuilder.insert(0, " ");
        } else {
            spannableStringBuilder.append(" ");
        }
        A02(context, spannableStringBuilder, (Integer) null, z, A02);
    }

    public static void A05(TextView textView, int i, int i2, int i3, boolean z) {
        Drawable drawable;
        int i4;
        int intrinsicWidth;
        Context context = textView.getContext();
        boolean A02 = AnonymousClass0hB.A02(context);
        if (z) {
            drawable = context.getDrawable(R.drawable.verified_profile).mutate();
            if (A02) {
                i4 = 0;
                intrinsicWidth = drawable.getIntrinsicWidth();
            } else {
                i4 = i2;
                intrinsicWidth = drawable.getIntrinsicWidth() + i2;
            }
            drawable.setBounds(i4, i, intrinsicWidth, drawable.getIntrinsicHeight() + i);
            if (A02) {
                C09860go.A0R(textView, drawable.getIntrinsicWidth());
            } else {
                C09860go.A0T(textView, i2);
            }
            if (i3 != -1) {
                C63393hP.A05(drawable, i3);
            }
        } else {
            drawable = null;
        }
        Drawable drawable2 = null;
        if (A02) {
            drawable2 = drawable;
            drawable = null;
        }
        textView.setCompoundDrawables(drawable2, (Drawable) null, drawable, (Drawable) null);
    }

    public static void A06(TextView textView, int i, boolean z) {
        A05(textView, (int) TypedValue.applyDimension(1, (float) 1, C18230wP.A0E(textView.getContext())), 0, i, z);
    }

    public static void A07(TextView textView, boolean z) {
        Context context = textView.getContext();
        A05(textView, (int) TypedValue.applyDimension(1, (float) 1, C18230wP.A0E(context)), 0, context.getColor(R.color.blue_5), z);
    }

    public static void A08(TextView textView, boolean z) {
        A06(textView, textView.getContext().getColor(R.color.blue_5), z);
    }
}
