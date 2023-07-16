package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: X.4y1  reason: invalid class name and case insensitive filesystem */
public final class C86654y1 extends Drawable {
    public int A00;
    public long A01 = 2147483647L;
    public long A02;
    public AnonymousClass0ZU A03;
    public boolean A04 = true;
    public final Movie A05;
    public final int A06;
    public final Paint A07 = C86114wI.A0C(2);

    public C86654y1(String str, int i) {
        C04220Ms.A0B(str, 1);
        this.A06 = i;
        Movie decodeFile = Movie.decodeFile(str);
        C04220Ms.A06(decodeFile);
        this.A05 = decodeFile;
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        if (!this.A04) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.A02 == 0) {
                this.A02 = uptimeMillis;
            }
            Movie movie = this.A05;
            int duration = movie.duration();
            if (duration == 0) {
                duration = 1000;
            }
            this.A00 = (int) ((uptimeMillis - this.A02) % ((long) duration));
            A00(canvas);
            invalidateSelf();
            if (SystemClock.uptimeMillis() - this.A02 >= ((long) movie.duration()) * this.A01) {
                this.A04 = true;
                AnonymousClass0ZU r0 = this.A03;
                if (r0 != null) {
                    r0.invoke();
                    return;
                }
                return;
            }
            return;
        }
        A00(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    private final void A00(Canvas canvas) {
        Movie movie = this.A05;
        movie.setTime(this.A00);
        canvas.save();
        canvas.scale(((float) getIntrinsicWidth()) / ((float) movie.width()), ((float) getIntrinsicWidth()) / ((float) movie.width()));
        movie.draw(canvas, ((float) getBounds().left) / (((float) getIntrinsicWidth()) / ((float) movie.width())), ((float) getBounds().top) / (((float) getIntrinsicWidth()) / ((float) movie.width())), this.A07);
        canvas.restore();
    }

    public final void A01() {
        if (this.A04) {
            this.A04 = false;
            this.A02 = SystemClock.uptimeMillis() - ((long) this.A00);
            invalidateSelf();
        }
    }

    public final int getIntrinsicHeight() {
        int i = this.A06;
        if (i <= 0) {
            return this.A05.height();
        }
        return i;
    }

    public final int getIntrinsicWidth() {
        int i = this.A06;
        if (i <= 0) {
            return this.A05.width();
        }
        return i;
    }

    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }
}
