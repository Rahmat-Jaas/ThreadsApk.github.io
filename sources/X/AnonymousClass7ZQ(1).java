package X;

import android.app.Notification;

/* renamed from: X.7ZQ  reason: invalid class name */
public final class AnonymousClass7ZQ implements C141858dJ {
    public final int A00;
    public final Notification A01;
    public final String A02;
    public final String A03;

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("NotifyTask[");
        A0s.append("packageName:");
        A0s.append(this.A02);
        A0s.append(", id:");
        A0s.append(this.A00);
        A0s.append(", tag:");
        A0s.append(this.A03);
        return C18180wK.A0i("]", A0s);
    }

    public AnonymousClass7ZQ(Notification notification, String str, String str2, int i) {
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A01 = notification;
    }
}
