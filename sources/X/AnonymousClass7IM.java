package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.EditText;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.service.session.UserSession;

/* renamed from: X.7IM  reason: invalid class name */
public final class AnonymousClass7IM {
    public static final AnonymousClass7IM A00 = new AnonymousClass7IM();

    public static final void A00(Context context, EditText editText, int i, boolean z) {
        String str;
        int i2;
        if (i == 0) {
            i2 = 2131832601;
        } else if (i == 1) {
            i2 = 2131832602;
        } else if (!z) {
            i2 = 2131832604;
        } else {
            str = null;
            editText.setHint(str);
        }
        str = context.getString(i2);
        editText.setHint(str);
    }

    public static final boolean A02(EditText editText) {
        C04220Ms.A0B(editText, 0);
        return C18180wK.A1W(AnonymousClass8bP.A0P(AnonymousClass0wJ.A0n(editText)).length());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r6 != false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r6 == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(com.instagram.common.ui.base.IgLinearLayout r4, int r5, boolean r6) {
        /*
            r3 = this;
            r2 = 2
            r0 = 2131304338(0x7f091f92, float:1.8226816E38)
            android.view.View r1 = r4.findViewById(r0)
            if (r5 < r2) goto L_0x000d
            r0 = 0
            if (r6 == 0) goto L_0x000f
        L_0x000d:
            r0 = 8
        L_0x000f:
            r1.setVisibility(r0)
            r0 = 2131304339(0x7f091f93, float:1.8226818E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = 1
            if (r5 <= r0) goto L_0x001f
            r0 = 0
            if (r6 != 0) goto L_0x0021
        L_0x001f:
            r0 = 8
        L_0x0021:
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IM.A03(com.instagram.common.ui.base.IgLinearLayout, int, boolean):void");
    }

    public static final void A01(Context context, CircularImageView circularImageView, UserSession userSession, int i) {
        int i2;
        circularImageView.setVisibility(C18210wN.A1V(userSession) ? 1 : 0);
        Drawable background = circularImageView.getBackground();
        C04220Ms.A0C(background, C28174Ezk.A00(0));
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.mutate();
        try {
            i2 = C86134wK.A07(context);
        } catch (Resources.NotFoundException unused) {
            C10770iu.A00().ABJ("Resource.NotFoundException when getting R.dimen.color_stroke_size", 817896325).report();
            i2 = C18240wQ.A01(context, 2);
        }
        gradientDrawable.setStroke(i2, context.getColor(i));
    }
}
