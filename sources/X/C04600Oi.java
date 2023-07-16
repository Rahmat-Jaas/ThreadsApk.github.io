package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.0Oi  reason: invalid class name and case insensitive filesystem */
public abstract class C04600Oi extends C010204r {
    public final Activity A00;
    public final Context A01;
    public final Handler A02;
    public final C12560m7 A03 = new AnonymousClass0RX();

    public abstract LayoutInflater A02();

    public abstract Object A03();

    public abstract void A04();

    public abstract void A05(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract boolean A06(String str);

    public C04600Oi(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.A00 = fragmentActivity;
        this.A01 = fragmentActivity;
        this.A02 = handler;
    }
}
