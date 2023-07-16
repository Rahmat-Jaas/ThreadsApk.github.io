package X;

import android.os.SystemClock;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0kx  reason: invalid class name and case insensitive filesystem */
public final class C11880kx extends MarkerEditor implements PointEditor {
    public final int A00;
    public final int A01;
    public final ArrayList A02 = new ArrayList();
    public final C03250Fc A03;

    public final void markerEditingCompleted() {
        C03250Fc.A01(this.A03, this, "", TimeUnit.MILLISECONDS, 13, 0, 0, 0);
    }

    public final MarkerEditor point(String str, String str2, long j) {
        this.A02.add(new AnonymousClass0XJ(str2, str, 11, j));
        return this;
    }

    public final PointEditor pointCustomTimestamp(long j) {
        this.A02.add(new AnonymousClass0XJ((Object) null, "", 16, j));
        return this;
    }

    public final MarkerEditor pointEditingCompleted() {
        this.A02.add(new AnonymousClass0XJ("", (Object) null, 14));
        return this;
    }

    public final PointEditor pointEditor(String str) {
        this.A02.add(new AnonymousClass0XJ((Object) null, str, 13, SystemClock.uptimeMillis()));
        return this;
    }

    public final PointEditor pointShouldIncludeMetadata(boolean z) {
        this.A02.add(new AnonymousClass0XJ("", Boolean.valueOf(z), 15));
        return this;
    }

    public final MarkerEditor pointWithMetadata(String str, String str2, long j) {
        this.A02.add(new AnonymousClass0XJ(str2, str, 12, j));
        return this;
    }

    public final MarkerEditor setSurviveUserSwitch(boolean z) {
        this.A02.add(new AnonymousClass0XJ("", Boolean.valueOf(z), 29));
        return this;
    }

    public final MarkerEditor withLevel(int i) {
        this.A02.add(new AnonymousClass0XJ("", Integer.valueOf(i), 0));
        return this;
    }

    public C11880kx(C03250Fc r2, int i, int i2) {
        this.A03 = r2;
        this.A01 = i;
        this.A00 = i2;
    }

    public final PointEditor addPointData(String str, double d) {
        this.A02.add(new AnonymousClass0XJ(str, Double.valueOf(d), 21));
        return this;
    }

    public final PointEditor addPointData(String str, float f) {
        this.A02.add(new AnonymousClass0XJ(str, Float.valueOf(f), 20));
        return this;
    }

    public final PointEditor addPointData(String str, int i) {
        this.A02.add(new AnonymousClass0XJ(str, Integer.valueOf(i), 18));
        return this;
    }

    public final PointEditor addPointData(String str, long j) {
        this.A02.add(new AnonymousClass0XJ(str, Long.valueOf(j), 19));
        return this;
    }

    public final PointEditor addPointData(String str, String str2) {
        this.A02.add(new AnonymousClass0XJ(str, str2, 17));
        return this;
    }

    public final PointEditor addPointData(String str, boolean z) {
        this.A02.add(new AnonymousClass0XJ(str, Boolean.valueOf(z), 22));
        return this;
    }

    public final PointEditor addPointData(String str, double[] dArr) {
        this.A02.add(new AnonymousClass0XJ(str, dArr, 27));
        return this;
    }

    public final PointEditor addPointData(String str, float[] fArr) {
        this.A02.add(new AnonymousClass0XJ(str, fArr, 26));
        return this;
    }

    public final PointEditor addPointData(String str, int[] iArr) {
        this.A02.add(new AnonymousClass0XJ(str, iArr, 23));
        return this;
    }

    public final PointEditor addPointData(String str, long[] jArr) {
        this.A02.add(new AnonymousClass0XJ(str, jArr, 25));
        return this;
    }

    public final PointEditor addPointData(String str, String[] strArr) {
        this.A02.add(new AnonymousClass0XJ(str, strArr, 24));
        return this;
    }

    public final PointEditor addPointData(String str, boolean[] zArr) {
        this.A02.add(new AnonymousClass0XJ(str, zArr, 28));
        return this;
    }

    public final MarkerEditor annotate(String str, double d) {
        this.A02.add(new AnonymousClass0XJ(str, Double.valueOf(d), 4));
        return this;
    }

    public final MarkerEditor annotate(String str, int i) {
        this.A02.add(new AnonymousClass0XJ(str, Integer.valueOf(i), 2));
        return this;
    }

    public final MarkerEditor annotate(String str, long j) {
        this.A02.add(new AnonymousClass0XJ(str, Long.valueOf(j), 3));
        return this;
    }

    public final MarkerEditor annotate(String str, String str2) {
        this.A02.add(new AnonymousClass0XJ(str, str2, 1));
        return this;
    }

    public final MarkerEditor annotate(String str, boolean z) {
        this.A02.add(new AnonymousClass0XJ(str, Boolean.valueOf(z), 5));
        return this;
    }

    public final MarkerEditor annotate(String str, double[] dArr) {
        this.A02.add(new AnonymousClass0XJ(str, dArr, 9));
        return this;
    }

    public final MarkerEditor annotate(String str, int[] iArr) {
        this.A02.add(new AnonymousClass0XJ(str, iArr, 7));
        return this;
    }

    public final MarkerEditor annotate(String str, long[] jArr) {
        this.A02.add(new AnonymousClass0XJ(str, jArr, 8));
        return this;
    }

    public final MarkerEditor annotate(String str, String[] strArr) {
        this.A02.add(new AnonymousClass0XJ(str, strArr, 6));
        return this;
    }

    public final MarkerEditor annotate(String str, boolean[] zArr) {
        this.A02.add(new AnonymousClass0XJ(str, zArr, 10));
        return this;
    }
}
