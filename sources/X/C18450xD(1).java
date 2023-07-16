package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.0xD  reason: invalid class name and case insensitive filesystem */
public final class C18450xD extends Drawable {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final C86794yH A09;
    public final C86794yH A0A;
    public final C86794yH A0B;
    public final Integer A0C;

    public C18450xD(Context context, List list) {
        Integer num;
        Context context2 = context;
        int A022 = C18240wQ.A02(context2, 18);
        this.A08 = A022;
        int A023 = C18240wQ.A02(context2, 22);
        this.A07 = A023;
        this.A06 = C18240wQ.A02(context2, 5);
        int A024 = C18240wQ.A02(context2, 12);
        this.A02 = A024;
        int A025 = C18240wQ.A02(context2, 9);
        this.A03 = A025;
        this.A04 = C18240wQ.A02(context2, 4);
        this.A05 = C18240wQ.A02(context2, 3);
        this.A00 = C09860go.A00(context2, 8.5f);
        this.A01 = C09860go.A00(context2, 13.0f);
        List list2 = list;
        int size = list2.size();
        if (size == 0) {
            num = AnonymousClass006.A00;
        } else if (size == 1) {
            this.A09 = new C86794yH((ImageUrl) list2.get(0), "threads_post_sticker_replies_facepile", A022, 0, -1, context2.getColor(R.color.igds_photo_placeholder));
            num = AnonymousClass006.A01;
        } else if (size != 2) {
            this.A09 = new C86794yH((ImageUrl) list2.get(0), "threads_post_sticker_replies_facepile", A022, 0, -1, context2.getColor(R.color.igds_photo_placeholder));
            this.A0A = new C86794yH((ImageUrl) list2.get(1), "threads_post_sticker_replies_facepile", A024, 0, -1, context2.getColor(R.color.igds_photo_placeholder));
            this.A0B = new C86794yH((ImageUrl) list2.get(2), "threads_post_sticker_replies_facepile", A025, 0, -1, context2.getColor(R.color.igds_photo_placeholder));
            num = AnonymousClass006.A0N;
        } else {
            int A026 = C18240wQ.A02(context2, 2);
            int color = context2.getColor(R.color.direct_widget_primary_background);
            this.A09 = new C86794yH((ImageUrl) list2.get(0), "threads_post_sticker_replies_facepile", A023, A026, color, context2.getColor(R.color.igds_photo_placeholder));
            this.A0A = new C86794yH((ImageUrl) list2.get(1), "threads_post_sticker_replies_facepile", A023, A026, color, context2.getColor(R.color.igds_photo_placeholder));
            num = AnonymousClass006.A0C;
        }
        this.A0C = num;
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        C86794yH r0 = this.A09;
        if (r0 != null) {
            r0.draw(canvas);
        }
        C86794yH r02 = this.A0A;
        if (r02 != null) {
            r02.draw(canvas);
        }
        C86794yH r03 = this.A0B;
        if (r03 != null) {
            r03.draw(canvas);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        int intValue = this.A0C.intValue();
        if (intValue == 1) {
            return this.A08;
        }
        if (intValue == 2) {
            return this.A07;
        }
        if (intValue == 3) {
            return this.A08 + this.A05 + this.A03;
        }
        if (intValue == 0) {
            return 0;
        }
        throw AnonymousClass4VZ.A00();
    }

    public final int getIntrinsicWidth() {
        int intValue = this.A0C.intValue();
        if (intValue == 1) {
            return this.A08;
        }
        if (intValue == 2) {
            return (this.A07 << 1) - this.A06;
        }
        if (intValue == 3) {
            return this.A02 + this.A04 + this.A08;
        }
        if (intValue == 0) {
            return 0;
        }
        throw AnonymousClass4VZ.A00();
    }

    public final void setAlpha(int i) {
        C86794yH r0 = this.A09;
        if (r0 != null) {
            r0.setAlpha(i);
        }
        C86794yH r02 = this.A0A;
        if (r02 != null) {
            r02.setAlpha(i);
        }
        C86794yH r03 = this.A0B;
        if (r03 != null) {
            r03.setAlpha(i);
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        int intrinsicWidth = getIntrinsicWidth();
        int intrinsicHeight = getIntrinsicHeight();
        float f3 = ((float) intrinsicWidth) / 2.0f;
        int A022 = AnonymousClass8bA.A02(f - f3);
        int A023 = AnonymousClass8bA.A02(f + f3);
        float f4 = ((float) intrinsicHeight) / 2.0f;
        int A024 = AnonymousClass8bA.A02(f2 - f4);
        int A025 = AnonymousClass8bA.A02(f2 + f4);
        int intValue = this.A0C.intValue();
        if (intValue == 1) {
            C86794yH r0 = this.A09;
            if (r0 != null) {
                r0.setBounds(A022, A024, A023, A025);
                return;
            }
            throw C18180wK.A0a("Required value was null.");
        } else if (intValue == 2) {
            int i5 = this.A07 + A022;
            int i6 = i5 - this.A06;
            C86794yH r02 = this.A09;
            if (r02 != null) {
                r02.setBounds(A022, A024, i5, A025);
                C86794yH r03 = this.A0A;
                if (r03 != null) {
                    r03.setBounds(i6, A024, A023, A025);
                    return;
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        } else if (intValue == 3) {
            int A026 = AnonymousClass8bA.A02(((float) A024) + this.A00);
            int A027 = AnonymousClass8bA.A02(((float) A022) + this.A01);
            C86794yH r2 = this.A09;
            if (r2 != null) {
                int i7 = this.A08;
                r2.setBounds(A023 - i7, A024, A023, i7 + A024);
                C86794yH r22 = this.A0A;
                if (r22 != null) {
                    int i8 = this.A02;
                    r22.setBounds(A022, A026, A022 + i8, i8 + A026);
                    C86794yH r23 = this.A0B;
                    if (r23 != null) {
                        int i9 = this.A03;
                        r23.setBounds(A027, A025 - i9, i9 + A027, A025);
                        return;
                    }
                    throw C18180wK.A0a("Required value was null.");
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        }
    }
}
