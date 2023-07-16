package X;

import android.content.Context;
import java.nio.MappedByteBuffer;

/* renamed from: X.0To  reason: invalid class name and case insensitive filesystem */
public final class C05420To implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    public C05420To(Context context, String str) {
        this.A01 = str;
        this.A00 = context;
    }

    public final void run() {
        C05460Tv A002 = C07850cI.A00(this.A01);
        Context context = this.A00;
        A002.A05(context, C07850cI.A0C);
        MappedByteBuffer mappedByteBuffer = C07850cI.A0A.A02;
        int i = 0;
        do {
            mappedByteBuffer.putLong(i << 3, 0);
            i++;
        } while (i < 40);
        C05470Tw.A01(context, true);
    }
}
