package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.service.session.UserSession;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: X.4xh  reason: invalid class name and case insensitive filesystem */
public final class C86454xh extends Drawable {
    public final AnonymousClass78F A00;
    public final Drawable A01;

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        this.A01.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        return this.A01.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A01.getIntrinsicWidth();
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C86454xh(Context context, UserSession userSession, AnonymousClass78F r15) {
        Bitmap bitmap;
        Drawable bitmapDrawable;
        this.A00 = r15;
        if (!r15.A05 || r15.A04 == null) {
            String str = r15.A02;
            str.getClass();
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(C15430rJ.A01(str));
                openInputStream.getClass();
                bitmap = BitmapFactory.decodeStream(openInputStream);
            } catch (FileNotFoundException unused) {
                bitmap = null;
            }
            bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        } else {
            AnonymousClass7EW r4 = new AnonymousClass7EW("", AnonymousClass0wJ.A0Y(userSession).B4M().getUrl(), false);
            AnonymousClass78F r1 = this.A00;
            AnonymousClass7EW r3 = new AnonymousClass7EW("", r1.A00, false);
            String str2 = r1.A04;
            str2.getClass();
            bitmapDrawable = new AnonymousClass4yR(context, userSession, new AnonymousClass792((NewFundraiserInfo) null, r3, r4, (String) null, (String) null, r1.A03, "", (String) null, str2, 0));
        }
        this.A01 = bitmapDrawable;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A01.setBounds(i, i2, i3, i4);
    }
}
