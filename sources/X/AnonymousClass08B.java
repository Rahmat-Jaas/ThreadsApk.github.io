package X;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;

/* renamed from: X.08B  reason: invalid class name */
public final class AnonymousClass08B extends AnonymousClass0DX {
    public boolean A00 = true;
    public final AnonymousClass084 A01;
    public final long[] A02;
    public final long[] A03;

    public static void A00(C016808a r4, long[] jArr, int i) {
        r4.A01 += jArr[i | 3];
        r4.A00 += jArr[i | 2];
        r4.A03 += jArr[i | 1];
        r4.A02 += jArr[i];
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03() {
        return new C016808a();
    }

    public final /* bridge */ /* synthetic */ boolean A04(AnonymousClass0DW r13) {
        boolean z;
        C016808a r132 = (C016808a) r13;
        synchronized (this) {
            if (this.A00) {
                AnonymousClass084 r3 = this.A01;
                long[] jArr = this.A02;
                try {
                    Arrays.fill(jArr, 0);
                    int i = 0;
                    AnonymousClass084.A00(r3, jArr, 0, 2);
                    AnonymousClass084.A00(r3, jArr, 1, 0);
                    long[] jArr2 = this.A03;
                    while (true) {
                        int length = jArr.length;
                        if (i >= length) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                            z = true;
                            break;
                        } else if (jArr[i] < jArr2[i]) {
                            Log.e("NetworkMetricsCollector", AnonymousClass00U.A0d("Network Bytes decreased from ", Arrays.toString(jArr2), " to ", Arrays.toString(jArr)), (Throwable) null);
                            z = false;
                            break;
                        } else {
                            i++;
                        }
                    }
                    this.A00 = z;
                    if (z) {
                        r132.A01 = 0;
                        r132.A00 = 0;
                        r132.A03 = 0;
                        r132.A02 = 0;
                        A00(r132, jArr, 0);
                        A00(r132, jArr, 4);
                        return true;
                    }
                } catch (RemoteException | IllegalArgumentException | NullPointerException e) {
                    Log.e("NetworkStatsManagerBytesCollector", "Unable to get bytes transferred", e);
                    return false;
                }
            }
        }
    }

    public AnonymousClass08B(Context context) {
        this.A01 = new AnonymousClass084(context);
        this.A02 = new long[8];
        this.A03 = new long[8];
    }
}
