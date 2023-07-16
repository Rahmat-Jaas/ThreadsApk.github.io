package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Bp  reason: invalid class name and case insensitive filesystem */
public final class C120587Bp {
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (A02(r0, r4) == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r15, android.view.View r16, com.instagram.service.session.UserSession r17, boolean r18) {
        /*
            r6 = 0
            r10 = 1
            r1 = r16
            r3 = r17
            int r5 = X.C18200wM.A02(r10, r3, r1)
            r0 = 2131300389(0x7f091025, float:1.8218806E38)
            android.view.View r14 = X.AnonymousClass0wJ.A0J(r1, r0)
            r0 = 2131300391(0x7f091027, float:1.821881E38)
            android.view.View r12 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r0 = 2131300392(0x7f091028, float:1.8218812E38)
            android.view.View r13 = X.AnonymousClass0wJ.A0K(r1, r0)
            X.6ew r4 = X.AnonymousClass2SP.A00(r3)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36318131786092696(0x81072600041098, double:3.031071010679018E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0046
            float r1 = r13.getAlpha()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0046
            if (r18 == 0) goto L_0x0116
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
        L_0x003f:
            boolean r0 = A02(r0, r4)
            r9 = 1
            if (r0 != 0) goto L_0x0047
        L_0x0046:
            r9 = 0
        L_0x0047:
            r1 = 5
            androidx.core.view.IDxDCompatShape5S0000000_2_I2 r0 = new androidx.core.view.IDxDCompatShape5S0000000_2_I2
            r0.<init>(r1)
            X.C006702y.A0C(r12, r0)
            r8 = 8
            r2 = 3000(0xbb8, double:1.482E-320)
            r0 = 300(0x12c, double:1.48E-321)
            r7 = 0
            r11 = r15
            if (r18 == 0) goto L_0x00a8
            if (r9 == 0) goto L_0x011a
            r13.setVisibility(r6)
            r8 = 2131232515(0x7f080703, float:1.8081141E38)
            android.graphics.drawable.Drawable r8 = r15.getDrawable(r8)
            if (r8 == 0) goto L_0x0075
            android.graphics.drawable.Drawable r8 = r8.mutate()
            if (r8 == 0) goto L_0x0075
            r7 = 2131099740(0x7f06005c, float:1.7811842E38)
            X.C63393hP.A03(r15, r8, r7)
            r7 = r8
        L_0x0075:
            r12.setImageDrawable(r7)
            r7 = 2131231553(0x7f080341, float:1.807919E38)
            android.graphics.drawable.Drawable r7 = r15.getDrawable(r7)
            r14.setBackground(r7)
            r14.setVisibility(r6)
            float[] r5 = new float[r5]
            r5 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r5)
            r5.setDuration(r0)
            r5.setStartDelay(r2)
            r0 = 13
            X.C86134wK.A0z(r5, r13, r0)
            com.instagram.model.mediatype.ProductType r2 = com.instagram.model.mediatype.ProductType.CLIPS
        L_0x009b:
            r1 = 3
            com.facebook.redex.IDxAListenerShape183S0200000_2_I2 r0 = new com.facebook.redex.IDxAListenerShape183S0200000_2_I2
            r0.<init>(r1, r4, r2)
            r5.addListener(r0)
            r5.start()
            return
        L_0x00a8:
            if (r9 == 0) goto L_0x0141
            r13.setVisibility(r6)
            r8 = 2131232515(0x7f080703, float:1.8081141E38)
            android.graphics.drawable.Drawable r8 = r15.getDrawable(r8)
            if (r8 == 0) goto L_0x00c3
            android.graphics.drawable.Drawable r8 = r8.mutate()
            if (r8 == 0) goto L_0x00c3
            r7 = 2131099740(0x7f06005c, float:1.7811842E38)
            X.C63393hP.A03(r15, r8, r7)
            r7 = r8
        L_0x00c3:
            r12.setImageDrawable(r7)
            r7 = 2131231553(0x7f080341, float:1.807919E38)
            android.graphics.drawable.Drawable r7 = r15.getDrawable(r7)
            r14.setBackground(r7)
            r14.setVisibility(r6)
            float[] r5 = new float[r5]
            r5 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r5)
            r5.setDuration(r0)
            r5.setStartDelay(r2)
            com.facebook.redex.IDxUListenerShape34S0400000_2_I2 r9 = new com.facebook.redex.IDxUListenerShape34S0400000_2_I2
            r9.<init>(r10, r11, r12, r13, r14)
            r5.addUpdateListener(r9)
            r5.start()
            android.animation.ArgbEvaluator r7 = new android.animation.ArgbEvaluator
            r7.<init>()
            r5 = 2131099740(0x7f06005c, float:1.7811842E38)
            java.lang.Integer r6 = X.C86134wK.A0b(r15, r5)
            r5 = 2131099815(0x7f0600a7, float:1.7811994E38)
            int r5 = r15.getColor(r5)
            java.lang.Object[] r5 = X.C18210wN.A1Y(r6, r5)
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofObject(r7, r5)
            r5.setDuration(r0)
            r5.setStartDelay(r2)
            r0 = 14
            X.C86134wK.A0z(r5, r12, r0)
            com.instagram.model.mediatype.ProductType r2 = com.instagram.model.mediatype.ProductType.FEED
            goto L_0x009b
        L_0x0116:
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.FEED
            goto L_0x003f
        L_0x011a:
            r13.setVisibility(r8)
            r0 = 2131232515(0x7f080703, float:1.8081141E38)
            android.graphics.drawable.Drawable r0 = r15.getDrawable(r0)
            if (r0 == 0) goto L_0x0133
            android.graphics.drawable.Drawable r1 = r0.mutate()
            if (r1 == 0) goto L_0x0133
            r0 = 2131099740(0x7f06005c, float:1.7811842E38)
            X.C63393hP.A03(r15, r1, r0)
            r7 = r1
        L_0x0133:
            r12.setImageDrawable(r7)
            r0 = 2131231553(0x7f080341, float:1.807919E38)
            android.graphics.drawable.Drawable r0 = r15.getDrawable(r0)
            r14.setBackground(r0)
            goto L_0x0159
        L_0x0141:
            r13.setVisibility(r8)
            r0 = 2131232516(0x7f080704, float:1.8081143E38)
            android.graphics.drawable.Drawable r1 = r15.getDrawable(r0)
            if (r1 == 0) goto L_0x015d
            r0 = 2131099815(0x7f0600a7, float:1.7811994E38)
            X.C63393hP.A03(r15, r1, r0)
        L_0x0153:
            r12.setImageDrawable(r1)
            r14.setBackground(r7)
        L_0x0159:
            r14.setVisibility(r6)
            return
        L_0x015d:
            r1 = r7
            goto L_0x0153
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120587Bp.A01(android.content.Context, android.view.View, com.instagram.service.session.UserSession, boolean):void");
    }

    public static final Drawable A00(Context context, User user) {
        boolean A1V = C18210wN.A1V(user);
        Context context2 = context;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Drawable drawable = context.getDrawable(R.drawable.ig_illustrations_illo_subscriber_crown);
        if (drawable != null) {
            A0v.add(drawable);
        }
        A0v.add(new C86794yH(user.B4M(), (String) null, dimensionPixelSize, C18240wQ.A02(context, 14), A1V ? 1 : 0, A1V ? 1 : 0));
        return new C18470xF(context2, AnonymousClass006.A00, A0v, 0.4f, dimensionPixelSize, dimensionPixelSize, A1V ? 1 : 0);
    }

    public static final boolean A02(ProductType productType, C106376ew r8) {
        long currentTimeMillis;
        long A05;
        int ordinal = productType.ordinal();
        if (ordinal == 13) {
            SharedPreferences sharedPreferences = r8.A00;
            if (sharedPreferences.getInt("exclusive_content_animation_tall_video_count", 0) >= 3) {
                return false;
            }
            currentTimeMillis = System.currentTimeMillis();
            A05 = C18180wK.A05(sharedPreferences, "exclusive_content_animation_tall_video_timestamp");
        } else if (ordinal == 1) {
            SharedPreferences sharedPreferences2 = r8.A00;
            if (sharedPreferences2.getInt("exclusive_content_animation_post_count", 0) >= 3) {
                return false;
            }
            currentTimeMillis = System.currentTimeMillis();
            A05 = C18180wK.A05(sharedPreferences2, "exclusive_content_animation_post_timestamp");
        } else if (ordinal != 9) {
            return false;
        } else {
            SharedPreferences sharedPreferences3 = r8.A00;
            if (sharedPreferences3.getInt("exclusive_content_animation_story_count", 0) >= 3) {
                return false;
            }
            currentTimeMillis = System.currentTimeMillis();
            A05 = C18180wK.A05(sharedPreferences3, "exclusive_content_animation_story_timestamp");
        }
        if (currentTimeMillis - A05 > TimeUnit.DAYS.toMillis(1)) {
            return true;
        }
        return false;
    }
}
