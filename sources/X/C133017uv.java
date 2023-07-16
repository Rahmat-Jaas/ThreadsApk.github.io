package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;

/* renamed from: X.7uv  reason: invalid class name and case insensitive filesystem */
public final class C133017uv implements C33926Hx9 {
    public int A00;
    public final /* synthetic */ Context A01;

    public final int ApP() {
        return 8;
    }

    public C133017uv(Context context) {
        this.A01 = context;
        this.A00 = C86124wJ.A09(context);
    }

    public final Drawable AOu() {
        Drawable drawable = this.A01.getDrawable(R.drawable.red_circle_bg);
        drawable.getClass();
        return drawable;
    }

    public final int AOv() {
        return this.A01.getColor(R.color.canvas_bottom_sheet_description_text_color);
    }

    public final int AYj() {
        return this.A00;
    }

    public final int AYk() {
        return C86124wJ.A09(this.A01);
    }

    public final Integer AZJ() {
        return AnonymousClass006.A01;
    }

    public final int Aog() {
        return this.A01.getColor(R.color.grey_6);
    }

    public final Drawable Aoh() {
        Drawable drawable = this.A01.getDrawable(R.drawable.bg_grey_2_circle);
        drawable.getClass();
        return drawable;
    }

    public final int Aoi() {
        return this.A01.getColor(R.color.grey_4);
    }

    public final Drawable Aoj() {
        return this.A01.getDrawable(R.drawable.direct_large_avatar_button_background);
    }

    public final int Ask() {
        return C18240wQ.A01(this.A01, -111);
    }

    public final Drawable BAM() {
        Drawable drawable = this.A01.getDrawable(R.drawable.instagram_arrow_left_pano_outline_24);
        drawable.getClass();
        return drawable;
    }

    public final Drawable BIK() {
        Drawable drawable = this.A01.getDrawable(R.drawable.instagram_delete_pano_outline_24);
        drawable.getClass();
        return drawable;
    }

    public final Drawable BLt() {
        return this.A01.getDrawable(R.drawable.story_message_composer_background);
    }

    public final int BAL() {
        return Aog();
    }

    public final void CjF(int i) {
        this.A00 = i;
    }
}
