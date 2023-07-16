package X;

import android.content.ClipData;
import android.view.ContentInfo;

/* renamed from: X.03W  reason: invalid class name */
public final class AnonymousClass03W implements C004001v {
    public final ContentInfo A00;

    public final ClipData AXc() {
        return this.A00.getClip();
    }

    public final int Ait() {
        return this.A00.getFlags();
    }

    public final int BCm() {
        return this.A00.getSource();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentInfoCompat{");
        sb.append(this.A00);
        sb.append("}");
        return sb.toString();
    }

    public AnonymousClass03W(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.A00 = contentInfo;
    }

    public final ContentInfo BMJ() {
        return this.A00;
    }
}
